# AlipayCommerceLogisticsOrderInstantdeliveryApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancel**](AlipayCommerceLogisticsOrderInstantdeliveryApi.md#cancel) | **POST** /v3/alipay/commerce/logistics/order/instantdelivery/cancel | 取消即时配送订单 |
| [**create**](AlipayCommerceLogisticsOrderInstantdeliveryApi.md#create) | **POST** /v3/alipay/commerce/logistics/order/instantdelivery/create | 下即时配送订单 |
| [**precreate**](AlipayCommerceLogisticsOrderInstantdeliveryApi.md#precreate) | **POST** /v3/alipay/commerce/logistics/order/instantdelivery/precreate | 预下即时配送订单 |


<a name="cancel"></a>
# **cancel**
> Object cancel(alipayCommerceLogisticsOrderInstantdeliveryCancelModel)

取消即时配送订单

取消即时配送订单

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceLogisticsOrderInstantdeliveryApi;

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

    AlipayCommerceLogisticsOrderInstantdeliveryApi apiInstance = new AlipayCommerceLogisticsOrderInstantdeliveryApi(defaultClient);
    AlipayCommerceLogisticsOrderInstantdeliveryCancelModel alipayCommerceLogisticsOrderInstantdeliveryCancelModel = new AlipayCommerceLogisticsOrderInstantdeliveryCancelModel(); // AlipayCommerceLogisticsOrderInstantdeliveryCancelModel | 
    try {
      Object result = apiInstance.cancel(alipayCommerceLogisticsOrderInstantdeliveryCancelModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceLogisticsOrderInstantdeliveryApi#cancel");
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
| **alipayCommerceLogisticsOrderInstantdeliveryCancelModel** | **AlipayCommerceLogisticsOrderInstantdeliveryCancelModel**|  | [optional] |

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

<a name="create"></a>
# **create**
> AlipayCommerceLogisticsOrderInstantdeliveryCreateResponseModel create(alipayCommerceLogisticsOrderInstantdeliveryCreateModel)

下即时配送订单

下即时配送订单

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceLogisticsOrderInstantdeliveryApi;

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

    AlipayCommerceLogisticsOrderInstantdeliveryApi apiInstance = new AlipayCommerceLogisticsOrderInstantdeliveryApi(defaultClient);
    AlipayCommerceLogisticsOrderInstantdeliveryCreateModel alipayCommerceLogisticsOrderInstantdeliveryCreateModel = new AlipayCommerceLogisticsOrderInstantdeliveryCreateModel(); // AlipayCommerceLogisticsOrderInstantdeliveryCreateModel | 
    try {
      AlipayCommerceLogisticsOrderInstantdeliveryCreateResponseModel result = apiInstance.create(alipayCommerceLogisticsOrderInstantdeliveryCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceLogisticsOrderInstantdeliveryApi#create");
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
| **alipayCommerceLogisticsOrderInstantdeliveryCreateModel** | **AlipayCommerceLogisticsOrderInstantdeliveryCreateModel**|  | [optional] |

### Return type

**AlipayCommerceLogisticsOrderInstantdeliveryCreateResponseModel**

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

<a name="precreate"></a>
# **precreate**
> AlipayCommerceLogisticsOrderInstantdeliveryPrecreateResponseModel precreate(alipayCommerceLogisticsOrderInstantdeliveryPrecreateModel)

预下即时配送订单

预下即时配送订单

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceLogisticsOrderInstantdeliveryApi;

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

    AlipayCommerceLogisticsOrderInstantdeliveryApi apiInstance = new AlipayCommerceLogisticsOrderInstantdeliveryApi(defaultClient);
    AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel alipayCommerceLogisticsOrderInstantdeliveryPrecreateModel = new AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel(); // AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel | 
    try {
      AlipayCommerceLogisticsOrderInstantdeliveryPrecreateResponseModel result = apiInstance.precreate(alipayCommerceLogisticsOrderInstantdeliveryPrecreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceLogisticsOrderInstantdeliveryApi#precreate");
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
| **alipayCommerceLogisticsOrderInstantdeliveryPrecreateModel** | **AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel**|  | [optional] |

### Return type

**AlipayCommerceLogisticsOrderInstantdeliveryPrecreateResponseModel**

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

