# AlipayOfflineMarketShopSummaryApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayOfflineMarketShopSummaryApi.md#batchquery) | **POST** /v3/alipay/offline/market/shop/summary/batchquery | 门店摘要信息批量查询接口 |


<a name="batchquery"></a>
# **batchquery**
> AlipayOfflineMarketShopSummaryBatchqueryResponseModel batchquery(alipayOfflineMarketShopSummaryBatchqueryModel)

门店摘要信息批量查询接口

用于进行门店摘要信息批量查询接口。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOfflineMarketShopSummaryApi;

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

    AlipayOfflineMarketShopSummaryApi apiInstance = new AlipayOfflineMarketShopSummaryApi(defaultClient);
    AlipayOfflineMarketShopSummaryBatchqueryModel alipayOfflineMarketShopSummaryBatchqueryModel = new AlipayOfflineMarketShopSummaryBatchqueryModel(); // AlipayOfflineMarketShopSummaryBatchqueryModel | 
    try {
      AlipayOfflineMarketShopSummaryBatchqueryResponseModel result = apiInstance.batchquery(alipayOfflineMarketShopSummaryBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOfflineMarketShopSummaryApi#batchquery");
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
| **alipayOfflineMarketShopSummaryBatchqueryModel** | **AlipayOfflineMarketShopSummaryBatchqueryModel**|  | [optional] |

### Return type

**AlipayOfflineMarketShopSummaryBatchqueryResponseModel**

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

