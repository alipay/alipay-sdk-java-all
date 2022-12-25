# AlipayOpenMiniInnerappPluginuseconfigApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancel**](AlipayOpenMiniInnerappPluginuseconfigApi.md#cancel) | **POST** /v3/alipay/open/mini/innerapp/pluginuseconfig/cancel | 撤销插件端版本配置灰度 |
| [**online**](AlipayOpenMiniInnerappPluginuseconfigApi.md#online) | **POST** /v3/alipay/open/mini/innerapp/pluginuseconfig/online | 上线插件使用端版本配置 |
| [**upgrade**](AlipayOpenMiniInnerappPluginuseconfigApi.md#upgrade) | **POST** /v3/alipay/open/mini/innerapp/pluginuseconfig/upgrade | 灰度端版本配置 |


<a name="cancel"></a>
# **cancel**
> Object cancel(alipayOpenMiniInnerappPluginuseconfigCancelModel)

撤销插件端版本配置灰度

结束插件端版本配置灰度

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerappPluginuseconfigApi;

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

    AlipayOpenMiniInnerappPluginuseconfigApi apiInstance = new AlipayOpenMiniInnerappPluginuseconfigApi(defaultClient);
    AlipayOpenMiniInnerappPluginuseconfigCancelModel alipayOpenMiniInnerappPluginuseconfigCancelModel = new AlipayOpenMiniInnerappPluginuseconfigCancelModel(); // AlipayOpenMiniInnerappPluginuseconfigCancelModel | 
    try {
      Object result = apiInstance.cancel(alipayOpenMiniInnerappPluginuseconfigCancelModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerappPluginuseconfigApi#cancel");
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
| **alipayOpenMiniInnerappPluginuseconfigCancelModel** | **AlipayOpenMiniInnerappPluginuseconfigCancelModel**|  | [optional] |

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
> Object online(alipayOpenMiniInnerappPluginuseconfigOnlineModel)

上线插件使用端版本配置

小程序使用插件版本全量上线

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerappPluginuseconfigApi;

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

    AlipayOpenMiniInnerappPluginuseconfigApi apiInstance = new AlipayOpenMiniInnerappPluginuseconfigApi(defaultClient);
    AlipayOpenMiniInnerappPluginuseconfigOnlineModel alipayOpenMiniInnerappPluginuseconfigOnlineModel = new AlipayOpenMiniInnerappPluginuseconfigOnlineModel(); // AlipayOpenMiniInnerappPluginuseconfigOnlineModel | 
    try {
      Object result = apiInstance.online(alipayOpenMiniInnerappPluginuseconfigOnlineModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerappPluginuseconfigApi#online");
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
| **alipayOpenMiniInnerappPluginuseconfigOnlineModel** | **AlipayOpenMiniInnerappPluginuseconfigOnlineModel**|  | [optional] |

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

<a name="upgrade"></a>
# **upgrade**
> Object upgrade(alipayOpenMiniInnerappPluginuseconfigUpgradeModel)

灰度端版本配置

升级/降级 端版本配置

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerappPluginuseconfigApi;

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

    AlipayOpenMiniInnerappPluginuseconfigApi apiInstance = new AlipayOpenMiniInnerappPluginuseconfigApi(defaultClient);
    AlipayOpenMiniInnerappPluginuseconfigUpgradeModel alipayOpenMiniInnerappPluginuseconfigUpgradeModel = new AlipayOpenMiniInnerappPluginuseconfigUpgradeModel(); // AlipayOpenMiniInnerappPluginuseconfigUpgradeModel | 
    try {
      Object result = apiInstance.upgrade(alipayOpenMiniInnerappPluginuseconfigUpgradeModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerappPluginuseconfigApi#upgrade");
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
| **alipayOpenMiniInnerappPluginuseconfigUpgradeModel** | **AlipayOpenMiniInnerappPluginuseconfigUpgradeModel**|  | [optional] |

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

