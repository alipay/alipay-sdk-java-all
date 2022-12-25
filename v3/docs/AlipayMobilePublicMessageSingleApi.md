# AlipayMobilePublicMessageSingleApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**send**](AlipayMobilePublicMessageSingleApi.md#send) | **POST** /v3/alipay/mobile/public/message/single/send | 单发模板消息 |


<a name="send"></a>
# **send**
> AlipayMobilePublicMessageSingleSendResponseModel send(alipayMobilePublicMessageSingleSendModel)

单发模板消息

单发模板消息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMobilePublicMessageSingleApi;

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

    AlipayMobilePublicMessageSingleApi apiInstance = new AlipayMobilePublicMessageSingleApi(defaultClient);
    AlipayMobilePublicMessageSingleSendModel alipayMobilePublicMessageSingleSendModel = new AlipayMobilePublicMessageSingleSendModel(); // AlipayMobilePublicMessageSingleSendModel | 
    try {
      AlipayMobilePublicMessageSingleSendResponseModel result = apiInstance.send(alipayMobilePublicMessageSingleSendModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMobilePublicMessageSingleApi#send");
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
| **alipayMobilePublicMessageSingleSendModel** | **AlipayMobilePublicMessageSingleSendModel**|  | [optional] |

### Return type

**AlipayMobilePublicMessageSingleSendResponseModel**

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

