# AlipayOpenMiniTemplatemsgTinypayswitchApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**confirm**](AlipayOpenMiniTemplatemsgTinypayswitchApi.md#confirm) | **POST** /v3/alipay/open/mini/templatemsg/tinypayswitch/confirm | 小程序支付消息确认接口 |


<a name="confirm"></a>
# **confirm**
> Object confirm()

小程序支付消息确认接口

支付消息是用户和商户收款账户之间发生的交易后，由平台代发的消息提醒。通过接口确认后，可在小程序交易的支付消息上透出商户主体和商户小程序入口

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniTemplatemsgTinypayswitchApi;

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

    AlipayOpenMiniTemplatemsgTinypayswitchApi apiInstance = new AlipayOpenMiniTemplatemsgTinypayswitchApi(defaultClient);
    try {
      Object result = apiInstance.confirm();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniTemplatemsgTinypayswitchApi#confirm");
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

**Object**

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

