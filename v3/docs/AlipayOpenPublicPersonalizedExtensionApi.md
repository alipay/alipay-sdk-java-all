# AlipayOpenPublicPersonalizedExtensionApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayOpenPublicPersonalizedExtensionApi.md#batchquery) | **POST** /v3/alipay/open/public/personalized/extension/batchquery | 扩展区批量查询接口 |
| [**create**](AlipayOpenPublicPersonalizedExtensionApi.md#create) | **POST** /v3/alipay/open/public/personalized/extension/create | 个性化扩展区创建接口 |
| [**delete**](AlipayOpenPublicPersonalizedExtensionApi.md#delete) | **POST** /v3/alipay/open/public/personalized/extension/delete | 扩展区删除接口 |


<a name="batchquery"></a>
# **batchquery**
> AlipayOpenPublicPersonalizedExtensionBatchqueryResponseModel batchquery()

扩展区批量查询接口

开发者可使用此接口批量查询扩展区列表，包括默认扩展区和个性化扩展区

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicPersonalizedExtensionApi;

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

    AlipayOpenPublicPersonalizedExtensionApi apiInstance = new AlipayOpenPublicPersonalizedExtensionApi(defaultClient);
    try {
      AlipayOpenPublicPersonalizedExtensionBatchqueryResponseModel result = apiInstance.batchquery();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicPersonalizedExtensionApi#batchquery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**AlipayOpenPublicPersonalizedExtensionBatchqueryResponseModel**

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

<a name="create"></a>
# **create**
> AlipayOpenPublicPersonalizedExtensionCreateResponseModel create()

个性化扩展区创建接口

开发者可使用该接口创建一套个性化扩展区，符合该扩展区规则的用户进入生活号主页后会看到该个性化扩展区

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicPersonalizedExtensionApi;

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

    AlipayOpenPublicPersonalizedExtensionApi apiInstance = new AlipayOpenPublicPersonalizedExtensionApi(defaultClient);
    try {
      AlipayOpenPublicPersonalizedExtensionCreateResponseModel result = apiInstance.create();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicPersonalizedExtensionApi#create");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**AlipayOpenPublicPersonalizedExtensionCreateResponseModel**

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

<a name="delete"></a>
# **delete**
> Object delete()

扩展区删除接口

开发者可调用该接口删除创建的一套扩展区，包括个性化扩展区和默认扩展区

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicPersonalizedExtensionApi;

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

    AlipayOpenPublicPersonalizedExtensionApi apiInstance = new AlipayOpenPublicPersonalizedExtensionApi(defaultClient);
    try {
      Object result = apiInstance.delete();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicPersonalizedExtensionApi#delete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

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

