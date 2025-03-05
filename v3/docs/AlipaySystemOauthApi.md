# AlipaySystemOauthApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**token**](AlipaySystemOauthApi.md#token) | **POST** /v3/alipay/system/oauth/token | 换取授权访问令牌 |


<a name="token"></a>
# **token**
> AlipaySystemOauthTokenResponseModel token(alipaySystemOauthTokenModel)

换取授权访问令牌

换取授权访问令牌

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipaySystemOauthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.alipay.com");
    // 设置alipayConfig参数（全局设置一次）
    AlipayConfig config = new AlipayConfig();
    config.setAppId("app_id");
    config.setPrivateKey("private_key");
    config.setAlipayPublicKey("alipay_public_key");
    config.setEncryptKey("encrypt_key");
    defaultClient.setAlipayConfig(config);

    AlipaySystemOauthApi apiInstance = new AlipaySystemOauthApi(defaultClient);
    AlipaySystemOauthTokenModel alipaySystemOauthTokenModel = new AlipaySystemOauthTokenModel(); // AlipaySystemOauthTokenModel | 
    try {
      AlipaySystemOauthTokenResponseModel result = apiInstance.token(alipaySystemOauthTokenModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipaySystemOauthApi#token");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alipaySystemOauthTokenModel** | **AlipaySystemOauthTokenModel**|  | [optional] |

### Return type

**AlipaySystemOauthTokenResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

