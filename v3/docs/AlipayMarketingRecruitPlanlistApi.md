# AlipayMarketingRecruitPlanlistApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayMarketingRecruitPlanlistApi.md#query) | **POST** /v3/alipay/marketing/recruit/planlist/query | 查询可报名的方案列表 |


<a name="query"></a>
# **query**
> AlipayMarketingRecruitPlanlistQueryResponseModel query(alipayMarketingRecruitPlanlistQueryModel)

查询可报名的方案列表

查询可报名的方案列表

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingRecruitPlanlistApi;

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

    AlipayMarketingRecruitPlanlistApi apiInstance = new AlipayMarketingRecruitPlanlistApi(defaultClient);
    AlipayMarketingRecruitPlanlistQueryModel alipayMarketingRecruitPlanlistQueryModel = new AlipayMarketingRecruitPlanlistQueryModel(); // AlipayMarketingRecruitPlanlistQueryModel | 
    try {
      AlipayMarketingRecruitPlanlistQueryResponseModel result = apiInstance.query(alipayMarketingRecruitPlanlistQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingRecruitPlanlistApi#query");
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
| **alipayMarketingRecruitPlanlistQueryModel** | **AlipayMarketingRecruitPlanlistQueryModel**|  | [optional] |

### Return type

**AlipayMarketingRecruitPlanlistQueryResponseModel**

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

