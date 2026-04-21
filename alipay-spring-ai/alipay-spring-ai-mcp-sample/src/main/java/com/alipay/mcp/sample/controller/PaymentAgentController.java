package com.alipay.mcp.sample.controller;

import com.alipay.mcp.springai.client.AlipayMcpClient;
import io.modelcontextprotocol.spec.McpSchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.util.List;
import java.util.Map;

/**
 * AI 支付助手控制器
 */
@RestController
@RequestMapping("/api/agent")
public class PaymentAgentController {

    private static final Logger log = LoggerFactory.getLogger(PaymentAgentController.class);

    private final AlipayMcpClient mcpClient;

    public PaymentAgentController(AlipayMcpClient mcpClient) {
        this.mcpClient = mcpClient;
    }

    /**
     * 获取可用工具列表
     */
    @GetMapping("/tools")
    public Mono<List<McpSchema.Tool>> listTools() {
        return Mono.fromCallable(mcpClient::listTools)
            .subscribeOn(Schedulers.boundedElastic());
    }

    /**
     * 流式获取工具列表
     */
    @GetMapping(value = "/tools/stream", produces = "text/event-stream")
    public Flux<McpSchema.Tool> listToolsStream() {
        return mcpClient.listToolsStream();
    }

    /**
     * 同步调用工具
     */
    @PostMapping("/tool/{toolName}")
    public Mono<AlipayMcpClient.ToolCallResult> callTool(
            @PathVariable String toolName,
            @RequestBody Map<String, Object> args) {
        log.info("Calling tool: {} with args: {}", toolName, args);
        return Mono.fromCallable(() -> mcpClient.callTool(toolName, args))
            .subscribeOn(Schedulers.boundedElastic());
    }

    /**
     * 流式调用工具
     */
    @PostMapping(value = "/tool/{toolName}/stream", produces = "text/event-stream")
    public Flux<AlipayMcpClient.ToolCallResult> callToolStream(
            @PathVariable String toolName,
            @RequestBody Map<String, Object> args) {
        log.info("Streaming call to tool: {} with args: {}", toolName, args);
        return mcpClient.callToolStream(toolName, args);
    }

    /**
     * 健康检查
     */
    @GetMapping("/health")
    public Mono<Map<String, Object>> health() {
        return Mono.fromCallable(() -> {
            var tools = mcpClient.listTools();
            return Map.of(
                "status", "UP",
                "toolCount", tools.size(),
                "clientInfo", mcpClient.getClientInfo()
            );
        }).subscribeOn(Schedulers.boundedElastic());
    }
}