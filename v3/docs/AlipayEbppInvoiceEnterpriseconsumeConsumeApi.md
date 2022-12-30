# AlipayEbppInvoiceEnterpriseconsumeConsumeApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayEbppInvoiceEnterpriseconsumeConsumeApi.md#batchquery) | **POST** /v3/alipay/ebpp/invoice/enterpriseconsume/consume/batchquery | 企业因公账单查询 |


<a name="batchquery"></a>
# **batchquery**
> AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryResponseModel batchquery(alipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel)

企业因公账单查询

基于企业ID和员工UID，在指定时间段（时间间隔不超过24小时）内获取因公账单数据

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceEnterpriseconsumeConsumeApi;

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

    AlipayEbppInvoiceEnterpriseconsumeConsumeApi apiInstance = new AlipayEbppInvoiceEnterpriseconsumeConsumeApi(defaultClient);
    AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel alipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel = new AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel(); // AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel | 
    try {
      AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryResponseModel result = apiInstance.batchquery(alipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceEnterpriseconsumeConsumeApi#batchquery");
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
| **alipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel** | **AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryResponseModel**

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

