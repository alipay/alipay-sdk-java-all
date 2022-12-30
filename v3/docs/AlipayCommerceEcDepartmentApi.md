# AlipayCommerceEcDepartmentApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayCommerceEcDepartmentApi.md#create) | **POST** /v3/alipay/commerce/ec/department | 企业部门创建 |
| [**delete**](AlipayCommerceEcDepartmentApi.md#delete) | **POST** /v3/alipay/commerce/ec/department/delete | 企业部门删除 |


<a name="create"></a>
# **create**
> AlipayCommerceEcDepartmentCreateResponseModel create(alipayCommerceEcDepartmentCreateModel)

企业部门创建

创建企业部门

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcDepartmentApi;

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

    AlipayCommerceEcDepartmentApi apiInstance = new AlipayCommerceEcDepartmentApi(defaultClient);
    AlipayCommerceEcDepartmentCreateModel alipayCommerceEcDepartmentCreateModel = new AlipayCommerceEcDepartmentCreateModel(); // AlipayCommerceEcDepartmentCreateModel | 
    try {
      AlipayCommerceEcDepartmentCreateResponseModel result = apiInstance.create(alipayCommerceEcDepartmentCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcDepartmentApi#create");
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
| **alipayCommerceEcDepartmentCreateModel** | **AlipayCommerceEcDepartmentCreateModel**|  | [optional] |

### Return type

**AlipayCommerceEcDepartmentCreateResponseModel**

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
> Object delete(alipayCommerceEcDepartmentDeleteModel)

企业部门删除

删除企业部门

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcDepartmentApi;

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

    AlipayCommerceEcDepartmentApi apiInstance = new AlipayCommerceEcDepartmentApi(defaultClient);
    AlipayCommerceEcDepartmentDeleteModel alipayCommerceEcDepartmentDeleteModel = new AlipayCommerceEcDepartmentDeleteModel(); // AlipayCommerceEcDepartmentDeleteModel | 
    try {
      Object result = apiInstance.delete(alipayCommerceEcDepartmentDeleteModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcDepartmentApi#delete");
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
| **alipayCommerceEcDepartmentDeleteModel** | **AlipayCommerceEcDepartmentDeleteModel**|  | [optional] |

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

