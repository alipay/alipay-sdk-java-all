# AlipayOpenMiniVersionGrayApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancel**](AlipayOpenMiniVersionGrayApi.md#cancel) | **POST** /v3/alipay/open/mini/version/gray/cancel | 小程序结束灰度 |
| [**online**](AlipayOpenMiniVersionGrayApi.md#online) | **POST** /v3/alipay/open/mini/version/gray/online | 小程序灰度上架 |


<a name="cancel"></a>
# **cancel**
> Object cancel(alipayOpenMiniVersionGrayCancelModel)

小程序结束灰度

小程序结束灰度

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniVersionGrayApi;

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

    AlipayOpenMiniVersionGrayApi apiInstance = new AlipayOpenMiniVersionGrayApi(defaultClient);
    AlipayOpenMiniVersionGrayCancelModel alipayOpenMiniVersionGrayCancelModel = new AlipayOpenMiniVersionGrayCancelModel(); // AlipayOpenMiniVersionGrayCancelModel | 
    try {
      Object result = apiInstance.cancel(alipayOpenMiniVersionGrayCancelModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniVersionGrayApi#cancel");
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
| **alipayOpenMiniVersionGrayCancelModel** | **AlipayOpenMiniVersionGrayCancelModel**|  | [optional] |

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

<a name="online"></a>
# **online**
> Object online(alipayOpenMiniVersionGrayOnlineModel)

小程序灰度上架

小程序灰度上架

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniVersionGrayApi;

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

    AlipayOpenMiniVersionGrayApi apiInstance = new AlipayOpenMiniVersionGrayApi(defaultClient);
    AlipayOpenMiniVersionGrayOnlineModel alipayOpenMiniVersionGrayOnlineModel = new AlipayOpenMiniVersionGrayOnlineModel(); // AlipayOpenMiniVersionGrayOnlineModel | 
    try {
      Object result = apiInstance.online(alipayOpenMiniVersionGrayOnlineModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniVersionGrayApi#online");
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
| **alipayOpenMiniVersionGrayOnlineModel** | **AlipayOpenMiniVersionGrayOnlineModel**|  | [optional] |

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

