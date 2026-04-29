# 支付宝 Spring AI MCP SDK

支付宝 MCP (Model Context Protocol) SDK for Spring AI，集成支付宝开放平台 MCP Server，支持 RSA2 自动签名。

## 特性

- ✅ 基于 Spring AI 和 MCP 协议
- ✅ 支持 SSE (Server-Sent Events) 流式通信
- ✅ 支持 Streamable HTTP 传输（MCP 2025-03-26 协议）
- ✅ HTTP 请求自动添加 RSA2 签名
- ✅ 响应式编程（Reactor Flux/Mono）
- ✅ Spring Boot 自动配置
- ✅ 完整的日志追踪

## 模块结构

```
alipay-spring-ai/
├── alipay-spring-ai-mcp-core/           # 核心模块
│   ├── client/AlipayMcpClient.java      # MCP 客户端
│   ├── transport/AlipaySseMcpTransport.java  # 带签名的 Transport
│   └── transport/AlipayMcpException.java     # 异常类
│
├── alipay-spring-ai-mcp-autoconfigure/  # 自动配置
│   ├── AlipayMcpProperties.java         # 配置属性
│   └── AlipayMcpAutoConfiguration.java  # 自动配置类
│
├── alipay-spring-ai-mcp-starter/        # Starter（聚合）
│
└── alipay-spring-ai-mcp-sample/         # Demo 示例
```

## 快速开始

### 1. 引入依赖

> **⚠️ 依赖变更说明（v1.0.0-SNAPSHOT）：** 从此版本开始，`alipay-spring-ai-mcp-starter` 不再内嵌 MCP SDK（`io.modelcontextprotocol.sdk:mcp`），改为 `provided` 依赖。使用者**必须**在项目中引入 MCP SDK 依赖，通常通过 `spring-ai-starter-mcp-server-webmvc` 间接传递即可。

**推荐方式（通过 Spring AI BOM 管理版本）：**

```xml
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>org.springframework.ai</groupId>
            <artifactId>spring-ai-bom</artifactId>
            <version>1.0.0-SNAPSHOT</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>

<dependencies>
    <!-- alipay mcp starter（不再内嵌 mcp SDK） -->
    <dependency>
        <groupId>com.alipay.sdk</groupId>
        <artifactId>alipay-spring-ai-mcp-starter</artifactId>
        <version>1.0.0-SNAPSHOT</version>
    </dependency>

    <!-- spring-ai mcp server（自动传递 mcp SDK 依赖，无需额外声明） -->
    <dependency>
        <groupId>org.springframework.ai</groupId>
        <artifactId>spring-ai-starter-mcp-server-webmvc</artifactId>
    </dependency>
</dependencies>
```

**版本兼容性对照：**

| Spring AI BOM 版本 | 对应的 MCP SDK 版本 |
|---|---|
| 1.0.0-M4 | 0.11.3 |
| 1.0.0-SNAPSHOT | 0.10.0 |

### 2. 配置 application.yml

**SSE 模式（默认）：**

```yaml
alipay:
  mcp:
    enabled: true
    app-id: your-app-id
    private-key: ${ALIPAY_PRIVATE_KEY}
    transport-mode: sse  # 默认值，可省略
    sse-endpoint: https://opengw.alipay.com/api/v1/open/mcps/your-mcp-name/sse
```

**Streamable HTTP 模式（推荐）：**

```yaml
alipay:
  mcp:
    enabled: true
    app-id: your-app-id
    private-key: ${ALIPAY_PRIVATE_KEY}
    transport-mode: streamable
    streamable-endpoint: https://opengw.alipay.com/api/v1/open/mcps/your-mcp-name/mcp
```

**简化配置（自动构建端点）：**

```yaml
alipay:
  mcp:
    enabled: true
    app-id: your-app-id
    private-key: ${ALIPAY_PRIVATE_KEY}
    transport-mode: streamable  # 或 sse
    base-uri: https://opengw.alipay.com
    mcp-name: your-mcp-name     # 自动构建为 /api/v1/open/mcps/{mcp-name}/{mcp|sse}
```

**配置说明：**

| 配置项 | 说明 | 必填 | 示例 |
|--------|------|------|------|
| `alipay.mcp.enabled` | 是否启用 | 否 | `true` |
| `alipay.mcp.app-id` | 支付宝应用 ID | 是 | `2021006141677002` |
| `alipay.mcp.private-key` | 应用私钥（PKCS8） | 是 | 环境变量 `${ALIPAY_PRIVATE_KEY}` |
| `alipay.mcp.transport-mode` | 传输模式 | 否 | `sse` 或 `streamable` |
| `alipay.mcp.sse-endpoint` | SSE 端点 | 条件 | SSE 模式下的完整端点 URL |
| `alipay.mcp.streamable-endpoint` | Streamable 端点 | 条件 | Streamable 模式下的完整端点 URL |
| `alipay.mcp.base-uri` | 基础 URI | 条件 | 与 `mcp-name` 一起使用时可省略端点配置 |
| `alipay.mcp.mcp-name` | MCP 名称 | 条件 | 与 `base-uri` 一起使用时可省略端点配置 |

