# AlipayEbppInvoiceExpensecontrolAggregationApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayEbppInvoiceExpensecontrolAggregationApi.md#create) | **POST** /v3/alipay/ebpp/invoice/expensecontrol/aggregation/create | 创建费控规则聚合关系 |


<a name="create"></a>
# **create**
> AlipayEbppInvoiceExpensecontrolAggregationCreateResponseModel create(alipayEbppInvoiceExpensecontrolAggregationCreateModel)

创建费控规则聚合关系

创建费控规则聚合关系

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceExpensecontrolAggregationApi;

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

    AlipayEbppInvoiceExpensecontrolAggregationApi apiInstance = new AlipayEbppInvoiceExpensecontrolAggregationApi(defaultClient);
    AlipayEbppInvoiceExpensecontrolAggregationCreateModel alipayEbppInvoiceExpensecontrolAggregationCreateModel = new AlipayEbppInvoiceExpensecontrolAggregationCreateModel(); // AlipayEbppInvoiceExpensecontrolAggregationCreateModel | 
    try {
      AlipayEbppInvoiceExpensecontrolAggregationCreateResponseModel result = apiInstance.create(alipayEbppInvoiceExpensecontrolAggregationCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceExpensecontrolAggregationApi#create");
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
| **alipayEbppInvoiceExpensecontrolAggregationCreateModel** | **AlipayEbppInvoiceExpensecontrolAggregationCreateModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceExpensecontrolAggregationCreateResponseModel**

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

