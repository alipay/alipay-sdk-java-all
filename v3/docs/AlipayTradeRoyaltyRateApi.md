# AlipayTradeRoyaltyRateApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayTradeRoyaltyRateApi.md#query) | **POST** /v3/alipay/trade/royalty/rate/query | 分账比例查询 |


<a name="query"></a>
# **query**
> AlipayTradeRoyaltyRateQueryResponseModel query(alipayTradeRoyaltyRateQueryModel)

分账比例查询

商户签约分账产品后，商户或其授权ISV可对分账比例进行查询。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeRoyaltyRateApi;

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

    AlipayTradeRoyaltyRateApi apiInstance = new AlipayTradeRoyaltyRateApi(defaultClient);
    AlipayTradeRoyaltyRateQueryModel alipayTradeRoyaltyRateQueryModel = new AlipayTradeRoyaltyRateQueryModel(); // AlipayTradeRoyaltyRateQueryModel | 
    try {
      AlipayTradeRoyaltyRateQueryResponseModel result = apiInstance.query(alipayTradeRoyaltyRateQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeRoyaltyRateApi#query");
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
| **alipayTradeRoyaltyRateQueryModel** | **AlipayTradeRoyaltyRateQueryModel**|  | [optional] |

### Return type

**AlipayTradeRoyaltyRateQueryResponseModel**

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

