# AlipayMarketingCampaignOrderVoucherApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**consult**](AlipayMarketingCampaignOrderVoucherApi.md#consult) | **POST** /v3/alipay/marketing/campaign/order/voucher/consult | 订单优惠前置咨询 |


<a name="consult"></a>
# **consult**
> AlipayMarketingCampaignOrderVoucherConsultResponseModel consult(authToken, alipayMarketingCampaignOrderVoucherConsultModel)

订单优惠前置咨询

本接口用于前置优惠咨询，包括本订单可享的优惠券列表，注意该列表并不等价于最终核销时使用的券列表，而是包含了咨询的那一刻该订单能用的所有券，且券满足叠加使用下的互斥等规则

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingCampaignOrderVoucherApi;

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

    AlipayMarketingCampaignOrderVoucherApi apiInstance = new AlipayMarketingCampaignOrderVoucherApi(defaultClient);
    String authToken = "authToken_example"; // String | 用户授权令牌
    AlipayMarketingCampaignOrderVoucherConsultModel alipayMarketingCampaignOrderVoucherConsultModel = new AlipayMarketingCampaignOrderVoucherConsultModel(); // AlipayMarketingCampaignOrderVoucherConsultModel | 
    try {
      AlipayMarketingCampaignOrderVoucherConsultResponseModel result = apiInstance.consult(authToken, alipayMarketingCampaignOrderVoucherConsultModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingCampaignOrderVoucherApi#consult");
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
| **authToken** | **String**| 用户授权令牌 | [optional] |
| **alipayMarketingCampaignOrderVoucherConsultModel** | **AlipayMarketingCampaignOrderVoucherConsultModel**|  | [optional] |

### Return type

**AlipayMarketingCampaignOrderVoucherConsultResponseModel**

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

