# AlipayMerchantTradecomplainSupplementApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**submit**](AlipayMerchantTradecomplainSupplementApi.md#submit) | **POST** /v3/alipay/merchant/tradecomplain/supplement | 商家补充凭证 |


<a name="submit"></a>
# **submit**
> Object submit(alipayMerchantTradecomplainSupplementSubmitModel)

商家补充凭证

投诉进入平台处理中状态时，为保证客服能准确判定责任方，可使用此接口补充文字或图片说明问题及处理经过

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMerchantTradecomplainSupplementApi;

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

    AlipayMerchantTradecomplainSupplementApi apiInstance = new AlipayMerchantTradecomplainSupplementApi(defaultClient);
    AlipayMerchantTradecomplainSupplementSubmitModel alipayMerchantTradecomplainSupplementSubmitModel = new AlipayMerchantTradecomplainSupplementSubmitModel(); // AlipayMerchantTradecomplainSupplementSubmitModel | 
    try {
      Object result = apiInstance.submit(alipayMerchantTradecomplainSupplementSubmitModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMerchantTradecomplainSupplementApi#submit");
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
| **alipayMerchantTradecomplainSupplementSubmitModel** | **AlipayMerchantTradecomplainSupplementSubmitModel**|  | [optional] |

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

