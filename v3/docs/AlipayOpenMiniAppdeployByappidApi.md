# AlipayOpenMiniAppdeployByappidApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenMiniAppdeployByappidApi.md#query) | **GET** /v3/alipay/open/mini/appdeploy/byappid/query | 根据APPID分页查询小程序发布信息 |


<a name="query"></a>
# **query**
> AlipayOpenMiniAppdeployByappidQueryResponseModel query(miniAppId, bundleId, instCode, pageNum, pageSize)

根据APPID分页查询小程序发布信息

用于伙伴平台面向开发者提供查询小程序发布能力

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniAppdeployByappidApi;

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

    AlipayOpenMiniAppdeployByappidApi apiInstance = new AlipayOpenMiniAppdeployByappidApi(defaultClient);
    String miniAppId = "2018XXXXXX"; // String | 小程序应用ID
    String bundleId = "com.amap.app"; // String | 端标识
    String instCode = "alipay"; // String | 租户标识
    Integer pageNum = 1; // Integer | 当前页，从1开始
    Integer pageSize = 20; // Integer | 每页个数
    try {
      AlipayOpenMiniAppdeployByappidQueryResponseModel result = apiInstance.query(miniAppId, bundleId, instCode, pageNum, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniAppdeployByappidApi#query");
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
| **miniAppId** | **String**| 小程序应用ID | [optional] |
| **bundleId** | **String**| 端标识 | [optional] |
| **instCode** | **String**| 租户标识 | [optional] |
| **pageNum** | **Integer**| 当前页，从1开始 | [optional] |
| **pageSize** | **Integer**| 每页个数 | [optional] |

### Return type

**AlipayOpenMiniAppdeployByappidQueryResponseModel**

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

