# AlipayOpenMiniInnerbaseinfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenMiniInnerbaseinfoApi.md#query) | **GET** /v3/alipay/open/mini/innerbaseinfo/query | 内部小程序-应用信息查询 |


<a name="query"></a>
# **query**
> AlipayOpenMiniInnerbaseinfoQueryResponseModel query(miniAppId, instCode, miniAppName, appSubType)

内部小程序-应用信息查询

查询小程序应用信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerbaseinfoApi;

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

    AlipayOpenMiniInnerbaseinfoApi apiInstance = new AlipayOpenMiniInnerbaseinfoApi(defaultClient);
    String miniAppId = "2014060600164699"; // String | 小程序ID，mini_app_id 和 mini_app_name 两个需要有其中一个必填，当填了mini_app_id时只使用id去进行查询。
    String instCode = "taobao"; // String | 租户code，alipay or taobao
    String miniAppName = "test"; // String | 小程序name，mini_app_id 和 mini_app_name 两个需要有其中一个必填，当填了mini_app_id时只使用id去进行查询。
    String appSubType = "TINYAPP_TEMPLATE"; // String | 小程序类型，TINYAPP_TEMPLATE，TINYAPP_NORMAL，TINYAPP_PLUGIN，使用mini_app_name查询的时候，该字段要求必传。
    try {
      AlipayOpenMiniInnerbaseinfoQueryResponseModel result = apiInstance.query(miniAppId, instCode, miniAppName, appSubType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerbaseinfoApi#query");
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
| **miniAppId** | **String**| 小程序ID，mini_app_id 和 mini_app_name 两个需要有其中一个必填，当填了mini_app_id时只使用id去进行查询。 | [optional] |
| **instCode** | **String**| 租户code，alipay or taobao | [optional] |
| **miniAppName** | **String**| 小程序name，mini_app_id 和 mini_app_name 两个需要有其中一个必填，当填了mini_app_id时只使用id去进行查询。 | [optional] |
| **appSubType** | **String**| 小程序类型，TINYAPP_TEMPLATE，TINYAPP_NORMAL，TINYAPP_PLUGIN，使用mini_app_name查询的时候，该字段要求必传。 | [optional] |

### Return type

**AlipayOpenMiniInnerbaseinfoQueryResponseModel**

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

