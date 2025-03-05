# AlipayOpenMiniInnerMembersApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**add**](AlipayOpenMiniInnerMembersApi.md#add) | **POST** /v3/alipay/open/mini/inner/members/add | 内部链路添加开发成员 |
| [**delete**](AlipayOpenMiniInnerMembersApi.md#delete) | **DELETE** /v3/alipay/open/mini/inner/members/delete | 内部链路删除开发成员 |
| [**query**](AlipayOpenMiniInnerMembersApi.md#query) | **GET** /v3/alipay/open/mini/inner/members/query | 内部链路查询开发成员 |


<a name="add"></a>
# **add**
> Object add(alipayOpenMiniInnerMembersAddModel)

内部链路添加开发成员

添加开发成员

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerMembersApi;

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

    AlipayOpenMiniInnerMembersApi apiInstance = new AlipayOpenMiniInnerMembersApi(defaultClient);
    AlipayOpenMiniInnerMembersAddModel alipayOpenMiniInnerMembersAddModel = new AlipayOpenMiniInnerMembersAddModel(); // AlipayOpenMiniInnerMembersAddModel | 
    try {
      Object result = apiInstance.add(alipayOpenMiniInnerMembersAddModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerMembersApi#add");
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
| **alipayOpenMiniInnerMembersAddModel** | **AlipayOpenMiniInnerMembersAddModel**|  | [optional] |

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
> Object delete(miniAppId, appOrigin, domainAccount, loginId, type)

内部链路删除开发成员

删除开发成员

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerMembersApi;

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

    AlipayOpenMiniInnerMembersApi apiInstance = new AlipayOpenMiniInnerMembersApi(defaultClient);
    String miniAppId = "2021154987463214"; // String | 业务小程序id
    String appOrigin = "ALIPAY"; // String | 业务来源
    String domainAccount = "域账号"; // String | 域账号（如传入则删除联系人）
    String loginId = "登陆支付宝账号"; // String | 登陆支付宝账号
    String type = "1"; // String | 成员类型
    try {
      Object result = apiInstance.delete(miniAppId, appOrigin, domainAccount, loginId, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerMembersApi#delete");
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
| **miniAppId** | **String**| 业务小程序id | [optional] |
| **appOrigin** | **String**| 业务来源 | [optional] |
| **domainAccount** | **String**| 域账号（如传入则删除联系人） | [optional] |
| **loginId** | **String**| 登陆支付宝账号 | [optional] |
| **type** | **String**| 成员类型 | [optional] |

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
> AlipayOpenMiniInnerMembersQueryResponseModel query(miniAppId, appOrigin)

内部链路查询开发成员

内部链路查询开发成员

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerMembersApi;

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

    AlipayOpenMiniInnerMembersApi apiInstance = new AlipayOpenMiniInnerMembersApi(defaultClient);
    String miniAppId = "2021125487896547"; // String | 业务小程序id
    String appOrigin = "ALIPAY"; // String | 业务来源
    try {
      AlipayOpenMiniInnerMembersQueryResponseModel result = apiInstance.query(miniAppId, appOrigin);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerMembersApi#query");
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
| **miniAppId** | **String**| 业务小程序id | [optional] |
| **appOrigin** | **String**| 业务来源 | [optional] |

### Return type

**AlipayOpenMiniInnerMembersQueryResponseModel**

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

