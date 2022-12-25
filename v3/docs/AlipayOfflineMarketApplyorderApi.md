# AlipayOfflineMarketApplyorderApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayOfflineMarketApplyorderApi.md#batchquery) | **POST** /v3/alipay/offline/market/applyorder/batchquery | 业务流水批量查询接口 |


<a name="batchquery"></a>
# **batchquery**
> AlipayOfflineMarketApplyorderBatchqueryResponseModel batchquery(alipayOfflineMarketApplyorderBatchqueryModel)

业务流水批量查询接口

通过该接口分页查询Leads、门店、商品相关操作流水信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOfflineMarketApplyorderApi;

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

    AlipayOfflineMarketApplyorderApi apiInstance = new AlipayOfflineMarketApplyorderApi(defaultClient);
    AlipayOfflineMarketApplyorderBatchqueryModel alipayOfflineMarketApplyorderBatchqueryModel = new AlipayOfflineMarketApplyorderBatchqueryModel(); // AlipayOfflineMarketApplyorderBatchqueryModel | 
    try {
      AlipayOfflineMarketApplyorderBatchqueryResponseModel result = apiInstance.batchquery(alipayOfflineMarketApplyorderBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOfflineMarketApplyorderApi#batchquery");
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
| **alipayOfflineMarketApplyorderBatchqueryModel** | **AlipayOfflineMarketApplyorderBatchqueryModel**|  | [optional] |

### Return type

**AlipayOfflineMarketApplyorderBatchqueryResponseModel**

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

