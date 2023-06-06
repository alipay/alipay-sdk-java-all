# AlipayEbppInvoiceEcorderOrderApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayEbppInvoiceEcorderOrderApi.md#query) | **GET** /v3/alipay/ebpp/invoice/ecorder/order/query | 企业码订单查询 |


<a name="query"></a>
# **query**
> AlipayEbppInvoiceEcorderOrderQueryResponseModel query(enterpriseId, accountId, agreementNo, orderId, orderType)

企业码订单查询

企业码订单查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceEcorderOrderApi;

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

    AlipayEbppInvoiceEcorderOrderApi apiInstance = new AlipayEbppInvoiceEcorderOrderApi(defaultClient);
    String enterpriseId = "2088501296144291"; // String | 企业ID
    String accountId = "2088000000000000"; // String | 共同账户ID
    String agreementNo = "20200000000000000000"; // String | 授权签约协议号
    String orderId = "2020103022000000000000000000"; // String | 订单ID
    String orderType = "METRO"; // String | 订单类型
    try {
      AlipayEbppInvoiceEcorderOrderQueryResponseModel result = apiInstance.query(enterpriseId, accountId, agreementNo, orderId, orderType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceEcorderOrderApi#query");
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
| **enterpriseId** | **String**| 企业ID | [optional] |
| **accountId** | **String**| 共同账户ID | [optional] |
| **agreementNo** | **String**| 授权签约协议号 | [optional] |
| **orderId** | **String**| 订单ID | [optional] |
| **orderType** | **String**| 订单类型 | [optional] |

### Return type

**AlipayEbppInvoiceEcorderOrderQueryResponseModel**

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

