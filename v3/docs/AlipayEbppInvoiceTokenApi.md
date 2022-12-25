# AlipayEbppInvoiceTokenApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayEbppInvoiceTokenApi.md#batchquery) | **GET** /v3/alipay/ebpp/invoice/token/batchquery | 根据查询令牌获取发票要素列表 |


<a name="batchquery"></a>
# **batchquery**
> AlipayEbppInvoiceTokenBatchqueryResponseModel batchquery(invoiceToken, scene)

根据查询令牌获取发票要素列表

根据用户通过发票管家选择发票列表产生的请求令牌获取用户选择发票要素列表

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceTokenApi;

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

    AlipayEbppInvoiceTokenApi apiInstance = new AlipayEbppInvoiceTokenApi(defaultClient);
    String invoiceToken = "0136d80096e34a07a528db7cc5bc442888s"; // String | 查询请求令牌。通过唤起支付宝钱包后用户进入发票管家选择发票列表后创建，并通过isv接收url回传给isv。详见 <a href=\"https://opendocs.alipay.com/open/01m6z5\">\"选\"模式发票报销</a>。
    String scene = "INVOICE_EXPENSE"; // String | 发票要素获取应用场景。固定为 INVOICE_EXPENSE 表示发票报销。
    try {
      AlipayEbppInvoiceTokenBatchqueryResponseModel result = apiInstance.batchquery(invoiceToken, scene);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceTokenApi#batchquery");
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
| **invoiceToken** | **String**| 查询请求令牌。通过唤起支付宝钱包后用户进入发票管家选择发票列表后创建，并通过isv接收url回传给isv。详见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/01m6z5\&quot;&gt;\&quot;选\&quot;模式发票报销&lt;/a&gt;。 | [optional] |
| **scene** | **String**| 发票要素获取应用场景。固定为 INVOICE_EXPENSE 表示发票报销。 | [optional] |

### Return type

**AlipayEbppInvoiceTokenBatchqueryResponseModel**

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

