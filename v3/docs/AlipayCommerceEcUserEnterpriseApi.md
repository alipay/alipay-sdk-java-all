# AlipayCommerceEcUserEnterpriseApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayCommerceEcUserEnterpriseApi.md#query) | **GET** /v3/alipay/commerce/ec/user/enterprise | 用户企业列表 |


<a name="query"></a>
# **query**
> AlipayCommerceEcUserEnterpriseQueryResponseModel query(userId, openId)

用户企业列表

用户所属企业列表

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcUserEnterpriseApi;

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

    AlipayCommerceEcUserEnterpriseApi apiInstance = new AlipayCommerceEcUserEnterpriseApi(defaultClient);
    String userId = "20889384849393"; // String | 用户id
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 用户open_id
    try {
      AlipayCommerceEcUserEnterpriseQueryResponseModel result = apiInstance.query(userId, openId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcUserEnterpriseApi#query");
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
| **userId** | **String**| 用户id | [optional] |
| **openId** | **String**| 用户open_id | [optional] |

### Return type

**AlipayCommerceEcUserEnterpriseQueryResponseModel**

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

