# AlipayIserviceCcmInstanceApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayIserviceCcmInstanceApi.md#create) | **POST** /v3/alipay/iservice/ccm/instance/create | 创建租户实例 |
| [**get**](AlipayIserviceCcmInstanceApi.md#get) | **POST** /v3/alipay/iservice/ccm/instance/get | 查询单个租户实例（数据权限） |
| [**query**](AlipayIserviceCcmInstanceApi.md#query) | **POST** /v3/alipay/iservice/ccm/instance/query | 列出所有的租户实例（数据权限） |


<a name="create"></a>
# **create**
> AlipayIserviceCcmInstanceCreateResponseModel create(alipayIserviceCcmInstanceCreateModel)

创建租户实例

创建租户实例

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmInstanceApi;

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

    AlipayIserviceCcmInstanceApi apiInstance = new AlipayIserviceCcmInstanceApi(defaultClient);
    AlipayIserviceCcmInstanceCreateModel alipayIserviceCcmInstanceCreateModel = new AlipayIserviceCcmInstanceCreateModel(); // AlipayIserviceCcmInstanceCreateModel | 
    try {
      AlipayIserviceCcmInstanceCreateResponseModel result = apiInstance.create(alipayIserviceCcmInstanceCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmInstanceApi#create");
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
| **alipayIserviceCcmInstanceCreateModel** | **AlipayIserviceCcmInstanceCreateModel**|  | [optional] |

### Return type

**AlipayIserviceCcmInstanceCreateResponseModel**

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

<a name="get"></a>
# **get**
> AlipayIserviceCcmInstanceGetResponseModel get(alipayIserviceCcmInstanceGetModel)

查询单个租户实例（数据权限）

查询单个租户实例（数据权限）

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmInstanceApi;

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

    AlipayIserviceCcmInstanceApi apiInstance = new AlipayIserviceCcmInstanceApi(defaultClient);
    AlipayIserviceCcmInstanceGetModel alipayIserviceCcmInstanceGetModel = new AlipayIserviceCcmInstanceGetModel(); // AlipayIserviceCcmInstanceGetModel | 
    try {
      AlipayIserviceCcmInstanceGetResponseModel result = apiInstance.get(alipayIserviceCcmInstanceGetModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmInstanceApi#get");
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
| **alipayIserviceCcmInstanceGetModel** | **AlipayIserviceCcmInstanceGetModel**|  | [optional] |

### Return type

**AlipayIserviceCcmInstanceGetResponseModel**

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
> AlipayIserviceCcmInstanceQueryResponseModel query(alipayIserviceCcmInstanceQueryModel)

列出所有的租户实例（数据权限）

列出所有的租户实例（数据权限）。一个云客服租户下可以有多个租户实例（数据权限），每个租户实例之间的数据是隔离的（除了用户、权限、私信、IVR数据外）。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmInstanceApi;

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

    AlipayIserviceCcmInstanceApi apiInstance = new AlipayIserviceCcmInstanceApi(defaultClient);
    AlipayIserviceCcmInstanceQueryModel alipayIserviceCcmInstanceQueryModel = new AlipayIserviceCcmInstanceQueryModel(); // AlipayIserviceCcmInstanceQueryModel | 
    try {
      AlipayIserviceCcmInstanceQueryResponseModel result = apiInstance.query(alipayIserviceCcmInstanceQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmInstanceApi#query");
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
| **alipayIserviceCcmInstanceQueryModel** | **AlipayIserviceCcmInstanceQueryModel**|  | [optional] |

### Return type

**AlipayIserviceCcmInstanceQueryResponseModel**

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

