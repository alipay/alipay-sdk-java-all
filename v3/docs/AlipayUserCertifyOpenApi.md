# AlipayUserCertifyOpenApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**initialize**](AlipayUserCertifyOpenApi.md#initialize) | **POST** /v3/alipay/user/certify/open/initialize | 身份认证初始化服务 |
| [**query**](AlipayUserCertifyOpenApi.md#query) | **GET** /v3/alipay/user/certify/open/query | 身份认证记录查询 |


<a name="initialize"></a>
# **initialize**
> AlipayUserCertifyOpenInitializeResponseModel initialize(alipayUserCertifyOpenInitializeModel)

身份认证初始化服务

支付宝开放认证初始化服务，用于创建开放认证流程。注意：港澳台同胞身份验证服务仅支持在支付宝客户端内使用，外部 APP 使用该项服务需唤起支付宝客户端。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayUserCertifyOpenApi;

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

    AlipayUserCertifyOpenApi apiInstance = new AlipayUserCertifyOpenApi(defaultClient);
    AlipayUserCertifyOpenInitializeModel alipayUserCertifyOpenInitializeModel = new AlipayUserCertifyOpenInitializeModel(); // AlipayUserCertifyOpenInitializeModel | 
    try {
      AlipayUserCertifyOpenInitializeResponseModel result = apiInstance.initialize(alipayUserCertifyOpenInitializeModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayUserCertifyOpenApi#initialize");
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
| **alipayUserCertifyOpenInitializeModel** | **AlipayUserCertifyOpenInitializeModel**|  | [optional] |

### Return type

**AlipayUserCertifyOpenInitializeResponseModel**

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
> AlipayUserCertifyOpenQueryResponseModel query(certifyId)

身份认证记录查询

商户在开放认证完成后，调用本接口查询认证状态和相关数据

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayUserCertifyOpenApi;

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

    AlipayUserCertifyOpenApi apiInstance = new AlipayUserCertifyOpenApi(defaultClient);
    String certifyId = "OC201809253000000393900404029253"; // String | 本次申请操作的唯一标识，通过alipay.user.certify.open.initialize(身份认证初始化服务)接口同步响应获取。
    try {
      AlipayUserCertifyOpenQueryResponseModel result = apiInstance.query(certifyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayUserCertifyOpenApi#query");
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
| **certifyId** | **String**| 本次申请操作的唯一标识，通过alipay.user.certify.open.initialize(身份认证初始化服务)接口同步响应获取。 | [optional] |

### Return type

**AlipayUserCertifyOpenQueryResponseModel**

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

