# AlipayOpenMiniInnerappPluginsyncmodeApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modify**](AlipayOpenMiniInnerappPluginsyncmodeApi.md#modify) | **POST** /v3/alipay/open/mini/innerapp/pluginsyncmode/modify | 修改插件继承模式 |


<a name="modify"></a>
# **modify**
> Object modify(alipayOpenMiniInnerappPluginsyncmodeModifyModel)

修改插件继承模式

修改插件继承模式，模板和插件使用关系是否自动继承到宿主小程序上

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerappPluginsyncmodeApi;

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

    AlipayOpenMiniInnerappPluginsyncmodeApi apiInstance = new AlipayOpenMiniInnerappPluginsyncmodeApi(defaultClient);
    AlipayOpenMiniInnerappPluginsyncmodeModifyModel alipayOpenMiniInnerappPluginsyncmodeModifyModel = new AlipayOpenMiniInnerappPluginsyncmodeModifyModel(); // AlipayOpenMiniInnerappPluginsyncmodeModifyModel | 
    try {
      Object result = apiInstance.modify(alipayOpenMiniInnerappPluginsyncmodeModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerappPluginsyncmodeApi#modify");
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
| **alipayOpenMiniInnerappPluginsyncmodeModifyModel** | **AlipayOpenMiniInnerappPluginsyncmodeModifyModel**|  | [optional] |

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

