# AlipayIserviceCcmIsvApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**initialize**](AlipayIserviceCcmIsvApi.md#initialize) | **POST** /v3/alipay/iservice/ccm/isv/initialize | ccm isv注册接口 |


<a name="initialize"></a>
# **initialize**
> AlipayIserviceCcmIsvInitializeResponseModel initialize(alipayIserviceCcmIsvInitializeModel)

ccm isv注册接口

商家 / ISV 开发的插件接入CCM（蚂蚁客户沟通管理平台）之前，需要先将自己的信息注册到 CCM，并设置一个用于 iframe 接口接入安全认证使用的公钥。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmIsvApi;

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

    AlipayIserviceCcmIsvApi apiInstance = new AlipayIserviceCcmIsvApi(defaultClient);
    AlipayIserviceCcmIsvInitializeModel alipayIserviceCcmIsvInitializeModel = new AlipayIserviceCcmIsvInitializeModel(); // AlipayIserviceCcmIsvInitializeModel | 
    try {
      AlipayIserviceCcmIsvInitializeResponseModel result = apiInstance.initialize(alipayIserviceCcmIsvInitializeModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmIsvApi#initialize");
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
| **alipayIserviceCcmIsvInitializeModel** | **AlipayIserviceCcmIsvInitializeModel**|  | [optional] |

### Return type

**AlipayIserviceCcmIsvInitializeResponseModel**

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

