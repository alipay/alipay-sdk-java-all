# AlipayMerchantLiveChannelApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayMerchantLiveChannelApi.md#query) | **GET** /v3/alipay/merchant/live/channel/query | 渠道信息查询 |


<a name="query"></a>
# **query**
> AlipayMerchantLiveChannelQueryResponseModel query(secret)

渠道信息查询

根据直播等内容域跳转小程序下单时携带的orderStartId，回查业务主体信息(如操作人、主播、直播、文章等，用于外部业务信息补全、返佣等)。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMerchantLiveChannelApi;

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

    AlipayMerchantLiveChannelApi apiInstance = new AlipayMerchantLiveChannelApi(defaultClient);
    String secret = "b07d6694341b69c406522d3ff28d9807"; // String | 渠道下单参数(orderStartId)
    try {
      AlipayMerchantLiveChannelQueryResponseModel result = apiInstance.query(secret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMerchantLiveChannelApi#query");
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
| **secret** | **String**| 渠道下单参数(orderStartId) | [optional] |

### Return type

**AlipayMerchantLiveChannelQueryResponseModel**

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

