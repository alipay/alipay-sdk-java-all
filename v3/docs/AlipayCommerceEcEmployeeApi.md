# AlipayCommerceEcEmployeeApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**add**](AlipayCommerceEcEmployeeApi.md#add) | **POST** /v3/alipay/commerce/ec/employee/add | 添加员工 |
| [**delete**](AlipayCommerceEcEmployeeApi.md#delete) | **POST** /v3/alipay/commerce/ec/employee/delete | 删除员工 |


<a name="add"></a>
# **add**
> AlipayCommerceEcEmployeeAddResponseModel add(alipayCommerceEcEmployeeAddModel)

添加员工

企业添加员工，并返回员工签约链接和吱口令

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcEmployeeApi;

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

    AlipayCommerceEcEmployeeApi apiInstance = new AlipayCommerceEcEmployeeApi(defaultClient);
    AlipayCommerceEcEmployeeAddModel alipayCommerceEcEmployeeAddModel = new AlipayCommerceEcEmployeeAddModel(); // AlipayCommerceEcEmployeeAddModel | 
    try {
      AlipayCommerceEcEmployeeAddResponseModel result = apiInstance.add(alipayCommerceEcEmployeeAddModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcEmployeeApi#add");
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
| **alipayCommerceEcEmployeeAddModel** | **AlipayCommerceEcEmployeeAddModel**|  | [optional] |

### Return type

**AlipayCommerceEcEmployeeAddResponseModel**

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
> Object delete(alipayCommerceEcEmployeeDeleteModel)

删除员工

删除员工并解绑因公付

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcEmployeeApi;

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

    AlipayCommerceEcEmployeeApi apiInstance = new AlipayCommerceEcEmployeeApi(defaultClient);
    AlipayCommerceEcEmployeeDeleteModel alipayCommerceEcEmployeeDeleteModel = new AlipayCommerceEcEmployeeDeleteModel(); // AlipayCommerceEcEmployeeDeleteModel | 
    try {
      Object result = apiInstance.delete(alipayCommerceEcEmployeeDeleteModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcEmployeeApi#delete");
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
| **alipayCommerceEcEmployeeDeleteModel** | **AlipayCommerceEcEmployeeDeleteModel**|  | [optional] |

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

