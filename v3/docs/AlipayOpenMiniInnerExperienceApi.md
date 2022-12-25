# AlipayOpenMiniInnerExperienceApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancel**](AlipayOpenMiniInnerExperienceApi.md#cancel) | **POST** /v3/alipay/open/mini/inner/experience/cancel | 内部链路取消体验版 |


<a name="cancel"></a>
# **cancel**
> Object cancel(alipayOpenMiniInnerExperienceCancelModel)

内部链路取消体验版

提供给内部一二方用于取消体验版

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerExperienceApi;

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

    AlipayOpenMiniInnerExperienceApi apiInstance = new AlipayOpenMiniInnerExperienceApi(defaultClient);
    AlipayOpenMiniInnerExperienceCancelModel alipayOpenMiniInnerExperienceCancelModel = new AlipayOpenMiniInnerExperienceCancelModel(); // AlipayOpenMiniInnerExperienceCancelModel | 
    try {
      Object result = apiInstance.cancel(alipayOpenMiniInnerExperienceCancelModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerExperienceApi#cancel");
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
| **alipayOpenMiniInnerExperienceCancelModel** | **AlipayOpenMiniInnerExperienceCancelModel**|  | [optional] |

### Return type

**Object**

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

