# AlipayOpenPublicTemplateMessageApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](AlipayOpenPublicTemplateMessageApi.md#get) | **GET** /v3/alipay/open/public/template/message/get | 消息模板领取接口 |


<a name="get"></a>
# **get**
> AlipayOpenPublicTemplateMessageGetResponseModel get(templateId)

消息模板领取接口

帮助服务窗开发者从服务窗平台（fuwu.alipay.com）公共模板库里领取一个行业的消息模板--消息模板是一种消息的样式，如消费提醒、账单提醒等，主要用于isv帮助商户领取消息模板。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicTemplateMessageApi;

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

    AlipayOpenPublicTemplateMessageApi apiInstance = new AlipayOpenPublicTemplateMessageApi(defaultClient);
    String templateId = "TM000000223"; // String | 消息母板id，登陆生活号后台(fuwu.alipay.com)，点击菜单“模板消息”，点击“模板库”，即可看到相应模板的消息母板id
    try {
      AlipayOpenPublicTemplateMessageGetResponseModel result = apiInstance.get(templateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicTemplateMessageApi#get");
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
| **templateId** | **String**| 消息母板id，登陆生活号后台(fuwu.alipay.com)，点击菜单“模板消息”，点击“模板库”，即可看到相应模板的消息母板id | [optional] |

### Return type

**AlipayOpenPublicTemplateMessageGetResponseModel**

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

