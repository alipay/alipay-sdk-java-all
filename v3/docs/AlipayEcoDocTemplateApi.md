# AlipayEcoDocTemplateApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayEcoDocTemplateApi.md#create) | **POST** /v3/alipay/eco/doc/template/create | 创建合同模板（E签宝） |


<a name="create"></a>
# **create**
> AlipayEcoDocTemplateCreateResponseModel create(targetAppId, alipayEcoDocTemplateCreateModel)

创建合同模板（E签宝）

通过此接口创建合同模板后，通过返回的文件直传地址上传模板文件（WORD/PDF）。同时记录接口返回的模板ID（templateId），后续发起合同签署需要使用到。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoDocTemplateApi;

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

    AlipayEcoDocTemplateApi apiInstance = new AlipayEcoDocTemplateApi(defaultClient);
    String targetAppId = "targetAppId_example"; // String | 目标isv应用ID
    AlipayEcoDocTemplateCreateModel alipayEcoDocTemplateCreateModel = new AlipayEcoDocTemplateCreateModel(); // AlipayEcoDocTemplateCreateModel | 
    try {
      AlipayEcoDocTemplateCreateResponseModel result = apiInstance.create(targetAppId, alipayEcoDocTemplateCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoDocTemplateApi#create");
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
| **targetAppId** | **String**| 目标isv应用ID | [optional] |
| **alipayEcoDocTemplateCreateModel** | **AlipayEcoDocTemplateCreateModel**|  | [optional] |

### Return type

**AlipayEcoDocTemplateCreateResponseModel**

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

