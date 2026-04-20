# Alipay MCP SDK 架构设计文档

## 一、架构设计

### 1.1 整体架构

```
┌─────────────────────────────────────────────────────────────┐
│                      用户层                                  │
│  McpClientBuilder │ 自定义 Interceptor │ Custom Headers    │
└───────────────────────────┬─────────────────────────────────┘
                            │
┌───────────────────────────▼─────────────────────────────────┐
│                      SDK 核心层                             │
│  ┌────────────────┐  ┌──────────────┐  ┌───────────────┐  │
│  │   McpClient   │  │ McpClient    │  │  Interceptor │  │
│  │   (客户端)     │◄─┤   Config     │  │    Chain     │  │
│  └───────┬────────┘  └──────────────┘  └───────────────┘  │
└──────────┼──────────────────────────────────────────────────┘
           │
┌──────────▼──────────────────────────────────────────────────┐
│                      传输层                                  │
│  ┌────────────────────┐  ┌─────────────────────────────┐   │
│  │   SseConnection    │  │   HTTP POST (消息发送)      │   │
│  │   (SSE 长连接)      │  │                             │   │
│  └────────────────────┘  └─────────────────────────────┘   │
└─────────────────────────────────────────────────────────────┘
```

### 1.2 模块划分

| 模块 | 包路径 | 职责 |
|------|--------|------|
| config | `com.alipay.mcp.config` | 配置管理 |
| builder | `com.alipay.mcp.builder` | Builder 构建器 |
| interceptor | `com.alipay.mcp.interceptor` | 拦截器机制 |
| client | `com.alipay.mcp` | 客户端核心 |
| transport | `com.alipay.mcp.transport` | 网络传输 |
| protocol | `com.alipay.mcp.protocol` | 协议模型 |
| auth | `com.alipay.mcp.auth` | 认证（内部使用） |

---

## 二、核心类设计

### 2.1 配置类 (McpClientConfig)

```java
public class McpClientConfig {
    // 必需参数
    private String appId;
    private String privateKey;
    private String mcpName;

    // 可选参数
    private String serverUrl = "https://opengw.alipay.com";
    private int connectTimeout = 10000;
    private int readTimeout = 60000;
    private Map<String, String> customHeaders = new HashMap<>();
    private String alipayPublicKey;
    private String appAuthToken;
}
```

### 2.2 Builder (McpClientBuilder)

链式调用构建客户端，自动添加支付宝认证拦截器：

```java
public class McpClientBuilder {
    private McpClientConfig config = new McpClientConfig();
    private List<Interceptor> interceptors = new ArrayList<>();

    // 必需参数
    public McpClientBuilder appId(String appId);
    public McpClientBuilder privateKey(String privateKey);
    public McpClientBuilder mcpName(String mcpName);

    // 可选参数
    public McpClientBuilder serverUrl(String serverUrl);
    public McpClientBuilder customHeader(String key, String value);
    public McpClientBuilder appAuthToken(String token);

    // 拦截器
    public McpClientBuilder addInterceptor(Interceptor interceptor);

    public McpClient build();
}
```

### 2.3 拦截器接口 (Interceptor)

```java
public interface Interceptor {
    Response intercept(Chain chain) throws IOException;

    interface Chain {
        Request request();
        Response proceed(Request request) throws IOException;
        McpClientConfig config();
    }
}
```

### 2.4 核心类

| 类名 | 职责 |
|------|------|
| `McpClientConfig` | 配置类，持有所有配置 |
| `McpClientBuilder` | Builder，构建客户端 |
| `McpClient` | 主客户端类 |
| `Interceptor` | 拦截器接口 |
| `InterceptorChain` | 拦截器链实现 |
| `AlipayAuthInterceptor` | 支付宝加签拦截器 |
| `Request` | 请求对象 |
| `Response` | 响应对象 |

---

## 三、通信机制

### 3.1 SSE 长连接

- **用途**: 服务端主动推送（通知、进度、日志）
- **建立**: 客户端发起 SSE 请求到 `/api/v1/open/mcps/{mcpName}/sse`
- **事件类型**: `endpoint`, `message`, `progress`, `log`

### 3.2 HTTP POST

- **用途**: 客户端请求响应（tools/list、tools/call 等）
- **地址**: 由 SSE 返回的 `endpoint` 决定
- **响应**: 直接在 HTTP 响应体中返回 JSON-RPC 消息

---

## 四、使用示例

### 4.1 基础用法

```java
McpClient client = new McpClientBuilder()
    .appId("2021006141677002")
    .privateKey("MIIEvgIBADAN...")
    .mcpName("aidata-convenience-life5")
    .build();

client.connect(listener);
List<Tool> tools = client.listTools();
```

### 4.2 自定义 Header

```java
McpClient client = new McpClientBuilder()
    .appId("2021006141677002")
    .privateKey("MIIEvgIBADAN...")
    .mcpName("aidata-convenience-life5")
    .customHeader("X-Custom-Header", "value")
    .build();
```

### 4.3 自定义拦截器

```java
// 创建自定义拦截器
Interceptor loggingInterceptor = new Interceptor() {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        long start = System.currentTimeMillis();

        System.out.println("请求: " + request.getMethod() + " " + request.getUrl());

        Response response = chain.proceed(request);

        long cost = System.currentTimeMillis() - start;
        System.out.println("响应: " + response.getCode() + ", 耗时: " + cost + "ms");

        return response;
    }
};

McpClient client = new McpClientBuilder()
    .appId("2021006141677002")
    .privateKey("MIIEvgIBADAN...")
    .mcpName("aidata-convenience-life5")
    .addInterceptor(loggingInterceptor)
    .build();
```

---

## 五、文件清单

### 新建文件

| 文件 | 路径 |
|------|------|
| McpClientConfig | `mcp-sdk/src/main/java/com/alipay/mcp/config/McpClientConfig.java` |
| McpClientBuilder | `mcp-sdk/src/main/java/com/alipay/mcp/builder/McpClientBuilder.java` |
| Interceptor | `mcp-sdk/src/main/java/com/alipay/mcp/interceptor/Interceptor.java` |
| InterceptorChain | `mcp-sdk/src/main/java/com/alipay/mcp/interceptor/InterceptorChain.java` |
| Request | `mcp-sdk/src/main/java/com/alipay/mcp/interceptor/Request.java` |
| Response | `mcp-sdk/src/main/java/com/alipay/mcp/interceptor/Response.java` |
| AlipayAuthInterceptor | `mcp-sdk/src/main/java/com/alipay/mcp/interceptor/AlipayAuthInterceptor.java` |
| TransportLayer | `mcp-sdk/src/main/java/com/alipay/mcp/transport/TransportLayer.java` |

### 修改文件

| 文件 | 变更 |
|------|------|
| McpClient.java | 添加新构造函数，支持 McpClientConfig 和拦截器列表 |
| McpClientDemo.java | 更新为新的 Builder 用法 |

---

## 六、拦截器链执行流程

```
Request ──► Interceptor1 ──► Interceptor2 ──► ... ──► HTTP Client
             (Auth)           (Logging)              │
             └───────────────┬───────────────────────┘
                             │
                    Response ◄───────────────────────┘
```

1. 拦截器按添加顺序执行
2. 支付宝认证拦截器自动放在第一位
3. 每个拦截器通过 `chain.proceed()` 传递请求给下一个拦截器
4. 响应沿相反方向返回