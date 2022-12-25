# AlipayOpenMiniInnerversionPackageApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayOpenMiniInnerversionPackageApi.md#create) | **POST** /v3/alipay/open/mini/innerversion/package/create | 单独构建包信息 |


<a name="create"></a>
# **create**
> Object create(alipayOpenMiniInnerversionPackageCreateModel)

单独构建包信息

内部OPENAPI 单独构建包信息。将构建链路中打预发包逻辑抽离出来，成为单独的能力，让伙伴等业务自己来调用

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerversionPackageApi;

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

    AlipayOpenMiniInnerversionPackageApi apiInstance = new AlipayOpenMiniInnerversionPackageApi(defaultClient);
    AlipayOpenMiniInnerversionPackageCreateModel alipayOpenMiniInnerversionPackageCreateModel = new AlipayOpenMiniInnerversionPackageCreateModel(); // AlipayOpenMiniInnerversionPackageCreateModel | 
    try {
      Object result = apiInstance.create(alipayOpenMiniInnerversionPackageCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerversionPackageApi#create");
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
| **alipayOpenMiniInnerversionPackageCreateModel** | **AlipayOpenMiniInnerversionPackageCreateModel**|  | [optional] |

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

