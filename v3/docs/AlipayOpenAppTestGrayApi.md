# AlipayOpenAppTestGrayApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayOpenAppTestGrayApi.md#create) | **POST** /v3/alipay/open/app/test/gray/create | openapi-oas3.0灰度 |
| [**query**](AlipayOpenAppTestGrayApi.md#query) | **GET** /v3/alipay/open/app/test/gray/query | GET方法测试 |


<a name="create"></a>
# **create**
> AlipayOpenAppTestGrayCreateResponseModel create(a, oid, b, c, alipayOpenAppTestGrayCreateModel)

openapi-oas3.0灰度

openapi，oas3.0灰度

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenAppTestGrayApi;

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

    AlipayOpenAppTestGrayApi apiInstance = new AlipayOpenAppTestGrayApi(defaultClient);
    String a = "a1"; // String | a
    String oid = "111"; // String | 1
    String b = "b2"; // String | 生
    String c = "c1"; // String | c1
    AlipayOpenAppTestGrayCreateModel alipayOpenAppTestGrayCreateModel = new AlipayOpenAppTestGrayCreateModel(); // AlipayOpenAppTestGrayCreateModel | 
    try {
      AlipayOpenAppTestGrayCreateResponseModel result = apiInstance.create(a, oid, b, c, alipayOpenAppTestGrayCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenAppTestGrayApi#create");
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
| **a** | **String**| a | [optional] |
| **oid** | **String**| 1 | [optional] |
| **b** | **String**| 生 | [optional] |
| **c** | **String**| c1 | [optional] |
| **alipayOpenAppTestGrayCreateModel** | **AlipayOpenAppTestGrayCreateModel**|  | [optional] |

### Return type

**AlipayOpenAppTestGrayCreateResponseModel**

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
> AlipayOpenAppTestGrayQueryResponseModel query(latitude, cityId, uid, buyOpenId)

GET方法测试

oas get

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenAppTestGrayApi;

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

    AlipayOpenAppTestGrayApi apiInstance = new AlipayOpenAppTestGrayApi(defaultClient);
    String latitude = "123"; // String | 纬度
    String cityId = "1"; // String | 1
    String uid = "1"; // String | 1
    String buyOpenId = "1"; // String | 1
    try {
      AlipayOpenAppTestGrayQueryResponseModel result = apiInstance.query(latitude, cityId, uid, buyOpenId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenAppTestGrayApi#query");
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
| **latitude** | **String**| 纬度 | [optional] |
| **cityId** | **String**| 1 | [optional] |
| **uid** | **String**| 1 | [optional] |
| **buyOpenId** | **String**| 1 | [optional] |

### Return type

**AlipayOpenAppTestGrayQueryResponseModel**

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

