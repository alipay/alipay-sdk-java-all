package com.alipay.mcp.transport;

import com.alipay.mcp.McpException;
import com.alipay.mcp.auth.McpAuthBuilder;
import com.alipay.mcp.config.McpClientConfig;
import com.alipay.mcp.interceptor.Interceptor;
import com.alipay.mcp.interceptor.Request;
import com.alipay.mcp.interceptor.Response;
import com.alipay.mcp.protocol.JsonRpcMessage;
import com.alipay.v3.ApiException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Streamable HTTP 连接管理器（支持 MCP 2025-03-26 协议）
 * <p>
 * 特点：
 * - 直接 POST 到 /mcp 端点，无需 SSE 握手
 * - 支持 Session-ID 会话保持（stateful 模式）
 * - 支持无状态模式（stateless）
 * - 响应式流式返回结果
 *
 * @author alipay
 */
public class StreamableHttpConnection implements TransportLayer {

    private static final Logger log = LoggerFactory.getLogger(StreamableHttpConnection.class);
    private static final String DEFAULT_BASE_URL = "https://opengw.alipay.com";
    private static final String MCP_ENDPOINT = "/api/v1/open/mcps/%s/mcp";

    private final OkHttpClient httpClient;
    private final String mcpUrl;
    private final String baseUrl;
    private final McpAuthBuilder authBuilder;
    private final Gson gson;
    private final McpClientConfig config;
    private final List<Interceptor> interceptors;

    // Session-ID（stateful 模式）
    private String sessionId;
    private final AtomicBoolean hasSession = new AtomicBoolean(false);

    // 待响应的请求映射
    private final Map<String, CompletableFuture<JsonRpcMessage>> pendingRequests = new ConcurrentHashMap<>();

    // 事件监听器
    private McpEventListener eventListener;

    // 请求超时调度器
    private final ScheduledExecutorService timeoutExecutor = Executors.newSingleThreadScheduledExecutor();

    public StreamableHttpConnection(McpClientConfig config, List<Interceptor> interceptors) {
        this.config = config;
        this.interceptors = interceptors != null ? interceptors : Collections.emptyList();
        this.baseUrl = config.getServerUrl() != null ? config.getServerUrl() : DEFAULT_BASE_URL;

        // 优先使用 streamableEndpoint，否则用 mcpName 拼接
        if (config.getStreamableEndpoint() != null && !config.getStreamableEndpoint().isEmpty()) {
            this.mcpUrl = config.getStreamableEndpoint();
        } else if (config.getMcpName() != null && !config.getMcpName().isEmpty()) {
            this.mcpUrl = this.baseUrl + String.format(MCP_ENDPOINT, config.getMcpName());
        } else {
            // 兼容使用 sseEndpoint 配置的情况
            this.mcpUrl = config.getSseEndpoint();
        }

        // 根据认证类型初始化 authBuilder
        if (config.getAuthType() == com.alipay.mcp.config.McpClientConfig.AuthType.API_KEY) {
            this.authBuilder = null;
        } else {
            this.authBuilder = new McpAuthBuilder(config.getAppId(), config.getPrivateKey());
        }

        this.httpClient = new OkHttpClient.Builder()
                .connectTimeout(config.getConnectTimeout(), TimeUnit.MILLISECONDS)
                .readTimeout(config.getReadTimeout(), TimeUnit.MILLISECONDS)
                .build();

        this.gson = new GsonBuilder().create();
    }

    /**
     * 兼容旧构造函数（无拦截器）
     */
    public StreamableHttpConnection(McpClientConfig config) {
        this(config, null);
    }

    @Override
    public void connect(McpEventListener listener) {
        this.eventListener = listener;

        // Streamable HTTP 模式不需要预先建立连接
        // 连接状态在第一次请求时建立
        log.info("Streamable HTTP 连接已就绪：{}", mcpUrl);

        if (eventListener != null) {
            eventListener.onConnected();
        }
    }

    /**
     * 发送请求（返回 JsonRpcMessage，与 SseConnection 保持一致）
     */
    @Override
    public CompletableFuture<Object> sendRequest(String method, Object params) {
        // 返回 JsonRpcMessage CompletableFuture，但类型擦除为 Object
        return (CompletableFuture<Object>) (CompletableFuture<?>) sendRequestInternal(method, params);
    }

