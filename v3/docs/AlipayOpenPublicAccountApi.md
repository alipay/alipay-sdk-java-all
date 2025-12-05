# AlipayOpenPublicAccountApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayOpenPublicAccountApi.md#create) | **POST** /v3/alipay/open/public/account/create | 添加绑定商户会员号 |
| [**delete**](AlipayOpenPublicAccountApi.md#delete) | **DELETE** /v3/alipay/open/public/account/delete | 解除绑定商户会员号 |
| [**query**](AlipayOpenPublicAccountApi.md#query) | **GET** /v3/alipay/open/public/account/query | 查询绑定商户会员号 |


<a name="create"></a>
# **create**
> AlipayOpenPublicAccountCreateResponseModel create(alipayOpenPublicAccountCreateModel)

添加绑定商户会员号

当用户成为商户的关注用户后，可以在商户的服务窗中点击“添加绑定商户会员号”功能，支付宝系统收到操作请求后将该动作通知给商户（使用用户发送信息到商户接口，其中eventType（事件类型）为click，actionParam（按钮标识）为authentication），商户根据此通知调用商户回复消息接口（其中须包含Url链接地址），支付宝收到商户的回复消息中的链接地址后，自动跳转至商户平台的上商户会员绑定界面中，让用户完成账户绑定。 当用户有效完成账户绑定后，商户调用本接口，把绑定结果数据通知给支付宝。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicAccountApi;

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

    AlipayOpenPublicAccountApi apiInstance = new AlipayOpenPublicAccountApi(defaultClient);
    AlipayOpenPublicAccountCreateModel alipayOpenPublicAccountCreateModel = new AlipayOpenPublicAccountCreateModel(); // AlipayOpenPublicAccountCreateModel | 
    try {
      AlipayOpenPublicAccountCreateResponseModel result = apiInstance.create(alipayOpenPublicAccountCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicAccountApi#create");
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
| **alipayOpenPublicAccountCreateModel** | **AlipayOpenPublicAccountCreateModel**|  | [optional] |

### Return type

**AlipayOpenPublicAccountCreateResponseModel**

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
> Object delete(agreementId, bindAccountNo, fromUserId, openId)

解除绑定商户会员号

在支付宝服务窗中目前一共有三种解除绑定商户会员号的场景，具体如下：  用户取消关注服务窗  用户在服务窗内手动执行解除绑定操作  开发者调用解除绑定商户会员号接口解除绑定

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicAccountApi;

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

    AlipayOpenPublicAccountApi apiInstance = new AlipayOpenPublicAccountApi(defaultClient);
    String agreementId = "29022222"; // String | 协议号，商户会员在支付宝服务窗账号中的唯一标识，与bind_account_no不能同时为空
    String bindAccountNo = "test001"; // String | 绑定帐号，建议在开发者的系统中保持唯一性，与agreement_id不能同时为空
    String fromUserId = "2088656734541243"; // String | 绑定用户的支付宝userid，2088开头16位长度的字符串，与agreementId不能同时为空
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 支付宝用户的唯一标识
    try {
      Object result = apiInstance.delete(agreementId, bindAccountNo, fromUserId, openId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicAccountApi#delete");
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
| **agreementId** | **String**| 协议号，商户会员在支付宝服务窗账号中的唯一标识，与bind_account_no不能同时为空 | [optional] |
| **bindAccountNo** | **String**| 绑定帐号，建议在开发者的系统中保持唯一性，与agreement_id不能同时为空 | [optional] |
| **fromUserId** | **String**| 绑定用户的支付宝userid，2088开头16位长度的字符串，与agreementId不能同时为空 | [optional] |
| **openId** | **String**| 支付宝用户的唯一标识 | [optional] |

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
> AlipayOpenPublicAccountQueryResponseModel query(userId, openId)

查询绑定商户会员号

当用户成为商户的关注用户之后，则商户可以通过本接口查询关注者的绑定账户，以便补全异常情况下的单边账户数据。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicAccountApi;

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

    AlipayOpenPublicAccountApi apiInstance = new AlipayOpenPublicAccountApi(defaultClient);
    String userId = "2088123412341234"; // String | 用户的支付宝用户号，2088开头。
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 支付宝用户的唯一标识
    try {
      AlipayOpenPublicAccountQueryResponseModel result = apiInstance.query(userId, openId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicAccountApi#query");
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
| **userId** | **String**| 用户的支付宝用户号，2088开头。 | [optional] |
| **openId** | **String**| 支付宝用户的唯一标识 | [optional] |

### Return type

**AlipayOpenPublicAccountQueryResponseModel**

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

