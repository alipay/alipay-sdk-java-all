# AlipayTradeFastpayRefundApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayTradeFastpayRefundApi.md#query) | **POST** /v3/alipay/trade/fastpay/refund/query | 统一收单交易退款查询 |


<a name="query"></a>
# **query**
> AlipayTradeFastpayRefundQueryResponseModel query(alipayTradeFastpayRefundQueryModel)

统一收单交易退款查询

商户可使用该接口查询自已通过alipay.trade.refund提交的退款请求是否执行成功。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeFastpayRefundApi;

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

    AlipayTradeFastpayRefundApi apiInstance = new AlipayTradeFastpayRefundApi(defaultClient);
    AlipayTradeFastpayRefundQueryModel alipayTradeFastpayRefundQueryModel = new AlipayTradeFastpayRefundQueryModel(); // AlipayTradeFastpayRefundQueryModel | 
    try {
      AlipayTradeFastpayRefundQueryResponseModel result = apiInstance.query(alipayTradeFastpayRefundQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeFastpayRefundApi#query");
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
| **alipayTradeFastpayRefundQueryModel** | **AlipayTradeFastpayRefundQueryModel**|  | [optional] |

### Return type

**AlipayTradeFastpayRefundQueryResponseModel**

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

