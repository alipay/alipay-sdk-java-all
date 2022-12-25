# AlipayIserviceCcmServiceApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**buy**](AlipayIserviceCcmServiceApi.md#buy) | **POST** /v3/alipay/iservice/ccm/service/buy | 租户开通isv服务接口 |
| [**close**](AlipayIserviceCcmServiceApi.md#close) | **POST** /v3/alipay/iservice/ccm/service/close | 关闭租户开通的isv服务接口 |
| [**initialize**](AlipayIserviceCcmServiceApi.md#initialize) | **POST** /v3/alipay/iservice/ccm/service/initialize | isv服务初始化接口 |


<a name="buy"></a>
# **buy**
> AlipayIserviceCcmServiceBuyResponseModel buy(alipayIserviceCcmServiceBuyModel)

租户开通isv服务接口

租户购买了isv服务后，通知ccm开通服务

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmServiceApi;

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

    AlipayIserviceCcmServiceApi apiInstance = new AlipayIserviceCcmServiceApi(defaultClient);
    AlipayIserviceCcmServiceBuyModel alipayIserviceCcmServiceBuyModel = new AlipayIserviceCcmServiceBuyModel(); // AlipayIserviceCcmServiceBuyModel | 
    try {
      AlipayIserviceCcmServiceBuyResponseModel result = apiInstance.buy(alipayIserviceCcmServiceBuyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmServiceApi#buy");
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
| **alipayIserviceCcmServiceBuyModel** | **AlipayIserviceCcmServiceBuyModel**|  | [optional] |

### Return type

**AlipayIserviceCcmServiceBuyResponseModel**

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

<a name="close"></a>
# **close**
> Object close(alipayIserviceCcmServiceCloseModel)

关闭租户开通的isv服务接口

租户购买的ISV服务到期后，isv通知ccm关闭服务

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmServiceApi;

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

    AlipayIserviceCcmServiceApi apiInstance = new AlipayIserviceCcmServiceApi(defaultClient);
    AlipayIserviceCcmServiceCloseModel alipayIserviceCcmServiceCloseModel = new AlipayIserviceCcmServiceCloseModel(); // AlipayIserviceCcmServiceCloseModel | 
    try {
      Object result = apiInstance.close(alipayIserviceCcmServiceCloseModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmServiceApi#close");
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
| **alipayIserviceCcmServiceCloseModel** | **AlipayIserviceCcmServiceCloseModel**|  | [optional] |

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

<a name="initialize"></a>
# **initialize**
> AlipayIserviceCcmServiceInitializeResponseModel initialize(alipayIserviceCcmServiceInitializeModel)

isv服务初始化接口

ISV调用此接口对接入CCM的服务代码、名称、描述等信息做初始化

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmServiceApi;

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

    AlipayIserviceCcmServiceApi apiInstance = new AlipayIserviceCcmServiceApi(defaultClient);
    AlipayIserviceCcmServiceInitializeModel alipayIserviceCcmServiceInitializeModel = new AlipayIserviceCcmServiceInitializeModel(); // AlipayIserviceCcmServiceInitializeModel | 
    try {
      AlipayIserviceCcmServiceInitializeResponseModel result = apiInstance.initialize(alipayIserviceCcmServiceInitializeModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmServiceApi#initialize");
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
| **alipayIserviceCcmServiceInitializeModel** | **AlipayIserviceCcmServiceInitializeModel**|  | [optional] |

### Return type

**AlipayIserviceCcmServiceInitializeResponseModel**

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

