# AlipayCommerceIotDeviceReportApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**upload**](AlipayCommerceIotDeviceReportApi.md#upload) | **POST** /v3/alipay/commerce/iot/device/report/upload | 设备检测报告上传 |


<a name="upload"></a>
# **upload**
> AlipayCommerceIotDeviceReportUploadResponseModel upload(alipayCommerceIotDeviceReportUploadModel)

设备检测报告上传

设备检测报告上传

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceIotDeviceReportApi;

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

    AlipayCommerceIotDeviceReportApi apiInstance = new AlipayCommerceIotDeviceReportApi(defaultClient);
    AlipayCommerceIotDeviceReportUploadModel alipayCommerceIotDeviceReportUploadModel = new AlipayCommerceIotDeviceReportUploadModel(); // AlipayCommerceIotDeviceReportUploadModel | 
    try {
      AlipayCommerceIotDeviceReportUploadResponseModel result = apiInstance.upload(alipayCommerceIotDeviceReportUploadModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceIotDeviceReportApi#upload");
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
| **alipayCommerceIotDeviceReportUploadModel** | **AlipayCommerceIotDeviceReportUploadModel**|  | [optional] |

### Return type

**AlipayCommerceIotDeviceReportUploadResponseModel**

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

