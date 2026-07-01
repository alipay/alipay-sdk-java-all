# Alipay MCP SDK for Java

支付宝 MCP 网关 SDK for Java，基于标准 MCP (Model Context Protocol) 协议实现，帮助开发者快速接入支付宝 MCP 网关服务。

## 特性

- 基于标准 MCP 协议，支持 JSON-RPC 2.0 消息格式
- 支持 SSE (Server-Sent Events) 传输（协议版本：2024-11-05）
- 支持 Streamable HTTP 传输（协议版本：2025-03-26），推荐使用
- 复用支付宝 SDK 签名能力，自动完成请求认证
- 支持自定义拦截器链，可扩展日志、监控等能力
- 支持 Session-ID 会话保持（Streamable 模式）
- 提供简化客户端 `SimpleMcpClient`，开箱即用

## 环境要求

- Java 1.8+
- Maven 3.8+

## 安装

### Maven 依赖

```xml
<dependency>
    <groupId>com.alipay.sdk</groupId>
    <artifactId>alipay-mcp-sdk</artifactId>
    <version>1.0.0</version>
</dependency>
```

## 快速开始

SDK 提供两种客户端：

| 客户端 | 适用场景 | 特点 |
|--------|---------|------|
| `SimpleMcpClient` | 快速开发、大多数场景 | API 简洁，自动连接和初始化，支持 Builder 链式调用工具参数 |
| `McpClient` | 需要完整协议控制 | 完整的 MCP 协议支持，支持自定义拦截器 |

### 1. SimpleMcpClient（推荐）

`SimpleMcpClient` 是简化版客户端，自动完成连接与初始化握手，API 更加简洁。

#### Streamable HTTP 模式（默认，推荐）

```java
try (SimpleMcpClient client = SimpleMcpClient.create()
        .appId("2021006141677002")
        .privateKey("-----BEGIN PRIVATE KEY----- ...")
        .mcpName("aidata-convenience-life5")
        .serverUrl("https://opengw.alipay.com")
        .build()) {

    // 连接并自动完成初始化
    client.connect();

    // 获取工具列表
    List<Tool> tools = client.listTools();

    // 调用工具（Map 参数）
    Map<String, Object> args = new HashMap<>();
    args.put("from", "2024-01-01");
    args.put("to", "2024-12-31");
    ToolCallResult result = client.callTool("Holidays", args);

    // 读取结果
    result.getContent().forEach(c -> System.out.println(c.getText()));
}
```

#### SSE 模式（兼容旧版协议）

```java
try (SimpleMcpClient client = SimpleMcpClient.create()
        .appId("2021006141677002")
        .privateKey("-----BEGIN PRIVATE KEY----- ...")
        .mcpName("aidata-convenience-life5")
        .transportMode("sse")  // 显式设置为 SSE 模式
        .serverUrl("https://opengw.alipay.com")
        .build()) {

    client.connect();
    List<Tool> tools = client.listTools();
}
```

#### Builder 链式调用工具参数

`SimpleMcpClient` 提供了链式 Builder 风格来构建工具调用参数，支持嵌套参数：

```java
ToolCallResult result = client.callTool("myTool")
        .param("query", "test")
        .nestedParam("toolParams", "date", "2024-01-01")
        .nestedParam("toolParams", "type", "1")
        .execute();
```

#### 异步调用

```java
// 异步获取工具列表
CompletableFuture<List<Tool>> toolsFuture = client.listToolsAsync();

// 异步调用工具
CompletableFuture<ToolCallResult> resultFuture = client.callToolAsync("Holidays", args);

// 异步 Builder 风格
CompletableFuture<ToolCallResult> future = client.callTool("Holidays")
        .param("from", "2024-01-01")
        .param("to", "2024-12-31")
        .executeAsync();
```

#### 辅助方法

```java
// 检查工具是否存在
boolean exists = client.hasTool("Holidays");

// 获取工具详情
Tool tool = client.getTool("Holidays");
System.out.println(tool.getName() + ": " + tool.getDescription());
```

### 2. McpClient（完整协议控制）

`McpClient` 通过 `McpClientBuilder` 构建，适合需要自定义拦截器或精细控制 MCP 协议的场景。

#### Streamable HTTP 模式（推荐）

```java
try (McpClient client = new McpClientBuilder()
        .appId("2021006141677002")
        .privateKey("-----BEGIN PRIVATE KEY----- ...")
        .mcpName("aidata-convenience-life5")
        .transportMode("streamable")
        .serverUrl("https://opengw.alipay.com")
        .build()) {

    // 建立连接并完成初始化握手
    client.connectAndInitialize(new McpEventListener() {
        @Override
        public void onConnected() {
            System.out.println("连接已建立");
        }

        @Override
        public void onError(McpException e) {
            System.err.println("错误：" + e.getMessage());
        }
    });

    // 获取工具列表
    List<Tool> tools = client.listTools();

    // 调用工具
    Map<String, Object> args = new HashMap<>();
    args.put("from", "2024-01-01");
    args.put("to", "2024-12-31");
    ToolCallResult result = client.callTool("Holidays", args);
}
```

