package com.alipay.mcp.springai.transport;

import com.alipay.mcp.springai.util.PrivateKeyLoader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpResponse;

import java.net.URI;
import java.security.PrivateKey;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

/**
 * 支付宝认证拦截器测试
 *
 * 参考 alipay-mcp-sdk 中的 McpAuthBuilderTest
 */
@ExtendWith(MockitoExtension.class)
class AlipayAuthInterceptorTest {

    /**
     * 测试私钥（与 alipay-mcp-sdk 保持一致）
     */
    private static final String TEST_PRIVATE_KEY = "-----BEGIN PRIVATE KEY----- " +
        "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDORnQ5jZnurOS9U6o26J1ZH5wWSsaRHERQ3U3EXBI3iRnkHJGFjg1RK6OYswOnYEtzJKripFxaq6mzWS75qnmG4Ny49MyIVT1zL7rDWtMP9DYaGAVTrccCyZe8IjbQR0TW1zNbcj4ue+jYqkv5+/sHX0f/EtKOgcnTb7bXrYL+co7s0fFTQfdc6HbNisoX5ZdtjG1Y6166GDBTndxE8/95GBlBNkT5e8rF84OvATbATBCmuOAA4XcGfeRVUFjPPgwIjbIgpcprlmTZMWjVP7OFVAdC9HkNKsWgbinGigvBb/FCIrGx+10dCghRvegBH7Ua/LsIoFjgvyf1zbbqwt0dAgMBAAECggEAb97H89q3DDmaSI/SdbsMcyRwi6p8LIDvEAglwAPLIXFqqEtSJOOYl1gafps/tQvFf6n4P7iyGb6V553Lmz34cM0NCAZD0wCfthPBr2dXpoRkvxwd73cEwp9Aepj3r1ennvjRcpvv21f6PV+Gmwos55+mNVEo/n6nTdN9j1UcARB4k1rpK66YTwTUn1dwFBp4JMyUZy2LzbnpF4qa0sRvrwhUlgjKrJGXzaW26y0chI02SEx/k2AQ78wd+nbhYABYU/xTVioZiYoyCGM5e3ehDXsELs5Ks0JqD/MZD5JhS9P6KFOLgVsfz7UVf5EVHiDseLwKEXWLpJqQJ6qOogkmYQKBgQDyeYHPYGzOFyvov5FQC6VXYdXj4uO+E68aIaXyvnczbqOTYsWnw6gFDFcnNSMcVcfMhwkfLOKsWUQ/cbgnDi6pVrkjHhSIwude2K1RvHWQ7wzY8weT1CkORPWrR70V2MS2dv8qdRWZ9g6ic0QuJW/7ElngbDpdexGMfS1NOaANyQKBgQDZyAacynbO1w3Wk2TdF+S/TjkrBA6fEELZhmCQAmt250VIwLDP/ignmUKrzGa81fsF2M7Rlt6wDpppcTgZY4emtozreQZFaf6i4FyqGIPdBFFpM5R3VFqbkxDirYjlwl74H+SsQnmWC0DDnq+Cee0PKb4Ya2jRr6lEEuoUDKcutQKBgQDeh2j82y/ADD/+ASHpZma9xUo5NJdycDo5LzxPhUF8cEOrFfD0QHpI98RcdUXd0VPmft9+PwFgzyP1XfZ10Ww9eRu8APUzdjxFLXITG3SCKQGPcas4nnN3Zw5XvSTpkeEm3Brd6kqC2/EeYc7m0vDsaTEW5/zAohu+5XrX7tTXEQKBgQCmnrgYa3rco4KN4fUwhuBXUWTBuXfqUMmknX/xjjhkH2tNz0c3yu8z5Lkysc8EuP42KfuKNVCpCHMxKxNNsW2OqmpEmjKnFwJf4SJkbR8uEOisgW8coSg1kR5BH532k3CPi+8rsCxQFMn3IMiNHfW2PSyYiE0I6MmrMIFw14FtZQKBgHx08LIwK4Fk6vfsaxPpmD8DLPL76EbDOyNnNUkp6q2UmG5ZoGb5JEHEk52HnAdpbQ45aIE5jEVy54ubqjSkID8/Bxbp5vIwVpPr8D7boj6Xz99uy5qjiHCIfDXXlqb+yE863SQykQxzSkNj6TPCBMM2PYHVMRS3YtIk2UjfdVI5 " +
        "-----END PRIVATE KEY-----";

    private static final String TEST_APP_ID = "test-app-id";

    @Mock
    private HttpRequest request;

    @Mock
    private ClientHttpRequestExecution execution;

    @Mock
    private ClientHttpResponse response;

    private PrivateKey privateKey;
    private AlipayAuthInterceptor interceptor;
    private HttpHeaders headers;

    @BeforeEach
    void setUp() {
        privateKey = PrivateKeyLoader.loadFromString(TEST_PRIVATE_KEY);
        interceptor = new AlipayAuthInterceptor(TEST_APP_ID, privateKey, null);
        headers = new HttpHeaders();
    }

    @Test
    void testInterceptAddsAuthorizationHeader() throws Exception {
        System.out.println("=== 测试添加 Authorization 头 ===");

        // 设置 mock
        when(request.getMethod()).thenReturn(HttpMethod.GET);
        when(request.getURI()).thenReturn(new URI("https://api.alipay.com/api/v1/test"));
        when(request.getHeaders()).thenReturn(headers);
        when(execution.execute(any(), any())).thenReturn(response);

        // 执行
        ClientHttpResponse result = interceptor.intercept(request, "".getBytes(), execution);

        // 验证
        assertNotNull(result);
        assertTrue(headers.containsKey("Authorization"));

        String authorization = headers.getFirst("Authorization");
        System.out.println("Authorization: " + authorization);

        assertNotNull(authorization);
        assertTrue(authorization.startsWith("ALIPAY-SHA256withRSA"));
        assertTrue(authorization.contains("app_id=" + TEST_APP_ID));
        assertTrue(authorization.contains("timestamp="));
        assertTrue(authorization.contains("nonce="));
        assertTrue(authorization.contains(",sign="));

        verify(execution).execute(any(), any());
    }

