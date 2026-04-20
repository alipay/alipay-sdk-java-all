package com.alipay.mcp.transport;

import com.alipay.mcp.config.McpClientConfig;
import com.alipay.mcp.McpException;
import com.alipay.mcp.auth.McpAuthBuilder;
import com.alipay.mcp.interceptor.Interceptor;
import com.alipay.mcp.interceptor.Request;
import com.alipay.mcp.interceptor.Response;
import com.alipay.mcp.protocol.JsonRpcMessage;
import com.alipay.v3.ApiException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.*;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSourceListener;
import okhttp3.sse.EventSources;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.TimeoutException;

/**
 * SSE 连接管理器（支持自动重连）
 *
 * @author alipay
 */
public class SseConnection {

    private static final Logger log = LoggerFactory.getLogger(SseConnection.class);
    private static final String DEFAULT_BASE_URL = "https://opengw.alipay.com";

    private final OkHttpClient httpClient;
    private final String sseUrl;
    private final String baseUrl;
    private final McpAuthBuilder authBuilder;
    private final Gson gson;
    private final McpClientConfig config;
    private final List<Interceptor> interceptors;

    private EventSource eventSource;
    private String messageEndpoint;
    private CountDownLatch connectLatch = new CountDownLatch(1);
    private CountDownLatch endpointLatch = new CountDownLatch(1);

    // 待响应的请求映射
    private final Map<String, CompletableFuture<JsonRpcMessage>> pendingRequests
            = new ConcurrentHashMap<>();

    // 事件监听器
    private McpEventListener eventListener;

    // 重连相关
    private ReconnectConfig reconnectConfig = ReconnectConfig.disabled();
    private final AtomicBoolean reconnecting = new AtomicBoolean(false);
    private final AtomicInteger reconnectCount = new AtomicInteger(0);
    private final ScheduledExecutorService reconnectExecutor = Executors.newSingleThreadScheduledExecutor();
    private volatile boolean manuallyClosed = false;

    // 请求超时调度器
    private final ScheduledExecutorService timeoutExecutor = Executors.newSingleThreadScheduledExecutor();

    public SseConnection(McpClientConfig config, List<Interceptor> interceptors) {
        this.config = config;
        this.interceptors = interceptors != null ? interceptors : Collections.emptyList();
        this.baseUrl = config.getServerUrl() != null ? config.getServerUrl() : DEFAULT_BASE_URL;
        // 优先使用 sseEndpoint，否则用 mcpName 拼接
        if (config.getSseEndpoint() != null && !config.getSseEndpoint().isEmpty()) {
            this.sseUrl = config.getSseEndpoint();
        } else {
            this.sseUrl = this.baseUrl + "/api/v1/open/mcps/" + config.getMcpName() + "/sse";
        }
        this.authBuilder = new McpAuthBuilder(config.getAppId(), config.getPrivateKey());

        this.httpClient = new OkHttpClient.Builder()
                .connectTimeout(config.getConnectTimeout(), TimeUnit.MILLISECONDS)
                .readTimeout(0, TimeUnit.SECONDS) // SSE 长连接，不设置读取超时
                .build();

        this.gson = new GsonBuilder().create();
    }

    /**
     * 兼容旧构造函数（无拦截器）
     */
    public SseConnection(McpClientConfig config) {
        this(config, null);
    }

    /**
     * 设置重连配置
     */
    public void setReconnectConfig(ReconnectConfig config) {
        this.reconnectConfig = config != null ? config : ReconnectConfig.disabled();
    }

    /**
     * 获取重连配置
     */
    public ReconnectConfig getReconnectConfig() {
        return reconnectConfig;
    }

    /**
     * 是否正在重连
     */
    public boolean isReconnecting() {
        return reconnecting.get();
    }

