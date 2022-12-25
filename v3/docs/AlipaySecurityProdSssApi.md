# AlipaySecurityProdSssApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipaySecurityProdSssApi.md#query) | **POST** /v3/alipay/security/prod/sss/query/{bbb} | 金柚测试3.0接口 |


<a name="query"></a>
# **query**
> AlipaySecurityProdSssQueryResponseModel query(bbb, aaa, aaaOpenId, alipaySecurityProdSssQueryModel)

金柚测试3.0接口

金柚测试3.0接口

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipaySecurityProdSssApi;

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

    AlipaySecurityProdSssApi apiInstance = new AlipaySecurityProdSssApi(defaultClient);
    String bbb = "1"; // String | activity_id 词条描述
    String aaa = "3333"; // String | 1
    String aaaOpenId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 1
    AlipaySecurityProdSssQueryModel alipaySecurityProdSssQueryModel = new AlipaySecurityProdSssQueryModel(); // AlipaySecurityProdSssQueryModel | 
    try {
      AlipaySecurityProdSssQueryResponseModel result = apiInstance.query(bbb, aaa, aaaOpenId, alipaySecurityProdSssQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipaySecurityProdSssApi#query");
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
| **bbb** | **String**| activity_id 词条描述 | |
| **aaa** | **String**| 1 | [optional] |
| **aaaOpenId** | **String**| 1 | [optional] |
| **alipaySecurityProdSssQueryModel** | **AlipaySecurityProdSssQueryModel**|  | [optional] |

### Return type

**AlipaySecurityProdSssQueryResponseModel**

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

