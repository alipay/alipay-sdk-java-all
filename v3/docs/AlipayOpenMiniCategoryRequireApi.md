# AlipayOpenMiniCategoryRequireApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenMiniCategoryRequireApi.md#query) | **GET** /v3/alipay/open/mini/category/require/query | 查询类目所需资质信息 |


<a name="query"></a>
# **query**
> AlipayOpenMiniCategoryRequireQueryResponseModel query(categoryCodeList)

查询类目所需资质信息

查询类目所需资质信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniCategoryRequireApi;

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

    AlipayOpenMiniCategoryRequireApi apiInstance = new AlipayOpenMiniCategoryRequireApi(defaultClient);
    List<String> categoryCodeList = Arrays.asList(); // List<String> | 类目列表，不超过五个
    try {
      AlipayOpenMiniCategoryRequireQueryResponseModel result = apiInstance.query(categoryCodeList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniCategoryRequireApi#query");
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
| **categoryCodeList** | **List&lt;String&gt;**| 类目列表，不超过五个 | [optional] |

### Return type

**AlipayOpenMiniCategoryRequireQueryResponseModel**

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

