# AlipayOpenPublicMessageCustomApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**send**](AlipayOpenPublicMessageCustomApi.md#send) | **POST** /v3/alipay/open/public/message/custom/send | 异步单发消息 |


<a name="send"></a>
# **send**
> Object send(alipayOpenPublicMessageCustomSendModel)

异步单发消息

开发者可使用该接口向指定关注用户推送客服消息，一般用于开发者使用接口与用户进行实时信息交互，例如自动回答用户包含某些指定关键字的咨询等。注意：用户必须在48小时之内与该生活号有交互行为才能收到消息（交互行为包括进入生活号、点击菜单、向生活号发送消息等），每个生活号每天只能向1个用户推送100条消息，超过这个数目会报错频率超限

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicMessageCustomApi;

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

    AlipayOpenPublicMessageCustomApi apiInstance = new AlipayOpenPublicMessageCustomApi(defaultClient);
    AlipayOpenPublicMessageCustomSendModel alipayOpenPublicMessageCustomSendModel = new AlipayOpenPublicMessageCustomSendModel(); // AlipayOpenPublicMessageCustomSendModel | 
    try {
      Object result = apiInstance.send(alipayOpenPublicMessageCustomSendModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicMessageCustomApi#send");
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
| **alipayOpenPublicMessageCustomSendModel** | **AlipayOpenPublicMessageCustomSendModel**|  | [optional] |

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

