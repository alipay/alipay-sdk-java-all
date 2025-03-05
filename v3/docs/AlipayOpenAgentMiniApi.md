# AlipayOpenAgentMiniApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayOpenAgentMiniApi.md#create) | **POST** /v3/alipay/open/agent/mini/create | 代商家创建小程序应用 |


<a name="create"></a>
# **create**
> Object create(appLogo, data)

代商家创建小程序应用

ISV 代商家创建小程序应用。该接口后续将不再更新迭代，请使用新接口对接开发。新接口介绍文档：https://opendocs.alipay.com/isv/03kqzh ；新接口对接文档：https://opendocs.alipay.com/mini/03l21u 。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenAgentMiniApi;

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

    AlipayOpenAgentMiniApi apiInstance = new AlipayOpenAgentMiniApi(defaultClient);
    File appLogo = new File("/path/to/file"); // File | 
    AlipayOpenAgentMiniCreateModel data = new AlipayOpenAgentMiniCreateModel(); // AlipayOpenAgentMiniCreateModel | 
    try {
      Object result = apiInstance.create(appLogo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenAgentMiniApi#create");
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
| **appLogo** | **File**|  | [optional] |
| **data** | **AlipayOpenAgentMiniCreateModel**|  | [optional] |

### Return type

**Object**

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