    @Test
    void testInterceptWithPostRequest() throws Exception {
        System.out.println("=== 测试 POST 请求签名 ===");

        String requestBody = "{\"key\":\"value\"}";

        when(request.getMethod()).thenReturn(HttpMethod.POST);
        when(request.getURI()).thenReturn(new URI("https://api.alipay.com/api/v1/test"));
        when(request.getHeaders()).thenReturn(headers);
        when(execution.execute(any(), any())).thenReturn(response);

        // 执行
        interceptor.intercept(request, requestBody.getBytes(), execution);

        // 验证
        String authorization = headers.getFirst("Authorization");
        assertNotNull(authorization);
        assertTrue(authorization.contains("sign="));

        System.out.println("POST Authorization: " + authorization);
    }

    @Test
    void testInterceptWithDifferentMethods() throws Exception {
        System.out.println("=== 测试不同 HTTP 方法 ===");

        String[] methods = {"GET", "POST", "PUT", "DELETE"};

        for (String methodStr : methods) {
            HttpMethod method = HttpMethod.valueOf(methodStr);
            HttpHeaders testHeaders = new HttpHeaders();

            when(request.getMethod()).thenReturn(method);
            when(request.getURI()).thenReturn(new URI("https://api.alipay.com/api/v1/test"));
            when(request.getHeaders()).thenReturn(testHeaders);
            when(execution.execute(any(), any())).thenReturn(response);

            interceptor.intercept(request, "".getBytes(), execution);

            String authorization = testHeaders.getFirst("Authorization");
            assertNotNull(authorization, methodStr + " 请求应该生成 Authorization");
            assertTrue(authorization.contains("sign="), methodStr + " 请求应该包含签名");

            System.out.println(methodStr + " 请求签名成功");
        }
    }

    @Test
    void testInterceptWithAuthToken() throws Exception {
        System.out.println("=== 测试带 appAuthToken 的签名 ===");

        String authToken = "auth_token_123";
        AlipayAuthInterceptor interceptorWithToken = new AlipayAuthInterceptor(
            TEST_APP_ID, privateKey, authToken);

        when(request.getMethod()).thenReturn(HttpMethod.POST);
        when(request.getURI()).thenReturn(new URI("https://api.alipay.com/api/v1/test"));
        when(request.getHeaders()).thenReturn(headers);
        when(execution.execute(any(), any())).thenReturn(response);

        // 执行
        interceptorWithToken.intercept(request, "{\"data\":\"test\"}".getBytes(), execution);

        // 验证 Authorization 头存在
        String authorization = headers.getFirst("Authorization");
        assertNotNull(authorization);
        assertTrue(authorization.contains("sign="));

        System.out.println("带 authToken 的签名成功: " + authorization);
    }

    @Test
    void testInterceptSetsRequiredHeaders() throws Exception {
        System.out.println("=== 测试设置必需的头 ===");

        when(request.getMethod()).thenReturn(HttpMethod.POST);
        when(request.getURI()).thenReturn(new URI("https://api.alipay.com/api/v1/test"));
        when(request.getHeaders()).thenReturn(headers);
        when(execution.execute(any(), any())).thenReturn(response);

        interceptor.intercept(request, "".getBytes(), execution);

        // 验证 Content-Type
        assertTrue(headers.containsKey("Content-Type"));
        assertEquals("application/json; charset=UTF-8",
            headers.getFirst("Content-Type"));

        // 验证 Accept
        assertTrue(headers.containsKey("Accept"));
        assertEquals("text/event-stream", headers.getFirst("Accept"));

        System.out.println("必需头设置成功");
    }

    @Test
    void testSignContentFormat() throws Exception {
        System.out.println("=== 测试签名内容格式 ===");

        ArgumentCaptor<HttpRequest> requestCaptor = ArgumentCaptor.forClass(HttpRequest.class);
        ArgumentCaptor<byte[]> bodyCaptor = ArgumentCaptor.forClass(byte[].class);

        String requestBody = "{\"test\":\"data\"}";

        when(request.getMethod()).thenReturn(HttpMethod.POST);
        when(request.getURI()).thenReturn(new URI("https://api.alipay.com/api/v1/test"));
        when(request.getHeaders()).thenReturn(headers);
        when(execution.execute(requestCaptor.capture(), bodyCaptor.capture())).thenReturn(response);

        interceptor.intercept(request, requestBody.getBytes(), execution);

        // 验证请求被传递
        assertEquals(requestBody, new String(bodyCaptor.getValue()));

        // 验证 Authorization 格式
        String authorization = headers.getFirst("Authorization");
        System.out.println("生成的 Authorization: " + authorization);

        // 格式: ALIPAY-SHA256withRSA app_id=xxx,timestamp=xxx,nonce=xxx,sign=xxx
        String[] parts = authorization.split(" ");
        assertEquals(2, parts.length);
        assertEquals("ALIPAY-SHA256withRSA", parts[0]);

        String authParams = parts[1];
        assertTrue(authParams.contains("app_id=" + TEST_APP_ID));
        assertTrue(authParams.contains("timestamp="));
        assertTrue(authParams.contains("nonce="));
        assertTrue(authParams.contains("sign="));

        System.out.println("签名内容格式正确");
    }
}
