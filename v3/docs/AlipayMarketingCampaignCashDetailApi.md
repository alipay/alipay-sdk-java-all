# AlipayMarketingCampaignCashDetailApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayMarketingCampaignCashDetailApi.md#query) | **GET** /v3/alipay/marketing/campaign/cash/detail/query | 现金活动详情查询 |


<a name="query"></a>
# **query**
> AlipayMarketingCampaignCashDetailQueryResponseModel query(crowdNo)

现金活动详情查询

商户通过开放平台查询自己创建的现金活动详情

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingCampaignCashDetailApi;

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

    AlipayMarketingCampaignCashDetailApi apiInstance = new AlipayMarketingCampaignCashDetailApi(defaultClient);
    String crowdNo = "POYb84lfiKVdIfERAYsqPL_KQRIpfQbl47xfRmmPBlDMnSZ96O-zxUfKlHp5cxmx"; // String | 现金活动号，通过<a href=\"https://opendocs.alipay.com/apis/api_5/alipay.marketing.campaign.cash.create\">alipay.marketing.campaign.cash.create</a>(创建现金活动)接口创建现金活动获取。
    try {
      AlipayMarketingCampaignCashDetailQueryResponseModel result = apiInstance.query(crowdNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingCampaignCashDetailApi#query");
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
| **crowdNo** | **String**| 现金活动号，通过&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_5/alipay.marketing.campaign.cash.create\&quot;&gt;alipay.marketing.campaign.cash.create&lt;/a&gt;(创建现金活动)接口创建现金活动获取。 | [optional] |

### Return type

**AlipayMarketingCampaignCashDetailQueryResponseModel**

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

