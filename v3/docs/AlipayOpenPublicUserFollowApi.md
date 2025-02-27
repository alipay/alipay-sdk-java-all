# AlipayOpenPublicUserFollowApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenPublicUserFollowApi.md#query) | **POST** /v3/alipay/open/public/user/follow/query | 查询用户是否已经关注了生活号 |


<a name="query"></a>
# **query**
> AlipayOpenPublicUserFollowQueryResponseModel query(alipayOpenPublicUserFollowQueryModel)

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
    AlipayOpenPublicUserFollowQueryModel alipayOpenPublicUserFollowQueryModel = new AlipayOpenPublicUserFollowQueryModel(); // AlipayOpenPublicUserFollowQueryModel | 
    try {
      AlipayOpenPublicUserFollowQueryResponseModel result = apiInstance.query(alipayOpenPublicUserFollowQueryModel);
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
| **alipayOpenPublicUserFollowQueryModel** | **AlipayOpenPublicUserFollowQueryModel**|  | [optional] |

### Return type

**AlipayOpenPublicUserFollowQueryResponseModel**

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

