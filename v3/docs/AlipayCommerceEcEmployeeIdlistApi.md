# AlipayCommerceEcEmployeeIdlistApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayCommerceEcEmployeeIdlistApi.md#query) | **GET** /v3/alipay/commerce/ec/employee/idlist/query | 查询部门下员工id列表 |


<a name="query"></a>
# **query**
> AlipayCommerceEcEmployeeIdlistQueryResponseModel query(enterpriseId, departmentId, pageNum, pageSize)

查询部门下员工id列表

查询某个部门下员工id列表

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcEmployeeIdlistApi;

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

    AlipayCommerceEcEmployeeIdlistApi apiInstance = new AlipayCommerceEcEmployeeIdlistApi(defaultClient);
    String enterpriseId = "2088441363102941"; // String | 企业id
    String departmentId = "1001094000039142"; // String | 部门id
    Integer pageNum = 1; // Integer | 查询页数
    Integer pageSize = 1000; // Integer | 每页查询大小，限制最大为1000
    try {
      AlipayCommerceEcEmployeeIdlistQueryResponseModel result = apiInstance.query(enterpriseId, departmentId, pageNum, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcEmployeeIdlistApi#query");
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
| **pageNum** | **Integer**| 查询页数 | [optional] |
| **pageSize** | **Integer**| 每页查询大小，限制最大为1000 | [optional] |

### Return type

**AlipayCommerceEcEmployeeIdlistQueryResponseModel**

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

