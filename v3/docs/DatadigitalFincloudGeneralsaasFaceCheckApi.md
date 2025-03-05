# DatadigitalFincloudGeneralsaasFaceCheckApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**initialize**](DatadigitalFincloudGeneralsaasFaceCheckApi.md#initialize) | **POST** /v3/datadigital/fincloud/generalsaas/face/check/initialize | 活体检测初始化 |
| [**query**](DatadigitalFincloudGeneralsaasFaceCheckApi.md#query) | **GET** /v3/datadigital/fincloud/generalsaas/face/check/query | 活体检测结果查询 |


<a name="initialize"></a>
# **initialize**
> DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel initialize(datadigitalFincloudGeneralsaasFaceCheckInitializeModel)

活体检测初始化

人脸检测业务单据初始化

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.DatadigitalFincloudGeneralsaasFaceCheckApi;

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

    DatadigitalFincloudGeneralsaasFaceCheckApi apiInstance = new DatadigitalFincloudGeneralsaasFaceCheckApi(defaultClient);
    DatadigitalFincloudGeneralsaasFaceCheckInitializeModel datadigitalFincloudGeneralsaasFaceCheckInitializeModel = new DatadigitalFincloudGeneralsaasFaceCheckInitializeModel(); // DatadigitalFincloudGeneralsaasFaceCheckInitializeModel | 
    try {
      DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel result = apiInstance.initialize(datadigitalFincloudGeneralsaasFaceCheckInitializeModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatadigitalFincloudGeneralsaasFaceCheckApi#initialize");
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
| **datadigitalFincloudGeneralsaasFaceCheckInitializeModel** | **DatadigitalFincloudGeneralsaasFaceCheckInitializeModel**|  | [optional] |

### Return type

**DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel**

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
> DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel query(certifyId, needAlivePhoto, needScore, needQualityScore, needAttackResult)

活体检测结果查询

用于查询活体检测结果。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.DatadigitalFincloudGeneralsaasFaceCheckApi;

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

    DatadigitalFincloudGeneralsaasFaceCheckApi apiInstance = new DatadigitalFincloudGeneralsaasFaceCheckApi(defaultClient);
    String certifyId = "dddddfsss88833ssf"; // String | 传入初始化接口datadigital.fincloud.generalsaas.face.check.initialize 得到的certify_id
    String needAlivePhoto = "Y_M"; // String | 是否需要返回活体结果图片，needAlivePhoto：Y_O （原始图片）、Y_M（虚化，背景马赛克）、N（不返图）。非必填，默认为N
    String needScore = "Y"; // String | 该入参已经废弃。
    String needQualityScore = "N"; // String | 是否需要返回图片质量分，非必填，默认值为N。 N表示不需要，Y表示需要
    String needAttackResult = "N"; // String | 该参数已废弃
    try {
      DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel result = apiInstance.query(certifyId, needAlivePhoto, needScore, needQualityScore, needAttackResult);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatadigitalFincloudGeneralsaasFaceCheckApi#query");
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
| **certifyId** | **String**| 传入初始化接口datadigital.fincloud.generalsaas.face.check.initialize 得到的certify_id | [optional] |
| **needAlivePhoto** | **String**| 是否需要返回活体结果图片，needAlivePhoto：Y_O （原始图片）、Y_M（虚化，背景马赛克）、N（不返图）。非必填，默认为N | [optional] |
| **needScore** | **String**| 该入参已经废弃。 | [optional] |
| **needQualityScore** | **String**| 是否需要返回图片质量分，非必填，默认值为N。 N表示不需要，Y表示需要 | [optional] |
| **needAttackResult** | **String**| 该参数已废弃 | [optional] |

### Return type

**DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel**

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