#### SSE 模式

```java
try (McpClient client = new McpClientBuilder()
        .appId("2021006141677002")
        .privateKey("-----BEGIN PRIVATE KEY----- ...")
        .mcpName("aidata-convenience-life5")
        .transportMode("sse")
        .serverUrl("https://opengw.alipay.com")
        .build()) {

    client.connectAndInitialize(listener);
    List<Tool> tools = client.listTools();
}
```

#### 使用完整端点 URL

除了通过 `mcpName` 自动拼接端点 URL 外，也可以直接指定完整的端点地址：

```java
// Streamable HTTP 端点
try (McpClient client = new McpClientBuilder()
        .appId("2021006141677002")
        .privateKey("-----BEGIN PRIVATE KEY----- ...")
        .transportMode("streamable")
        .streamableEndpoint("https://opengw.alipay.com/api/v1/open/mcps/aidata-convenience-life5/mcp")
        .build()) {
    // ...
}

// SSE 端点
try (McpClient client = new McpClientBuilder()
        .appId("2021006141677002")
        .privateKey("-----BEGIN PRIVATE KEY----- ...")
        .transportMode("sse")
        .sseEndpoint("https://opengw.alipay.com/api/v1/open/mcps/aidata-convenience-life5/sse")
        .build()) {
    // ...
}
```

### 3. 自定义拦截器

SDK 支持自定义拦截器，可以在请求发送前后添加自定义逻辑（如日志、监控、认证增强等）。`McpClientBuilder` 会自动添加 `AlipayAuthInterceptor` 进行签名认证，无需手动添加。

```java
// 创建日志拦截器
Interceptor loggingInterceptor = new Interceptor() {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        long start = System.currentTimeMillis();
        System.out.println("[Logger] >>> " + request.getMethod() + " " + request.getUrl());

        Response response = chain.proceed(request);

        long cost = System.currentTimeMillis() - start;
        System.out.println("[Logger] <<< " + response.getCode() + " (" + cost + "ms)");
        return response;
    }
};

try (McpClient client = new McpClientBuilder()
        .appId("2021006141677002")
        .privateKey("-----BEGIN PRIVATE KEY----- ...")
        .mcpName("aidata-convenience-life5")
        .addInterceptor(loggingInterceptor)
        .build()) {
    // ...
}
```

## 配置说明

### SimpleMcpClient 配置项

| 方法 | 必填 | 默认值 | 说明 |
|------|------|--------|------|
| `appId(String)` | 是 | - | 应用 ID |
| `privateKey(String)` | 是 | - | 应用私钥（PKCS8 格式） |
| `mcpName(String)` | 与 endpoint 二选一 | - | MCP 服务名称，用于自动拼接端点 URL |
| `sseEndpoint(String)` | 与 mcpName 二选一 | - | SSE 端点完整 URL |
| `streamableEndpoint(String)` | 与 mcpName 二选一 | - | Streamable HTTP 端点完整 URL |
| `transportMode(String)` | 否 | `"streamable"` | 传输模式：`"streamable"` 或 `"sse"` |
| `serverUrl(String)` | 否 | `https://opengw.alipay.com` | 网关地址 |
| `connectTimeout(int)` | 否 | `10000` | 连接超时（毫秒） |
| `readTimeout(int)` | 否 | `60000` | 读取超时（毫秒） |
| `clientName(String)` | 否 | `"mcp-java-sdk"` | 客户端名称 |
| `clientVersion(String)` | 否 | `"1.0.0"` | 客户端版本 |
| `protocolVersion(String)` | 否 | 自动根据模式选择 | MCP 协议版本 |
| `onProgress(Consumer)` | 否 | - | 进度回调 |
| `onLog(Consumer)` | 否 | - | 日志回调 |
| `onError(Consumer)` | 否 | - | 错误回调 |

### McpClientBuilder 额外配置项

在 SimpleMcpClient 基础上，`McpClientBuilder` 还支持：

| 方法 | 默认值 | 说明 |
|------|--------|------|
| `sseConnectTimeout(int)` | `30000` | SSE 连接超时（毫秒） |
| `endpointReadyTimeout(int)` | `10000` | Endpoint 就绪超时（毫秒） |
| `requestTimeout(int)` | `30000` | 请求超时（毫秒） |
| `callToolTimeout(int)` | `60000` | 工具调用超时（毫秒） |
| `customHeader(String, String)` | - | 自定义请求头 |
| `alipayPublicKey(String)` | - | 支付宝公钥（用于验签） |
| `appAuthToken(String)` | - | 应用授权令牌 |
| `capability(String, Object)` | - | 客户端能力声明 |
| `addInterceptor(Interceptor)` | - | 添加自定义拦截器 |

## 核心 API

### McpClient

