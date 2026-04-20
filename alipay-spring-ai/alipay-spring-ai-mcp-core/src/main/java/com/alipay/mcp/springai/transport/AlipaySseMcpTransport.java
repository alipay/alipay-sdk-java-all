package com.alipay.mcp.springai.transport;

import com.alipay.mcp.springai.logging.McpTransportLogger;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.modelcontextprotocol.client.transport.McpTransport;
import io.modelcontextprotocol.spec.McpSchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestClient;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Sinks;
import reactor.core.scheduler.Schedulers;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/**
 * 支付宝 SSE MCP Transport（完整实现）
 */
public class AlipaySseMcpTransport implements McpTransport {

    private static final Logger log = LoggerFactory.getLogger(AlipaySseMcpTransport.class);

    private final RestClient restClient;
    private final WebClient webClient;
    private final String sseEndpoint;
    private final AtomicBoolean connected = new AtomicBoolean(false);
    private final AtomicReference<String> sessionId = new AtomicReference<>();
    private final ObjectMapper objectMapper;

    private volatile String messageEndpoint;
    private Sinks.Many<McpSchema.JSONRPCMessage> inboundSink;

    public AlipaySseMcpTransport(Builder builder) {
        this.sseEndpoint = builder.sseEndpoint;
        this.objectMapper = new ObjectMapper();

        // 创建带日志的拦截器链
        List<ClientHttpRequestInterceptor> interceptors = new ArrayList<>(builder.interceptors);
        interceptors.add(new LoggingInterceptor());

        this.restClient = createRestClient(builder, interceptors);
        this.webClient = createWebClient(builder, interceptors);

        this.inboundSink = Sinks.many().multicast().onBackpressureBuffer();
    }

    private RestClient createRestClient(Builder builder,
            List<ClientHttpRequestInterceptor> interceptors) {
        RestClient.Builder clientBuilder = RestClient.builder()
            .baseUrl(sseEndpoint)
            .defaultHeaders(headers -> {
                headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
                headers.set("Cache-Control", "no-cache");
            });

        interceptors.forEach(clientBuilder::requestInterceptor);

        return clientBuilder.build();
    }

    private WebClient createWebClient(Builder builder,
            List<ClientHttpRequestInterceptor> interceptors) {
        // WebClient 使用不同的方式添加拦截器
        return WebClient.builder()
            .baseUrl(sseEndpoint)
            .defaultHeaders(headers -> {
                headers.set("Accept", MediaType.TEXT_EVENT_STREAM_VALUE);
                headers.set("Cache-Control", "no-cache");
            })
            .build();
    }

    @Override
    public Mono<Void> connect(Function<McpSchema.JSONRPCMessage, Mono<Void>> handler) {
        if (!connected.compareAndSet(false, true)) {
            return Mono.error(new IllegalStateException("Transport already connected"));
        }

        McpTransportLogger.logSseConnect(sseEndpoint);

        // 1. 建立 SSE 连接获取端点
        return establishSseConnection()
            .flatMap(endpoint -> {
                this.messageEndpoint = endpoint;
                McpTransportLogger.logSseConnected(endpoint);

                // 2. 启动消息监听循环
                return startMessageLoop(handler);
            })
            .doOnError(e -> {
                McpTransportLogger.logSseError(e);
                connected.set(false);
            })
            .subscribeOn(Schedulers.boundedElastic());
    }

    /**
     * 建立 SSE 连接，获取消息端点
     */
    private Mono<String> establishSseConnection() {
        return webClient.get()
            .accept(MediaType.TEXT_EVENT_STREAM)
            .retrieve()
            .bodyToFlux(String.class)
            .doOnNext(line -> log.trace("[SSE RAW] {}", line))
            .filter(line -> line.startsWith("event: endpoint"))
            .next()
            .timeout(Duration.ofSeconds(30))
            .map(line -> {
                // 解析 endpoint 事件
                // event: endpoint
                //  /message?sessionId=xxx
                String data = line.substring(line.indexOf(" ") + 6).trim();
                sessionId.set(extractSessionId(data));
                return data;
            });
    }

    /**
     * 启动消息监听循环
     */
    private Mono<Void> startMessageLoop(Function<McpSchema.JSONRPCMessage, Mono<Void>> handler) {
        return webClient.get()
            .accept(MediaType.TEXT_EVENT_STREAM)
            .retrieve()
            .bodyToFlux(String.class)
            .filter(line -> !line.isEmpty())
            .bufferUntil(line -> line.startsWith("event:"))
            .flatMap(events -> processEventBatch(events, handler))
            .onErrorContinue((err, obj) -> {
                log.error("[SSE] Error processing event", err);
            })
            .then();
    }

