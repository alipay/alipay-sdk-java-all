# AlipayMarketingMaterialImageApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**upload**](AlipayMarketingMaterialImageApi.md#upload) | **POST** /v3/alipay/marketing/material/image | 营销图片资源上传接口 |


<a name="upload"></a>
# **upload**
> AlipayMarketingMaterialImageUploadResponseModel upload(data, fileContent)

营销图片资源上传接口

营销通用上传图片接口

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingMaterialImageApi;

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

    AlipayMarketingMaterialImageApi apiInstance = new AlipayMarketingMaterialImageApi(defaultClient);
    AlipayMarketingMaterialImageUploadModel data = new AlipayMarketingMaterialImageUploadModel(); // AlipayMarketingMaterialImageUploadModel | 
    File fileContent = new File("/path/to/file"); // File | 
    try {
      AlipayMarketingMaterialImageUploadResponseModel result = apiInstance.upload(data, fileContent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingMaterialImageApi#upload");
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
| **data** | **AlipayMarketingMaterialImageUploadModel**|  | [optional] |
| **fileContent** | **File**|  | [optional] |

### Return type

**AlipayMarketingMaterialImageUploadResponseModel**

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

