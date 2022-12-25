# AlipayOpenMiniInnerversionBetainfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenMiniInnerversionBetainfoApi.md#query) | **GET** /v3/alipay/open/mini/innerversion/betainfo/query | 查看可邀测状态接口 |


<a name="query"></a>
# **query**
> AlipayOpenMiniInnerversionBetainfoQueryResponseModel query(pluginId, bundleId, pluginVersion, appOrigin)

查看可邀测状态接口

查看插件可邀测版本状态,邀测结果

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerversionBetainfoApi;

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

    AlipayOpenMiniInnerversionBetainfoApi apiInstance = new AlipayOpenMiniInnerversionBetainfoApi(defaultClient);
    String pluginId = "2021xxxx"; // String | 插件ID
    String bundleId = "com.alipay.alipaywallet"; // String | 端信息
    String pluginVersion = "0.0.1"; // String | 查询版本号
    String appOrigin = "ASTORE"; // String | 业务来源
    try {
      AlipayOpenMiniInnerversionBetainfoQueryResponseModel result = apiInstance.query(pluginId, bundleId, pluginVersion, appOrigin);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerversionBetainfoApi#query");
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
| **pluginId** | **String**| 插件ID | [optional] |
| **bundleId** | **String**| 端信息 | [optional] |
| **pluginVersion** | **String**| 查询版本号 | [optional] |
| **appOrigin** | **String**| 业务来源 | [optional] |

### Return type

**AlipayOpenMiniInnerversionBetainfoQueryResponseModel**

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

