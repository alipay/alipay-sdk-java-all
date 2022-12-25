# AlipayOpenMiniInnerversionUploadstatusApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenMiniInnerversionUploadstatusApi.md#query) | **GET** /v3/alipay/open/mini/innerversion/uploadstatus/query | 多端小程序-查询构建状态 |


<a name="query"></a>
# **query**
> AlipayOpenMiniInnerversionUploadstatusQueryResponseModel query(buildPackageId, miniAppId, buildVersion, instCode, bundleId)

多端小程序-查询构建状态

查询构建状态

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerversionUploadstatusApi;

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

    AlipayOpenMiniInnerversionUploadstatusApi apiInstance = new AlipayOpenMiniInnerversionUploadstatusApi(defaultClient);
    String buildPackageId = "34818"; // String | 包管理ID，用于查询打包状态
    String miniAppId = "2018012201365222"; // String | 小程序ID
    String buildVersion = "0.0.5"; // String | 小程序版本
    String instCode = "taobao"; // String | 租户id
    String bundleId = "com.taobao.app"; // String | 端信息
    try {
      AlipayOpenMiniInnerversionUploadstatusQueryResponseModel result = apiInstance.query(buildPackageId, miniAppId, buildVersion, instCode, bundleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerversionUploadstatusApi#query");
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
| **buildPackageId** | **String**| 包管理ID，用于查询打包状态 | [optional] |
| **miniAppId** | **String**| 小程序ID | [optional] |
| **buildVersion** | **String**| 小程序版本 | [optional] |
| **instCode** | **String**| 租户id | [optional] |
| **bundleId** | **String**| 端信息 | [optional] |

### Return type

**AlipayOpenMiniInnerversionUploadstatusQueryResponseModel**

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

