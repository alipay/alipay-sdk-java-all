# KoubeiTradeOrderApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**consult**](KoubeiTradeOrderApi.md#consult) | **POST** /v3/koubei/trade/order/consult | 口碑订单预咨询 |


<a name="consult"></a>
# **consult**
> KoubeiTradeOrderConsultResponseModel consult(koubeiTradeOrderConsultModel)

口碑订单预咨询

ISV下单前，可以通过此接口咨询用户优惠信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.KoubeiTradeOrderApi;

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

    KoubeiTradeOrderApi apiInstance = new KoubeiTradeOrderApi(defaultClient);
    KoubeiTradeOrderConsultModel koubeiTradeOrderConsultModel = new KoubeiTradeOrderConsultModel(); // KoubeiTradeOrderConsultModel | 
    try {
      KoubeiTradeOrderConsultResponseModel result = apiInstance.consult(koubeiTradeOrderConsultModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KoubeiTradeOrderApi#consult");
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
| **koubeiTradeOrderConsultModel** | **KoubeiTradeOrderConsultModel**|  | [optional] |

### Return type

**KoubeiTradeOrderConsultResponseModel**

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

