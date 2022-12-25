# AlipayMarketingMaterialApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayMarketingMaterialApi.md#create) | **POST** /v3/alipay/marketing/material/create | 创建支付宝素材 |


<a name="create"></a>
# **create**
> AlipayMarketingMaterialCreateResponseModel create(alipayMarketingMaterialCreateModel)

创建支付宝素材

用于创建支付宝素材

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingMaterialApi;

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

    AlipayMarketingMaterialApi apiInstance = new AlipayMarketingMaterialApi(defaultClient);
    AlipayMarketingMaterialCreateModel alipayMarketingMaterialCreateModel = new AlipayMarketingMaterialCreateModel(); // AlipayMarketingMaterialCreateModel | 
    try {
      AlipayMarketingMaterialCreateResponseModel result = apiInstance.create(alipayMarketingMaterialCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingMaterialApi#create");
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
| **alipayMarketingMaterialCreateModel** | **AlipayMarketingMaterialCreateModel**|  | [optional] |

### Return type

**AlipayMarketingMaterialCreateResponseModel**

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

