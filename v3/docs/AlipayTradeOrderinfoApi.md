# AlipayTradeOrderinfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sync**](AlipayTradeOrderinfoApi.md#sync) | **POST** /v3/alipay/trade/orderinfo/sync | 支付宝订单信息同步接口 |


<a name="sync"></a>
# **sync**
> AlipayTradeOrderinfoSyncResponseModel sync()

支付宝订单信息同步接口

该接口用于商户向支付宝同步该笔订单相关业务信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeOrderinfoApi;

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

    AlipayTradeOrderinfoApi apiInstance = new AlipayTradeOrderinfoApi(defaultClient);
    try {
      AlipayTradeOrderinfoSyncResponseModel result = apiInstance.sync();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeOrderinfoApi#sync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**AlipayTradeOrderinfoSyncResponseModel**

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

