# Alipay Spring AI MCP Starter

支付宝 MCP（Model Context Protocol）SDK，基于 [MCP Java SDK 0.17.0](https://github.com/modelcontextprotocol/java-sdk) 封装 MCP 协议通信与支付宝签名认证，支持 Spring Boot 自动配置和编程式使用。

## 环境要求

| 依赖 | 版本要求 |
|------|---------|
| Java | 17+ |
| Spring Boot | 3.4.x+ |
| MCP Java SDK | 0.17.0（已内含，无需单独引入） |
| Spring AI（可选） | 1.1.4+（仅配合 Spring AI Chat 使用时需要） |

> **注意**：如果需要配合 Spring AI 的 Chat 模型使用，Spring AI 版本必须 >= 1.1.4，因为本 SDK 内置的 MCP SDK 版本为 0.17.0，低版本 Spring AI 内置的 MCP SDK API 不兼容（缺少 `HttpClientStreamableHttpTransport`、`McpSyncHttpClientRequestCustomizer` 等关键类）。

## 安装

### 1. 打包到本地仓库

```bash
cd alipay-spring-ai-mcp-starter
mvn install -DskipTests
```

### 2. 引入依赖

**场景 A：仅使用 AlipayMcpClient 调用 MCP 工具（不需要 Spring AI）**

```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>3.4.5</version>
</parent>

<dependencies>
    <dependency>
        <groupId>com.alipay.sdk</groupId>
        <artifactId>alipay-spring-ai-mcp-starter</artifactId>
        <version>1.0.0-SNAPSHOT</version>
    </dependency>
</dependencies>

<!-- MCP SDK 在 Spring Milestones 仓库 -->
<repositories>
    <repository>
        <id>spring-milestones</id>
        <name>Spring Milestones</name>
        <url>https://repo.spring.io/milestone</url>
        <snapshots><enabled>false</enabled></snapshots>
    </repository>
</repositories>
```

**场景 B：配合 Spring AI 一起使用**

```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>3.4.5</version>
</parent>

<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>org.springframework.ai</groupId>
            <artifactId>spring-ai-bom</artifactId>
            <version>1.1.4</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>

<dependencies>
    <!-- 支付宝 MCP Starter -->
    <dependency>
        <groupId>com.alipay.sdk</groupId>
        <artifactId>alipay-spring-ai-mcp-starter</artifactId>
        <version>1.0.0-SNAPSHOT</version>
    </dependency>

    <!-- Spring AI MCP Client（如需 Spring AI 集成） -->
    <dependency>
        <groupId>org.springframework.ai</groupId>
        <artifactId>spring-ai-mcp-client-spring-boot-starter</artifactId>
    </dependency>

    <!-- AI 模型（以 OpenAI 为例） -->
    <dependency>
        <groupId>org.springframework.ai</groupId>
        <artifactId>spring-ai-openai-spring-boot-starter</artifactId>
    </dependency>
</dependencies>

<repositories>
    <repository>
        <id>spring-milestones</id>
        <name>Spring Milestones</name>
        <url>https://repo.spring.io/milestone</url>
        <snapshots><enabled>false</enabled></snapshots>
    </repository>
</repositories>
```

## 快速开始

SDK 提供两种使用方式：

| 方式 | 适用场景 | 特点 |
|------|---------|------|
| Spring Boot 自动配置 | Spring Boot 项目 | 零代码创建客户端，直接注入使用 |
| 编程式使用 | 非 Spring Boot 项目或需要多客户端 | 手动构造 `AlipayMcpClient`，灵活控制 |

### 方式一：Spring Boot 自动配置（推荐）

在 `application.yml` 中配置：

```yaml
alipay:
  mcp:
    enabled: true
    app-id: "你的应用ID"
    private-key: "你的PKCS8私钥"
    # 方式1：指定完整端点
    transport-mode: sse
    sse-endpoint: "https://opengw.alipay.com/api/v1/open/mcps/your-mcp-name/sse"
    # 方式2：base-uri + mcp-name 自动构建端点
    # transport-mode: sse
    # base-uri: "https://opengw.alipay.com"
    # mcp-name: "your-mcp-name"
```

直接注入 `AlipayMcpClient` 使用（自动配置会自动调用 `initialize()`）：

```java
@Service
public class McpService {

    private final AlipayMcpClient mcpClient;

    public McpService(AlipayMcpClient mcpClient) {
        this.mcpClient = mcpClient;
    }

    public List<McpSchema.Tool> listTools() {
        return mcpClient.listTools();
    }

    public AlipayMcpClient.ToolCallResult callTool(String toolName, Map<String, Object> args) {
        return mcpClient.callTool(toolName, args);
    }
}
```

### 方式二：编程式使用

无需 Spring Boot，手动创建客户端。**注意：编程式使用必须在构造后调用 `initialize()` 执行 MCP 握手。**

#### SSE 模式

```java
// 方式1：使用完整端点 URL
AlipayMcpClient client = new AlipayMcpClient(
    appId, privateKey,
    "https://opengw.alipay.com/api/v1/open/mcps/your-mcp-name/sse"
);

// 方式2：使用 baseUri + mcpName（自动拼接端点）
AlipayMcpClient client = new AlipayMcpClient(
    appId, privateKey,
    "https://opengw.alipay.com",
    "your-mcp-name"
);
```

#### Streamable HTTP 模式

```java
// 方式1：使用完整端点 URL
AlipayMcpClient client = new AlipayMcpClient(
    appId, privateKey,
    "https://opengw.alipay.com/api/v1/open/mcps/your-mcp-name/mcp",
    AlipayMcpClient.TransportMode.STREAMABLE
);

// 方式2：使用 baseUri + mcpName
AlipayMcpClient client = new AlipayMcpClient(
    appId, privateKey,
    "https://opengw.alipay.com",
    "your-mcp-name",
    AlipayMcpClient.TransportMode.STREAMABLE
);
```

#### 完整调用示例

```java
try (AlipayMcpClient client = new AlipayMcpClient(appId, privateKey, sseEndpoint)) {
    // 1. 初始化（必须调用，执行 MCP 握手）
    McpSchema.InitializeResult initResult = client.initialize();
    System.out.println("服务端信息: " + initResult);

    // 2. 获取工具列表
    List<McpSchema.Tool> tools = client.listTools();
    tools.forEach(t -> System.out.println(t.name() + ": " + t.description()));

    // 3. 同步调用工具
    AlipayMcpClient.ToolCallResult result = client.callTool("toolName",
        Map.of("param1", "value1"));
    System.out.println("结果: " + result.content());
    System.out.println("是否错误: " + result.isError());

    // 4. 流式调用工具
    client.callToolStream("toolName", Map.of("param1", "value1"))
        .subscribe(r -> System.out.println("流式结果: " + r.content()));

    // 5. 异步调用工具
    AlipayMcpClient.ToolCallResult asyncResult = client.callToolAsync("toolName",
        Map.of("param1", "value1")).get(30, TimeUnit.SECONDS);

    // 6. 获取底层 McpSyncClient（用于 Spring AI 集成）
    McpSyncClient syncClient = client.getSyncClient();
}
```

### 方式三：配合 Spring AI Chat 模型使用

将 `AlipayMcpClient` 暴露的底层 `McpSyncClient` 注册为 Spring AI 的 Tool Callback Provider：

```java
@Configuration
public class McpConfig {

    @Bean
    public SyncMcpToolCallbackProvider mcpToolCallbackProvider(AlipayMcpClient alipayMcpClient) {
        // 将支付宝 MCP 工具注册为 Spring AI 可调用的 Tool
        return SyncMcpToolCallbackProvider.builder()
            .mcpClient(alipayMcpClient.getSyncClient())
            .build();
    }
}
```

在 Chat 中使用：

```java
@Service
public class ChatService {

    private final ChatClient chatClient;

    public ChatService(ChatClient.Builder chatClientBuilder,
                       SyncMcpToolCallbackProvider toolProvider) {
        this.chatClient = chatClientBuilder
            .defaultToolCallbacks(toolProvider)
            .build();
    }

    public String chat(String userMessage) {
        return chatClient.prompt()
            .user(userMessage)
            .call()
            .content();
    }
}
```

## 配置项

| 配置项 | 必填 | 默认值 | 说明 |
|--------|------|--------|------|
| `alipay.mcp.enabled` | 否 | `true` | 是否启用自动配置 |
| `alipay.mcp.app-id` | 是 | - | 支付宝应用 App ID |
| `alipay.mcp.private-key` | 是 | - | 应用私钥（PKCS8 格式，可带 PEM 标记） |
| `alipay.mcp.transport-mode` | 否 | `sse` | 传输模式：`sse` 或 `streamable` |
| `alipay.mcp.sse-endpoint` | 二选一 | - | SSE 完整端点 URL |
| `alipay.mcp.streamable-endpoint` | 二选一 | - | Streamable HTTP 完整端点 URL |
| `alipay.mcp.base-uri` | 二选一 | - | 基础 URI（如 `https://opengw.alipay.com`） |
| `alipay.mcp.mcp-name` | 二选一 | - | MCP 服务名称（配合 base-uri 自动构建端点） |
| `alipay.mcp.connect-timeout` | 否 | `10s` | 连接超时时间 |

> **端点配置优先级**：`sse-endpoint` / `streamable-endpoint` > `base-uri` + `mcp-name`

### 端点地址

| 环境 | SSE 模式 | Streamable 模式 |
|------|---------|-----------------|
| 线上 | `https://opengw.alipay.com/api/v1/open/mcps/{mcpName}/sse` | `https://opengw.alipay.com/api/v1/open/mcps/{mcpName}/mcp` |
| 预发 | `https://opengw-pre.alipay.com/api/v1/open/mcps/{mcpName}/sse` | `https://opengw-pre.alipay.com/api/v1/open/mcps/{mcpName}/mcp` |

## API 参考

### AlipayMcpClient

| 方法 | 返回类型 | 说明 |
|------|---------|------|
| `initialize()` | `McpSchema.InitializeResult` | 执行 MCP 握手，**编程式使用必须调用** |
| `listTools()` | `List<McpSchema.Tool>` | 同步获取工具列表 |
| `listToolsStream()` | `Flux<McpSchema.Tool>` | 流式获取工具列表 |
| `callTool(name, args)` | `ToolCallResult` | 同步调用工具 |
| `callToolStream(name, args)` | `Flux<ToolCallResult>` | 流式调用工具 |
| `callToolAsync(name, args)` | `CompletableFuture<ToolCallResult>` | 异步调用工具 |
| `getSyncClient()` | `McpSyncClient` | 获取底层 MCP 同步客户端（用于 Spring AI 集成） |
| `getAsyncClient()` | `McpAsyncClient` | 获取底层 MCP 异步客户端 |
| `getClientInfo()` | `McpSchema.Implementation` | 获取客户端信息 |
| `close()` | `void` | 关闭客户端，释放资源 |

### ToolCallResult

`ToolCallResult` 是一个 Java record，包含以下字段：

| 字段 | 类型 | 说明 |
|------|------|------|
| `content()` | `String` | 工具返回的文本内容 |
| `type()` | `String` | 内容类型（通常为 `"text"`） |
| `isError()` | `boolean` | 是否为错误结果 |

### TransportMode

| 值 | 说明 |
|----|------|
| `SSE` | HTTP with SSE（旧版协议，2024-11-05） |
| `STREAMABLE` | Streamable HTTP（新版协议，2025-03-26） |

### AlipayMcpClient 构造函数

| 构造函数 | 说明 |
|----------|------|
| `AlipayMcpClient(appId, privateKey, sseEndpoint)` | 使用完整 SSE 端点 URL，默认 SSE 模式 |
| `AlipayMcpClient(appId, privateKey, endpoint, mode)` | 使用完整端点 URL + 指定传输模式 |
| `AlipayMcpClient(appId, privateKey, baseUri, mcpName)` | 使用 baseUri + mcpName，默认 SSE 模式 |
| `AlipayMcpClient(appId, privateKey, baseUri, mcpName, mode)` | 使用 baseUri + mcpName + 指定传输模式 |

## 签名机制

SDK 在每次 HTTP 请求时自动计算支付宝签名并注入 `Authorization` 请求头，使用应用私钥（PKCS8）对请求路径和请求体进行签名。无需手动处理签名逻辑。

签名实现基于 MCP SDK 0.17.0 提供的 `McpSyncHttpClientRequestCustomizer` 扩展点，在每次 HTTP 请求（SSE GET 连接和 POST 消息）时动态计算签名。

**Authorization Header 格式：**

```
ALIPAY-SHA256withRSA app_id={appId},timestamp={timestamp},nonce={nonce},sign={sign}
```

**签名原文格式：**

```
{authString}
{method}
{uri}
{body}
```

## 私钥格式

支持以下 PKCS8 格式：

```bash
# 带 PEM 标记（推荐，可直接粘贴）
-----BEGIN PRIVATE KEY-----
MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC...
-----END PRIVATE KEY-----

# 纯 Base64 字符串（也支持）
MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC...
```

也可使用 `PrivateKeyLoader` 工具类从文件加载：

```java
PrivateKey key = PrivateKeyLoader.loadFromFile("/path/to/private_key.pem");
```

## 异常处理

SDK 抛出 `AlipayMcpException`，包含错误码和错误信息：

```java
try {
    AlipayMcpClient.ToolCallResult result = client.callTool("toolName", args);
} catch (AlipayMcpException e) {
    System.err.println("错误码: " + e.getErrorCode());
    System.err.println("错误信息: " + e.getMessage());
}
```

## 项目结构

```
alipay-spring-ai-mcp-starter/src/main/java/com/alipay/mcp/springai/
├── AlipayMcpAutoConfiguration.java     # Spring Boot 自动配置
├── AlipayMcpProperties.java            # 配置属性（alipay.mcp.*）
├── client/
│   └── AlipayMcpClient.java            # 核心客户端
├── transport/
│   ├── AlipaySseMcpTransport.java      # SSE 传输（含签名）
│   ├── AlipayStreamableMcpTransport.java  # Streamable HTTP 传输（含签名）
│   ├── AlipayAuthRequestCustomizer.java   # 签名工具（Authorization 头构建）
│   └── AlipayMcpException.java         # 异常类
├── logging/
│   └── McpTransportLogger.java         # 传输层日志记录器
└── util/
    └── PrivateKeyLoader.java            # 私钥加载工具
```

## 依赖说明

| 依赖 | 版本 | 说明 |
|------|------|------|
| mcp (io.modelcontextprotocol.sdk) | 0.17.0 | MCP Java SDK |
| alipay-sdk-java-v3 | 3.1.70.ALL | 支付宝 v3 SDK（用于签名） |
| spring-boot-starter | 3.4.5 | Spring Boot |
| spring-webflux | - | 响应式流支持 |
| reactor-netty-http | - | HTTP 客户端 |
| jackson-databind | - | JSON 处理 |

## 常见问题

### Q: Spring AI 版本必须 1.1.4 吗？

如果只使用 `AlipayMcpClient` 调用 MCP 工具，不需要 Spring AI。如果配合 Spring AI 使用，建议使用 1.1.4+，因为本 SDK 内置的 MCP SDK 版本为 0.17.0，低版本 Spring AI 内置的 MCP SDK API 不兼容。

### Q: SSE 和 Streamable HTTP 怎么选？

- **SSE**：成熟稳定，配置默认值，线上环境默认推荐
- **Streamable HTTP**：MCP 协议新版传输方式（2025-03-26 规范），更适合网络代理环境，部分预发环境使用

### Q: 自动配置和编程式使用有什么区别？

- **自动配置**：Spring Boot 启动时自动创建 `AlipayMcpClient` Bean 并调用 `initialize()`，直接注入即可使用
- **编程式使用**：手动创建 `AlipayMcpClient` 实例，**必须手动调用 `initialize()`** 执行 MCP 握手后才能使用

### Q: 签名如何工作？

SDK 通过 MCP SDK 0.17.0 的 `McpSyncHttpClientRequestCustomizer` 扩展点，在每次 HTTP 请求时自动计算签名并注入 `Authorization` 头，无需手动处理。

## 许可证

Apache License 2.0
