# AlipayOpenMiniAppdeployByappversionApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenMiniAppdeployByappversionApi.md#query) | **GET** /v3/alipay/open/mini/appdeploy/byappversion/query | 通过版本查询小程序发布 |


<a name="query"></a>
# **query**
> AlipayOpenMiniAppdeployByappversionQueryResponseModel query(miniAppId, bundleId, instCode, appVersion)

通过版本查询小程序发布

伙伴平台使用，用于向开发者展示小程序发布信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniAppdeployByappversionApi;

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

    AlipayOpenMiniAppdeployByappversionApi apiInstance = new AlipayOpenMiniAppdeployByappversionApi(defaultClient);
    String miniAppId = "2011XXXXXXX"; // String | 小程序ID
    String bundleId = "com.amap.app"; // String | 端标识
    String instCode = "alipay"; // String | 租户
    String appVersion = "0.0.1"; // String | 小程序版本
    try {
      AlipayOpenMiniAppdeployByappversionQueryResponseModel result = apiInstance.query(miniAppId, bundleId, instCode, appVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniAppdeployByappversionApi#query");
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
| **bundleId** | **String**| 端标识 | [optional] |
| **instCode** | **String**| 租户 | [optional] |
| **appVersion** | **String**| 小程序版本 | [optional] |

### Return type

**AlipayOpenMiniAppdeployByappversionQueryResponseModel**

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

