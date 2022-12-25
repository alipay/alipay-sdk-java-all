# AlipayMarketingRecruitPlanApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayMarketingRecruitPlanApi.md#query) | **POST** /v3/alipay/marketing/recruit/plan/query | 招商方案详情查询 |


<a name="query"></a>
# **query**
> AlipayMarketingRecruitPlanQueryResponseModel query(alipayMarketingRecruitPlanQueryModel)

招商方案详情查询

招商方案详情查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingRecruitPlanApi;

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

    AlipayMarketingRecruitPlanApi apiInstance = new AlipayMarketingRecruitPlanApi(defaultClient);
    AlipayMarketingRecruitPlanQueryModel alipayMarketingRecruitPlanQueryModel = new AlipayMarketingRecruitPlanQueryModel(); // AlipayMarketingRecruitPlanQueryModel | 
    try {
      AlipayMarketingRecruitPlanQueryResponseModel result = apiInstance.query(alipayMarketingRecruitPlanQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingRecruitPlanApi#query");
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
| **alipayMarketingRecruitPlanQueryModel** | **AlipayMarketingRecruitPlanQueryModel**|  | [optional] |

### Return type

**AlipayMarketingRecruitPlanQueryResponseModel**

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

