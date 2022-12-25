# AlipayCommerceTransportParkingEnterinfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sync**](AlipayCommerceTransportParkingEnterinfoApi.md#sync) | **POST** /v3/alipay/commerce/transport/parking/enterinfo/sync | 停车入场模板消息配置 |


<a name="sync"></a>
# **sync**
> AlipayCommerceTransportParkingEnterinfoSyncResponseModel sync(alipayCommerceTransportParkingEnterinfoSyncModel)

停车入场模板消息配置

车辆驶入停车场时，服务商通过此接口配置消息模板内容告知支付宝发送给用户

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceTransportParkingEnterinfoApi;

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

    AlipayCommerceTransportParkingEnterinfoApi apiInstance = new AlipayCommerceTransportParkingEnterinfoApi(defaultClient);
    AlipayCommerceTransportParkingEnterinfoSyncModel alipayCommerceTransportParkingEnterinfoSyncModel = new AlipayCommerceTransportParkingEnterinfoSyncModel(); // AlipayCommerceTransportParkingEnterinfoSyncModel | 
    try {
      AlipayCommerceTransportParkingEnterinfoSyncResponseModel result = apiInstance.sync(alipayCommerceTransportParkingEnterinfoSyncModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceTransportParkingEnterinfoApi#sync");
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
| **alipayCommerceTransportParkingEnterinfoSyncModel** | **AlipayCommerceTransportParkingEnterinfoSyncModel**|  | [optional] |

### Return type

**AlipayCommerceTransportParkingEnterinfoSyncResponseModel**

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

