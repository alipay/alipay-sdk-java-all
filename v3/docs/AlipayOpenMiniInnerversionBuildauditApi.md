# AlipayOpenMiniInnerversionBuildauditApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**submit**](AlipayOpenMiniInnerversionBuildauditApi.md#submit) | **POST** /v3/alipay/open/mini/innerversion/buildaudit/submit | 内部链路小程序构建并提审 |


<a name="submit"></a>
# **submit**
> Object submit(alipayOpenMiniInnerversionBuildauditSubmitModel)

内部链路小程序构建并提审

内部链路小程序构建并提审

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerversionBuildauditApi;

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

    AlipayOpenMiniInnerversionBuildauditApi apiInstance = new AlipayOpenMiniInnerversionBuildauditApi(defaultClient);
    AlipayOpenMiniInnerversionBuildauditSubmitModel alipayOpenMiniInnerversionBuildauditSubmitModel = new AlipayOpenMiniInnerversionBuildauditSubmitModel(); // AlipayOpenMiniInnerversionBuildauditSubmitModel | 
    try {
      Object result = apiInstance.submit(alipayOpenMiniInnerversionBuildauditSubmitModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerversionBuildauditApi#submit");
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
| **alipayOpenMiniInnerversionBuildauditSubmitModel** | **AlipayOpenMiniInnerversionBuildauditSubmitModel**|  | [optional] |

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

