# AlipayTradeWapApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pay**](AlipayTradeWapApi.md#pay) | **POST** /v3/alipay/trade/wap/pay | 手机网站支付接口2.0 |


<a name="pay"></a>
# **pay**
> AlipayTradeWapPayResponseModel pay(alipayTradeWapPayModel)

手机网站支付接口2.0

外部商户创建订单并支付

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeWapApi;

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

    AlipayTradeWapApi apiInstance = new AlipayTradeWapApi(defaultClient);
    AlipayTradeWapPayModel alipayTradeWapPayModel = new AlipayTradeWapPayModel(); // AlipayTradeWapPayModel | 
    try {
      AlipayTradeWapPayResponseModel result = apiInstance.pay(alipayTradeWapPayModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeWapApi#pay");
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
| **alipayTradeWapPayModel** | **AlipayTradeWapPayModel**|  | [optional] |

### Return type

**AlipayTradeWapPayResponseModel**

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

