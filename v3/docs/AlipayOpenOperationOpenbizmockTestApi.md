# AlipayOpenOperationOpenbizmockTestApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenOperationOpenbizmockTestApi.md#query) | **POST** /v3/alipay/open/operation/openbizmock/test/query | 测试openpai的openid自动补偿哈哈 |


<a name="query"></a>
# **query**
> AlipayOpenOperationOpenbizmockTestQueryResponseModel query(alipayOpenOperationOpenbizmockTestQueryModel)

测试openpai的openid自动补偿哈哈

哈哈

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenOperationOpenbizmockTestApi;

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

    AlipayOpenOperationOpenbizmockTestApi apiInstance = new AlipayOpenOperationOpenbizmockTestApi(defaultClient);
    AlipayOpenOperationOpenbizmockTestQueryModel alipayOpenOperationOpenbizmockTestQueryModel = new AlipayOpenOperationOpenbizmockTestQueryModel(); // AlipayOpenOperationOpenbizmockTestQueryModel | 
    try {
      AlipayOpenOperationOpenbizmockTestQueryResponseModel result = apiInstance.query(alipayOpenOperationOpenbizmockTestQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenOperationOpenbizmockTestApi#query");
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
| **alipayOpenOperationOpenbizmockTestQueryModel** | **AlipayOpenOperationOpenbizmockTestQueryModel**|  | [optional] |

### Return type

**AlipayOpenOperationOpenbizmockTestQueryResponseModel**

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

