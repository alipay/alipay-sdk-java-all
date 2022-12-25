# AlipayOpenMiniVersionDetailApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenMiniVersionDetailApi.md#query) | **GET** /v3/alipay/open/mini/version/detail/query | 小程序版本详情查询 |


<a name="query"></a>
# **query**
> AlipayOpenMiniVersionDetailQueryResponseModel query(appVersion, bundleId)

小程序版本详情查询

小程序版本详情查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniVersionDetailApi;

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

    AlipayOpenMiniVersionDetailApi apiInstance = new AlipayOpenMiniVersionDetailApi(defaultClient);
    String appVersion = "0.0.1"; // String | 小程序版本号
    String bundleId = "com.alipay.alipaywallet"; // String | 小程序投放的端参数，支持： com.alipay.iot.xpaas（IoT端）。 com.alipay.alipaywallet（支付宝钱包端）。 例如投放到支付宝钱包是支付宝端。该参数可选，默认支付宝端。
    try {
      AlipayOpenMiniVersionDetailQueryResponseModel result = apiInstance.query(appVersion, bundleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniVersionDetailApi#query");
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
| **appVersion** | **String**| 小程序版本号 | [optional] |
| **bundleId** | **String**| 小程序投放的端参数，支持： com.alipay.iot.xpaas（IoT端）。 com.alipay.alipaywallet（支付宝钱包端）。 例如投放到支付宝钱包是支付宝端。该参数可选，默认支付宝端。 | [optional] |

### Return type

**AlipayOpenMiniVersionDetailQueryResponseModel**

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

