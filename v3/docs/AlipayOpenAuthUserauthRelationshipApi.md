# AlipayOpenAuthUserauthRelationshipApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenAuthUserauthRelationshipApi.md#query) | **GET** /v3/alipay/open/auth/userauth/relationship/query | 用户授权关系查询 |


<a name="query"></a>
# **query**
> AlipayOpenAuthUserauthRelationshipQueryResponseModel query(userId, openId, scopes)

用户授权关系查询

校验本应用和用户的授权关系有效性

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenAuthUserauthRelationshipApi;

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

    AlipayOpenAuthUserauthRelationshipApi apiInstance = new AlipayOpenAuthUserauthRelationshipApi(defaultClient);
    String userId = "2088123443211234"; // String | 蚂蚁统一会员ID，如果未开启openid改造，则此值必传
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 蚂蚁统一会员ID，蚂蚁统一会员ID，如果已完成openid改造，则此值必传
    String scopes = "auth_user,auth_zhima"; // String | 查询授权关系所关联的scope，半角逗号分隔的列表，且不允许有重复值
    try {
      AlipayOpenAuthUserauthRelationshipQueryResponseModel result = apiInstance.query(userId, openId, scopes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenAuthUserauthRelationshipApi#query");
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
| **userId** | **String**| 蚂蚁统一会员ID，如果未开启openid改造，则此值必传 | [optional] |
| **openId** | **String**| 蚂蚁统一会员ID，蚂蚁统一会员ID，如果已完成openid改造，则此值必传 | [optional] |
| **scopes** | **String**| 查询授权关系所关联的scope，半角逗号分隔的列表，且不允许有重复值 | [optional] |

### Return type

**AlipayOpenAuthUserauthRelationshipQueryResponseModel**

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

