# AlipayOpenPublicTemplateMessageIndustryApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modify**](AlipayOpenPublicTemplateMessageIndustryApi.md#modify) | **POST** /v3/alipay/open/public/template/message/industry/modify | 模板消息行业设置修改接口 |


<a name="modify"></a>
# **modify**
> Object modify(alipayOpenPublicTemplateMessageIndustryModifyModel)

模板消息行业设置修改接口

用于修改服务窗消息模板设置的行业信息，如：IT科技/IT软件与服务。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicTemplateMessageIndustryApi;

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

    AlipayOpenPublicTemplateMessageIndustryApi apiInstance = new AlipayOpenPublicTemplateMessageIndustryApi(defaultClient);
    AlipayOpenPublicTemplateMessageIndustryModifyModel alipayOpenPublicTemplateMessageIndustryModifyModel = new AlipayOpenPublicTemplateMessageIndustryModifyModel(); // AlipayOpenPublicTemplateMessageIndustryModifyModel | 
    try {
      Object result = apiInstance.modify(alipayOpenPublicTemplateMessageIndustryModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicTemplateMessageIndustryApi#modify");
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
| **alipayOpenPublicTemplateMessageIndustryModifyModel** | **AlipayOpenPublicTemplateMessageIndustryModifyModel**|  | [optional] |

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

