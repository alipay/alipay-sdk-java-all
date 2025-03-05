# AlipayDataDataserviceAdConversionApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**upload**](AlipayDataDataserviceAdConversionApi.md#upload) | **POST** /v3/alipay/data/dataservice/ad/conversion/upload | 转化数据回传 |


<a name="upload"></a>
# **upload**
> Object upload(alipayDataDataserviceAdConversionUploadModel)

转化数据回传

供广告商家通过OpenAPI上报转化明细数据，用于广告投放效果的追踪和广告投放的优化。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayDataDataserviceAdConversionApi;

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

    AlipayDataDataserviceAdConversionApi apiInstance = new AlipayDataDataserviceAdConversionApi(defaultClient);
    AlipayDataDataserviceAdConversionUploadModel alipayDataDataserviceAdConversionUploadModel = new AlipayDataDataserviceAdConversionUploadModel(); // AlipayDataDataserviceAdConversionUploadModel | 
    try {
      Object result = apiInstance.upload(alipayDataDataserviceAdConversionUploadModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayDataDataserviceAdConversionApi#upload");
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
| **alipayDataDataserviceAdConversionUploadModel** | **AlipayDataDataserviceAdConversionUploadModel**|  | [optional] |

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