    /**
     * 发送请求内部方法（返回 JsonRpcMessage）
     */
    private CompletableFuture<JsonRpcMessage> sendRequestInternal(String method, Object params) {
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
            timeoutTask.cancel(false);
            if (ex != null) {
                log.warn("sendRequest - 请求超时或失败：{}", ex.getMessage());
            }
        });

        pendingRequests.put(requestId, future);

        try {
            // 构建拦截器请求对象
            Request interceptorRequest = new Request(mcpUrl, "POST", body);
            interceptorRequest.addHeader("Content-Type", "application/json");

            // 添加 Session-ID（如果有）
            if (hasSession.get() && sessionId != null) {
                interceptorRequest.addHeader("Mcp-Session-Id", sessionId);
            }

            // 执行请求
            executeRequest(interceptorRequest, new RequestCallback() {
                @Override
                public void onSuccess(int statusCode, String responseBody) {
                    log.debug("HTTP onResponse - status: {}, body: {}", statusCode,
                            responseBody.length() > 200 ? responseBody.substring(0, 200) + "..." : responseBody);

                    if (statusCode < 200 || statusCode >= 300) {
                        pendingRequests.remove(requestId);
                        future.completeExceptionally(
                                new McpException("HTTP 错误：" + statusCode + ", body: " + responseBody)
                        );
                        return;
                    }

                    // 解析响应
                    try {
                        JsonRpcMessage response = gson.fromJson(responseBody, JsonRpcMessage.class);

                        if (response.getError() != null) {
                            pendingRequests.remove(requestId);
                            future.completeExceptionally(
                                    new McpException("RPC 错误：" + response.getError().getMessage())
                            );
                        } else {
                            // 完成 Future（返回完整的 JsonRpcMessage）
                            pendingRequests.remove(requestId);
                            future.complete(response);
                        }
                    } catch (Exception e) {
                        pendingRequests.remove(requestId);
                        future.completeExceptionally(new McpException("响应解析失败", e));
                    }
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

    @Override
    public void sendNotification(String method, Object params) {
        JsonRpcMessage notification = new JsonRpcMessage();
        notification.setJsonrpc("2.0");
        notification.setMethod(method);
        notification.setParams(params);

        String body = gson.toJson(notification);
        log.debug("sendNotification - method: {}, body: {}", method, body);

        try {
            // 构建拦截器请求对象
            Request interceptorRequest = new Request(mcpUrl, "POST", body);
            interceptorRequest.addHeader("Content-Type", "application/json");

            // 添加 Session-ID（如果有）
            if (hasSession.get() && sessionId != null) {
                interceptorRequest.addHeader("Mcp-Session-Id", sessionId);
            }

            // 执行请求
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
            log.warn("sendNotification 异常：{}", e.getMessage());
        }
    }

    @Override
    public void close() {
        // 关闭线程池
        timeoutExecutor.shutdownNow();
        try {
            timeoutExecutor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // 清理 Session
        if (hasSession.get()) {
            deleteSession();
        }

        httpClient.dispatcher().executorService().shutdown();
    }

    @Override
    public String getMessageEndpoint() {
        return mcpUrl;
    }

    /**
     * 删除会话（stateful 模式）
     */
    private void deleteSession() {
        if (sessionId == null) {
            return;
        }

        try {
            okhttp3.Request request = new okhttp3.Request.Builder()
                    .url(mcpUrl)
                    .header("Mcp-Session-Id", sessionId)
                    .headers(buildHeaders("DELETE", mcpUrl, ""))
                    .delete()
                    .build();

            okhttp3.Response response = httpClient.newCall(request).execute();
            response.close();
            log.debug("会话已删除：{}", sessionId);
        } catch (Exception e) {
            log.warn("删除会话失败：{}", e.getMessage());
        }
    }

    /**
     * 请求回调接口
     */
    private interface RequestCallback {
        void onSuccess(int statusCode, String responseBody);
        void onFailure(Exception e);
    }

    /**
     * 执行请求（通过拦截器链或直接执行）
     */
    private void executeRequest(Request request, RequestCallback callback) throws Exception {
        if (interceptors.isEmpty()) {
            executeDirectly(request, callback);
        } else {
            executeWithInterceptors(request, callback);
        }
    }

    /**
     * 直接执行请求（无拦截器）
     */
    private void executeDirectly(Request request, RequestCallback callback) throws Exception {
        okhttp3.Request.Builder okRequestBuilder = new okhttp3.Request.Builder()
                .url(request.getUrl())
                .post(RequestBody.create(request.getBody(), MediaType.parse("application/json")));

        // 添加认证头
        try {
            Headers authHeaders = buildHeaders("POST", request.getUrl(), request.getBody());
            for (String name : authHeaders.names()) {
                okRequestBuilder.addHeader(name, authHeaders.get(name));
            }
        } catch (ApiException e) {
            callback.onFailure(e);
            return;
        }

        // 添加自定义请求头
        for (Map.Entry<String, String> header : request.getHeaders().entrySet()) {
            okRequestBuilder.addHeader(header.getKey(), header.getValue());
        }

        okhttp3.Request okRequest = okRequestBuilder.build();

        httpClient.newCall(okRequest).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callback.onFailure(e);
            }

            @Override
            public void onResponse(Call call, okhttp3.Response response) throws IOException {
                // 保存 Session-ID（如果有）
                String newSessionId = response.header("Mcp-Session-Id");
                if (newSessionId != null) {
                    sessionId = newSessionId;
                    hasSession.set(true);
                    log.debug("收到 Session-ID: {}", sessionId);
                }

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
     * 执行实际 HTTP 请求（拦截器链末端调用）
     * 注意：此方法由拦截器链调用，认证头已由拦截器添加，不需要再添加
     */
    private Response executeHttpRequest(Request request) throws IOException {
        okhttp3.Request.Builder okRequestBuilder = new okhttp3.Request.Builder()
                .url(request.getUrl())
                .post(RequestBody.create(request.getBody(), MediaType.parse("application/json")));

        // 添加自定义请求头（包含拦截器添加的认证头）
        for (Map.Entry<String, String> header : request.getHeaders().entrySet()) {
            okRequestBuilder.addHeader(header.getKey(), header.getValue());
        }

        okhttp3.Request okRequest = okRequestBuilder.build();

        try (okhttp3.Response okResponse = httpClient.newCall(okRequest).execute()) {
            // 保存 Session-ID（如果有）
            String newSessionId = okResponse.header("Mcp-Session-Id");
            if (newSessionId != null) {
                sessionId = newSessionId;
                hasSession.set(true);
                log.debug("收到 Session-ID: {}", sessionId);
            }

            String responseBody = okResponse.body() != null ? okResponse.body().string() : "";
            return new Response(okResponse.code(), responseBody);
        }
    }

    private Headers buildHeaders(String method, String url, String body) throws ApiException {
        Headers.Builder builder = new Headers.Builder();
        if (config.getAuthType() == com.alipay.mcp.config.McpClientConfig.AuthType.API_KEY) {
            builder.add("Authorization", "Bearer " + config.getApiKey());
        } else {
            Map<String, String> headers = authBuilder.buildHeaders(method, parseUri(url), body);
            headers.forEach(builder::add);
        }
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
     * 获取 Session-ID
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * 检查是否有会话
     */
    public boolean hasSession() {
        return hasSession.get();
    }

    /**
     * 发送 initialize 请求并完成握手（使用默认参数）
     *
     * @return 初始化结果
     * @throws McpException 初始化失败时抛出
     */
    public JsonRpcMessage sendInitialize() throws McpException {
        return sendInitialize("mcp-java-sdk", "1.0.0", "2025-03-26", null);
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
        return sendInitialize(clientName, clientVersion, "2025-03-26", capabilities);
    }

    /**
     * 发送 initialize 请求并完成握手（完整参数）
     * <p>
     * 注意：Streamable HTTP 模式默认协议版本为 2025-03-26
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
        params.put("protocolVersion", protocolVersion != null ? protocolVersion : "2025-03-26");

        Map<String, Object> clientInfo = new java.util.HashMap<>();
        clientInfo.put("name", clientName != null ? clientName : "mcp-java-sdk");
        clientInfo.put("version", clientVersion != null ? clientVersion : "1.0.0");
        params.put("clientInfo", clientInfo);

        params.put("capabilities", capabilities != null ? capabilities : new java.util.HashMap<>());

        try {
            CompletableFuture<Object> future = sendRequest("initialize", params);
            JsonRpcMessage response = (JsonRpcMessage) future.get(config.getRequestTimeout(), TimeUnit.MILLISECONDS);

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
}