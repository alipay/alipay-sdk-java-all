# AlipayOpenAuthTokenApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**app**](AlipayOpenAuthTokenApi.md#app) | **POST** /v3/alipay/open/auth/token/app | 换取应用授权令牌 |


<a name="app"></a>
# **app**
> AlipayOpenAuthTokenAppResponseModel app(alipayOpenAuthTokenAppModel)

换取应用授权令牌

换取应用授权令牌。在应用授权的场景下，商户把名下应用授权给ISV后，支付宝会给ISV颁发应用授权码app_auth_code，ISV可通过获取到的app_auth_code换取app_auth_token。app_auth_code作为换取app_auth_token的票据，每次用户授权带上的app_auth_code将不一样，app_auth_code只能使用一次，一天（从当前时间算起的24小时）未被使用自动过期。  刷新应用授权令牌，ISV可通过获取到的refresh_token刷新app_auth_token，刷新后老的refresh_token会在一段时间后失效（失效时间为接口返回的re_expires_in）。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenAuthTokenApi;

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

    AlipayOpenAuthTokenApi apiInstance = new AlipayOpenAuthTokenApi(defaultClient);
    AlipayOpenAuthTokenAppModel alipayOpenAuthTokenAppModel = new AlipayOpenAuthTokenAppModel(); // AlipayOpenAuthTokenAppModel | 
    try {
      AlipayOpenAuthTokenAppResponseModel result = apiInstance.app(alipayOpenAuthTokenAppModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenAuthTokenApi#app");
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
| **alipayOpenAuthTokenAppModel** | **AlipayOpenAuthTokenAppModel**|  | [optional] |

### Return type

**AlipayOpenAuthTokenAppResponseModel**

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

