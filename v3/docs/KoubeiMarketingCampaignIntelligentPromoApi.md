# KoubeiMarketingCampaignIntelligentPromoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](KoubeiMarketingCampaignIntelligentPromoApi.md#batchquery) | **POST** /v3/koubei/marketing/campaign/intelligent/promo/batchquery | 智能营销活动批量查询 |


<a name="batchquery"></a>
# **batchquery**
> KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel batchquery()

智能营销活动批量查询

智能营销活动批量查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.KoubeiMarketingCampaignIntelligentPromoApi;

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

    KoubeiMarketingCampaignIntelligentPromoApi apiInstance = new KoubeiMarketingCampaignIntelligentPromoApi(defaultClient);
    try {
      KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel result = apiInstance.batchquery();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KoubeiMarketingCampaignIntelligentPromoApi#batchquery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**KoubeiMarketingCampaignIntelligentPromoBatchqueryResponseModel**

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