    /**
     * 处理一批 SSE 事件
     */
    private Mono<Void> processEventBatch(List<String> events,
            Function<McpSchema.JSONRPCMessage, Mono<Void>> handler) {

        String eventType = null;
        String eventData = null;

        for (String line : events) {
            if (line.startsWith("event: ")) {
                eventType = line.substring(7).trim();
            } else if (line.startsWith(" ")) {
                eventData = line.substring(6).trim();
            }
        }

        if ("message".equals(eventType) && eventData != null) {
            try {
                McpSchema.JSONRPCMessage message = parseMessage(eventData);
                log.debug("[SSE] Received message: {}", message);
                return handler.apply(message);
            } catch (Exception e) {
                log.error("[SSE] Failed to parse message: {}", eventData, e);
                return Mono.error(e);
            }
        }

        return Mono.empty();
    }

    /**
     * 发送消息（流式）
     */
    @Override
    public Flux<McpSchema.JSONRPCMessage> sendMessage(McpSchema.JSONRPCMessage message) {
        if (!connected.get()) {
            return Flux.error(new IllegalStateException("Transport not connected"));
        }

        String json = serializeMessage(message);
        log.debug("[HTTP] Sending message to {}: {}", messageEndpoint, json);

        return webClient.post()
            .uri(messageEndpoint)
            .contentType(MediaType.APPLICATION_JSON)
            .bodyValue(json)
            .retrieve()
            .onStatus(HttpStatusCode::isError, response ->
                response.bodyToMono(String.class)
                    .map(errorBody -> new AlipayMcpException(
                        "HTTP " + response.statusCode() + ": " + errorBody))
            )
            .bodyToFlux(McpSchema.JSONRPCMessage.class)
            .doOnNext(resp -> log.debug("[HTTP] Received response: {}", resp));
    }

    /**
     * 发送消息（异步）
     */
    @Override
    public CompletableFuture<McpSchema.JSONRPCMessage> sendMessageAsync(
            McpSchema.JSONRPCMessage message) {
        return sendMessage(message)
            .next()
            .toFuture();
    }

    @Override
    public Mono<Void> close() {
        return closeGracefully();
    }

    @Override
    public Mono<Void> closeGracefully() {
        if (connected.compareAndSet(true, false)) {
            McpTransportLogger.logSseDisconnected(sseEndpoint, "graceful shutdown");
            inboundSink.tryEmitComplete();
        }
        return Mono.empty();
    }

    // ============ Builder ============

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String sseEndpoint;
        private final List<ClientHttpRequestInterceptor> interceptors = new ArrayList<>();
        private Duration connectTimeout = Duration.ofSeconds(10);
        private Duration readTimeout = Duration.ofSeconds(60);

        public Builder sseEndpoint(String endpoint) {
            this.sseEndpoint = endpoint;
            return this;
        }

        public Builder addInterceptor(ClientHttpRequestInterceptor interceptor) {
            this.interceptors.add(interceptor);
            return this;
        }

        public Builder connectTimeout(Duration timeout) {
            this.connectTimeout = timeout;
            return this;
        }

        public Builder readTimeout(Duration timeout) {
            this.readTimeout = timeout;
            return this;
        }

        public AlipaySseMcpTransport build() {
            if (sseEndpoint == null || sseEndpoint.isEmpty()) {
                throw new IllegalArgumentException("SSE endpoint is required");
            }
            return new AlipaySseMcpTransport(this);
        }
    }

    // ============ 工具方法 ============

    private String extractSessionId(String endpoint) {
        // 从 /message?sessionId=xxx 中提取
        if (endpoint.contains("sessionId=")) {
            return endpoint.substring(endpoint.indexOf("sessionId=") + 10);
        }
        return null;
    }

    private McpSchema.JSONRPCMessage parseMessage(String json) {
        try {
            return objectMapper.readValue(json, McpSchema.JSONRPCMessage.class);
        } catch (Exception e) {
            throw new AlipayMcpException("PARSE_ERROR", "Failed to parse message: " + e.getMessage(), e);
        }
    }

    private String serializeMessage(McpSchema.JSONRPCMessage message) {
        try {
            return objectMapper.writeValueAsString(message);
        } catch (Exception e) {
            throw new AlipayMcpException("SERIALIZE_ERROR", "Failed to serialize message: " + e.getMessage(), e);
        }
    }

    // ============ HTTP 日志拦截器 ============

    private static class LoggingInterceptor implements ClientHttpRequestInterceptor {

        @Override
        public ClientHttpResponse intercept(org.springframework.http.HttpRequest request,
                byte[] body, ClientHttpRequestExecution execution) throws IOException {

            String method = request.getMethod().name();
            String url = request.getURI().toString();
            String bodyStr = body.length > 0 ? new String(body) : "";

            McpTransportLogger.logHttpRequest(method, url, bodyStr);

            long start = System.currentTimeMillis();
            ClientHttpResponse response = execution.execute(request, body);
            long duration = System.currentTimeMillis() - start;

            log.trace("[HTTP] Response in {}ms: {}", duration, response.getStatusCode());

            return response;
        }
    }
}
