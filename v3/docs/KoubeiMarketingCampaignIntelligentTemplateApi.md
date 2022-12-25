# KoubeiMarketingCampaignIntelligentTemplateApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**consult**](KoubeiMarketingCampaignIntelligentTemplateApi.md#consult) | **POST** /v3/koubei/marketing/campaign/intelligent/template/consult | 智能营销模板咨询 |


<a name="consult"></a>
# **consult**
> KoubeiMarketingCampaignIntelligentTemplateConsultResponseModel consult(koubeiMarketingCampaignIntelligentTemplateConsultModel)

智能营销模板咨询

咨询可使用的智能营销模板

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.KoubeiMarketingCampaignIntelligentTemplateApi;

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

    KoubeiMarketingCampaignIntelligentTemplateApi apiInstance = new KoubeiMarketingCampaignIntelligentTemplateApi(defaultClient);
    KoubeiMarketingCampaignIntelligentTemplateConsultModel koubeiMarketingCampaignIntelligentTemplateConsultModel = new KoubeiMarketingCampaignIntelligentTemplateConsultModel(); // KoubeiMarketingCampaignIntelligentTemplateConsultModel | 
    try {
      KoubeiMarketingCampaignIntelligentTemplateConsultResponseModel result = apiInstance.consult(koubeiMarketingCampaignIntelligentTemplateConsultModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KoubeiMarketingCampaignIntelligentTemplateApi#consult");
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
| **koubeiMarketingCampaignIntelligentTemplateConsultModel** | **KoubeiMarketingCampaignIntelligentTemplateConsultModel**|  | [optional] |

### Return type

**KoubeiMarketingCampaignIntelligentTemplateConsultResponseModel**

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

