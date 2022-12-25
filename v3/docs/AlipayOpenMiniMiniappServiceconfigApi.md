# AlipayOpenMiniMiniappServiceconfigApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modify**](AlipayOpenMiniMiniappServiceconfigApi.md#modify) | **POST** /v3/alipay/open/mini/miniapp/serviceconfig/modify | 小程序设置客服方式 |


<a name="modify"></a>
# **modify**
> Object modify(alipayOpenMiniMiniappServiceconfigModifyModel)

小程序设置客服方式

小程序设置客服方式

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniMiniappServiceconfigApi;

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

    AlipayOpenMiniMiniappServiceconfigApi apiInstance = new AlipayOpenMiniMiniappServiceconfigApi(defaultClient);
    AlipayOpenMiniMiniappServiceconfigModifyModel alipayOpenMiniMiniappServiceconfigModifyModel = new AlipayOpenMiniMiniappServiceconfigModifyModel(); // AlipayOpenMiniMiniappServiceconfigModifyModel | 
    try {
      Object result = apiInstance.modify(alipayOpenMiniMiniappServiceconfigModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniMiniappServiceconfigApi#modify");
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
| **alipayOpenMiniMiniappServiceconfigModifyModel** | **AlipayOpenMiniMiniappServiceconfigModifyModel**|  | [optional] |

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

