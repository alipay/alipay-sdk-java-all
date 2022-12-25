# DatadigitalFincloudGeneralsaasFaceCertifyApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**initialize**](DatadigitalFincloudGeneralsaasFaceCertifyApi.md#initialize) | **POST** /v3/datadigital/fincloud/generalsaas/face/certify/initialize | 初始化人脸认证服务接口 |
| [**query**](DatadigitalFincloudGeneralsaasFaceCertifyApi.md#query) | **GET** /v3/datadigital/fincloud/generalsaas/face/certify/query | 查询人脸认证记录接口 |
| [**verify**](DatadigitalFincloudGeneralsaasFaceCertifyApi.md#verify) | **POST** /v3/datadigital/fincloud/generalsaas/face/certify/verify | 开始人脸认证服务接口 |


<a name="initialize"></a>
# **initialize**
> DatadigitalFincloudGeneralsaasFaceCertifyInitializeResponseModel initialize(datadigitalFincloudGeneralsaasFaceCertifyInitializeModel)

初始化人脸认证服务接口

人脸核身初始化服务，用于创建认证流程。供外部客户使用该项服务。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.DatadigitalFincloudGeneralsaasFaceCertifyApi;

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

    DatadigitalFincloudGeneralsaasFaceCertifyApi apiInstance = new DatadigitalFincloudGeneralsaasFaceCertifyApi(defaultClient);
    DatadigitalFincloudGeneralsaasFaceCertifyInitializeModel datadigitalFincloudGeneralsaasFaceCertifyInitializeModel = new DatadigitalFincloudGeneralsaasFaceCertifyInitializeModel(); // DatadigitalFincloudGeneralsaasFaceCertifyInitializeModel | 
    try {
      DatadigitalFincloudGeneralsaasFaceCertifyInitializeResponseModel result = apiInstance.initialize(datadigitalFincloudGeneralsaasFaceCertifyInitializeModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatadigitalFincloudGeneralsaasFaceCertifyApi#initialize");
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
| **datadigitalFincloudGeneralsaasFaceCertifyInitializeModel** | **DatadigitalFincloudGeneralsaasFaceCertifyInitializeModel**|  | [optional] |

### Return type

**DatadigitalFincloudGeneralsaasFaceCertifyInitializeResponseModel**

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
> DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel query(certifyId)

查询人脸认证记录接口

商户在开放认证完成后，调用本接口查询认证状态和相关数据

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.DatadigitalFincloudGeneralsaasFaceCertifyApi;

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

    DatadigitalFincloudGeneralsaasFaceCertifyApi apiInstance = new DatadigitalFincloudGeneralsaasFaceCertifyApi(defaultClient);
    String certifyId = "OC201809253000000393900404029253"; // String | 本次申请操作的唯一标识，通过initialize(身份认证初始化服务)接口同步响应获取。
    try {
      DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel result = apiInstance.query(certifyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatadigitalFincloudGeneralsaasFaceCertifyApi#query");
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
| **certifyId** | **String**| 本次申请操作的唯一标识，通过initialize(身份认证初始化服务)接口同步响应获取。 | [optional] |

### Return type

**DatadigitalFincloudGeneralsaasFaceCertifyQueryResponseModel**

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

<a name="verify"></a>
# **verify**
> DatadigitalFincloudGeneralsaasFaceCertifyVerifyResponseModel verify(datadigitalFincloudGeneralsaasFaceCertifyVerifyModel)

开始人脸认证服务接口

人脸核身服务开始认证。请根据返回结果渲染页面。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.DatadigitalFincloudGeneralsaasFaceCertifyApi;

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

    DatadigitalFincloudGeneralsaasFaceCertifyApi apiInstance = new DatadigitalFincloudGeneralsaasFaceCertifyApi(defaultClient);
    DatadigitalFincloudGeneralsaasFaceCertifyVerifyModel datadigitalFincloudGeneralsaasFaceCertifyVerifyModel = new DatadigitalFincloudGeneralsaasFaceCertifyVerifyModel(); // DatadigitalFincloudGeneralsaasFaceCertifyVerifyModel | 
    try {
      DatadigitalFincloudGeneralsaasFaceCertifyVerifyResponseModel result = apiInstance.verify(datadigitalFincloudGeneralsaasFaceCertifyVerifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatadigitalFincloudGeneralsaasFaceCertifyApi#verify");
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
| **datadigitalFincloudGeneralsaasFaceCertifyVerifyModel** | **DatadigitalFincloudGeneralsaasFaceCertifyVerifyModel**|  | [optional] |

### Return type

**DatadigitalFincloudGeneralsaasFaceCertifyVerifyResponseModel**

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

