# AlipayOpenSpIsvSignauthApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayOpenSpIsvSignauthApi.md#create) | **POST** /v3/alipay/open/sp/isv/signauth/create | 创建签约授权一体化订单 |
| [**query**](AlipayOpenSpIsvSignauthApi.md#query) | **POST** /v3/alipay/open/sp/isv/signauth/query | 查询签约授权一体化订单状态详情 |


<a name="create"></a>
# **create**
> AlipayOpenSpIsvSignauthCreateResponseModel create(alipayOpenSpIsvSignauthCreateModel)

创建签约授权一体化订单

针对签约授权一体化场景，创建签约授权一体化订单绑定签约单（可选）、绑定代运营授权单、应用授权单，跟踪整个签约授权一体化订单的状态

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSpIsvSignauthApi;

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

    AlipayOpenSpIsvSignauthApi apiInstance = new AlipayOpenSpIsvSignauthApi(defaultClient);
    AlipayOpenSpIsvSignauthCreateModel alipayOpenSpIsvSignauthCreateModel = new AlipayOpenSpIsvSignauthCreateModel(); // AlipayOpenSpIsvSignauthCreateModel | 
    try {
      AlipayOpenSpIsvSignauthCreateResponseModel result = apiInstance.create(alipayOpenSpIsvSignauthCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSpIsvSignauthApi#create");
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
| **alipayOpenSpIsvSignauthCreateModel** | **AlipayOpenSpIsvSignauthCreateModel**|  | [optional] |

### Return type

**AlipayOpenSpIsvSignauthCreateResponseModel**

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
> AlipayOpenSpIsvSignauthQueryResponseModel query(alipayOpenSpIsvSignauthQueryModel)

查询签约授权一体化订单状态详情

查询签约授权一体化订单状态详情（包含子任务信息）

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSpIsvSignauthApi;

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

    AlipayOpenSpIsvSignauthApi apiInstance = new AlipayOpenSpIsvSignauthApi(defaultClient);
    AlipayOpenSpIsvSignauthQueryModel alipayOpenSpIsvSignauthQueryModel = new AlipayOpenSpIsvSignauthQueryModel(); // AlipayOpenSpIsvSignauthQueryModel | 
    try {
      AlipayOpenSpIsvSignauthQueryResponseModel result = apiInstance.query(alipayOpenSpIsvSignauthQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSpIsvSignauthApi#query");
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
| **alipayOpenSpIsvSignauthQueryModel** | **AlipayOpenSpIsvSignauthQueryModel**|  | [optional] |

### Return type

**AlipayOpenSpIsvSignauthQueryResponseModel**

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

