# DatadigitalFincloudGeneralsaasOcrServerApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**detect**](DatadigitalFincloudGeneralsaasOcrServerApi.md#detect) | **POST** /v3/datadigital/fincloud/generalsaas/ocr/server/detect | 服务端OCR |


<a name="detect"></a>
# **detect**
> DatadigitalFincloudGeneralsaasOcrServerDetectResponseModel detect(data, fileContent)

服务端OCR

纯服务端OCR对接

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.DatadigitalFincloudGeneralsaasOcrServerApi;

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

    DatadigitalFincloudGeneralsaasOcrServerApi apiInstance = new DatadigitalFincloudGeneralsaasOcrServerApi(defaultClient);
    DatadigitalFincloudGeneralsaasOcrServerDetectModel data = new DatadigitalFincloudGeneralsaasOcrServerDetectModel(); // DatadigitalFincloudGeneralsaasOcrServerDetectModel | 
    File fileContent = new File("/path/to/file"); // File | 
    try {
      DatadigitalFincloudGeneralsaasOcrServerDetectResponseModel result = apiInstance.detect(data, fileContent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatadigitalFincloudGeneralsaasOcrServerApi#detect");
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
| **data** | **DatadigitalFincloudGeneralsaasOcrServerDetectModel**|  | [optional] |
| **fileContent** | **File**|  | [optional] |

### Return type

**DatadigitalFincloudGeneralsaasOcrServerDetectResponseModel**

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

