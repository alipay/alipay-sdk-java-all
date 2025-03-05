# AlipayCommerceEcEmployeeTitleApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayCommerceEcEmployeeTitleApi.md#create) | **POST** /v3/alipay/commerce/ec/employee/title | 新增员工抬头关系 |
| [**delete**](AlipayCommerceEcEmployeeTitleApi.md#delete) | **POST** /v3/alipay/commerce/ec/employee/title/delete | 删除员工抬头信息 |
| [**modify**](AlipayCommerceEcEmployeeTitleApi.md#modify) | **PUT** /v3/alipay/commerce/ec/employee/title | 修改员工抬头信息 |


<a name="create"></a>
# **create**
> Object create(alipayCommerceEcEmployeeTitleCreateModel)

新增员工抬头关系

批量新增员工抬头关系，单次新增最大一千条

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcEmployeeTitleApi;

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

    AlipayCommerceEcEmployeeTitleApi apiInstance = new AlipayCommerceEcEmployeeTitleApi(defaultClient);
    AlipayCommerceEcEmployeeTitleCreateModel alipayCommerceEcEmployeeTitleCreateModel = new AlipayCommerceEcEmployeeTitleCreateModel(); // AlipayCommerceEcEmployeeTitleCreateModel | 
    try {
      Object result = apiInstance.create(alipayCommerceEcEmployeeTitleCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcEmployeeTitleApi#create");
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
| **alipayCommerceEcEmployeeTitleCreateModel** | **AlipayCommerceEcEmployeeTitleCreateModel**|  | [optional] |

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

<a name="delete"></a>
# **delete**
> Object delete(alipayCommerceEcEmployeeTitleDeleteModel)

删除员工抬头信息

批量删除员工抬头信息，单次删除最大一百条

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcEmployeeTitleApi;

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

    AlipayCommerceEcEmployeeTitleApi apiInstance = new AlipayCommerceEcEmployeeTitleApi(defaultClient);
    AlipayCommerceEcEmployeeTitleDeleteModel alipayCommerceEcEmployeeTitleDeleteModel = new AlipayCommerceEcEmployeeTitleDeleteModel(); // AlipayCommerceEcEmployeeTitleDeleteModel | 
    try {
      Object result = apiInstance.delete(alipayCommerceEcEmployeeTitleDeleteModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcEmployeeTitleApi#delete");
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
| **alipayCommerceEcEmployeeTitleDeleteModel** | **AlipayCommerceEcEmployeeTitleDeleteModel**|  | [optional] |

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

<a name="modify"></a>
# **modify**
> Object modify(alipayCommerceEcEmployeeTitleModifyModel)

修改员工抬头信息

修改员工抬头信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcEmployeeTitleApi;

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

    AlipayCommerceEcEmployeeTitleApi apiInstance = new AlipayCommerceEcEmployeeTitleApi(defaultClient);
    AlipayCommerceEcEmployeeTitleModifyModel alipayCommerceEcEmployeeTitleModifyModel = new AlipayCommerceEcEmployeeTitleModifyModel(); // AlipayCommerceEcEmployeeTitleModifyModel | 
    try {
      Object result = apiInstance.modify(alipayCommerceEcEmployeeTitleModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcEmployeeTitleApi#modify");
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
| **alipayCommerceEcEmployeeTitleModifyModel** | **AlipayCommerceEcEmployeeTitleModifyModel**|  | [optional] |

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

