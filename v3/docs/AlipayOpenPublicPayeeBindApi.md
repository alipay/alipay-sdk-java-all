# AlipayOpenPublicPayeeBindApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayOpenPublicPayeeBindApi.md#create) | **POST** /v3/alipay/open/public/payee/bind/create | 添加收款账号接口 |
| [**delete**](AlipayOpenPublicPayeeBindApi.md#delete) | **DELETE** /v3/alipay/open/public/payee/bind/delete | 解绑收款账号接口 |


<a name="create"></a>
# **create**
> Object create(alipayOpenPublicPayeeBindCreateModel)

添加收款账号接口

允许开发者调用该接口将收款账号与当前生活号绑定，从而支持支付成功页引导推荐关注生活号

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicPayeeBindApi;

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

    AlipayOpenPublicPayeeBindApi apiInstance = new AlipayOpenPublicPayeeBindApi(defaultClient);
    AlipayOpenPublicPayeeBindCreateModel alipayOpenPublicPayeeBindCreateModel = new AlipayOpenPublicPayeeBindCreateModel(); // AlipayOpenPublicPayeeBindCreateModel | 
    try {
      Object result = apiInstance.create(alipayOpenPublicPayeeBindCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicPayeeBindApi#create");
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
| **alipayOpenPublicPayeeBindCreateModel** | **AlipayOpenPublicPayeeBindCreateModel**|  | [optional] |

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
> Object delete(loginId, pid)

解绑收款账号接口

允许开发者调用该接口将收款账号与当前生活号解绑

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicPayeeBindApi;

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

    AlipayOpenPublicPayeeBindApi apiInstance = new AlipayOpenPublicPayeeBindApi(defaultClient);
    String loginId = "13434232322"; // String | 收款账号，需要绑定的收款支付宝账号，请勿与 pid 同时传入。
    String pid = "208844738438439"; // String | 支付宝用户id，2088开头的16位长度字符串，请勿与 login_id 同时传入。
    try {
      Object result = apiInstance.delete(loginId, pid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicPayeeBindApi#delete");
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
| **loginId** | **String**| 收款账号，需要绑定的收款支付宝账号，请勿与 pid 同时传入。 | [optional] |
| **pid** | **String**| 支付宝用户id，2088开头的16位长度字符串，请勿与 login_id 同时传入。 | [optional] |

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

