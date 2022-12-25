# AlipayMerchantTradecomplainReplyApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**submit**](AlipayMerchantTradecomplainReplyApi.md#submit) | **POST** /v3/alipay/merchant/tradecomplain/reply | 商家留言回复 |


<a name="submit"></a>
# **submit**
> Object submit(alipayMerchantTradecomplainReplySubmitModel)

商家留言回复

投诉单状态在“商家待处理”或“商家已反馈”或“商家处理超时”状态下，若有内容需要补充说明，可使用此接口提交文字或图片

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMerchantTradecomplainReplyApi;

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

    AlipayMerchantTradecomplainReplyApi apiInstance = new AlipayMerchantTradecomplainReplyApi(defaultClient);
    AlipayMerchantTradecomplainReplySubmitModel alipayMerchantTradecomplainReplySubmitModel = new AlipayMerchantTradecomplainReplySubmitModel(); // AlipayMerchantTradecomplainReplySubmitModel | 
    try {
      Object result = apiInstance.submit(alipayMerchantTradecomplainReplySubmitModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMerchantTradecomplainReplyApi#submit");
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
| **alipayMerchantTradecomplainReplySubmitModel** | **AlipayMerchantTradecomplainReplySubmitModel**|  | [optional] |

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

