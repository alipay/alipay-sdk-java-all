# AlipayOpenInstantdeliveryAccountApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayOpenInstantdeliveryAccountApi.md#create) | **POST** /v3/alipay/open/instantdelivery/account/create | 即时配送商家账户创建 |
| [**query**](AlipayOpenInstantdeliveryAccountApi.md#query) | **GET** /v3/alipay/open/instantdelivery/account/query | 即时配送商家账户查询 |


<a name="create"></a>
# **create**
> AlipayOpenInstantdeliveryAccountCreateResponseModel create(alipayOpenInstantdeliveryAccountCreateModel)

即时配送商家账户创建

商家入驻开放平台，接入即时配送服务，调用即时配送公司的接口创建账户

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenInstantdeliveryAccountApi;

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

    AlipayOpenInstantdeliveryAccountApi apiInstance = new AlipayOpenInstantdeliveryAccountApi(defaultClient);
    AlipayOpenInstantdeliveryAccountCreateModel alipayOpenInstantdeliveryAccountCreateModel = new AlipayOpenInstantdeliveryAccountCreateModel(); // AlipayOpenInstantdeliveryAccountCreateModel | 
    try {
      AlipayOpenInstantdeliveryAccountCreateResponseModel result = apiInstance.create(alipayOpenInstantdeliveryAccountCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenInstantdeliveryAccountApi#create");
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
| **alipayOpenInstantdeliveryAccountCreateModel** | **AlipayOpenInstantdeliveryAccountCreateModel**|  | [optional] |

### Return type

**AlipayOpenInstantdeliveryAccountCreateResponseModel**

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
> AlipayOpenInstantdeliveryAccountQueryResponseModel query()

即时配送商家账户查询

即时配送业务，查询商家账户信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenInstantdeliveryAccountApi;

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

    AlipayOpenInstantdeliveryAccountApi apiInstance = new AlipayOpenInstantdeliveryAccountApi(defaultClient);
    try {
      AlipayOpenInstantdeliveryAccountQueryResponseModel result = apiInstance.query();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenInstantdeliveryAccountApi#query");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**AlipayOpenInstantdeliveryAccountQueryResponseModel**

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

