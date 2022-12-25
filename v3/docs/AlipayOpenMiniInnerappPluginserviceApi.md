# AlipayOpenMiniInnerappPluginserviceApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**publish**](AlipayOpenMiniInnerappPluginserviceApi.md#publish) | **POST** /v3/alipay/open/mini/innerapp/pluginservice/publish | 插件发布能力中心 |


<a name="publish"></a>
# **publish**
> AlipayOpenMiniInnerappPluginservicePublishResponseModel publish(alipayOpenMiniInnerappPluginservicePublishModel)

插件发布能力中心

插件发布能力中心

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerappPluginserviceApi;

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

    AlipayOpenMiniInnerappPluginserviceApi apiInstance = new AlipayOpenMiniInnerappPluginserviceApi(defaultClient);
    AlipayOpenMiniInnerappPluginservicePublishModel alipayOpenMiniInnerappPluginservicePublishModel = new AlipayOpenMiniInnerappPluginservicePublishModel(); // AlipayOpenMiniInnerappPluginservicePublishModel | 
    try {
      AlipayOpenMiniInnerappPluginservicePublishResponseModel result = apiInstance.publish(alipayOpenMiniInnerappPluginservicePublishModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerappPluginserviceApi#publish");
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
| **alipayOpenMiniInnerappPluginservicePublishModel** | **AlipayOpenMiniInnerappPluginservicePublishModel**|  | [optional] |

### Return type

**AlipayOpenMiniInnerappPluginservicePublishResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

