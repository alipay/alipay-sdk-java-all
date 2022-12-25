# AlipayOpenSpOpporFeedbackApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modify**](AlipayOpenSpOpporFeedbackApi.md#modify) | **POST** /v3/alipay/open/sp/oppor/feedback/modify | 商机拓展完成 |


<a name="modify"></a>
# **modify**
> AlipayOpenSpOpporFeedbackModifyResponseModel modify(alipayOpenSpOpporFeedbackModifyModel)

商机拓展完成

商机拓展完成

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSpOpporFeedbackApi;

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

    AlipayOpenSpOpporFeedbackApi apiInstance = new AlipayOpenSpOpporFeedbackApi(defaultClient);
    AlipayOpenSpOpporFeedbackModifyModel alipayOpenSpOpporFeedbackModifyModel = new AlipayOpenSpOpporFeedbackModifyModel(); // AlipayOpenSpOpporFeedbackModifyModel | 
    try {
      AlipayOpenSpOpporFeedbackModifyResponseModel result = apiInstance.modify(alipayOpenSpOpporFeedbackModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSpOpporFeedbackApi#modify");
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
| **alipayOpenSpOpporFeedbackModifyModel** | **AlipayOpenSpOpporFeedbackModifyModel**|  | [optional] |

### Return type

**AlipayOpenSpOpporFeedbackModifyResponseModel**

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

