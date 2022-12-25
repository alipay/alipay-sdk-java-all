# AlipayOfflineMaterialImageApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**upload**](AlipayOfflineMaterialImageApi.md#upload) | **POST** /v3/alipay/offline/material/image/upload | 上传门店照片和视频接口 |


<a name="upload"></a>
# **upload**
> AlipayOfflineMaterialImageUploadResponseModel upload(data, imageContent)

上传门店照片和视频接口

系统商需要先将商户需要使用的图片和视频，上传支付宝服务器,生成对应的图片ID后才能够在口碑平台上配置相应图片

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOfflineMaterialImageApi;

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

    AlipayOfflineMaterialImageApi apiInstance = new AlipayOfflineMaterialImageApi(defaultClient);
    AlipayOfflineMaterialImageUploadModel data = new AlipayOfflineMaterialImageUploadModel(); // AlipayOfflineMaterialImageUploadModel | 
    File imageContent = new File("/path/to/file"); // File | 
    try {
      AlipayOfflineMaterialImageUploadResponseModel result = apiInstance.upload(data, imageContent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOfflineMaterialImageApi#upload");
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
| **data** | **AlipayOfflineMaterialImageUploadModel**|  | [optional] |
| **imageContent** | **File**|  | [optional] |

### Return type

**AlipayOfflineMaterialImageUploadResponseModel**

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

