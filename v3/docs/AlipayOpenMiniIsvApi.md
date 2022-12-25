# AlipayOpenMiniIsvApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayOpenMiniIsvApi.md#create) | **POST** /v3/alipay/open/mini/isv/create | isv服务商代商户创建小程序 |
| [**query**](AlipayOpenMiniIsvApi.md#query) | **GET** /v3/alipay/open/mini/isv/query | isv查询代商家创建小程序记录 |


<a name="create"></a>
# **create**
> AlipayOpenMiniIsvCreateResponseModel create(alipayOpenMiniIsvCreateModel)

isv服务商代商户创建小程序

服务商代商家创建小程序，待商家确认后服务商代创建的小程序才会生效，若商家超过确认时间则服务商创建的小程序会自动作废释放占用的小程序名称。 将 is_individual 设置为 true，并且同时传入 license_pic。将同时对具备个体工商户营业执照的商家个人账号认证成为个体工商户账号（创建小程序+升级个体工商户账号一体化）。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniIsvApi;

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

    AlipayOpenMiniIsvApi apiInstance = new AlipayOpenMiniIsvApi(defaultClient);
    AlipayOpenMiniIsvCreateModel alipayOpenMiniIsvCreateModel = new AlipayOpenMiniIsvCreateModel(); // AlipayOpenMiniIsvCreateModel | 
    try {
      AlipayOpenMiniIsvCreateResponseModel result = apiInstance.create(alipayOpenMiniIsvCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniIsvApi#create");
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
| **alipayOpenMiniIsvCreateModel** | **AlipayOpenMiniIsvCreateModel**|  | [optional] |

### Return type

**AlipayOpenMiniIsvCreateResponseModel**

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
> AlipayOpenMiniIsvQueryResponseModel query(orderNo)

isv查询代商家创建小程序记录

isv查询代商家创建小程序记录

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniIsvApi;

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

    AlipayOpenMiniIsvApi apiInstance = new AlipayOpenMiniIsvApi(defaultClient);
    String orderNo = "2394834823942343"; // String | 服务商代商家创建小程序，由支付宝开放平台返回的订单号用于后续查询处理进展。
    try {
      AlipayOpenMiniIsvQueryResponseModel result = apiInstance.query(orderNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniIsvApi#query");
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
| **orderNo** | **String**| 服务商代商家创建小程序，由支付宝开放平台返回的订单号用于后续查询处理进展。 | [optional] |

### Return type

**AlipayOpenMiniIsvQueryResponseModel**

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

