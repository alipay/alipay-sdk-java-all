# AlipayOpenPublicAccountApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayOpenPublicAccountApi.md#create) | **POST** /v3/alipay/open/public/account/create | 添加绑定商户会员号 |
| [**delete**](AlipayOpenPublicAccountApi.md#delete) | **POST** /v3/alipay/open/public/account/delete | 解除绑定商户会员号 |
| [**query**](AlipayOpenPublicAccountApi.md#query) | **POST** /v3/alipay/open/public/account/query | 查询绑定商户会员号 |
| [**reset**](AlipayOpenPublicAccountApi.md#reset) | **POST** /v3/alipay/open/public/account/reset | 重新设置绑定商家会员号 |


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
> Object delete(alipayOpenPublicAccountDeleteModel)

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
    AlipayOpenPublicAccountDeleteModel alipayOpenPublicAccountDeleteModel = new AlipayOpenPublicAccountDeleteModel(); // AlipayOpenPublicAccountDeleteModel | 
    try {
      Object result = apiInstance.delete(alipayOpenPublicAccountDeleteModel);
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
| **alipayOpenPublicAccountDeleteModel** | **AlipayOpenPublicAccountDeleteModel**|  | [optional] |

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

<a name="query"></a>
# **query**
> AlipayOpenPublicAccountQueryResponseModel query(alipayOpenPublicAccountQueryModel)

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
    AlipayOpenPublicAccountQueryModel alipayOpenPublicAccountQueryModel = new AlipayOpenPublicAccountQueryModel(); // AlipayOpenPublicAccountQueryModel | 
    try {
      AlipayOpenPublicAccountQueryResponseModel result = apiInstance.query(alipayOpenPublicAccountQueryModel);
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
| **alipayOpenPublicAccountQueryModel** | **AlipayOpenPublicAccountQueryModel**|  | [optional] |

### Return type

**AlipayOpenPublicAccountQueryResponseModel**

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

<a name="reset"></a>
# **reset**
> AlipayOpenPublicAccountResetResponseModel reset(alipayOpenPublicAccountResetModel)

重新设置绑定商家会员号

如果商户想要重置已经添加的外部账户，可以通过该接口完成。重置后，原有的外部户将删除，新的外部户添加进去。

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
    AlipayOpenPublicAccountResetModel alipayOpenPublicAccountResetModel = new AlipayOpenPublicAccountResetModel(); // AlipayOpenPublicAccountResetModel | 
    try {
      AlipayOpenPublicAccountResetResponseModel result = apiInstance.reset(alipayOpenPublicAccountResetModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicAccountApi#reset");
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
| **alipayOpenPublicAccountResetModel** | **AlipayOpenPublicAccountResetModel**|  | [optional] |

### Return type

**AlipayOpenPublicAccountResetResponseModel**

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

