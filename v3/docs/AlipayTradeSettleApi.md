# AlipayTradeSettleApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**confirm**](AlipayTradeSettleApi.md#confirm) | **POST** /v3/alipay/trade/settle/confirm | 统一收单确认结算接口 |


<a name="confirm"></a>
# **confirm**
> AlipayTradeSettleConfirmResponseModel confirm(alipayTradeSettleConfirmModel)

统一收单确认结算接口

确认结算

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeSettleApi;

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

    AlipayTradeSettleApi apiInstance = new AlipayTradeSettleApi(defaultClient);
    AlipayTradeSettleConfirmModel alipayTradeSettleConfirmModel = new AlipayTradeSettleConfirmModel(); // AlipayTradeSettleConfirmModel | 
    try {
      AlipayTradeSettleConfirmResponseModel result = apiInstance.confirm(alipayTradeSettleConfirmModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeSettleApi#confirm");
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
| **alipayTradeSettleConfirmModel** | **AlipayTradeSettleConfirmModel**|  | [optional] |

### Return type

**AlipayTradeSettleConfirmResponseModel**

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

