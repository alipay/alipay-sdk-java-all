# AlipayOpenPublicLabelUserApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenPublicLabelUserApi.md#query) | **GET** /v3/alipay/open/public/label/user/query | 公众号标签管理-查询用户标签 |


<a name="query"></a>
# **query**
> AlipayOpenPublicLabelUserQueryResponseModel query(userId, openId)

公众号标签管理-查询用户标签

开发者可以使用该接口查询某个用户的所有标签

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicLabelUserApi;

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

    AlipayOpenPublicLabelUserApi apiInstance = new AlipayOpenPublicLabelUserApi(defaultClient);
    String userId = "2088283746283746"; // String | 支付宝用户的userid，2088开头长度为16位的字符串
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 支付宝用户的唯一标识
    try {
      AlipayOpenPublicLabelUserQueryResponseModel result = apiInstance.query(userId, openId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicLabelUserApi#query");
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
| **userId** | **String**| 支付宝用户的userid，2088开头长度为16位的字符串 | [optional] |
| **openId** | **String**| 支付宝用户的唯一标识 | [optional] |

### Return type

**AlipayOpenPublicLabelUserQueryResponseModel**

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

