# AlipayOpenOperationOpenbizmockTestpathkeyApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenOperationOpenbizmockTestpathkeyApi.md#query) | **POST** /v3/alipay/open/operation/openbizmock/testpathkey/query/{keykey}/{a} | 测试网关协议3.0key和path |


<a name="query"></a>
# **query**
> AlipayOpenOperationOpenbizmockTestpathkeyQueryResponseModel query(keykey, a, b, c, alipayOpenOperationOpenbizmockTestpathkeyQueryModel)

测试网关协议3.0key和path

测试网关协议3.0key和path

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenOperationOpenbizmockTestpathkeyApi;

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

    AlipayOpenOperationOpenbizmockTestpathkeyApi apiInstance = new AlipayOpenOperationOpenbizmockTestpathkeyApi(defaultClient);
    String keykey = "keykey"; // String | ceshi
    String a = "a"; // String | 测试
    String b = "b"; // String | ceshi
    String c = "c"; // String | 测试
    AlipayOpenOperationOpenbizmockTestpathkeyQueryModel alipayOpenOperationOpenbizmockTestpathkeyQueryModel = new AlipayOpenOperationOpenbizmockTestpathkeyQueryModel(); // AlipayOpenOperationOpenbizmockTestpathkeyQueryModel | 
    try {
      AlipayOpenOperationOpenbizmockTestpathkeyQueryResponseModel result = apiInstance.query(keykey, a, b, c, alipayOpenOperationOpenbizmockTestpathkeyQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenOperationOpenbizmockTestpathkeyApi#query");
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
| **keykey** | **String**| ceshi | |
| **a** | **String**| 测试 | |
| **b** | **String**| ceshi | [optional] |
| **c** | **String**| 测试 | [optional] |
| **alipayOpenOperationOpenbizmockTestpathkeyQueryModel** | **AlipayOpenOperationOpenbizmockTestpathkeyQueryModel**|  | [optional] |

### Return type

**AlipayOpenOperationOpenbizmockTestpathkeyQueryResponseModel**

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

