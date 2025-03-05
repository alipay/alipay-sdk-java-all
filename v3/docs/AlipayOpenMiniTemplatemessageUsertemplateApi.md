# AlipayOpenMiniTemplatemessageUsertemplateApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apply**](AlipayOpenMiniTemplatemessageUsertemplateApi.md#apply) | **POST** /v3/alipay/open/mini/templatemessage/usertemplate/apply | 小程序模板消息申请 |


<a name="apply"></a>
# **apply**
> AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel apply(alipayOpenMiniTemplatemessageUsertemplateApplyModel)

小程序模板消息申请

小程序模板消息申请，申请之后可以通过返回的user_template_id来发送模板消息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniTemplatemessageUsertemplateApi;

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

    AlipayOpenMiniTemplatemessageUsertemplateApi apiInstance = new AlipayOpenMiniTemplatemessageUsertemplateApi(defaultClient);
    AlipayOpenMiniTemplatemessageUsertemplateApplyModel alipayOpenMiniTemplatemessageUsertemplateApplyModel = new AlipayOpenMiniTemplatemessageUsertemplateApplyModel(); // AlipayOpenMiniTemplatemessageUsertemplateApplyModel | 
    try {
      AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel result = apiInstance.apply(alipayOpenMiniTemplatemessageUsertemplateApplyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniTemplatemessageUsertemplateApi#apply");
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
| **alipayOpenMiniTemplatemessageUsertemplateApplyModel** | **AlipayOpenMiniTemplatemessageUsertemplateApplyModel**|  | [optional] |

### Return type

**AlipayOpenMiniTemplatemessageUsertemplateApplyResponseModel**

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

