# DatadigitalFincloudGeneralsaasOcrMobileApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**initialize**](DatadigitalFincloudGeneralsaasOcrMobileApi.md#initialize) | **POST** /v3/datadigital/fincloud/generalsaas/ocr/mobile/initialize | App端OCR初始化 |


<a name="initialize"></a>
# **initialize**
> DatadigitalFincloudGeneralsaasOcrMobileInitializeResponseModel initialize(datadigitalFincloudGeneralsaasOcrMobileInitializeModel)

App端OCR初始化

OCR端云一体化识别

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.DatadigitalFincloudGeneralsaasOcrMobileApi;

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

    DatadigitalFincloudGeneralsaasOcrMobileApi apiInstance = new DatadigitalFincloudGeneralsaasOcrMobileApi(defaultClient);
    DatadigitalFincloudGeneralsaasOcrMobileInitializeModel datadigitalFincloudGeneralsaasOcrMobileInitializeModel = new DatadigitalFincloudGeneralsaasOcrMobileInitializeModel(); // DatadigitalFincloudGeneralsaasOcrMobileInitializeModel | 
    try {
      DatadigitalFincloudGeneralsaasOcrMobileInitializeResponseModel result = apiInstance.initialize(datadigitalFincloudGeneralsaasOcrMobileInitializeModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatadigitalFincloudGeneralsaasOcrMobileApi#initialize");
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
| **datadigitalFincloudGeneralsaasOcrMobileInitializeModel** | **DatadigitalFincloudGeneralsaasOcrMobileInitializeModel**|  | [optional] |

### Return type

**DatadigitalFincloudGeneralsaasOcrMobileInitializeResponseModel**

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

