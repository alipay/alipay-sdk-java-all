# AlipayOpenMiniInnerbaseinfoApplogoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**upload**](AlipayOpenMiniInnerbaseinfoApplogoApi.md#upload) | **POST** /v3/alipay/open/mini/innerbaseinfo/applogo/upload | 内部小程序-小程序logo图片上传 |


<a name="upload"></a>
# **upload**
> AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel upload(appLogo)

内部小程序-小程序logo图片上传

上传小程序logo图片

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerbaseinfoApplogoApi;

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

    AlipayOpenMiniInnerbaseinfoApplogoApi apiInstance = new AlipayOpenMiniInnerbaseinfoApplogoApi(defaultClient);
    File appLogo = new File("/path/to/file"); // File | 
    try {
      AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel result = apiInstance.upload(appLogo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerbaseinfoApplogoApi#upload");
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
| **appLogo** | **File**|  | [optional] |

### Return type

**AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

