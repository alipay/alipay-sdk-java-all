# AlipayIserviceCcmRoleApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayIserviceCcmRoleApi.md#create) | **POST** /v3/alipay/iservice/ccm/role/create | 创建角色 |
| [**delete**](AlipayIserviceCcmRoleApi.md#delete) | **POST** /v3/alipay/iservice/ccm/role/delete | 删除角色 |
| [**get**](AlipayIserviceCcmRoleApi.md#get) | **POST** /v3/alipay/iservice/ccm/role/get | 获取角色详情 |
| [**modify**](AlipayIserviceCcmRoleApi.md#modify) | **POST** /v3/alipay/iservice/ccm/role/modify | 更新角色 |


<a name="create"></a>
# **create**
> AlipayIserviceCcmRoleCreateResponseModel create(alipayIserviceCcmRoleCreateModel)

创建角色

创建角色

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmRoleApi;

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

    AlipayIserviceCcmRoleApi apiInstance = new AlipayIserviceCcmRoleApi(defaultClient);
    AlipayIserviceCcmRoleCreateModel alipayIserviceCcmRoleCreateModel = new AlipayIserviceCcmRoleCreateModel(); // AlipayIserviceCcmRoleCreateModel | 
    try {
      AlipayIserviceCcmRoleCreateResponseModel result = apiInstance.create(alipayIserviceCcmRoleCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmRoleApi#create");
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
| **alipayIserviceCcmRoleCreateModel** | **AlipayIserviceCcmRoleCreateModel**|  | [optional] |

### Return type

**AlipayIserviceCcmRoleCreateResponseModel**

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

<a name="delete"></a>
# **delete**
> Object delete(alipayIserviceCcmRoleDeleteModel)

删除角色

删除角色

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmRoleApi;

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

    AlipayIserviceCcmRoleApi apiInstance = new AlipayIserviceCcmRoleApi(defaultClient);
    AlipayIserviceCcmRoleDeleteModel alipayIserviceCcmRoleDeleteModel = new AlipayIserviceCcmRoleDeleteModel(); // AlipayIserviceCcmRoleDeleteModel | 
    try {
      Object result = apiInstance.delete(alipayIserviceCcmRoleDeleteModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmRoleApi#delete");
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
| **alipayIserviceCcmRoleDeleteModel** | **AlipayIserviceCcmRoleDeleteModel**|  | [optional] |

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

<a name="get"></a>
# **get**
> AlipayIserviceCcmRoleGetResponseModel get(alipayIserviceCcmRoleGetModel)

获取角色详情

获取角色详情

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmRoleApi;

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

    AlipayIserviceCcmRoleApi apiInstance = new AlipayIserviceCcmRoleApi(defaultClient);
    AlipayIserviceCcmRoleGetModel alipayIserviceCcmRoleGetModel = new AlipayIserviceCcmRoleGetModel(); // AlipayIserviceCcmRoleGetModel | 
    try {
      AlipayIserviceCcmRoleGetResponseModel result = apiInstance.get(alipayIserviceCcmRoleGetModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmRoleApi#get");
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
| **alipayIserviceCcmRoleGetModel** | **AlipayIserviceCcmRoleGetModel**|  | [optional] |

### Return type

**AlipayIserviceCcmRoleGetResponseModel**

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

<a name="modify"></a>
# **modify**
> Object modify(alipayIserviceCcmRoleModifyModel)

更新角色

更新角色

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmRoleApi;

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

    AlipayIserviceCcmRoleApi apiInstance = new AlipayIserviceCcmRoleApi(defaultClient);
    AlipayIserviceCcmRoleModifyModel alipayIserviceCcmRoleModifyModel = new AlipayIserviceCcmRoleModifyModel(); // AlipayIserviceCcmRoleModifyModel | 
    try {
      Object result = apiInstance.modify(alipayIserviceCcmRoleModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmRoleApi#modify");
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
| **alipayIserviceCcmRoleModifyModel** | **AlipayIserviceCcmRoleModifyModel**|  | [optional] |

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

