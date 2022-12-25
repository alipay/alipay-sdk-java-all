# AlipayEbppInvoiceExpenseProgressApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sync**](AlipayEbppInvoiceExpenseProgressApi.md#sync) | **POST** /v3/alipay/ebpp/invoice/expense/progress/sync | 发票报销处理进度同步 |


<a name="sync"></a>
# **sync**
> Object sync(alipayEbppInvoiceExpenseProgressSyncModel)

发票报销处理进度同步

用户提交发票管家发票到isv申请报销后，isv对报销处理进度推进

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceExpenseProgressApi;

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

    AlipayEbppInvoiceExpenseProgressApi apiInstance = new AlipayEbppInvoiceExpenseProgressApi(defaultClient);
    AlipayEbppInvoiceExpenseProgressSyncModel alipayEbppInvoiceExpenseProgressSyncModel = new AlipayEbppInvoiceExpenseProgressSyncModel(); // AlipayEbppInvoiceExpenseProgressSyncModel | 
    try {
      Object result = apiInstance.sync(alipayEbppInvoiceExpenseProgressSyncModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceExpenseProgressApi#sync");
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
| **alipayEbppInvoiceExpenseProgressSyncModel** | **AlipayEbppInvoiceExpenseProgressSyncModel**|  | [optional] |

### Return type

**Object**

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

