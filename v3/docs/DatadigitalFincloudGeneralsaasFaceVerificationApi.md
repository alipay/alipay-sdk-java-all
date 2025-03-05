# DatadigitalFincloudGeneralsaasFaceVerificationApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**initialize**](DatadigitalFincloudGeneralsaasFaceVerificationApi.md#initialize) | **POST** /v3/datadigital/fincloud/generalsaas/face/verification/initialize | 人脸核身初始化 |
| [**query**](DatadigitalFincloudGeneralsaasFaceVerificationApi.md#query) | **GET** /v3/datadigital/fincloud/generalsaas/face/verification/query | 人脸核身结果查询 |


<a name="initialize"></a>
# **initialize**
> DatadigitalFincloudGeneralsaasFaceVerificationInitializeResponseModel initialize(datadigitalFincloudGeneralsaasFaceVerificationInitializeModel)

人脸核身初始化

人脸核身初始化接口

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.DatadigitalFincloudGeneralsaasFaceVerificationApi;

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

    DatadigitalFincloudGeneralsaasFaceVerificationApi apiInstance = new DatadigitalFincloudGeneralsaasFaceVerificationApi(defaultClient);
    DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel datadigitalFincloudGeneralsaasFaceVerificationInitializeModel = new DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel(); // DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel | 
    try {
      DatadigitalFincloudGeneralsaasFaceVerificationInitializeResponseModel result = apiInstance.initialize(datadigitalFincloudGeneralsaasFaceVerificationInitializeModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatadigitalFincloudGeneralsaasFaceVerificationApi#initialize");
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
| **datadigitalFincloudGeneralsaasFaceVerificationInitializeModel** | **DatadigitalFincloudGeneralsaasFaceVerificationInitializeModel**|  | [optional] |

### Return type

**DatadigitalFincloudGeneralsaasFaceVerificationInitializeResponseModel**

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
> DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel query(certifyId, needAlivePhoto)

人脸核身结果查询

查询核身结果

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.DatadigitalFincloudGeneralsaasFaceVerificationApi;

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

    DatadigitalFincloudGeneralsaasFaceVerificationApi apiInstance = new DatadigitalFincloudGeneralsaasFaceVerificationApi(defaultClient);
    String certifyId = "adsfasdfasdf"; // String | 填入人脸核身初始化阶段获取到的certify_id
    String needAlivePhoto = "N"; // String | 是否需要返回活体结果图片，默认为N（不返图）
    try {
      DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel result = apiInstance.query(certifyId, needAlivePhoto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatadigitalFincloudGeneralsaasFaceVerificationApi#query");
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
| **certifyId** | **String**| 填入人脸核身初始化阶段获取到的certify_id | [optional] |
| **needAlivePhoto** | **String**| 是否需要返回活体结果图片，默认为N（不返图） | [optional] |

### Return type

**DatadigitalFincloudGeneralsaasFaceVerificationQueryResponseModel**

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

