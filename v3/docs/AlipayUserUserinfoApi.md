# AlipayUserUserinfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**share**](AlipayUserUserinfoApi.md#share) | **POST** /v3/alipay/user/userinfo/share | 支付宝钱包用户信息共享 |


<a name="share"></a>
# **share**
> AlipayUserUserinfoShareResponseModel share()

支付宝钱包用户信息共享

外部应用上架到支付宝钱包，当支付宝用户从钱包访问外部应用时，会跳转到外部应用并带上用户的授权码。  外部应用用授权码调用授权令牌交换API（alipay.system.oauth.token）可得到授权令牌。  用授权令牌调用此接口得到支付宝会员相关信息。  特别说明：此接口的不需要授权是指不需外部应用主动引导用户授权，支付宝钱包会在引导用户授权后，  带上授权码再跳转到外部应用。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayUserUserinfoApi;

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

    AlipayUserUserinfoApi apiInstance = new AlipayUserUserinfoApi(defaultClient);
    try {
      AlipayUserUserinfoShareResponseModel result = apiInstance.share();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayUserUserinfoApi#share");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**AlipayUserUserinfoShareResponseModel**

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

