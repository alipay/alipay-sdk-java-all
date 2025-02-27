# AlipayTradeRefundApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apply**](AlipayTradeRefundApi.md#apply) | **POST** /v3/alipay/trade/refund/apply | 异步退款受理接口 |


<a name="apply"></a>
# **apply**
> AlipayTradeRefundApplyResponseModel apply(commonNotifyUrlModel)

异步退款受理接口

商户通过此接口提交异步退款请求，支付宝受理后，将会异步进行退款处理。退款完成后异步通知商户退款结果，商户可以通过alipay.trade.fastpay.refund.query接口查询退款状态。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeRefundApi;

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

    AlipayTradeRefundApi apiInstance = new AlipayTradeRefundApi(defaultClient);
    CommonNotifyUrlModel commonNotifyUrlModel = new CommonNotifyUrlModel(); // CommonNotifyUrlModel | 
    try {
      AlipayTradeRefundApplyResponseModel result = apiInstance.apply(commonNotifyUrlModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeRefundApi#apply");
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
| **commonNotifyUrlModel** | **CommonNotifyUrlModel**|  | [optional] |

### Return type

**AlipayTradeRefundApplyResponseModel**

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

