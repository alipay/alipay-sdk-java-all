# AlipayUserTwostageCommonApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**use**](AlipayUserTwostageCommonApi.md#use) | **POST** /v3/alipay/user/twostage/common/use | 通用当面付二阶段接口 |


<a name="use"></a>
# **use**
> AlipayUserTwostageCommonUseResponseModel use(alipayUserTwostageCommonUseModel)

通用当面付二阶段接口

商家通过小程序/卡券开放权益(优惠券)，用户在小程序/卡券授权后，打开付款码时通过该接口获取用户信息。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayUserTwostageCommonApi;

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

    AlipayUserTwostageCommonApi apiInstance = new AlipayUserTwostageCommonApi(defaultClient);
    AlipayUserTwostageCommonUseModel alipayUserTwostageCommonUseModel = new AlipayUserTwostageCommonUseModel(); // AlipayUserTwostageCommonUseModel | 
    try {
      AlipayUserTwostageCommonUseResponseModel result = apiInstance.use(alipayUserTwostageCommonUseModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayUserTwostageCommonApi#use");
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
| **alipayUserTwostageCommonUseModel** | **AlipayUserTwostageCommonUseModel**|  | [optional] |

### Return type

**AlipayUserTwostageCommonUseResponseModel**

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

