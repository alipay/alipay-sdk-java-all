# AlipayMarketingCardMessageApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**notify**](AlipayMarketingCardMessageApi.md#notify) | **POST** /v3/alipay/marketing/card/message/notify | 会员卡消息通知 |


<a name="notify"></a>
# **notify**
> AlipayMarketingCardMessageNotifyResponseModel notify(alipayMarketingCardMessageNotifyModel)

会员卡消息通知

商户触发消息通知用户

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingCardMessageApi;

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

    AlipayMarketingCardMessageApi apiInstance = new AlipayMarketingCardMessageApi(defaultClient);
    AlipayMarketingCardMessageNotifyModel alipayMarketingCardMessageNotifyModel = new AlipayMarketingCardMessageNotifyModel(); // AlipayMarketingCardMessageNotifyModel | 
    try {
      AlipayMarketingCardMessageNotifyResponseModel result = apiInstance.notify(alipayMarketingCardMessageNotifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingCardMessageApi#notify");
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
| **alipayMarketingCardMessageNotifyModel** | **AlipayMarketingCardMessageNotifyModel**|  | [optional] |

### Return type

**AlipayMarketingCardMessageNotifyResponseModel**

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

