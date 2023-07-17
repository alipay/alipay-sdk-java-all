# AlipayMarketingActivityDeliveryApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayMarketingActivityDeliveryApi.md#create) | **POST** /v3/alipay/marketing/delivery | 创建推广计划 |
| [**query**](AlipayMarketingActivityDeliveryApi.md#query) | **POST** /v3/alipay/marketing/delivery/{delivery_id}/query | 查询推广计划 |
| [**stop**](AlipayMarketingActivityDeliveryApi.md#stop) | **PATCH** /v3/alipay/marketing/delivery/{delivery_id}/stop | 停止推广计划 |


<a name="create"></a>
# **create**
> AlipayMarketingActivityDeliveryCreateResponseModel create(alipayMarketingActivityDeliveryCreateModel)

创建推广计划

为商家提供推广内容能力。创建推广成功后，请依据推广变更消息alipay.marketing.activity.delivery.message感知推广变更状态。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityDeliveryApi;

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

    AlipayMarketingActivityDeliveryApi apiInstance = new AlipayMarketingActivityDeliveryApi(defaultClient);
    AlipayMarketingActivityDeliveryCreateModel alipayMarketingActivityDeliveryCreateModel = new AlipayMarketingActivityDeliveryCreateModel(); // AlipayMarketingActivityDeliveryCreateModel | 
    try {
      AlipayMarketingActivityDeliveryCreateResponseModel result = apiInstance.create(alipayMarketingActivityDeliveryCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityDeliveryApi#create");
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
| **alipayMarketingActivityDeliveryCreateModel** | **AlipayMarketingActivityDeliveryCreateModel**|  | [optional] |

### Return type

**AlipayMarketingActivityDeliveryCreateResponseModel**

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
> AlipayMarketingActivityDeliveryQueryResponseModel query(deliveryId, alipayMarketingActivityDeliveryQueryModel)

查询推广计划

查询推广计划详情信息。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityDeliveryApi;

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

    AlipayMarketingActivityDeliveryApi apiInstance = new AlipayMarketingActivityDeliveryApi(defaultClient);
    String deliveryId = "20121231231242353"; // String | 推广计划id
    AlipayMarketingActivityDeliveryQueryModel alipayMarketingActivityDeliveryQueryModel = new AlipayMarketingActivityDeliveryQueryModel(); // AlipayMarketingActivityDeliveryQueryModel | 
    try {
      AlipayMarketingActivityDeliveryQueryResponseModel result = apiInstance.query(deliveryId, alipayMarketingActivityDeliveryQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityDeliveryApi#query");
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
| **deliveryId** | **String**| 推广计划id | |
| **alipayMarketingActivityDeliveryQueryModel** | **AlipayMarketingActivityDeliveryQueryModel**|  | [optional] |

### Return type

**AlipayMarketingActivityDeliveryQueryResponseModel**

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

<a name="stop"></a>
# **stop**
> AlipayMarketingActivityDeliveryStopResponseModel stop(deliveryId, alipayMarketingActivityDeliveryStopModel)

停止推广计划

停止推广计划。  注意：停止推广操作成功到推广内容停止生效，可能存在几分钟的延迟。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityDeliveryApi;

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

    AlipayMarketingActivityDeliveryApi apiInstance = new AlipayMarketingActivityDeliveryApi(defaultClient);
    String deliveryId = "20121231231242353"; // String | 推广计划id
    AlipayMarketingActivityDeliveryStopModel alipayMarketingActivityDeliveryStopModel = new AlipayMarketingActivityDeliveryStopModel(); // AlipayMarketingActivityDeliveryStopModel | 
    try {
      AlipayMarketingActivityDeliveryStopResponseModel result = apiInstance.stop(deliveryId, alipayMarketingActivityDeliveryStopModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityDeliveryApi#stop");
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
| **deliveryId** | **String**| 推广计划id | |
| **alipayMarketingActivityDeliveryStopModel** | **AlipayMarketingActivityDeliveryStopModel**|  | [optional] |

### Return type

**AlipayMarketingActivityDeliveryStopResponseModel**

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

