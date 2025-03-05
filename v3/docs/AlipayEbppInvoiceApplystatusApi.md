# AlipayEbppInvoiceApplystatusApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayEbppInvoiceApplystatusApi.md#query) | **POST** /v3/alipay/ebpp/invoice/applystatus/query | 根据外部订单号查询开票状态 |


<a name="query"></a>
# **query**
> AlipayEbppInvoiceApplystatusQueryResponseModel query(alipayEbppInvoiceApplystatusQueryModel)

根据外部订单号查询开票状态

根据外部订单号查询开票状态，仅有申请状态无完整票据信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceApplystatusApi;

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

    AlipayEbppInvoiceApplystatusApi apiInstance = new AlipayEbppInvoiceApplystatusApi(defaultClient);
    AlipayEbppInvoiceApplystatusQueryModel alipayEbppInvoiceApplystatusQueryModel = new AlipayEbppInvoiceApplystatusQueryModel(); // AlipayEbppInvoiceApplystatusQueryModel | 
    try {
      AlipayEbppInvoiceApplystatusQueryResponseModel result = apiInstance.query(alipayEbppInvoiceApplystatusQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceApplystatusApi#query");
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
| **alipayEbppInvoiceApplystatusQueryModel** | **AlipayEbppInvoiceApplystatusQueryModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceApplystatusQueryResponseModel**

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

