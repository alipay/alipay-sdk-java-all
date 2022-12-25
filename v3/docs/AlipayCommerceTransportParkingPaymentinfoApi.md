# AlipayCommerceTransportParkingPaymentinfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sync**](AlipayCommerceTransportParkingPaymentinfoApi.md#sync) | **POST** /v3/alipay/commerce/transport/parking/paymentinfo/sync | 停车支付模板消息配置 |


<a name="sync"></a>
# **sync**
> AlipayCommerceTransportParkingPaymentinfoSyncResponseModel sync(alipayCommerceTransportParkingPaymentinfoSyncModel)

停车支付模板消息配置

用户在场内支付时，服务商通过此接口配置消息模板内容告知支付宝发送给用户

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceTransportParkingPaymentinfoApi;

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

    AlipayCommerceTransportParkingPaymentinfoApi apiInstance = new AlipayCommerceTransportParkingPaymentinfoApi(defaultClient);
    AlipayCommerceTransportParkingPaymentinfoSyncModel alipayCommerceTransportParkingPaymentinfoSyncModel = new AlipayCommerceTransportParkingPaymentinfoSyncModel(); // AlipayCommerceTransportParkingPaymentinfoSyncModel | 
    try {
      AlipayCommerceTransportParkingPaymentinfoSyncResponseModel result = apiInstance.sync(alipayCommerceTransportParkingPaymentinfoSyncModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceTransportParkingPaymentinfoApi#sync");
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
| **alipayCommerceTransportParkingPaymentinfoSyncModel** | **AlipayCommerceTransportParkingPaymentinfoSyncModel**|  | [optional] |

### Return type

**AlipayCommerceTransportParkingPaymentinfoSyncResponseModel**

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

