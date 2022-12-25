# AlipayOpenAppMembersApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayOpenAppMembersApi.md#create) | **POST** /v3/alipay/open/app/members/create | 应用添加成员 |
| [**delete**](AlipayOpenAppMembersApi.md#delete) | **DELETE** /v3/alipay/open/app/members/delete | 应用删除成员 |
| [**query**](AlipayOpenAppMembersApi.md#query) | **GET** /v3/alipay/open/app/members/query | 应用查询成员列表 |


<a name="create"></a>
# **create**
> Object create(alipayOpenAppMembersCreateModel)

应用添加成员

应用添加成员，目前只支持小程序类型的应用使用

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenAppMembersApi;

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

    AlipayOpenAppMembersApi apiInstance = new AlipayOpenAppMembersApi(defaultClient);
    AlipayOpenAppMembersCreateModel alipayOpenAppMembersCreateModel = new AlipayOpenAppMembersCreateModel(); // AlipayOpenAppMembersCreateModel | 
    try {
      Object result = apiInstance.create(alipayOpenAppMembersCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenAppMembersApi#create");
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
| **alipayOpenAppMembersCreateModel** | **AlipayOpenAppMembersCreateModel**|  | [optional] |

### Return type

**Object**

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

<a name="delete"></a>
# **delete**
> Object delete(userId, openId, role)

应用删除成员

删除应用成员，目前只支持小程序类型的应用

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenAppMembersApi;

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

    AlipayOpenAppMembersApi apiInstance = new AlipayOpenAppMembersApi(defaultClient);
    String userId = "2088222943898172"; // String | 被删除成员的支付宝账户唯一标识，以2088开头。
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 被删除成员的openId。
    String role = "DEVELOPER"; // String | 被删除成员的角色类型，枚举支持： DEVELOPER：开发者。 EXPERIENCER：体验者。
    try {
      Object result = apiInstance.delete(userId, openId, role);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenAppMembersApi#delete");
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
| **userId** | **String**| 被删除成员的支付宝账户唯一标识，以2088开头。 | [optional] |
| **openId** | **String**| 被删除成员的openId。 | [optional] |
| **role** | **String**| 被删除成员的角色类型，枚举支持： DEVELOPER：开发者。 EXPERIENCER：体验者。 | [optional] |

### Return type

**Object**

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

<a name="query"></a>
# **query**
> AlipayOpenAppMembersQueryResponseModel query(role)

应用查询成员列表

应用查询成员列表，目前只支持小程序类型的应用

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenAppMembersApi;

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

    AlipayOpenAppMembersApi apiInstance = new AlipayOpenAppMembersApi(defaultClient);
    String role = "DEVELOPER"; // String | 查询的成员角色类型。 枚举支持： DEVELOPER：开发者； EXPERIENCER：体验者。 请选择其一传入
    try {
      AlipayOpenAppMembersQueryResponseModel result = apiInstance.query(role);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenAppMembersApi#query");
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
| **role** | **String**| 查询的成员角色类型。 枚举支持： DEVELOPER：开发者； EXPERIENCER：体验者。 请选择其一传入 | [optional] |

### Return type

**AlipayOpenAppMembersQueryResponseModel**

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

