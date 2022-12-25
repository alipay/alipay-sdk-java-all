# AlipayOpenSearchAppkeywordquotaApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenSearchAppkeywordquotaApi.md#query) | **GET** /v3/alipay/open/search/appkeywordquota/query | 查询小程序可配置关键词数 |


<a name="query"></a>
# **query**
> AlipayOpenSearchAppkeywordquotaQueryResponseModel query(targetAppid)

查询小程序可配置关键词数

查询小程序可配置关键词数

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSearchAppkeywordquotaApi;

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

    AlipayOpenSearchAppkeywordquotaApi apiInstance = new AlipayOpenSearchAppkeywordquotaApi(defaultClient);
    String targetAppid = "2021001120654127"; // String | 小程序id
    try {
      AlipayOpenSearchAppkeywordquotaQueryResponseModel result = apiInstance.query(targetAppid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSearchAppkeywordquotaApi#query");
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
| **targetAppid** | **String**| 小程序id | [optional] |

### Return type

**AlipayOpenSearchAppkeywordquotaQueryResponseModel**

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

