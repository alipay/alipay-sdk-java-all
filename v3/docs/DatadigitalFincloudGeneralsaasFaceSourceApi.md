# DatadigitalFincloudGeneralsaasFaceSourceApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**certify**](DatadigitalFincloudGeneralsaasFaceSourceApi.md#certify) | **POST** /v3/datadigital/fincloud/generalsaas/face/source/certify | 纯服务端人脸核身 |


<a name="certify"></a>
# **certify**
> DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel certify(data, fileContent)

纯服务端人脸核身

上传人脸照片，调用权威核验源进行验证

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.DatadigitalFincloudGeneralsaasFaceSourceApi;

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

    DatadigitalFincloudGeneralsaasFaceSourceApi apiInstance = new DatadigitalFincloudGeneralsaasFaceSourceApi(defaultClient);
    DatadigitalFincloudGeneralsaasFaceSourceCertifyModel data = new DatadigitalFincloudGeneralsaasFaceSourceCertifyModel(); // DatadigitalFincloudGeneralsaasFaceSourceCertifyModel | 
    File fileContent = new File("/path/to/file"); // File | 
    try {
      DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel result = apiInstance.certify(data, fileContent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatadigitalFincloudGeneralsaasFaceSourceApi#certify");
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
| **data** | **DatadigitalFincloudGeneralsaasFaceSourceCertifyModel**|  | [optional] |
| **fileContent** | **File**|  | [optional] |

### Return type

**DatadigitalFincloudGeneralsaasFaceSourceCertifyResponseModel**

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

