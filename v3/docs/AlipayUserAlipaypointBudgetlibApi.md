# AlipayUserAlipaypointBudgetlibApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayUserAlipaypointBudgetlibApi.md#query) | **GET** /v3/alipay/user/alipaypoint/budgetlib/query | 查询集分宝预算库详情 |


<a name="query"></a>
# **query**
> AlipayUserAlipaypointBudgetlibQueryResponseModel query(budgetCode)

查询集分宝预算库详情

用于查询集分宝预算库详情

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayUserAlipaypointBudgetlibApi;

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

    AlipayUserAlipaypointBudgetlibApi apiInstance = new AlipayUserAlipaypointBudgetlibApi(defaultClient);
    String budgetCode = "20201107050844"; // String | 集分宝预算库编码
    try {
      AlipayUserAlipaypointBudgetlibQueryResponseModel result = apiInstance.query(budgetCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayUserAlipaypointBudgetlibApi#query");
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
| **budgetCode** | **String**| 集分宝预算库编码 | [optional] |

### Return type

**AlipayUserAlipaypointBudgetlibQueryResponseModel**

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

