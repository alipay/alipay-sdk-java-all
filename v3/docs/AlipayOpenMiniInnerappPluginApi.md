# AlipayOpenMiniInnerappPluginApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**order**](AlipayOpenMiniInnerappPluginApi.md#order) | **POST** /v3/alipay/open/mini/innerapp/plugin/order | 小程序代商户订购插件 |


<a name="order"></a>
# **order**
> AlipayOpenMiniInnerappPluginOrderResponseModel order(alipayOpenMiniInnerappPluginOrderModel)

小程序代商户订购插件

提供给二方场景下，代商家小程序订购、授权与签约插件

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerappPluginApi;

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

    AlipayOpenMiniInnerappPluginApi apiInstance = new AlipayOpenMiniInnerappPluginApi(defaultClient);
    AlipayOpenMiniInnerappPluginOrderModel alipayOpenMiniInnerappPluginOrderModel = new AlipayOpenMiniInnerappPluginOrderModel(); // AlipayOpenMiniInnerappPluginOrderModel | 
    try {
      AlipayOpenMiniInnerappPluginOrderResponseModel result = apiInstance.order(alipayOpenMiniInnerappPluginOrderModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerappPluginApi#order");
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
| **alipayOpenMiniInnerappPluginOrderModel** | **AlipayOpenMiniInnerappPluginOrderModel**|  | [optional] |

### Return type

**AlipayOpenMiniInnerappPluginOrderResponseModel**

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

