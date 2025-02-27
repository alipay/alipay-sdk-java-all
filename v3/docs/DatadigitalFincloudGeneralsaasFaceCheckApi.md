# DatadigitalFincloudGeneralsaasFaceCheckApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**initialize**](DatadigitalFincloudGeneralsaasFaceCheckApi.md#initialize) | **POST** /v3/datadigital/fincloud/generalsaas/face/check/initialize | 人脸检测初始化 |
| [**query**](DatadigitalFincloudGeneralsaasFaceCheckApi.md#query) | **POST** /v3/datadigital/fincloud/generalsaas/face/check/query | 人脸检测结果数据查询 |


<a name="initialize"></a>
# **initialize**
> DatadigitalFincloudGeneralsaasFaceCheckInitializeResponseModel initialize(datadigitalFincloudGeneralsaasFaceCheckInitializeModel)

人脸检测初始化

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
> DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel query(datadigitalFincloudGeneralsaasFaceCheckQueryModel)

人脸检测结果数据查询

用于查询人脸检测结果的数据。

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
    DatadigitalFincloudGeneralsaasFaceCheckQueryModel datadigitalFincloudGeneralsaasFaceCheckQueryModel = new DatadigitalFincloudGeneralsaasFaceCheckQueryModel(); // DatadigitalFincloudGeneralsaasFaceCheckQueryModel | 
    try {
      DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel result = apiInstance.query(datadigitalFincloudGeneralsaasFaceCheckQueryModel);
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
| **datadigitalFincloudGeneralsaasFaceCheckQueryModel** | **DatadigitalFincloudGeneralsaasFaceCheckQueryModel**|  | [optional] |

### Return type

**DatadigitalFincloudGeneralsaasFaceCheckQueryResponseModel**

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

