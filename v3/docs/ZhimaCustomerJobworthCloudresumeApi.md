# ZhimaCustomerJobworthCloudresumeApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](ZhimaCustomerJobworthCloudresumeApi.md#query) | **GET** /v3/zhima/customer/jobworth/cloudresume/query | 智能简历基本数据查询 |


<a name="query"></a>
# **query**
> ZhimaCustomerJobworthCloudresumeQueryResponseModel query(connKey, onceToken)

智能简历基本数据查询

用于查询工作证基本信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaCustomerJobworthCloudresumeApi;

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

    ZhimaCustomerJobworthCloudresumeApi apiInstance = new ZhimaCustomerJobworthCloudresumeApi(defaultClient);
    String connKey = "uuid"; // String | 长效的认证令牌
    String onceToken = "uuid"; // String | 交换云简历的单次token
    try {
      ZhimaCustomerJobworthCloudresumeQueryResponseModel result = apiInstance.query(connKey, onceToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaCustomerJobworthCloudresumeApi#query");
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
| **connKey** | **String**| 长效的认证令牌 | [optional] |
| **onceToken** | **String**| 交换云简历的单次token | [optional] |

### Return type

**ZhimaCustomerJobworthCloudresumeQueryResponseModel**

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

