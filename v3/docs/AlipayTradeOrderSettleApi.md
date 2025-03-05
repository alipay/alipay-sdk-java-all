# AlipayTradeOrderSettleApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayTradeOrderSettleApi.md#query) | **GET** /v3/alipay/trade/order/settle/query | 交易分账查询接口 |


<a name="query"></a>
# **query**
> AlipayTradeOrderSettleQueryResponseModel query(settleNo, outRequestNo, tradeNo)

交易分账查询接口

根据分账请求号查询交易分账结果

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeOrderSettleApi;

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

    AlipayTradeOrderSettleApi apiInstance = new AlipayTradeOrderSettleApi(defaultClient);
    String settleNo = "20210706002530020036530021395831"; // String | 支付宝分账请求单号，传入该字段，无需再传外部请求号和支付宝交易号
    String outRequestNo = "20210727001"; // String | 调用分账接口时指定的外部请求号。分账查询时需要和支付宝交易号一起传入
    String tradeNo = "2021112611001004680 073956707"; // String | 支付宝交易号，传入该字段，需要和外部请求号一起传入
    try {
      AlipayTradeOrderSettleQueryResponseModel result = apiInstance.query(settleNo, outRequestNo, tradeNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeOrderSettleApi#query");
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
| **settleNo** | **String**| 支付宝分账请求单号，传入该字段，无需再传外部请求号和支付宝交易号 | [optional] |
| **outRequestNo** | **String**| 调用分账接口时指定的外部请求号。分账查询时需要和支付宝交易号一起传入 | [optional] |
| **tradeNo** | **String**| 支付宝交易号，传入该字段，需要和外部请求号一起传入 | [optional] |

### Return type

**AlipayTradeOrderSettleQueryResponseModel**

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

