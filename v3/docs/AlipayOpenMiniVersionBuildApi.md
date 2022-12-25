# AlipayOpenMiniVersionBuildApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenMiniVersionBuildApi.md#query) | **GET** /v3/alipay/open/mini/version/build/query | 小程序查询版本构建状态 |


<a name="query"></a>
# **query**
> AlipayOpenMiniVersionBuildQueryResponseModel query(appVersion, bundleId)

小程序查询版本构建状态

小程序查询版本构建状态

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniVersionBuildApi;

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

    AlipayOpenMiniVersionBuildApi apiInstance = new AlipayOpenMiniVersionBuildApi(defaultClient);
    String appVersion = "0.0.1"; // String | 小程序版本号
    String bundleId = "com.alipay.alipaywallet"; // String | 小程序投放的端参数，默认为支付宝端。支持：  com.alipay.alipaywallet：支付宝端。 com.alipay.iot.xpaas：IOT端。 例如：投放到支付宝钱包为支付宝端需传入 com.alipay.alipaywallet。
    try {
      AlipayOpenMiniVersionBuildQueryResponseModel result = apiInstance.query(appVersion, bundleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniVersionBuildApi#query");
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
| **bundleId** | **String**| 小程序投放的端参数，默认为支付宝端。支持：  com.alipay.alipaywallet：支付宝端。 com.alipay.iot.xpaas：IOT端。 例如：投放到支付宝钱包为支付宝端需传入 com.alipay.alipaywallet。 | [optional] |

### Return type

**AlipayOpenMiniVersionBuildQueryResponseModel**

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

