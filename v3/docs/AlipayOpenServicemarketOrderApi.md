# AlipayOpenServicemarketOrderApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accept**](AlipayOpenServicemarketOrderApi.md#accept) | **POST** /v3/alipay/open/servicemarket/order/accept | 服务商接单操作 |
| [**create**](AlipayOpenServicemarketOrderApi.md#create) | **POST** /v3/alipay/open/servicemarket/order/create | 服务市场代订购小程序 |
| [**notify**](AlipayOpenServicemarketOrderApi.md#notify) | **POST** /v3/alipay/open/servicemarket/order/notify | 服务市场商户确认订购通知 |
| [**query**](AlipayOpenServicemarketOrderApi.md#query) | **GET** /v3/alipay/open/servicemarket/order/query | 订购插件订单明细查询 |
| [**reject**](AlipayOpenServicemarketOrderApi.md#reject) | **POST** /v3/alipay/open/servicemarket/order/reject | 服务商拒绝接单 |


<a name="accept"></a>
# **accept**
> Object accept(alipayOpenServicemarketOrderAcceptModel)

服务商接单操作

商户订购服务插件之后，需要服务商接单，调用此接口可完成接单操作

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenServicemarketOrderApi;

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

    AlipayOpenServicemarketOrderApi apiInstance = new AlipayOpenServicemarketOrderApi(defaultClient);
    AlipayOpenServicemarketOrderAcceptModel alipayOpenServicemarketOrderAcceptModel = new AlipayOpenServicemarketOrderAcceptModel(); // AlipayOpenServicemarketOrderAcceptModel | 
    try {
      Object result = apiInstance.accept(alipayOpenServicemarketOrderAcceptModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenServicemarketOrderApi#accept");
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
| **alipayOpenServicemarketOrderAcceptModel** | **AlipayOpenServicemarketOrderAcceptModel**|  | [optional] |

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
> AlipayOpenServicemarketOrderCreateResponseModel create(appLogo, data)

服务市场代订购小程序

第三方服务商可以创建服务市场的订单，并代为创建小程序应用，小程序应用授权给服务商

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenServicemarketOrderApi;

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

    AlipayOpenServicemarketOrderApi apiInstance = new AlipayOpenServicemarketOrderApi(defaultClient);
    File appLogo = new File("/path/to/file"); // File | 
    AlipayOpenServicemarketOrderCreateModel data = new AlipayOpenServicemarketOrderCreateModel(); // AlipayOpenServicemarketOrderCreateModel | 
    try {
      AlipayOpenServicemarketOrderCreateResponseModel result = apiInstance.create(appLogo, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenServicemarketOrderApi#create");
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
| **appLogo** | **File**|  | [optional] |
| **data** | **AlipayOpenServicemarketOrderCreateModel**|  | [optional] |

### Return type

**AlipayOpenServicemarketOrderCreateResponseModel**

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

<a name="notify"></a>
# **notify**
> Object notify(commonNotifyUrlModel)

服务市场商户确认订购通知

服务市场当商户选择服务商提供产品并订购确认时，通知服务商订单消息。服务商可以通过通知的消息内容回查该订单明细。回查接口（alipay.open.servicemarket.order.query）

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenServicemarketOrderApi;

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

    AlipayOpenServicemarketOrderApi apiInstance = new AlipayOpenServicemarketOrderApi(defaultClient);
    CommonNotifyUrlModel commonNotifyUrlModel = new CommonNotifyUrlModel(); // CommonNotifyUrlModel | 
    try {
      Object result = apiInstance.notify(commonNotifyUrlModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenServicemarketOrderApi#notify");
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
| **commonNotifyUrlModel** | **CommonNotifyUrlModel**|  | [optional] |

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

<a name="query"></a>
# **query**
> AlipayOpenServicemarketOrderQueryResponseModel query(commodityOrderId, startPage)

订购插件订单明细查询

第三方服务商提供服务产品被商户订购后，服务市场会推送订单信息给服务商，服务商根据订单号回查该订单明细信息。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenServicemarketOrderApi;

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

    AlipayOpenServicemarketOrderApi apiInstance = new AlipayOpenServicemarketOrderApi(defaultClient);
    String commodityOrderId = "20160010200000000033400"; // String | 订购服务订单ID，通过支付宝发送的 https://opendocs.alipay.com/apis/api_3/alipay.open.servicemarket.order.notify(服务市场商户确认订购通知) 通知获取。
    String startPage = "1"; // String | 查询开始页码，1 为第一页。
    try {
      AlipayOpenServicemarketOrderQueryResponseModel result = apiInstance.query(commodityOrderId, startPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenServicemarketOrderApi#query");
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
| **commodityOrderId** | **String**| 订购服务订单ID，通过支付宝发送的 https://opendocs.alipay.com/apis/api_3/alipay.open.servicemarket.order.notify(服务市场商户确认订购通知) 通知获取。 | [optional] |
| **startPage** | **String**| 查询开始页码，1 为第一页。 | [optional] |

### Return type

**AlipayOpenServicemarketOrderQueryResponseModel**

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

<a name="reject"></a>
# **reject**
> Object reject(alipayOpenServicemarketOrderRejectModel)

服务商拒绝接单

服务商可以拒接商户购买服务插件订单

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenServicemarketOrderApi;

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

    AlipayOpenServicemarketOrderApi apiInstance = new AlipayOpenServicemarketOrderApi(defaultClient);
    AlipayOpenServicemarketOrderRejectModel alipayOpenServicemarketOrderRejectModel = new AlipayOpenServicemarketOrderRejectModel(); // AlipayOpenServicemarketOrderRejectModel | 
    try {
      Object result = apiInstance.reject(alipayOpenServicemarketOrderRejectModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenServicemarketOrderApi#reject");
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
| **alipayOpenServicemarketOrderRejectModel** | **AlipayOpenServicemarketOrderRejectModel**|  | [optional] |

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

