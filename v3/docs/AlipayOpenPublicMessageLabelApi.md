# AlipayOpenPublicMessageLabelApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**send**](AlipayOpenPublicMessageLabelApi.md#send) | **POST** /v3/alipay/open/public/message/label/send | 根据标签组发消息接口 |


<a name="send"></a>
# **send**
> Object send(alipayOpenPublicMessageLabelSendModel)

根据标签组发消息接口

开发者可以通过标签运算圈定一批用户，并且向这批用户推送消息。关于标签组发有以下注意点：  除了商户自定义标签，还支持支付宝用户标签，我们将陆续开放用户画像标签，目前支持的支付宝标签及说明请查看支付宝开放标签；  用户及标签数据有1天的缓存时间，即昨天开发者给M用户打了a标签，今天给有a标签的用户组发消息，M能够收到消息；但是如果开发者今天给M用户打了a标签，然后向有a标签的用户组发消息，M不能收到消息；  与群发消息接口类似，该接口调用之后，消息发送系统会处理一段时间，调用接口到发送成功存在一定的时延，几分钟到半个小时不等；  对于同一个用户而言，一周只能收到一条群发或者标签组发的消息；  消息组发接口一周最多调用5次。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicMessageLabelApi;

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

    AlipayOpenPublicMessageLabelApi apiInstance = new AlipayOpenPublicMessageLabelApi(defaultClient);
    AlipayOpenPublicMessageLabelSendModel alipayOpenPublicMessageLabelSendModel = new AlipayOpenPublicMessageLabelSendModel(); // AlipayOpenPublicMessageLabelSendModel | 
    try {
      Object result = apiInstance.send(alipayOpenPublicMessageLabelSendModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicMessageLabelApi#send");
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
| **alipayOpenPublicMessageLabelSendModel** | **AlipayOpenPublicMessageLabelSendModel**|  | [optional] |

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

