# AlipayOpenFileApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**upload**](AlipayOpenFileApi.md#upload) | **POST** /v3/alipay/open/file/upload | 支付宝文件上传接口 |


<a name="upload"></a>
# **upload**
> AlipayOpenFileUploadResponseModel upload(data, fileContent)

支付宝文件上传接口

支付宝通用文件上传接口，开发者可调用此接口上传文件，提供给其他业务使用，例如：上传素材（视频/图片），供给到生活号+/小程序等业务使用。 

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenFileApi;

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

    AlipayOpenFileApi apiInstance = new AlipayOpenFileApi(defaultClient);
    AlipayOpenFileUploadModel data = new AlipayOpenFileUploadModel(); // AlipayOpenFileUploadModel | 
    File fileContent = new File("/path/to/file"); // File | 
    try {
      AlipayOpenFileUploadResponseModel result = apiInstance.upload(data, fileContent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenFileApi#upload");
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
| **data** | **AlipayOpenFileUploadModel**|  | [optional] |
| **fileContent** | **File**|  | [optional] |

### Return type

**AlipayOpenFileUploadResponseModel**

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