### 3. 设置环境变量

私钥必须通过环境变量配置，避免敏感信息泄露。

**Linux/macOS:**

```bash
# 临时设置（当前终端有效）
export ALIPAY_PRIVATE_KEY="-----BEGIN PRIVATE KEY-----\nYOUR_PRIVATE_KEY\n-----END PRIVATE KEY-----"

# 永久设置（添加到 ~/.bashrc 或 ~/.zshrc）
echo 'export ALIPAY_PRIVATE_KEY="-----BEGIN PRIVATE KEY-----\nYOUR_PRIVATE_KEY\n-----END PRIVATE KEY-----"' >> ~/.zshrc
source ~/.zshrc
```

**Windows (PowerShell):**

```powershell
# 临时设置
$env:ALIPAY_PRIVATE_KEY="-----BEGIN PRIVATE KEY-----`nYOUR_PRIVATE_KEY`n-----END PRIVATE KEY-----"

# 永久设置
[System.Environment]::SetEnvironmentVariable("ALIPAY_PRIVATE_KEY", "YOUR_PRIVATE_KEY", "User")
```

**验证配置:**

```bash
# 检查环境变量是否设置成功
echo $ALIPAY_PRIVATE_KEY
```

> ⚠️ 注意：私钥包含换行符，在命令行赋值时需要用 `\n` 转义，或使用单引号包裹多行字符串。

### 4. 使用 AlipayMcpClient

```java
@RestController
public class MyController {

    @Autowired
    private AlipayMcpClient mcpClient;

    public void test() {
        // 获取工具列表
        List<Tool> tools = mcpClient.listTools();

        // 调用工具
        ToolCallResult result = mcpClient.callTool("toolName", Map.of("key", "value"));
    }
}
```

## API 说明

### AlipayMcpClient

| 方法 | 说明 |
|------|------|
| `listTools()` | 获取可用工具列表 |
| `listToolsStream()` | 流式获取工具列表 |
| `callTool(name, args)` | 同步调用工具 |
| `callToolStream(name, args)` | 流式调用工具 |
| `callToolAsync(name, args)` | 异步调用工具 |
| `getClientInfo()` | 获取客户端信息 |
| `getSyncClient()` | 获取 Spring AI 原生 McpSyncClient |
| `getAsyncClient()` | 获取 Spring AI 原生 McpAsyncClient |
| `close()` | 关闭客户端 |

### TransportMode 枚举

| 模式 | 说明 | 端点路径 |
|------|------|----------|
| `SSE` | HTTP with SSE（旧版协议） | `/sse` |
| `STREAMABLE` | Streamable HTTP（新版协议，2025-03-26） | `/mcp` |

### ToolCallResult

```java
record ToolCallResult(String content, String type, boolean isError) {}
```

## Demo 示例

### 启动 Demo

```bash
cd alipay-spring-ai-mcp-sample

# 设置私钥环境变量（私钥需要包含换行符）
export ALIPAY_PRIVATE_KEY="-----BEGIN PRIVATE KEY-----
YOUR_PRIVATE_KEY_CONTENT
-----END PRIVATE KEY-----"

# 启动应用
mvn spring-boot:run
```

### 测试接口

```bash
# 健康检查
curl http://localhost:8080/api/test/health

# 签名测试（查看日志中的 Authorization 头）
curl http://localhost:8080/api/test/mcp/sign-test

# 获取工具列表
curl http://localhost:8080/api/test/mcp/tools

# 调用工具
curl -X POST http://localhost:8080/api/test/mcp/call/Holidays \
  -H "Content-Type: application/json" \
  -d '{"toolParams": {"from": "2025-01-01", "to": "2025-12-31"}}'
```

### Streamable HTTP 模式测试

如果配置了 `transport-mode: streamable`，可以使用以下接口：

```bash
# 获取工具列表
curl http://localhost:8080/api/streamable/tools

# 流式获取工具列表（SSE 输出）
curl http://localhost:8080/api/streamable/tools/stream

# 同步调用工具
curl -X POST http://localhost:8080/api/streamable/tool/Holidays \
  -H "Content-Type: application/json" \
  -d '{"from": "2025-01-01", "to": "2025-12-31"}'

# 流式调用工具（SSE 输出）
curl -X POST http://localhost:8080/api/streamable/tool/Holidays/stream \
  -H "Content-Type: application/json" \
  -d '{"from": "2025-01-01", "to": "2025-12-31"}'

# 健康检查
curl http://localhost:8080/api/streamable/health
```

## 签名机制

SDK 自动为所有 MCP 请求添加 RSA2 签名：

```
Authorization: ALIPAY-SHA256withRSA app_id=xxx,timestamp=xxx,nonce=xxx,sign=xxx
```

签名内容：
```
app_id=xxx,timestamp=xxx,nonce=xxx
POST
/api/v1/open/mcps/xxx/sse
{request body}
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

## 依赖版本

- Spring Boot: 3.2.0
- Spring AI: 1.0.0-M4
- MCP SDK: 0.11.3
- 支付宝 SDK: 3.1.70.ALL

## 许可证

Apache License 2.0