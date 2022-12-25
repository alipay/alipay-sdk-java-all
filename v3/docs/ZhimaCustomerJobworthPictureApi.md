# ZhimaCustomerJobworthPictureApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**upload**](ZhimaCustomerJobworthPictureApi.md#upload) | **POST** /v3/zhima/customer/jobworth/picture/upload | 职得工作证图片上传 |


<a name="upload"></a>
# **upload**
> ZhimaCustomerJobworthPictureUploadResponseModel upload(zhimaCustomerJobworthPictureUploadModel)

职得工作证图片上传

工作证图片上传通用接口

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaCustomerJobworthPictureApi;

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

    ZhimaCustomerJobworthPictureApi apiInstance = new ZhimaCustomerJobworthPictureApi(defaultClient);
    ZhimaCustomerJobworthPictureUploadModel zhimaCustomerJobworthPictureUploadModel = new ZhimaCustomerJobworthPictureUploadModel(); // ZhimaCustomerJobworthPictureUploadModel | 
    try {
      ZhimaCustomerJobworthPictureUploadResponseModel result = apiInstance.upload(zhimaCustomerJobworthPictureUploadModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaCustomerJobworthPictureApi#upload");
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
| **zhimaCustomerJobworthPictureUploadModel** | **ZhimaCustomerJobworthPictureUploadModel**|  | [optional] |

### Return type

**ZhimaCustomerJobworthPictureUploadResponseModel**

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

