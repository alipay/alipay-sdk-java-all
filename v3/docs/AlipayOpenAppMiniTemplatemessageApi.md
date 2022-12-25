# AlipayOpenAppMiniTemplatemessageApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**send**](AlipayOpenAppMiniTemplatemessageApi.md#send) | **POST** /v3/alipay/open/app/mini/templatemessage/send | 小程序发送模板消息 |


<a name="send"></a>
# **send**
> Object send(alipayOpenAppMiniTemplatemessageSendModel)

小程序发送模板消息

小程序通过openapi给用户触达消息，主要为支付后的触达（通过消费id）、用户提交表单后的触达（通过formId）、刷脸后的触达（通过ftoken）以及用户订阅消息模板后的触达。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenAppMiniTemplatemessageApi;

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

    AlipayOpenAppMiniTemplatemessageApi apiInstance = new AlipayOpenAppMiniTemplatemessageApi(defaultClient);
    AlipayOpenAppMiniTemplatemessageSendModel alipayOpenAppMiniTemplatemessageSendModel = new AlipayOpenAppMiniTemplatemessageSendModel(); // AlipayOpenAppMiniTemplatemessageSendModel | 
    try {
      Object result = apiInstance.send(alipayOpenAppMiniTemplatemessageSendModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenAppMiniTemplatemessageApi#send");
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
| **alipayOpenAppMiniTemplatemessageSendModel** | **AlipayOpenAppMiniTemplatemessageSendModel**|  | [optional] |

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

