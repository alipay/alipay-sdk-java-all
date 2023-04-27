# AlipayEbppInvoiceTaxnoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayEbppInvoiceTaxnoApi.md#batchquery) | **POST** /v3/alipay/ebpp/invoice/taxno/batchquery | 获取指定企业的发票要素列表 |


<a name="batchquery"></a>
# **batchquery**
> AlipayEbppInvoiceTaxnoBatchqueryResponseModel batchquery(authToken, alipayEbppInvoiceTaxnoBatchqueryModel)

获取指定企业的发票要素列表

根据购买方税号获取用户的发票关键要素列表，该接口目前适用于发票报销场景

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceTaxnoApi;

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

    AlipayEbppInvoiceTaxnoApi apiInstance = new AlipayEbppInvoiceTaxnoApi(defaultClient);
    String authToken = "authToken_example"; // String | 用户授权令牌
    AlipayEbppInvoiceTaxnoBatchqueryModel alipayEbppInvoiceTaxnoBatchqueryModel = new AlipayEbppInvoiceTaxnoBatchqueryModel(); // AlipayEbppInvoiceTaxnoBatchqueryModel | 
    try {
      AlipayEbppInvoiceTaxnoBatchqueryResponseModel result = apiInstance.batchquery(authToken, alipayEbppInvoiceTaxnoBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceTaxnoApi#batchquery");
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
| **authToken** | **String**| 用户授权令牌 | [optional] |
| **alipayEbppInvoiceTaxnoBatchqueryModel** | **AlipayEbppInvoiceTaxnoBatchqueryModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceTaxnoBatchqueryResponseModel**

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

