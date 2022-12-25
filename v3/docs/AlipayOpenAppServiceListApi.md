# AlipayOpenAppServiceListApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenAppServiceListApi.md#query) | **GET** /v3/alipay/open/app/service/list/query | 服务批量查询 |


<a name="query"></a>
# **query**
> AlipayOpenAppServiceListQueryResponseModel query(serviceName, categoryId, pageSize, pageNum)

服务批量查询

服务批量分页查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenAppServiceListApi;

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

    AlipayOpenAppServiceListApi apiInstance = new AlipayOpenAppServiceListApi(defaultClient);
    String serviceName = "肯德基"; // String | 服务名称
    String categoryId = "C15484611"; // String | 类目
    Integer pageSize = 10; // Integer | 每页记录数
    Integer pageNum = 1; // Integer | 页码
    try {
      AlipayOpenAppServiceListQueryResponseModel result = apiInstance.query(serviceName, categoryId, pageSize, pageNum);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenAppServiceListApi#query");
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
| **serviceName** | **String**| 服务名称 | [optional] |
| **categoryId** | **String**| 类目 | [optional] |
| **pageSize** | **Integer**| 每页记录数 | [optional] |
| **pageNum** | **Integer**| 页码 | [optional] |

### Return type

**AlipayOpenAppServiceListQueryResponseModel**

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

