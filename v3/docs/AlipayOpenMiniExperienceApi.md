# AlipayOpenMiniExperienceApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancel**](AlipayOpenMiniExperienceApi.md#cancel) | **POST** /v3/alipay/open/mini/experience/cancel | 小程序取消体验版 |
| [**create**](AlipayOpenMiniExperienceApi.md#create) | **POST** /v3/alipay/open/mini/experience/create | 小程序生成体验版 |
| [**query**](AlipayOpenMiniExperienceApi.md#query) | **GET** /v3/alipay/open/mini/experience/query | 小程序体验版状态查询接口 |


<a name="cancel"></a>
# **cancel**
> Object cancel(alipayOpenMiniExperienceCancelModel)

小程序取消体验版

版本号为空

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniExperienceApi;

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

    AlipayOpenMiniExperienceApi apiInstance = new AlipayOpenMiniExperienceApi(defaultClient);
    AlipayOpenMiniExperienceCancelModel alipayOpenMiniExperienceCancelModel = new AlipayOpenMiniExperienceCancelModel(); // AlipayOpenMiniExperienceCancelModel | 
    try {
      Object result = apiInstance.cancel(alipayOpenMiniExperienceCancelModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniExperienceApi#cancel");
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
| **alipayOpenMiniExperienceCancelModel** | **AlipayOpenMiniExperienceCancelModel**|  | [optional] |

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

<a name="create"></a>
# **create**
> Object create(alipayOpenMiniExperienceCreateModel)

小程序生成体验版

小程序生成体验版

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniExperienceApi;

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

    AlipayOpenMiniExperienceApi apiInstance = new AlipayOpenMiniExperienceApi(defaultClient);
    AlipayOpenMiniExperienceCreateModel alipayOpenMiniExperienceCreateModel = new AlipayOpenMiniExperienceCreateModel(); // AlipayOpenMiniExperienceCreateModel | 
    try {
      Object result = apiInstance.create(alipayOpenMiniExperienceCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniExperienceApi#create");
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
| **alipayOpenMiniExperienceCreateModel** | **AlipayOpenMiniExperienceCreateModel**|  | [optional] |

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

<a name="query"></a>
# **query**
> AlipayOpenMiniExperienceQueryResponseModel query(appVersion, bundleId)

小程序体验版状态查询接口

小程序体验版状态查询接口

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniExperienceApi;

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

    AlipayOpenMiniExperienceApi apiInstance = new AlipayOpenMiniExperienceApi(defaultClient);
    String appVersion = "0.0.1"; // String | 商家小程序版本号。
    String bundleId = "com.alipay.alipaywallet"; // String | 小程序客户端类型，默认为支付宝端。支持如下入参： com.alipay.alipaywallet：支付宝端； com.alibaba.android.rimet：DINGDING端； com.amap.app：高德端； com.alibaba.ailabs.genie.webapps：天猫精灵端； com.alipay.iot.xpaas：支付宝IoT端。
    try {
      AlipayOpenMiniExperienceQueryResponseModel result = apiInstance.query(appVersion, bundleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniExperienceApi#query");
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
| **appVersion** | **String**| 商家小程序版本号。 | [optional] |
| **bundleId** | **String**| 小程序客户端类型，默认为支付宝端。支持如下入参： com.alipay.alipaywallet：支付宝端； com.alibaba.android.rimet：DINGDING端； com.amap.app：高德端； com.alibaba.ailabs.genie.webapps：天猫精灵端； com.alipay.iot.xpaas：支付宝IoT端。 | [optional] |

### Return type

**AlipayOpenMiniExperienceQueryResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

