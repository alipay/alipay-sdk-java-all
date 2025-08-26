# AlipayOpenMiniInnerversionApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**online**](AlipayOpenMiniInnerversionApi.md#online) | **POST** /v3/alipay/open/mini/innerversion/online | 内部小程序-上架 |
| [**sync**](AlipayOpenMiniInnerversionApi.md#sync) | **POST** /v3/alipay/open/mini/innerversion/sync | 小程序包信息推送 |
| [**upload**](AlipayOpenMiniInnerversionApi.md#upload) | **POST** /v3/alipay/open/mini/innerversion/upload | 内部小程序-打包构建 |


<a name="online"></a>
# **online**
> Object online(alipayOpenMiniInnerversionOnlineModel)

内部小程序-上架

内部小程序上架接口

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerversionApi;

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

    AlipayOpenMiniInnerversionApi apiInstance = new AlipayOpenMiniInnerversionApi(defaultClient);
    AlipayOpenMiniInnerversionOnlineModel alipayOpenMiniInnerversionOnlineModel = new AlipayOpenMiniInnerversionOnlineModel(); // AlipayOpenMiniInnerversionOnlineModel | 
    try {
      Object result = apiInstance.online(alipayOpenMiniInnerversionOnlineModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerversionApi#online");
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
| **alipayOpenMiniInnerversionOnlineModel** | **AlipayOpenMiniInnerversionOnlineModel**|  | [optional] |

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

<a name="sync"></a>
# **sync**
> Object sync(alipayOpenMiniInnerversionSyncModel)

小程序包信息推送

小程序上架、回滚，因拉包机制，用户无法及时生效，拉到原版本的用户，过期才会失效，该接口能力可以推送新版本到用户

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerversionApi;

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

    AlipayOpenMiniInnerversionApi apiInstance = new AlipayOpenMiniInnerversionApi(defaultClient);
    AlipayOpenMiniInnerversionSyncModel alipayOpenMiniInnerversionSyncModel = new AlipayOpenMiniInnerversionSyncModel(); // AlipayOpenMiniInnerversionSyncModel | 
    try {
      Object result = apiInstance.sync(alipayOpenMiniInnerversionSyncModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerversionApi#sync");
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
| **alipayOpenMiniInnerversionSyncModel** | **AlipayOpenMiniInnerversionSyncModel**|  | [optional] |

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
> AlipayOpenMiniInnerversionUploadResponseModel upload(alipayOpenMiniInnerversionUploadModel)

内部小程序-打包构建

内部小程序，创建打包构建任务，异步返回，使用查询接口轮询构建结果

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerversionApi;

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

    AlipayOpenMiniInnerversionApi apiInstance = new AlipayOpenMiniInnerversionApi(defaultClient);
    AlipayOpenMiniInnerversionUploadModel alipayOpenMiniInnerversionUploadModel = new AlipayOpenMiniInnerversionUploadModel(); // AlipayOpenMiniInnerversionUploadModel | 
    try {
      AlipayOpenMiniInnerversionUploadResponseModel result = apiInstance.upload(alipayOpenMiniInnerversionUploadModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerversionApi#upload");
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
| **alipayOpenMiniInnerversionUploadModel** | **AlipayOpenMiniInnerversionUploadModel**|  | [optional] |

### Return type

**AlipayOpenMiniInnerversionUploadResponseModel**

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

