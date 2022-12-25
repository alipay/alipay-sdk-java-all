# AlipayOpenMiniInnerversionInstantiationApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenMiniInnerversionInstantiationApi.md#query) | **GET** /v3/alipay/open/mini/innerversion/instantiation/query | 小程序实例化关系查询 |


<a name="query"></a>
# **query**
> AlipayOpenMiniInnerversionInstantiationQueryResponseModel query(appOrigin, bundleId, miniAppId, appVersion)

小程序实例化关系查询

用于通过模板实例化的小程序版本查询实例化关系

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerversionInstantiationApi;

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

    AlipayOpenMiniInnerversionInstantiationApi apiInstance = new AlipayOpenMiniInnerversionInstantiationApi(defaultClient);
    String appOrigin = "AAA"; // String | 来源类型，新接入方需要向支付宝申请专用来源，否则不予接入，申请方式请参见接入手册。
    String bundleId = "com.alipay.alipaywallet"; // String | 端id
    String miniAppId = "2021000116680014"; // String | 小程序ID，特殊场景专用，普通业务方无需关注该参数。
    String appVersion = "0.0.1"; // String | 实例化小程序版本号
    try {
      AlipayOpenMiniInnerversionInstantiationQueryResponseModel result = apiInstance.query(appOrigin, bundleId, miniAppId, appVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerversionInstantiationApi#query");
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
| **appOrigin** | **String**| 来源类型，新接入方需要向支付宝申请专用来源，否则不予接入，申请方式请参见接入手册。 | [optional] |
| **bundleId** | **String**| 端id | [optional] |
| **miniAppId** | **String**| 小程序ID，特殊场景专用，普通业务方无需关注该参数。 | [optional] |
| **appVersion** | **String**| 实例化小程序版本号 | [optional] |

### Return type

**AlipayOpenMiniInnerversionInstantiationQueryResponseModel**

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

