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
 * MCP 手动测试控制器
 *
 * 使用 AlipayMcpClient 访问支付宝 MCP Server
 * 加签逻辑已内置
 */
@RestController
@RequestMapping("/api/test")
public class McpTestController {

    private static final Logger log = LoggerFactory.getLogger(McpTestController.class);

    private final AlipayMcpClient alipayMcpClient;

    public McpTestController(AlipayMcpClient alipayMcpClient) {
        this.alipayMcpClient = alipayMcpClient;
        log.info("McpTestController 初始化完成，使用 AlipayMcpClient");
    }

    /**
     * 列出 MCP 工具
     */
    @GetMapping("/mcp/tools")
    public Mono<List<McpSchema.Tool>> listMcpTools() {
        log.info("=== 列出 MCP 工具 ===");
        return Mono.fromCallable(() -> {
            List<McpSchema.Tool> tools = alipayMcpClient.listTools();
            log.info("获取到 {} 个工具", tools.size());
            tools.forEach(t -> log.info("  - {}: {}", t.name(), t.description()));
            return tools;
        }).subscribeOn(Schedulers.boundedElastic());
    }

    /**
     * 调用 MCP 工具
     *
     * 示例调用:
     * POST /api/test/mcp/call/alipay_ebpp_invoice_query
     * Body: {"userId": "2088xxxx"}
     */
    @PostMapping("/mcp/call/{toolName}")
    public Mono<AlipayMcpClient.ToolCallResult> callMcpTool(
            @PathVariable String toolName,
            @RequestBody Map<String, Object> args) {
        log.info("=== 调用 MCP 工具 ===");
        log.info("工具名: {}, 参数: {}", toolName, args);
        return Mono.fromCallable(() -> alipayMcpClient.callTool(toolName, args))
            .subscribeOn(Schedulers.boundedElastic());
    }

    /**
     * 流式调用 MCP 工具
     */
    @PostMapping(value = "/mcp/call/{toolName}/stream", produces = "text/event-stream")
    public Flux<AlipayMcpClient.ToolCallResult> callMcpToolStream(
            @PathVariable String toolName,
            @RequestBody Map<String, Object> args) {
        log.info("=== 流式调用工具 ===");
        log.info("工具名: {}, 参数: {}", toolName, args);
        return alipayMcpClient.callToolStream(toolName, args);
    }

    /**
     * 获取客户端信息
     */
    @GetMapping("/mcp/client-info")
    public Mono<McpSchema.Implementation> getClientInfo() {
        return Mono.fromCallable(alipayMcpClient::getClientInfo)
            .subscribeOn(Schedulers.boundedElastic());
    }

    /**
     * 测试签名（查看日志）
     * 调用此接口会触发加签流程，可以在日志中看到签名信息
     */
    @GetMapping("/mcp/sign-test")
    public Mono<Map<String, Object>> signTest() {
        log.info("=== 签名测试 ===");
        log.info("此请求会携带支付宝 RSA2 签名，请查看日志中的 'Authorization' 头");
        return Mono.fromCallable(() -> {
            long start = System.currentTimeMillis();
            List<McpSchema.Tool> tools = alipayMcpClient.listTools();
            long cost = System.currentTimeMillis() - start;

            Map<String, Object> result = new java.util.HashMap<>();
            result.put("toolCount", tools.size());
            result.put("costMs", cost);
            result.put("message", "签名测试完成，请查看日志中的 'Authorization' 头");
            return result;
        }).subscribeOn(Schedulers.boundedElastic());
    }

    /**
     * 健康检查
     */
    @GetMapping("/health")
    public Mono<Map<String, Object>> health() {
        return Mono.fromCallable(() -> {
            List<McpSchema.Tool> tools = alipayMcpClient.listTools();
            Map<String, Object> result = new java.util.HashMap<>();
            result.put("status", "UP");
            result.put("toolCount", tools.size());
            result.put("clientInfo", alipayMcpClient.getClientInfo());
            return result;
        }).subscribeOn(Schedulers.boundedElastic());
    }
}