# AlipayOpenMiniResourceRecordApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**notify**](AlipayOpenMiniResourceRecordApi.md#notify) | **POST** /v3/alipay/open/mini/resource/record/notify | 提供给淘联盟备案信息接口 |


<a name="notify"></a>
# **notify**
> Object notify(alipayOpenMiniResourceRecordNotifyModel)

提供给淘联盟备案信息接口

淘联盟定制回调接口，用户流量插件账号打通场景

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniResourceRecordApi;

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

    AlipayOpenMiniResourceRecordApi apiInstance = new AlipayOpenMiniResourceRecordApi(defaultClient);
    AlipayOpenMiniResourceRecordNotifyModel alipayOpenMiniResourceRecordNotifyModel = new AlipayOpenMiniResourceRecordNotifyModel(); // AlipayOpenMiniResourceRecordNotifyModel | 
    try {
      Object result = apiInstance.notify(alipayOpenMiniResourceRecordNotifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniResourceRecordApi#notify");
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
| **alipayOpenMiniResourceRecordNotifyModel** | **AlipayOpenMiniResourceRecordNotifyModel**|  | [optional] |

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

