# AlipayOpenMiniIsvFastregisterApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayOpenMiniIsvFastregisterApi.md#create) | **POST** /v3/alipay/open/mini/isv/fastregister/create | ISV代创建试用小程序 |
| [**query**](AlipayOpenMiniIsvFastregisterApi.md#query) | **GET** /v3/alipay/open/mini/isv/fastregister/query | 查询试用小程序 |


<a name="create"></a>
# **create**
> AlipayOpenMiniIsvFastregisterCreateResponseModel create(alipayOpenMiniIsvFastregisterCreateModel)

ISV代创建试用小程序

ISV代商户创建试用小程序

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniIsvFastregisterApi;

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

    AlipayOpenMiniIsvFastregisterApi apiInstance = new AlipayOpenMiniIsvFastregisterApi(defaultClient);
    AlipayOpenMiniIsvFastregisterCreateModel alipayOpenMiniIsvFastregisterCreateModel = new AlipayOpenMiniIsvFastregisterCreateModel(); // AlipayOpenMiniIsvFastregisterCreateModel | 
    try {
      AlipayOpenMiniIsvFastregisterCreateResponseModel result = apiInstance.create(alipayOpenMiniIsvFastregisterCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniIsvFastregisterApi#create");
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
| **alipayOpenMiniIsvFastregisterCreateModel** | **AlipayOpenMiniIsvFastregisterCreateModel**|  | [optional] |

### Return type

**AlipayOpenMiniIsvFastregisterCreateResponseModel**

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
> AlipayOpenMiniIsvFastregisterQueryResponseModel query(orderNo)

查询试用小程序

查询试用小程序

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniIsvFastregisterApi;

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

    AlipayOpenMiniIsvFastregisterApi apiInstance = new AlipayOpenMiniIsvFastregisterApi(defaultClient);
    String orderNo = "2202121278786786768"; // String | 代创建试用小程序单号
    try {
      AlipayOpenMiniIsvFastregisterQueryResponseModel result = apiInstance.query(orderNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniIsvFastregisterApi#query");
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
| **orderNo** | **String**| 代创建试用小程序单号 | [optional] |

### Return type

**AlipayOpenMiniIsvFastregisterQueryResponseModel**

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

