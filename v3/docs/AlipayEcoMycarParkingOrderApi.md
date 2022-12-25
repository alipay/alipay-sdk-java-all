# AlipayEcoMycarParkingOrderApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sync**](AlipayEcoMycarParkingOrderApi.md#sync) | **POST** /v3/alipay/eco/mycar/parking/order/sync | 订单同步接口 |
| [**update**](AlipayEcoMycarParkingOrderApi.md#update) | **POST** /v3/alipay/eco/mycar/parking/order/update | 订单更新接口 |


<a name="sync"></a>
# **sync**
> Object sync(alipayEcoMycarParkingOrderSyncModel)

订单同步接口

商户通过接口调用，回传订单信息给停车平台

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoMycarParkingOrderApi;

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

    AlipayEcoMycarParkingOrderApi apiInstance = new AlipayEcoMycarParkingOrderApi(defaultClient);
    AlipayEcoMycarParkingOrderSyncModel alipayEcoMycarParkingOrderSyncModel = new AlipayEcoMycarParkingOrderSyncModel(); // AlipayEcoMycarParkingOrderSyncModel | 
    try {
      Object result = apiInstance.sync(alipayEcoMycarParkingOrderSyncModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoMycarParkingOrderApi#sync");
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
| **alipayEcoMycarParkingOrderSyncModel** | **AlipayEcoMycarParkingOrderSyncModel**|  | [optional] |

### Return type

**Object**

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

<a name="update"></a>
# **update**
> Object update(alipayEcoMycarParkingOrderUpdateModel)

订单更新接口

商户通过接口调用，回传订单状态给停车平台

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoMycarParkingOrderApi;

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

    AlipayEcoMycarParkingOrderApi apiInstance = new AlipayEcoMycarParkingOrderApi(defaultClient);
    AlipayEcoMycarParkingOrderUpdateModel alipayEcoMycarParkingOrderUpdateModel = new AlipayEcoMycarParkingOrderUpdateModel(); // AlipayEcoMycarParkingOrderUpdateModel | 
    try {
      Object result = apiInstance.update(alipayEcoMycarParkingOrderUpdateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoMycarParkingOrderApi#update");
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
| **alipayEcoMycarParkingOrderUpdateModel** | **AlipayEcoMycarParkingOrderUpdateModel**|  | [optional] |

### Return type

**Object**

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