    /**
     * 建立 SSE 连接（阻塞直到连接成功或失败）
     *
     * @param listener 事件监听器
     * @throws McpException 连接失败时抛出
     */
    public void connect(McpEventListener listener) throws McpException {
        this.eventListener = listener;

        okhttp3.Request request;
        try {
            request = new okhttp3.Request.Builder()
                    .url(sseUrl)
                    .header("Accept", "text/event-stream")
                    .headers(buildHeaders("GET", sseUrl, ""))
                    .get()
                    .build();
        } catch (ApiException e) {
            throw new McpException("构建认证头失败", e);
        }

        EventSource.Factory factory = EventSources.createFactory(httpClient);

        this.eventSource = factory.newEventSource(request, new EventSourceListener() {
            @Override
            public void onOpen(EventSource es, okhttp3.Response response) {
                log.debug("SSE 连接打开 - 状态码：{}", response.code());
                connectLatch.countDown();
                if (eventListener != null) {
                    eventListener.onConnected();
                }
            }

            @Override
            public void onEvent(EventSource es, String id, String type, String data) {
                log.debug("SSE 事件 - type: {},  {}", type, data);
                handleEvent(type, data);
            }

            @Override
            public void onClosed(EventSource es) {
                // 主动关闭时，只打印 debug 日志
                if (manuallyClosed) {
                    log.debug("SSE 连接已关闭");
                } else {
                    log.info("SSE 连接关闭");
                    if (eventListener != null) {
                        eventListener.onDisconnected();
                    }
                    // 尝试重连
                    attemptReconnect(new McpException("SSE 连接已关闭"));
                }
            }

            @Override
            public void onFailure(EventSource es, Throwable t, okhttp3.Response response) {
                // 主动关闭时，只打印 debug 日志
                if (manuallyClosed) {
                    log.debug("SSE 连接已关闭");
                } else {
                    log.error("SSE 连接失败", t);
                    if (eventListener != null) {
                        eventListener.onError(new McpException("SSE 连接失败", t));
                    }
                }
                connectLatch.countDown();
                // 尝试重连
                attemptReconnect(t);
            }
        });

        // 等待连接建立
        try {
            if (!connectLatch.await(config.getSseConnectTimeout(), TimeUnit.MILLISECONDS)) {
                throw new McpException("SSE 连接超时");
            }
            // 等待 endpoint 就绪
            if (!endpointLatch.await(config.getEndpointReadyTimeout(), TimeUnit.MILLISECONDS)) {
                throw new McpException("等待 endpoint 超时");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new McpException("SSE 连接被中断", e);
        }
    }

    /**
     * 处理 SSE 事件
     */
    private void handleEvent(String type, String data) {
        switch (type) {
            case "endpoint":
                // 服务器直接返回 endpoint 字符串，不是 JSON 对象
                this.messageEndpoint = data.trim();
                endpointLatch.countDown();
                if (eventListener != null) {
                    eventListener.onEndpointReady(this.messageEndpoint);
                }
                break;

            case "message":
                JsonRpcMessage msg = gson.fromJson(data, JsonRpcMessage.class);
                handleMessage(msg);
                break;

            case "progress":
                ProgressUpdate progress = gson.fromJson(data, ProgressUpdate.class);
                if (eventListener != null) {
                    eventListener.onProgress(progress);
                }
                break;

            case "log":
                LogMessage logMsg = gson.fromJson(data, LogMessage.class);
                if (eventListener != null) {
                    eventListener.onLog(logMsg);
                }
                break;

            default:
                log.warn("未知事件类型：{}, {}", type, data);
        }
    }

    /**
     * 处理 JSON-RPC 消息
     */
    private void handleMessage(JsonRpcMessage msg) {
        log.debug("handleMessage - msg: {}", msg);
        log.debug("handleMessage - msg.getId(): {}", msg.getId());
        log.debug("handleMessage - pendingRequests keys: {}", pendingRequests.keySet());
        if (msg.getId() != null && pendingRequests.containsKey(msg.getId())) {
            // 响应请求
            log.debug("handleMessage - 匹配到请求，准备返回响应");
            CompletableFuture<JsonRpcMessage> future = pendingRequests.remove(msg.getId());
            future.complete(msg);
        } else {
            // 服务器主动推送的通知
            log.debug("handleMessage - 未匹配到请求，作为通知处理");
            if (eventListener != null) {
                eventListener.onNotification(msg);
            }
        }
    }

    /**
     * 发送 JSON-RPC 请求
     *
     * @param method 方法名
     * @param params 参数
     * @return 响应 Future
     * @throws McpException 发送失败时抛出
     */
    public CompletableFuture<JsonRpcMessage> sendRequest(String method, Object params)
            throws McpException {

        if (messageEndpoint == null) {
            throw new McpException("SSE 连接未建立或 endpoint 未就绪");
        }

        String requestId = java.util.UUID.randomUUID().toString();
        JsonRpcMessage request = JsonRpcMessage.createRequest(method, params, requestId);
        String body = gson.toJson(request);

        log.debug("sendRequest - method: {}, requestId: {}", method, requestId);
        log.debug("sendRequest - body: {}", body.length() > 500 ? body.substring(0, 500) + "..." : body);

        CompletableFuture<JsonRpcMessage> future = new CompletableFuture<>();
        // Java 8 兼容的超时处理
        ScheduledFuture<?> timeoutTask = timeoutExecutor.schedule(() -> {
            if (!future.isDone()) {
                future.completeExceptionally(new TimeoutException("请求超时"));
                pendingRequests.remove(requestId);
            }
        }, config.getRequestTimeout(), TimeUnit.MILLISECONDS);

        future.whenComplete((result, ex) -> {
            timeoutTask.cancel(false); // 取消超时任务
            if (ex != null) {
                log.warn("sendRequest - 请求超时或失败: {}", ex.getMessage());
            }
        });
        pendingRequests.put(requestId, future);

        try {
            // 如果 messageEndpoint 是相对路径，拼接 baseUrl
            String fullUrl = messageEndpoint.startsWith("http") ? messageEndpoint : baseUrl + messageEndpoint;
            log.debug("sendRequest - fullUrl: {}", fullUrl);

            // 构建拦截器请求对象
            Request interceptorRequest = new Request(fullUrl, "POST", body);
            interceptorRequest.addHeader("Content-Type", "application/json");

            // 执行请求（通过拦截器链或直接执行）
            executeRequest(interceptorRequest, new RequestCallback() {
                @Override
                public void onSuccess(int statusCode, String responseBody) {
                    log.debug("HTTP onResponse - status: {}", statusCode);
                    if (statusCode < 200 || statusCode >= 300) {
                        pendingRequests.remove(requestId);
                        future.completeExceptionally(
                                new McpException("HTTP 错误：" + statusCode + ", body: " + responseBody)
                        );
                    }
                    // 响应通过 SSE 返回，这里不需要处理
                }

                @Override
                public void onFailure(Exception e) {
                    pendingRequests.remove(requestId);
                    future.completeExceptionally(new McpException("请求失败", e));
                }
            });

        } catch (Exception e) {
            pendingRequests.remove(requestId);
            future.completeExceptionally(new McpException("请求执行失败", e));
        }

        return future;
    }

    /**
     * 请求回调接口
     */
    private interface RequestCallback {
        void onSuccess(int statusCode, String responseBody);
        void onFailure(Exception e);
    }

    /**
     * 执行 HTTP 请求（支持拦截器链）
     */
    private void executeRequest(Request request, RequestCallback callback) throws Exception {
        if (interceptors.isEmpty()) {
            // 无拦截器，直接执行（使用内置认证）
            executeDirectly(request, callback);
        } else {
            // 有拦截器，通过拦截器链执行
            executeWithInterceptors(request, callback);
        }
    }

    /**
     * 直接执行请求（无拦截器，使用内置认证）
     */
    private void executeDirectly(Request request, RequestCallback callback) throws Exception {
        okhttp3.Request okRequest = new okhttp3.Request.Builder()
                .url(request.getUrl())
                .post(RequestBody.create(request.getBody(), MediaType.parse("application/json")))
                .headers(buildHeaders("POST", request.getUrl(), request.getBody()))
                .build();

        httpClient.newCall(okRequest).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callback.onFailure(e);
            }

            @Override
            public void onResponse(Call call, okhttp3.Response response) throws IOException {
                String responseBody = response.body() != null ? response.body().string() : null;
                callback.onSuccess(response.code(), responseBody);
            }
        });
    }

    /**
     * 通过拦截器链执行请求
     */
    private void executeWithInterceptors(Request request, RequestCallback callback) throws Exception {
        // 创建拦截器链
        Interceptor.Chain chain = new Interceptor.Chain() {
            private int index = 0;

            @Override
            public Request request() {
                return request;
            }

            @Override
            public Response proceed(Request req) throws IOException {
                if (index < interceptors.size()) {
                    Interceptor interceptor = interceptors.get(index++);
                    return interceptor.intercept(this);
                } else {
                    // 链末端，执行实际请求
                    return executeHttpRequest(req);
                }
            }

            @Override
            public McpClientConfig config() {
                return config;
            }
        };

        // 异步执行拦截器链
        httpClient.dispatcher().executorService().submit(() -> {
            try {
                Response response = chain.proceed(request);
                callback.onSuccess(response.getCode(), response.getBody());
            } catch (Exception e) {
                callback.onFailure(e);
            }
        });
    }

    /**
     * 执行实际的 HTTP 请求（拦截器链末端调用）
     */
    private Response executeHttpRequest(Request request) throws IOException {
        okhttp3.Request.Builder okRequestBuilder = new okhttp3.Request.Builder()
                .url(request.getUrl())
                .post(RequestBody.create(request.getBody(), MediaType.parse("application/json")));

        // 添加请求头
        for (Map.Entry<String, String> header : request.getHeaders().entrySet()) {
            okRequestBuilder.addHeader(header.getKey(), header.getValue());
        }

        okhttp3.Request okRequest = okRequestBuilder.build();

        try (okhttp3.Response okResponse = httpClient.newCall(okRequest).execute()) {
            String responseBody = okResponse.body() != null ? okResponse.body().string() : "";
            return new Response(okResponse.code(), responseBody);
        }
    }

    private Headers buildHeaders(String method, String url, String body) throws ApiException {
        Map<String, String> headers = authBuilder.buildHeaders(method, parseUri(url), body);
        Headers.Builder builder = new Headers.Builder();
        headers.forEach(builder::add);
        return builder.build();
    }

    private String parseUri(String fullUrl) {
        try {
            HttpUrl httpUrl = HttpUrl.parse(fullUrl);
            return httpUrl.encodedPath() +
                    (httpUrl.encodedQuery() != null ? "?" + httpUrl.encodedQuery() : "");
        } catch (Exception e) {
            return fullUrl;
        }
    }

    /**
     * 关闭连接
     */
    public void close() {
        manuallyClosed = true;

        // 关闭线程池，等待任务完成
        reconnectExecutor.shutdownNow();
        timeoutExecutor.shutdownNow();
        try {
            reconnectExecutor.awaitTermination(1, TimeUnit.SECONDS);
            timeoutExecutor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        if (eventSource != null) {
            eventSource.cancel();
        }
        httpClient.dispatcher().executorService().shutdown();
    }

    /**
     * 尝试重连
     */
    private void attemptReconnect(Throwable cause) {
        if (manuallyClosed) {
            log.debug("连接已手动关闭，不进行重连");
            return;
        }

        if (!reconnectConfig.isEnabled()) {
            log.debug("自动重连已禁用");
            return;
        }

        if (reconnecting.compareAndSet(false, true)) {
            int currentRetry = reconnectCount.getAndIncrement();

            // 检查是否超过最大重试次数
            if (reconnectConfig.getMaxRetries() > 0 && currentRetry >= reconnectConfig.getMaxRetries()) {
                log.error("已达到最大重连次数: {}", reconnectConfig.getMaxRetries());
                if (reconnectConfig.getListener() != null) {
                    reconnectConfig.getListener().onReconnectFailed(cause);
                }
                reconnecting.set(false);
                reconnectCount.set(0);
                return;
            }

            long delay = reconnectConfig.calculateDelay(currentRetry);
            log.info("将在 {} 毫秒后进行第 {} 次重连", delay, currentRetry + 1);

            if (reconnectConfig.getListener() != null) {
                reconnectConfig.getListener().onReconnecting(currentRetry + 1, delay, cause);
            }

            reconnectExecutor.schedule(() -> {
                try {
                    log.info("正在尝试重连...");
                    doReconnect();
                    reconnectCount.set(0);
                    reconnecting.set(false);
                    log.info("重连成功");
                    if (reconnectConfig.getListener() != null) {
                        reconnectConfig.getListener().onReconnected();
                    }
                } catch (Exception e) {
                    log.warn("重连失败: {}", e.getMessage());
                    reconnecting.set(false);
                    // 递归尝试下一次重连
                    attemptReconnect(e);
                }
            }, delay, TimeUnit.MILLISECONDS);
        }
    }

    /**
     * 执行重连
     */
    private void doReconnect() throws McpException {
        // 重置 latches
        this.connectLatch = new CountDownLatch(1);
        this.endpointLatch = new CountDownLatch(1);

        okhttp3.Request request;
        try {
            request = new okhttp3.Request.Builder()
                    .url(sseUrl)
                    .header("Accept", "text/event-stream")
                    .headers(buildHeaders("GET", sseUrl, ""))
                    .get()
                    .build();
        } catch (ApiException e) {
            throw new McpException("构建认证头失败", e);
        }

        EventSource.Factory factory = EventSources.createFactory(httpClient);

        this.eventSource = factory.newEventSource(request, new EventSourceListener() {
            @Override
            public void onOpen(EventSource es, okhttp3.Response response) {
                log.debug("重连 SSE 连接打开 - 状态码：{}", response.code());
                connectLatch.countDown();
                if (eventListener != null) {
                    eventListener.onConnected();
                }
            }

            @Override
            public void onEvent(EventSource es, String id, String type, String data) {
                log.debug("重连 SSE 事件 - type: {},  {}", type, data);
                handleEvent(type, data);
            }

            @Override
            public void onClosed(EventSource es) {
                log.info("重连 SSE 连接关闭");
                if (eventListener != null) {
                    eventListener.onDisconnected();
                }
                attemptReconnect(new McpException("SSE 连接已关闭"));
            }

            @Override
            public void onFailure(EventSource es, Throwable t, okhttp3.Response response) {
                log.error("重连 SSE 连接失败", t);
                connectLatch.countDown();
                if (eventListener != null) {
                    eventListener.onError(new McpException("SSE 连接失败", t));
                }
                attemptReconnect(t);
            }
        });

        // 等待连接建立
        try {
            if (!connectLatch.await(config.getSseConnectTimeout(), TimeUnit.MILLISECONDS)) {
                throw new McpException("重连连接超时");
            }
            // 等待 endpoint 就绪
            if (!endpointLatch.await(config.getEndpointReadyTimeout(), TimeUnit.MILLISECONDS)) {
                throw new McpException("重连等待 endpoint 超时");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new McpException("重连被中断", e);
        }
    }

    public String getMessageEndpoint() {
        return messageEndpoint;
    }

    /**
     * 发送 initialize 请求并完成握手（使用默认参数）
     *
     * @return 初始化结果
     * @throws McpException 初始化失败时抛出
     */
    public JsonRpcMessage sendInitialize() throws McpException {
        return sendInitialize("mcp-java-sdk", "1.0.0", "2024-11-05", null);
    }

    /**
     * 发送 initialize 请求并完成握手
     *
     * @param clientName 客户端名称
     * @param clientVersion 客户端版本
     * @param capabilities 客户端能力
     * @return 初始化结果
     * @throws McpException 初始化失败时抛出
     */
    public JsonRpcMessage sendInitialize(String clientName, String clientVersion,
                                          Map<String, Object> capabilities) throws McpException {
        return sendInitialize(clientName, clientVersion, "2024-11-05", capabilities);
    }

    /**
     * 发送 initialize 请求并完成握手（完整参数）
     *
     * @param clientName 客户端名称
     * @param clientVersion 客户端版本
     * @param protocolVersion 协议版本
     * @param capabilities 客户端能力
     * @return 初始化结果
     * @throws McpException 初始化失败时抛出
     */
    public JsonRpcMessage sendInitialize(String clientName, String clientVersion,
                                          String protocolVersion,
                                          Map<String, Object> capabilities) throws McpException {
        Map<String, Object> params = new java.util.HashMap<>();
        params.put("protocolVersion", protocolVersion != null ? protocolVersion : "2024-11-05");

        Map<String, Object> clientInfo = new java.util.HashMap<>();
        clientInfo.put("name", clientName != null ? clientName : "mcp-java-sdk");
        clientInfo.put("version", clientVersion != null ? clientVersion : "1.0.0");
        params.put("clientInfo", clientInfo);

        params.put("capabilities", capabilities != null ? capabilities : new java.util.HashMap<>());

        try {
            CompletableFuture<JsonRpcMessage> future = sendRequest("initialize", params);
            JsonRpcMessage response = future.get(config.getRequestTimeout(), TimeUnit.MILLISECONDS);

            if (response.getError() != null) {
                throw new McpException("Initialize failed: " + response.getError().getMessage());
            }

            // 发送 initialized 通知
            sendNotification("notifications/initialized", null);

            return response;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new McpException("初始化失败", e);
        }
    }

    /**
     * 发送通知（不等待响应）
     *
     * @param method 方法名
     * @param params 参数
     * @throws McpException 发送失败时抛出
     */
    public void sendNotification(String method, Object params) throws McpException {
        try {
            JsonRpcMessage notification = new JsonRpcMessage();
            notification.setJsonrpc("2.0");
            notification.setMethod(method);
            notification.setParams(params);

            String body = gson.toJson(notification);
            String endpoint = getMessageEndpoint();

            if (endpoint == null) {
                throw new McpException("SSE 连接未建立或 endpoint 未就绪");
            }

            String fullUrl = endpoint.startsWith("http") ? endpoint : baseUrl + endpoint;
            log.debug("sendNotification - method: {}, fullUrl: {}", method, fullUrl);

            // 构建拦截器请求对象
            Request interceptorRequest = new Request(fullUrl, "POST", body);
            interceptorRequest.addHeader("Content-Type", "application/json");

            // 执行请求（通过拦截器链或直接执行）
            executeRequest(interceptorRequest, new RequestCallback() {
                @Override
                public void onSuccess(int statusCode, String responseBody) {
                    log.debug("sendNotification response: {}", statusCode);
                }

                @Override
                public void onFailure(Exception e) {
                    log.warn("sendNotification failed: {}", e.getMessage());
                }
            });
        } catch (Exception e) {
            throw new McpException("发送通知失败", e);
        }
    }
}