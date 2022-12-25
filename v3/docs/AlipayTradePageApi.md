# AlipayTradePageApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pay**](AlipayTradePageApi.md#pay) | **POST** /v3/alipay/trade/page/pay | 统一收单下单并支付页面接口 |


<a name="pay"></a>
# **pay**
> AlipayTradePagePayResponseModel pay(alipayTradePagePayModel)

统一收单下单并支付页面接口

PC场景下单并支付

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradePageApi;

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

    AlipayTradePageApi apiInstance = new AlipayTradePageApi(defaultClient);
    AlipayTradePagePayModel alipayTradePagePayModel = new AlipayTradePagePayModel(); // AlipayTradePagePayModel | 
    try {
      AlipayTradePagePayResponseModel result = apiInstance.pay(alipayTradePagePayModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradePageApi#pay");
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
| **alipayTradePagePayModel** | **AlipayTradePagePayModel**|  | [optional] |

### Return type

**AlipayTradePagePayResponseModel**

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

