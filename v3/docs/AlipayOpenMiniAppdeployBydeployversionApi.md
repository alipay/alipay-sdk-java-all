# AlipayOpenMiniAppdeployBydeployversionApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenMiniAppdeployBydeployversionApi.md#query) | **GET** /v3/alipay/open/mini/appdeploy/bydeployversion/query | 根据发布版本查询小程序发布信息 |


<a name="query"></a>
# **query**
> AlipayOpenMiniAppdeployBydeployversionQueryResponseModel query(bundleId, miniAppId, instCode, deployVersion)

根据发布版本查询小程序发布信息

用于伙伴向开发者展示小程序发布信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniAppdeployBydeployversionApi;

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

    AlipayOpenMiniAppdeployBydeployversionApi apiInstance = new AlipayOpenMiniAppdeployBydeployversionApi(defaultClient);
    String bundleId = "com.amap.app"; // String | 客户端标识
    String miniAppId = "2021XXXXXX"; // String | 小程序ID
    String instCode = "alipay"; // String | 租户
    String deployVersion = "0.2.201910101.2"; // String | 发布标识
    try {
      AlipayOpenMiniAppdeployBydeployversionQueryResponseModel result = apiInstance.query(bundleId, miniAppId, instCode, deployVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniAppdeployBydeployversionApi#query");
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
| **bundleId** | **String**| 客户端标识 | [optional] |
| **miniAppId** | **String**| 小程序ID | [optional] |
| **instCode** | **String**| 租户 | [optional] |
| **deployVersion** | **String**| 发布标识 | [optional] |

### Return type

**AlipayOpenMiniAppdeployBydeployversionQueryResponseModel**

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

