# AlipayOpenAppApiFieldApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apply**](AlipayOpenAppApiFieldApi.md#apply) | **POST** /v3/alipay/open/app/api/field/apply | 申请获取接口用户敏感信息字段 |
| [**query**](AlipayOpenAppApiFieldApi.md#query) | **GET** /v3/alipay/open/app/api/field/query | 用户信息申请记录查询 |


<a name="apply"></a>
# **apply**
> Object apply(data, picture1, picture2, picture3, picture4, picture5, video)

申请获取接口用户敏感信息字段

申请获取接口出参中用户敏感信息字段，应用使用视频或图片（至少选择一项上传），单个图片或视频不超过10M，最多可上传5张图片示例。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenAppApiFieldApi;

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

    AlipayOpenAppApiFieldApi apiInstance = new AlipayOpenAppApiFieldApi(defaultClient);
    AlipayOpenAppApiFieldApplyModel data = new AlipayOpenAppApiFieldApplyModel(); // AlipayOpenAppApiFieldApplyModel | 
    File picture1 = new File("/path/to/file"); // File | 
    File picture2 = new File("/path/to/file"); // File | 
    File picture3 = new File("/path/to/file"); // File | 
    File picture4 = new File("/path/to/file"); // File | 
    File picture5 = new File("/path/to/file"); // File | 
    File video = new File("/path/to/file"); // File | 
    try {
      Object result = apiInstance.apply(data, picture1, picture2, picture3, picture4, picture5, video);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenAppApiFieldApi#apply");
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
| **data** | **AlipayOpenAppApiFieldApplyModel**|  | [optional] |
| **picture1** | **File**|  | [optional] |
| **picture2** | **File**|  | [optional] |
| **picture3** | **File**|  | [optional] |
| **picture4** | **File**|  | [optional] |
| **picture5** | **File**|  | [optional] |
| **video** | **File**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

<a name="query"></a>
# **query**
> AlipayOpenAppApiFieldQueryResponseModel query()

用户信息申请记录查询

查询用户信息申请记录，开发者发起请求时会基于当前发起请求的app_id进行查询，若为isv发起的三方代调用则以授权的商户app_id进行查询。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenAppApiFieldApi;

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

    AlipayOpenAppApiFieldApi apiInstance = new AlipayOpenAppApiFieldApi(defaultClient);
    try {
      AlipayOpenAppApiFieldQueryResponseModel result = apiInstance.query();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenAppApiFieldApi#query");
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

**AlipayOpenAppApiFieldQueryResponseModel**

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

