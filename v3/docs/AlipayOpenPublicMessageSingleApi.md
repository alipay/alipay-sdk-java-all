# AlipayOpenPublicMessageSingleApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**send**](AlipayOpenPublicMessageSingleApi.md#send) | **POST** /v3/alipay/open/public/message/single/send | 单发模板消息 |


<a name="send"></a>
# **send**
> Object send(alipayOpenPublicMessageSingleSendModel)

单发模板消息

商户可使用该接口向用户推送制定模板的消息，如动账提醒、停车通知等消息，消息模板可在生活号后台(fuwu.alipay.com)领取，点击“模板消息”菜单，即可在模板库中领取行业对应的模板

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicMessageSingleApi;

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

    AlipayOpenPublicMessageSingleApi apiInstance = new AlipayOpenPublicMessageSingleApi(defaultClient);
    AlipayOpenPublicMessageSingleSendModel alipayOpenPublicMessageSingleSendModel = new AlipayOpenPublicMessageSingleSendModel(); // AlipayOpenPublicMessageSingleSendModel | 
    try {
      Object result = apiInstance.send(alipayOpenPublicMessageSingleSendModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicMessageSingleApi#send");
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
| **alipayOpenPublicMessageSingleSendModel** | **AlipayOpenPublicMessageSingleSendModel**|  | [optional] |

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

