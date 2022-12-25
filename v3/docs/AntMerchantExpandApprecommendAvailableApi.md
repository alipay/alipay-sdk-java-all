# AntMerchantExpandApprecommendAvailableApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AntMerchantExpandApprecommendAvailableApi.md#query) | **GET** /v3/ant/merchant/expand/apprecommend/available/query | 查询可关联APP的账号列表 |


<a name="query"></a>
# **query**
> AntMerchantExpandApprecommendAvailableQueryResponseModel query(pageSize, pageNumber)

查询可关联APP的账号列表

查询可关联APP的账号列表，用于支付推荐场景

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AntMerchantExpandApprecommendAvailableApi;

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

    AntMerchantExpandApprecommendAvailableApi apiInstance = new AntMerchantExpandApprecommendAvailableApi(defaultClient);
    Integer pageSize = 10; // Integer | 单页行数，不能超过100行
    Integer pageNumber = 1; // Integer | 页码
    try {
      AntMerchantExpandApprecommendAvailableQueryResponseModel result = apiInstance.query(pageSize, pageNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntMerchantExpandApprecommendAvailableApi#query");
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
| **pageSize** | **Integer**| 单页行数，不能超过100行 | [optional] |
| **pageNumber** | **Integer**| 页码 | [optional] |

### Return type

**AntMerchantExpandApprecommendAvailableQueryResponseModel**

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