| 方法 | 说明 |
|------|------|
| `connect(McpEventListener)` | 建立连接 |
| `connectAndInitialize(McpEventListener)` | 建立连接并自动完成初始化握手 |
| `listTools()` | 同步获取工具列表 |
| `listToolsAsync()` | 异步获取工具列表 |
| `callTool(String, Map)` | 同步调用工具 |
| `callToolAsync(String, Map)` | 异步调用工具 |
| `initialize(ClientCapabilities, ClientInfo)` | 手动初始化（可选） |
| `sendNotification(String, Object)` | 发送通知（不等待响应） |
| `close()` | 关闭连接 |

### SimpleMcpClient

| 方法 | 说明 |
|------|------|
| `connect()` | 连接并自动初始化（幂等） |
| `listTools()` | 同步获取工具列表 |
| `listToolsAsync()` | 异步获取工具列表 |
| `callTool(String, Map)` | 同步调用工具 |
| `callToolAsync(String, Map)` | 异步调用工具 |
| `callTool(String)` | 返回 Builder，支持链式参数构建 |
| `getTool(String)` | 获取指定工具详情 |
| `hasTool(String)` | 检查工具是否存在 |
| `callToolsParallel(List)` | 并发调用多个工具 |
| `close()` | 关闭连接 |

### McpEventListener

| 回调方法 | 说明 |
|----------|------|
| `onConnected()` | 连接建立 |
| `onEndpointReady(String)` | 消息端点就绪 |
| `onMessage(JsonRpcMessage)` | 接收到 JSON-RPC 消息 |
| `onNotification(JsonRpcMessage)` | 接收到通知消息 |
| `onProgress(ProgressUpdate)` | 进度更新 |
| `onLog(LogMessage)` | 日志输出 |
| `onDisconnected()` | 连接断开 |
| `onError(McpException)` | 发生错误 |

## 签名机制

SDK 内置 `AlipayAuthInterceptor`，自动为每个请求生成签名。签名过程复用支付宝 v3 SDK 的 `AlipaySignature` 能力，无需手动处理。

**签名原文格式：**

```
{authString}
{method}
{uri}
{body}
[{appAuthToken}]
```

**Authorization Header：**

```
ALIPAY-SHA256withRSA app_id={appId},timestamp={timestamp},nonce={nonce},sign={sign}
```

## 传输模式对比

| 特性 | Streamable HTTP（推荐） | SSE |
|------|------------------------|-----|
| 协议版本 | 2025-03-26 | 2024-11-05 |
| 连接方式 | HTTP 请求/响应 | SSE 长连接 |
| Session-ID | 支持 | 不支持 |
| 适用场景 | 新项目，推荐使用 | 兼容旧版 |

## 项目结构

```
mcp-sdk/src/main/java/com/alipay/mcp/
├── McpClient.java                    # 主客户端（完整协议控制）
├── SimpleMcpClient.java              # 简化客户端（推荐）
├── McpException.java                 # 异常类
├── auth/
│   └── McpAuthBuilder.java           # 认证头构建器
├── builder/
│   └── McpClientBuilder.java         # McpClient 构建器
├── config/
│   └── McpClientConfig.java          # 客户端配置
├── interceptor/
│   ├── Interceptor.java              # 拦截器接口
│   ├── InterceptorChain.java         # 拦截器链
│   ├── AlipayAuthInterceptor.java    # 支付宝认证拦截器（签名）
│   ├── Request.java                  # 请求对象
│   └── Response.java                 # 响应对象
├── protocol/
│   ├── Tool.java                     # Tool 定义
│   ├── ToolCallParams.java           # Tool 调用参数
│   ├── ToolCallResult.java           # Tool 调用结果
│   ├── Content.java                  # 内容项（text/image/resource）
│   ├── Resource.java                 # 资源引用
│   ├── JsonRpcMessage.java           # JSON-RPC 消息
│   ├── JsonRpcError.java             # JSON-RPC 错误
│   ├── JsonSchema.java               # JSON Schema
│   └── JsonSchemaProperty.java       # JSON Schema 属性
└── transport/
    ├── TransportLayer.java           # 传输层接口
    ├── SseConnection.java            # SSE 连接管理
    ├── StreamableHttpConnection.java # Streamable HTTP 连接管理
    ├── McpEventListener.java         # 事件监听器
    ├── ReconnectConfig.java          # 重连配置
    ├── EndpointResponse.java         # Endpoint 响应
    ├── ProgressUpdate.java           # 进度更新
    └── LogMessage.java               # 日志消息
```

## 依赖说明

| 依赖 | 版本 | 说明 |
|------|------|------|
| alipay-sdk-java-v3 | 3.1.70.ALL | 支付宝 v3 SDK（用于签名） |
| okhttp-sse | 4.9.3 | OkHttp SSE 支持 |
| gson | 2.9.0 | JSON 序列化/反序列化 |
| slf4j-api | 1.7.36 | 日志门面 |

## 许可证

Apache License 2.0
