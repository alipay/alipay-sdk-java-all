# AlipayTradeApplepayAuthenticationApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**submit**](AlipayTradeApplepayAuthenticationApi.md#submit) | **POST** /v3/alipay/trade/applepay/authentication/submit | ApplePay支付鉴权提交 |


<a name="submit"></a>
# **submit**
> AlipayTradeApplepayAuthenticationSubmitResponseModel submit(alipayTradeApplepayAuthenticationSubmitModel)

ApplePay支付鉴权提交

ApplePay定义的接口，支付宝进行适配。ApplePay端支付核身完毕后，提交到支付宝进行核身验证+支付推进。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeApplepayAuthenticationApi;

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

    AlipayTradeApplepayAuthenticationApi apiInstance = new AlipayTradeApplepayAuthenticationApi(defaultClient);
    AlipayTradeApplepayAuthenticationSubmitModel alipayTradeApplepayAuthenticationSubmitModel = new AlipayTradeApplepayAuthenticationSubmitModel(); // AlipayTradeApplepayAuthenticationSubmitModel | 
    try {
      AlipayTradeApplepayAuthenticationSubmitResponseModel result = apiInstance.submit(alipayTradeApplepayAuthenticationSubmitModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeApplepayAuthenticationApi#submit");
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
| **alipayTradeApplepayAuthenticationSubmitModel** | **AlipayTradeApplepayAuthenticationSubmitModel**|  | [optional] |

### Return type

**AlipayTradeApplepayAuthenticationSubmitResponseModel**

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

