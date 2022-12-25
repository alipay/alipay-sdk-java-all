# AlipayTradeOverseasApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**settle**](AlipayTradeOverseasApi.md#settle) | **POST** /v3/alipay/trade/overseas/settle | 统一境内收单跨境结算接口 |


<a name="settle"></a>
# **settle**
> AlipayTradeOverseasSettleResponseModel settle(alipayTradeOverseasSettleModel)

统一境内收单跨境结算接口

境内收单跨境结算

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeOverseasApi;

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

    AlipayTradeOverseasApi apiInstance = new AlipayTradeOverseasApi(defaultClient);
    AlipayTradeOverseasSettleModel alipayTradeOverseasSettleModel = new AlipayTradeOverseasSettleModel(); // AlipayTradeOverseasSettleModel | 
    try {
      AlipayTradeOverseasSettleResponseModel result = apiInstance.settle(alipayTradeOverseasSettleModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeOverseasApi#settle");
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
| **alipayTradeOverseasSettleModel** | **AlipayTradeOverseasSettleModel**|  | [optional] |

### Return type

**AlipayTradeOverseasSettleResponseModel**

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

