# AlipayMobilePublicShortlinkApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayMobilePublicShortlinkApi.md#create) | **POST** /v3/alipay/mobile/public/shortlink/create | 服务窗短链自主生成接口 |


<a name="create"></a>
# **create**
> AlipayMobilePublicShortlinkCreateResponseModel create(alipayMobilePublicShortlinkCreateModel)

服务窗短链自主生成接口

商户通过本接口生成带自有场景标识的短链接

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMobilePublicShortlinkApi;

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

    AlipayMobilePublicShortlinkApi apiInstance = new AlipayMobilePublicShortlinkApi(defaultClient);
    AlipayMobilePublicShortlinkCreateModel alipayMobilePublicShortlinkCreateModel = new AlipayMobilePublicShortlinkCreateModel(); // AlipayMobilePublicShortlinkCreateModel | 
    try {
      AlipayMobilePublicShortlinkCreateResponseModel result = apiInstance.create(alipayMobilePublicShortlinkCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMobilePublicShortlinkApi#create");
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
| **alipayMobilePublicShortlinkCreateModel** | **AlipayMobilePublicShortlinkCreateModel**|  | [optional] |

### Return type

**AlipayMobilePublicShortlinkCreateResponseModel**

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

