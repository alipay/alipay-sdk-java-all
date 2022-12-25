# AlipayMerchantIndirectSmidbindApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayMerchantIndirectSmidbindApi.md#query) | **GET** /v3/alipay/merchant/indirect/smidbind/query | 获取商家认证状态 |


<a name="query"></a>
# **query**
> AlipayMerchantIndirectSmidbindQueryResponseModel query(subMerchantId)

获取商家认证状态

获取商家认证状态，状态枚举：已确认/未确认/已注销

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMerchantIndirectSmidbindApi;

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

    AlipayMerchantIndirectSmidbindApi apiInstance = new AlipayMerchantIndirectSmidbindApi(defaultClient);
    String subMerchantId = "2088000000000001"; // String | 支付宝商户id
    try {
      AlipayMerchantIndirectSmidbindQueryResponseModel result = apiInstance.query(subMerchantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMerchantIndirectSmidbindApi#query");
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
| **subMerchantId** | **String**| 支付宝商户id | [optional] |

### Return type

**AlipayMerchantIndirectSmidbindQueryResponseModel**

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

