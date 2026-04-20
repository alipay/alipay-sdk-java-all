# Alipay MCP SDK for Java

支付宝 MCP 网关 SDK for Java，基于标准 MCP (Model Context Protocol) 协议实现。

## 特性

- ✅ 基于标准 MCP 协议
- ✅ 支持 SSE (Server-Sent Events) 流式通信
- ✅ 支持 JSON-RPC 2.0 消息协议
- ✅ 复用支付宝 SDK 签名能力
- ✅ 极简配置（仅需 appId、privateKey、mcpName）

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

### 1. 创建配置

```java
// 方式一：使用 mcpName（自动拼接 SSE URL）
McpConfig config = new McpConfig(
    "2021006141677002",     // appId
    "-----BEGIN PRIVATE KEY----- ...",  // 私钥 (PKCS8 格式)
    "aidata-convenience-life5"  // mcpName
);

// 方式二：使用完整 SSE 端点 URL（推荐）
McpConfig config = new McpConfig(
    "2021006141677002",     // appId
    "-----BEGIN PRIVATE KEY----- ...",  // 私钥 (PKCS8 格式)
    null  // mcpName 可为 null
);
config.setSseEndpoint("https://opengw.alipay.com/api/v1/open/mcps/aidata-convenience-life5/sse");
```

### 2. 创建客户端并连接

```java
try (McpClient client = new McpClient(config)) {
    // 连接并初始化
    client.connectAndInitialize(new McpEventListener() {
        @Override
        public void onEndpointReady(String endpoint) {
            System.out.println("Endpoint: " + endpoint);
        }
        
        @Override
        public void onError(McpException e) {
            System.err.println("错误：" + e.getMessage());
        }
    });
    
    // 获取工具列表
    List<Tool> tools = client.listTools();
    tools.forEach(t -> System.out.println(t.getName()));
    
    // 调用工具
    Map<String, Object> args = new HashMap<>();
    args.put("query", "test");
    ToolCallResult result = client.callTool("my-tool", args);
    result.getContent().forEach(c -> System.out.println(c.getText()));
}
```

### 3. 使用 Builder 模式（推荐）

```java
// 方式一：使用 mcpName
try (McpClient client = new McpClientBuilder()
        .appId("2021006141677002")
        .privateKey("...")
        .mcpName("aidata-convenience-life5")
        .build()) {
    client.connectAndInitialize(listener);
    // ...
}

// 方式二：使用完整 SSE 端点 URL
try (McpClient client = new McpClientBuilder()
        .appId("2021006141677002")
        .privateKey("...")
        .sseEndpoint("https://opengw.alipay.com/api/v1/open/mcps/aidata-convenience-life5/sse")
        .build()) {
    client.connectAndInitialize(listener);
    // ...
}
```

### 4. 使用 SimpleMcpClient（最简洁）

```java
try (SimpleMcpClient client = SimpleMcpClient.create()
        .appId("2021006141677002")
        .privateKey("...")
        .sseEndpoint("https://opengw.alipay.com/api/v1/open/mcps/aidata-convenience-life5/sse")
        .build()) {
    
    client.connect();  // 自动初始化
    
    // 同步调用
    List<Tool> tools = client.listTools();
    
    // 异步调用
    CompletableFuture<ToolCallResult> future = client.callToolAsync("tool1", params);
    
    // Builder 模式调用
    ToolCallResult result = client.callTool("testOpenApi")
            .nestedParam("toolParams", "date", "2024-01-01")
            .nestedParam("toolParams", "type", "1")
            .execute();
}
```

## 核心 API

### 建立连接

```java
client.connect(new McpEventListener() {
    @Override
    public void onConnected() {
        System.out.println("连接已建立");
    }
    
    @Override
    public void onEndpointReady(String endpoint) {
        System.out.println("Endpoint 就绪：" + endpoint);
    }
    
    @Override
    public void onProgress(ProgressUpdate progress) {
        System.out.printf("进度：%d/%d%n", progress.getProgress(), progress.getTotal());
    }
    
    @Override
    public void onLog(LogMessage log) {
        System.out.printf("[%s] %s\n", log.getLevel(), log.getMessage());
    }
    
    @Override
    public void onError(McpException e) {
        System.err.println("错误：" + e.getMessage());
    }
});
```

### 获取工具列表

```java
List<Tool> tools = client.listTools();
```

### 调用工具

```java
Map<String, Object> args = new HashMap<>();
args.put("param1", "value1");
ToolCallResult result = client.callTool("tool-name", args);
```

### 初始化（可选）

```java
ClientCapabilities capabilities = new ClientCapabilities();
ClientInfo clientInfo = new ClientInfo();
clientInfo.setName("my-client");
clientInfo.setVersion("1.0.0");

InitializeResult initResult = client.initialize(capabilities, clientInfo);
System.out.println("协议版本：" + initResult.getProtocolVersion());
```

## 签名机制

SDK 复用支付宝 v3 SDK 的签名能力，签名规则如下：

**签名原文格式：**
```
{authString}
{method}
{url}
{body}
[{appAuthToken}]
```

**authString 格式：**
```
app_id={appId},timestamp={timestamp},nonce={nonce}
```

**Authorization Header：**
```
ALIPAY-SHA256withRSA {authString},sign={sign}
```

## 项目结构

```
mcp-sdk/
├── src/main/java/com/alipay/mcp/
│   ├── McpConfig.java              # 配置类
│   ├── McpException.java           # 异常类
│   ├── McpClient.java              # 主客户端
│   ├── auth/
│   │   └── McpAuthBuilder.java     # 认证头构建器
│   ├── protocol/
│   │   ├── JsonRpcMessage.java     # JSON-RPC 消息
│   │   ├── JsonRpcError.java       # JSON-RPC 错误
│   │   ├── Tool.java               # Tool 定义
│   │   ├── ToolCall.java           # Tool 调用参数
│   │   ├── ToolCallResult.java     # Tool 调用结果
│   │   ├── Content.java            # 内容项
│   │   ├── Resource.java           # 资源引用
│   │   ├── JsonSchema.java         # JSON Schema
│   │   └── JsonSchemaProperty.java # JSON Schema 属性
│   └── transport/
│       ├── SseConnection.java      # SSE 连接管理
│       ├── McpEventListener.java   # 事件监听器
│       ├── EndpointResponse.java   # Endpoint 事件
│       ├── ProgressUpdate.java     # 进度更新
│       └── LogMessage.java         # 日志消息
├── src/test/java/
│   └── com/alipay/mcp/
│       └── McpClientDemo.java      # 使用示例
├── pom.xml
└── README.md
```

## 依赖说明

| 依赖 | 说明 |
|------|------|
| alipay-sdk-java-v3 | 支付宝 v3 SDK（用于签名） |
| okhttp-sse | OkHttp SSE 支持 |
| gson | JSON 序列化/反序列化 |

## 许可证

Apache License 2.0