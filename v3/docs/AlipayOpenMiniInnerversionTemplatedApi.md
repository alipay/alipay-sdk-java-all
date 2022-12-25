# AlipayOpenMiniInnerversionTemplatedApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**upload**](AlipayOpenMiniInnerversionTemplatedApi.md#upload) | **POST** /v3/alipay/open/mini/innerversion/templated/upload | 基于模板构建版本 |


<a name="upload"></a>
# **upload**
> Object upload(alipayOpenMiniInnerversionTemplatedUploadModel)

基于模板构建版本

基于模板构建实例化小程序，同步接口，调用成功表示创建版本成功

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerversionTemplatedApi;

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

    AlipayOpenMiniInnerversionTemplatedApi apiInstance = new AlipayOpenMiniInnerversionTemplatedApi(defaultClient);
    AlipayOpenMiniInnerversionTemplatedUploadModel alipayOpenMiniInnerversionTemplatedUploadModel = new AlipayOpenMiniInnerversionTemplatedUploadModel(); // AlipayOpenMiniInnerversionTemplatedUploadModel | 
    try {
      Object result = apiInstance.upload(alipayOpenMiniInnerversionTemplatedUploadModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerversionTemplatedApi#upload");
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
| **alipayOpenMiniInnerversionTemplatedUploadModel** | **AlipayOpenMiniInnerversionTemplatedUploadModel**|  | [optional] |

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

