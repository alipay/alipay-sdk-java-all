# AlipayFundTransAppApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pay**](AlipayFundTransAppApi.md#pay) | **POST** /v3/alipay/fund/trans/app/pay | 现金红包无线支付接口 |


<a name="pay"></a>
# **pay**
> AlipayFundTransAppPayResponseModel pay(alipayFundTransAppPayModel)

现金红包无线支付接口

外部商户APP唤起快捷SDK创建现金红包单据并进行支付

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundTransAppApi;

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

    AlipayFundTransAppApi apiInstance = new AlipayFundTransAppApi(defaultClient);
    AlipayFundTransAppPayModel alipayFundTransAppPayModel = new AlipayFundTransAppPayModel(); // AlipayFundTransAppPayModel | 
    try {
      AlipayFundTransAppPayResponseModel result = apiInstance.pay(alipayFundTransAppPayModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundTransAppApi#pay");
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
| **alipayFundTransAppPayModel** | **AlipayFundTransAppPayModel**|  | [optional] |

### Return type

**AlipayFundTransAppPayResponseModel**

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

