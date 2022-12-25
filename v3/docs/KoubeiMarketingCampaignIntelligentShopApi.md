# KoubeiMarketingCampaignIntelligentShopApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**consult**](KoubeiMarketingCampaignIntelligentShopApi.md#consult) | **POST** /v3/koubei/marketing/campaign/intelligent/shop/consult | 智能营销门店咨询 |


<a name="consult"></a>
# **consult**
> KoubeiMarketingCampaignIntelligentShopConsultResponseModel consult(koubeiMarketingCampaignIntelligentShopConsultModel)

智能营销门店咨询

咨询完智能营销活动模型后，可以查询商户的符合智能营销活动标准的门店

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.KoubeiMarketingCampaignIntelligentShopApi;

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

    KoubeiMarketingCampaignIntelligentShopApi apiInstance = new KoubeiMarketingCampaignIntelligentShopApi(defaultClient);
    KoubeiMarketingCampaignIntelligentShopConsultModel koubeiMarketingCampaignIntelligentShopConsultModel = new KoubeiMarketingCampaignIntelligentShopConsultModel(); // KoubeiMarketingCampaignIntelligentShopConsultModel | 
    try {
      KoubeiMarketingCampaignIntelligentShopConsultResponseModel result = apiInstance.consult(koubeiMarketingCampaignIntelligentShopConsultModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KoubeiMarketingCampaignIntelligentShopApi#consult");
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
| **koubeiMarketingCampaignIntelligentShopConsultModel** | **KoubeiMarketingCampaignIntelligentShopConsultModel**|  | [optional] |

### Return type

**KoubeiMarketingCampaignIntelligentShopConsultResponseModel**

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

