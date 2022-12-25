# AlipayUserInfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**share**](AlipayUserInfoApi.md#share) | **POST** /v3/alipay/user/info/share | 支付宝会员授权信息查询接口 |


<a name="share"></a>
# **share**
> AlipayUserInfoShareResponseModel share(authToken)

支付宝会员授权信息查询接口

配合支付宝会员授权接口，查询授权信息。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayUserInfoApi;

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

    AlipayUserInfoApi apiInstance = new AlipayUserInfoApi(defaultClient);
    String authToken = "authToken_example"; // String | 用户授权令牌
    try {
      AlipayUserInfoShareResponseModel result = apiInstance.share(authToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayUserInfoApi#share");
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
| **authToken** | **String**| 用户授权令牌 | [optional] |

### Return type

**AlipayUserInfoShareResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

