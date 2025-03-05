# AlipayMerchantTradecomplainFeedbackApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**submit**](AlipayMerchantTradecomplainFeedbackApi.md#submit) | **POST** /v3/alipay/merchant/tradecomplain/feedback | 商家处理交易投诉 |


<a name="submit"></a>
# **submit**
> Object submit(alipayMerchantTradecomplainFeedbackSubmitModel)

商家处理交易投诉

商户请求交易投诉处理API，上传处理类型、处理内容描述及图片凭证。其中上传图片凭证需要先通过\&quot;商户上传处理图片\&quot;接口获取图片id，再将图片id设置到接口请求中。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMerchantTradecomplainFeedbackApi;

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

    AlipayMerchantTradecomplainFeedbackApi apiInstance = new AlipayMerchantTradecomplainFeedbackApi(defaultClient);
    AlipayMerchantTradecomplainFeedbackSubmitModel alipayMerchantTradecomplainFeedbackSubmitModel = new AlipayMerchantTradecomplainFeedbackSubmitModel(); // AlipayMerchantTradecomplainFeedbackSubmitModel | 
    try {
      Object result = apiInstance.submit(alipayMerchantTradecomplainFeedbackSubmitModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMerchantTradecomplainFeedbackApi#submit");
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
| **alipayMerchantTradecomplainFeedbackSubmitModel** | **AlipayMerchantTradecomplainFeedbackSubmitModel**|  | [optional] |

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

