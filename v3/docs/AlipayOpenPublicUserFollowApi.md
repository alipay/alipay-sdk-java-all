# AlipayOpenPublicUserFollowApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenPublicUserFollowApi.md#query) | **GET** /v3/alipay/open/public/user/follow/query | 查询用户是否已经关注了生活号 |


<a name="query"></a>
# **query**
> AlipayOpenPublicUserFollowQueryResponseModel query(userId, openId)

查询用户是否已经关注了生活号

查询用户是否已经关注生活号，支持生活号、内容号、财富号

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicUserFollowApi;

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

    AlipayOpenPublicUserFollowApi apiInstance = new AlipayOpenPublicUserFollowApi(defaultClient);
    String userId = "2088132324342243"; // String | 支付宝用户id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 支付宝用户唯一的标识
    try {
      AlipayOpenPublicUserFollowQueryResponseModel result = apiInstance.query(userId, openId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicUserFollowApi#query");
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
| **userId** | **String**| 支付宝用户id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。 | [optional] |
| **openId** | **String**| 支付宝用户唯一的标识 | [optional] |

### Return type

**AlipayOpenPublicUserFollowQueryResponseModel**

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

