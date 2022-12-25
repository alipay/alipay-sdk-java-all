# AlipayOpenMiniInnerversionModelforofflineApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenMiniInnerversionModelforofflineApi.md#query) | **GET** /v3/alipay/open/mini/innerversion/modelforoffline/query | 小程序线上版本包数据同步线下场景查询 |


<a name="query"></a>
# **query**
> AlipayOpenMiniInnerversionModelforofflineQueryResponseModel query(miniAppId, appVersion, bundleId, instCode)

小程序线上版本包数据同步线下场景查询

用于查询线上的版本包数据，同步到线下

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerversionModelforofflineApi;

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

    AlipayOpenMiniInnerversionModelforofflineApi apiInstance = new AlipayOpenMiniInnerversionModelforofflineApi(defaultClient);
    String miniAppId = "2018********"; // String | 小程序ID
    String appVersion = "0.0.1"; // String | 版本号
    String bundleId = "com.alipay.alipaywallet"; // String | com.alipay.alipaywallet:支付包
    String instCode = "alipay"; // String | alipay:支付宝
    try {
      AlipayOpenMiniInnerversionModelforofflineQueryResponseModel result = apiInstance.query(miniAppId, appVersion, bundleId, instCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerversionModelforofflineApi#query");
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
| **miniAppId** | **String**| 小程序ID | [optional] |
| **appVersion** | **String**| 版本号 | [optional] |
| **bundleId** | **String**| com.alipay.alipaywallet:支付包 | [optional] |
| **instCode** | **String**| alipay:支付宝 | [optional] |

### Return type

**AlipayOpenMiniInnerversionModelforofflineQueryResponseModel**

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

