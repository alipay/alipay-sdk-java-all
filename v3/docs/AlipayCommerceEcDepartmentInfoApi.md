# AlipayCommerceEcDepartmentInfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modify**](AlipayCommerceEcDepartmentInfoApi.md#modify) | **PUT** /v3/alipay/commerce/ec/department | 企业部门信息修改 |
| [**query**](AlipayCommerceEcDepartmentInfoApi.md#query) | **GET** /v3/alipay/commerce/ec/department/info/query | 查询部门详情 |


<a name="modify"></a>
# **modify**
> Object modify(alipayCommerceEcDepartmentInfoModifyModel)

企业部门信息修改

修改企业部门信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcDepartmentInfoApi;

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

    AlipayCommerceEcDepartmentInfoApi apiInstance = new AlipayCommerceEcDepartmentInfoApi(defaultClient);
    AlipayCommerceEcDepartmentInfoModifyModel alipayCommerceEcDepartmentInfoModifyModel = new AlipayCommerceEcDepartmentInfoModifyModel(); // AlipayCommerceEcDepartmentInfoModifyModel | 
    try {
      Object result = apiInstance.modify(alipayCommerceEcDepartmentInfoModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcDepartmentInfoApi#modify");
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
| **alipayCommerceEcDepartmentInfoModifyModel** | **AlipayCommerceEcDepartmentInfoModifyModel**|  | [optional] |

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
> AlipayCommerceEcDepartmentInfoQueryResponseModel query(enterpriseId, departmentId)

查询部门详情

根据部门id查询企业下某个部门的详细信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcDepartmentInfoApi;

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

    AlipayCommerceEcDepartmentInfoApi apiInstance = new AlipayCommerceEcDepartmentInfoApi(defaultClient);
    String enterpriseId = "2088441363102941"; // String | 企业id
    String departmentId = "1001094000039142"; // String | 部门id
    try {
      AlipayCommerceEcDepartmentInfoQueryResponseModel result = apiInstance.query(enterpriseId, departmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcDepartmentInfoApi#query");
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
| **enterpriseId** | **String**| 企业id | [optional] |
| **departmentId** | **String**| 部门id | [optional] |

### Return type

**AlipayCommerceEcDepartmentInfoQueryResponseModel**

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

