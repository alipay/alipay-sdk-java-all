# AlipayEbppPdeductBillPayApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**status**](AlipayEbppPdeductBillPayApi.md#status) | **GET** /v3/alipay/ebpp/pdeduct/bill/pay/status | 缴费直连代扣订单支付状态查询 |


<a name="status"></a>
# **status**
> AlipayEbppPdeductBillPayStatusResponseModel status(agreementId, openId, outOrderNo)

缴费直连代扣订单支付状态查询

缴费直连代扣

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppPdeductBillPayApi;

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

    AlipayEbppPdeductBillPayApi apiInstance = new AlipayEbppPdeductBillPayApi(defaultClient);
    String agreementId = "2088123123421312"; // String | 支付宝用户ID
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 用户UserId在应用AppId下的唯一用户标识
    String outOrderNo = "12312313"; // String | 商户代扣业务流水
    try {
      AlipayEbppPdeductBillPayStatusResponseModel result = apiInstance.status(agreementId, openId, outOrderNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppPdeductBillPayApi#status");
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
| **agreementId** | **String**| 支付宝用户ID | [optional] |
| **openId** | **String**| 用户UserId在应用AppId下的唯一用户标识 | [optional] |
| **outOrderNo** | **String**| 商户代扣业务流水 | [optional] |

### Return type

**AlipayEbppPdeductBillPayStatusResponseModel**

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

