# AlipayOpenPublicMessageGroupApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**send**](AlipayOpenPublicMessageGroupApi.md#send) | **POST** /v3/alipay/open/public/message/group/send | 分组消息发送接口 |


<a name="send"></a>
# **send**
> AlipayOpenPublicMessageGroupSendResponseModel send(alipayOpenPublicMessageGroupSendModel)

分组消息发送接口

开发者可调用此接口向指定分组中的关注用户发送消息，该接口为异步接口，一般请求成功后一段时间用户才能收到消息。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicMessageGroupApi;

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

    AlipayOpenPublicMessageGroupApi apiInstance = new AlipayOpenPublicMessageGroupApi(defaultClient);
    AlipayOpenPublicMessageGroupSendModel alipayOpenPublicMessageGroupSendModel = new AlipayOpenPublicMessageGroupSendModel(); // AlipayOpenPublicMessageGroupSendModel | 
    try {
      AlipayOpenPublicMessageGroupSendResponseModel result = apiInstance.send(alipayOpenPublicMessageGroupSendModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicMessageGroupApi#send");
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
| **alipayOpenPublicMessageGroupSendModel** | **AlipayOpenPublicMessageGroupSendModel**|  | [optional] |

### Return type

**AlipayOpenPublicMessageGroupSendResponseModel**

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

