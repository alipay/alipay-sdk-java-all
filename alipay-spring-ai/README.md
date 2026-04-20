# Alipay Spring AI MCP SDK

支付宝 MCP (Model Context Protocol) SDK for Spring AI，提供流式、响应式的 MCP 客户端能力。

## 特性

- ✅ 基于 Spring AI 和 MCP 协议
- ✅ 支持 SSE (Server-Sent Events) 流式通信
- ✅ HTTP 拦截切面自定义逻辑（支付宝签名认证）
- ✅ 响应式编程（Reactor Flux/Mono）
- ✅ Spring Boot 自动配置
- ✅ 完整的日志追踪

## 模块结构

```
alipay-spring-ai/
├── alipay-spring-ai-mcp-core/          # 核心模块
│   ├── AlipayMcpClient                  # MCP 客户端
│   ├── AlipaySseMcpTransport            # SSE 传输层
│   └── AlipayAuthInterceptor            # 签名拦截器
├── alipay-spring-ai-mcp-autoconfigure/ # Spring Boot 自动配置
├── alipay-spring-ai-mcp-starter/        # Starter 聚合
└── alipay-spring-ai-mcp-sample/         # 示例应用
```

## 快速开始

### 1. 添加依赖

```xml
<dependency>
    <groupId>com.alipay.sdk</groupId>
    <artifactId>alipay-spring-ai-mcp-starter</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

### 2. 配置

```yaml
alipay:
  mcp:
    app-id: your-app-id
    private-key: |
      -----BEGIN PRIVATE KEY-----
      your-private-key
      -----END PRIVATE KEY-----
    sse-endpoint: https://opengw.alipay.com/api/v1/open/mcps/your-mcp-name/sse
```

### 3. 使用

```java
@Service
public class PaymentService {

    @Autowired
    private AlipayMcpClient mcpClient;

    // 同步调用
    public ToolCallResult queryOrder(String orderNo) {
        return mcpClient.callTool("queryOrder", Map.of("orderNo", orderNo));
    }

    // 流式调用
    public Flux<ToolCallResult> queryOrderStream(String orderNo) {
        return mcpClient.callToolStream("queryOrder", Map.of("orderNo", orderNo));
    }
}
```

## 核心设计

### HTTP 拦截切面

`AlipayAuthInterceptor` 在 RestClient 和 WebClient 发送请求前自动拦截，添加支付宝签名：

```
请求流程:
业务代码 -> RestClient -> [AlipayAuthInterceptor] -> HTTP 请求
                                    ↓
                              添加 Authorization 头
                              ALIPAY-SHA256withRSA app_id=xxx,sign=xxx
```

### 流式支持

```java
// SSE 流式响应
Flux<ToolCallResult> results = mcpClient.callToolStream("toolName", args);

results.subscribe(
    result -> System.out.println("收到: " + result.content()),
    error -> System.err.println("错误: " + error),
    () -> System.out.println("完成")
);
```

## 构建

```bash
# 编译
mvn clean compile

# 测试
mvn test

# 打包
mvn clean package

# 安装到本地仓库
mvn clean install
```

## 运行示例

```bash
cd alipay-spring-ai-mcp-sample
export ALIPAY_APP_ID=your-app-id
export ALIPAY_PRIVATE_KEY=your-private-key
export ALIPAY_SSE_ENDPOINT=your-sse-endpoint
mvn spring-boot:run
```

## API 端点

示例应用启动后：

- `GET /api/agent/tools` - 获取工具列表
- `POST /api/agent/tool/{toolName}` - 同步调用工具
- `POST /api/agent/tool/{toolName}/stream` - 流式调用工具
- `GET /api/agent/health` - 健康检查

## 日志

日志文件位置：
- `logs/mcp-transport.log` - MCP 传输层日志
- `logs/mcp-http.log` - HTTP 请求/响应详情

## 许可证

Apache License 2.0
