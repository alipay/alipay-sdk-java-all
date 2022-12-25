# AlipayOpenMiniInnerversionLastApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenMiniInnerversionLastApi.md#query) | **GET** /v3/alipay/open/mini/innerversion/last/query | 内部链路查询最新版本号 |


<a name="query"></a>
# **query**
> AlipayOpenMiniInnerversionLastQueryResponseModel query(miniAppId, bundleId, appOrigin, pid)

内部链路查询最新版本号

针对一二方场景的开发者，小程序提供一套统一的内部能力体系，定向输出赋能，本接口主要用于查询最新版本号 

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerversionLastApi;

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

    AlipayOpenMiniInnerversionLastApi apiInstance = new AlipayOpenMiniInnerversionLastApi(defaultClient);
    String miniAppId = "2018********"; // String | 小程序ID，仅特殊场景使用，普通业务方无需关注该参数。
    String bundleId = "com.alipay.alipaywallet"; // String | 端信息
    String appOrigin = "AAA"; // String | 业务来源场景
    String pid = "2088*******"; // String | 小程序主体
    try {
      AlipayOpenMiniInnerversionLastQueryResponseModel result = apiInstance.query(miniAppId, bundleId, appOrigin, pid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerversionLastApi#query");
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
| **miniAppId** | **String**| 小程序ID，仅特殊场景使用，普通业务方无需关注该参数。 | [optional] |
| **bundleId** | **String**| 端信息 | [optional] |
| **appOrigin** | **String**| 业务来源场景 | [optional] |
| **pid** | **String**| 小程序主体 | [optional] |

### Return type

**AlipayOpenMiniInnerversionLastQueryResponseModel**

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

