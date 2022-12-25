# AlipayMerchantOrderApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sync**](AlipayMerchantOrderApi.md#sync) | **POST** /v3/alipay/merchant/order/sync | 订单数据同步接口 |


<a name="sync"></a>
# **sync**
> AlipayMerchantOrderSyncResponseModel sync(alipayMerchantOrderSyncModel)

订单数据同步接口

商户可以调用此接口同步交易对应的订单数据

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMerchantOrderApi;

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

    AlipayMerchantOrderApi apiInstance = new AlipayMerchantOrderApi(defaultClient);
    AlipayMerchantOrderSyncModel alipayMerchantOrderSyncModel = new AlipayMerchantOrderSyncModel(); // AlipayMerchantOrderSyncModel | 
    try {
      AlipayMerchantOrderSyncResponseModel result = apiInstance.sync(alipayMerchantOrderSyncModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMerchantOrderApi#sync");
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
| **alipayMerchantOrderSyncModel** | **AlipayMerchantOrderSyncModel**|  | [optional] |

### Return type

**AlipayMerchantOrderSyncResponseModel**

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

