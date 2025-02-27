# AlipayOpenMiniMiniappBrandApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancel**](AlipayOpenMiniMiniappBrandApi.md#cancel) | **POST** /v3/alipay/open/mini/miniapp/brand/cancel | 小程序品牌提交认证后取消品牌认证 |
| [**query**](AlipayOpenMiniMiniappBrandApi.md#query) | **GET** /v3/alipay/open/mini/miniapp/brand/query | 小程序品牌提交认证后查询品牌审核结果以及商户已有品牌 |
| [**submit**](AlipayOpenMiniMiniappBrandApi.md#submit) | **POST** /v3/alipay/open/mini/miniapp/brand/submit | 小程序品牌提交认证 |
| [**upload**](AlipayOpenMiniMiniappBrandApi.md#upload) | **POST** /v3/alipay/open/mini/miniapp/brand/upload | 小程序品牌提交认证时上传用户资质以及身份信息 |


<a name="cancel"></a>
# **cancel**
> Object cancel()

小程序品牌提交认证后取消品牌认证

小程序品牌提交认证后取消品牌认证

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniMiniappBrandApi;

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

    AlipayOpenMiniMiniappBrandApi apiInstance = new AlipayOpenMiniMiniappBrandApi(defaultClient);
    try {
      Object result = apiInstance.cancel();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniMiniappBrandApi#cancel");
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

<a name="query"></a>
# **query**
> AlipayOpenMiniMiniappBrandQueryResponseModel query()

小程序品牌提交认证后查询品牌审核结果以及商户已有品牌

小程序品牌提交认证后查询品牌审核结果以及商户已有品牌

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniMiniappBrandApi;

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

    AlipayOpenMiniMiniappBrandApi apiInstance = new AlipayOpenMiniMiniappBrandApi(defaultClient);
    try {
      AlipayOpenMiniMiniappBrandQueryResponseModel result = apiInstance.query();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniMiniappBrandApi#query");
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

**AlipayOpenMiniMiniappBrandQueryResponseModel**

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

<a name="submit"></a>
# **submit**
> Object submit(alipayOpenMiniMiniappBrandSubmitModel)

小程序品牌提交认证

小程序品牌提交认证

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniMiniappBrandApi;

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

    AlipayOpenMiniMiniappBrandApi apiInstance = new AlipayOpenMiniMiniappBrandApi(defaultClient);
    AlipayOpenMiniMiniappBrandSubmitModel alipayOpenMiniMiniappBrandSubmitModel = new AlipayOpenMiniMiniappBrandSubmitModel(); // AlipayOpenMiniMiniappBrandSubmitModel | 
    try {
      Object result = apiInstance.submit(alipayOpenMiniMiniappBrandSubmitModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniMiniappBrandApi#submit");
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
| **alipayOpenMiniMiniappBrandSubmitModel** | **AlipayOpenMiniMiniappBrandSubmitModel**|  | [optional] |

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

<a name="upload"></a>
# **upload**
> AlipayOpenMiniMiniappBrandUploadResponseModel upload()

小程序品牌提交认证时上传用户资质以及身份信息

小程序品牌提交认证时上传用户资质以及身份信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniMiniappBrandApi;

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

    AlipayOpenMiniMiniappBrandApi apiInstance = new AlipayOpenMiniMiniappBrandApi(defaultClient);
    try {
      AlipayOpenMiniMiniappBrandUploadResponseModel result = apiInstance.upload();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniMiniappBrandApi#upload");
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

**AlipayOpenMiniMiniappBrandUploadResponseModel**

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

