# AlipayMobileStdPublicMessageCustomApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**send**](AlipayMobileStdPublicMessageCustomApi.md#send) | **POST** /v3/alipay/mobile/std/public/message/custom/send | 异步单发消息 |


<a name="send"></a>
# **send**
> Object send(alipayMobileStdPublicMessageCustomSendModel)

异步单发消息

商户给单个用户发送消息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMobileStdPublicMessageCustomApi;

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

    AlipayMobileStdPublicMessageCustomApi apiInstance = new AlipayMobileStdPublicMessageCustomApi(defaultClient);
    AlipayMobileStdPublicMessageCustomSendModel alipayMobileStdPublicMessageCustomSendModel = new AlipayMobileStdPublicMessageCustomSendModel(); // AlipayMobileStdPublicMessageCustomSendModel | 
    try {
      Object result = apiInstance.send(alipayMobileStdPublicMessageCustomSendModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMobileStdPublicMessageCustomApi#send");
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
| **alipayMobileStdPublicMessageCustomSendModel** | **AlipayMobileStdPublicMessageCustomSendModel**|  | [optional] |

### Return type

**Object**

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

