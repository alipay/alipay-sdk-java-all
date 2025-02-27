# AlipayOpenMiniTipsDeliveryApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayOpenMiniTipsDeliveryApi.md#batchquery) | **POST** /v3/alipay/open/mini/tips/delivery/batchquery | 小程序收藏引导投放活动配置批量查询 |
| [**create**](AlipayOpenMiniTipsDeliveryApi.md#create) | **POST** /v3/alipay/open/mini/tips/delivery/create | 小程序收藏引导投放活动配置创建 |
| [**modify**](AlipayOpenMiniTipsDeliveryApi.md#modify) | **POST** /v3/alipay/open/mini/tips/delivery/modify | 小程序收藏引导投放活动修改 |
| [**query**](AlipayOpenMiniTipsDeliveryApi.md#query) | **POST** /v3/alipay/open/mini/tips/delivery/query | 小程序收藏引导投放活动详情查询 |


<a name="batchquery"></a>
# **batchquery**
> AlipayOpenMiniTipsDeliveryBatchqueryResponseModel batchquery(alipayOpenMiniTipsDeliveryBatchqueryModel)

小程序收藏引导投放活动配置批量查询

小程序收藏引导投放活动配置批量查询接口，获取该小程序下所有活动配置及状态信息。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniTipsDeliveryApi;

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

    AlipayOpenMiniTipsDeliveryApi apiInstance = new AlipayOpenMiniTipsDeliveryApi(defaultClient);
    AlipayOpenMiniTipsDeliveryBatchqueryModel alipayOpenMiniTipsDeliveryBatchqueryModel = new AlipayOpenMiniTipsDeliveryBatchqueryModel(); // AlipayOpenMiniTipsDeliveryBatchqueryModel | 
    try {
      AlipayOpenMiniTipsDeliveryBatchqueryResponseModel result = apiInstance.batchquery(alipayOpenMiniTipsDeliveryBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniTipsDeliveryApi#batchquery");
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
| **alipayOpenMiniTipsDeliveryBatchqueryModel** | **AlipayOpenMiniTipsDeliveryBatchqueryModel**|  | [optional] |

### Return type

**AlipayOpenMiniTipsDeliveryBatchqueryResponseModel**

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
> AlipayOpenMiniTipsDeliveryCreateResponseModel create(alipayOpenMiniTipsDeliveryCreateModel)

小程序收藏引导投放活动配置创建

小程序收藏引导投放活动配置创建。通过配置有效的小程序收藏引导（tips）文案，创建小程序收藏引导活动。用户在活动有效期内等于相应页面，将展示配置的个性化文案，帮助用户收藏小程序。请结合您的小程序及页面，配置个性化文案。 

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniTipsDeliveryApi;

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

    AlipayOpenMiniTipsDeliveryApi apiInstance = new AlipayOpenMiniTipsDeliveryApi(defaultClient);
    AlipayOpenMiniTipsDeliveryCreateModel alipayOpenMiniTipsDeliveryCreateModel = new AlipayOpenMiniTipsDeliveryCreateModel(); // AlipayOpenMiniTipsDeliveryCreateModel | 
    try {
      AlipayOpenMiniTipsDeliveryCreateResponseModel result = apiInstance.create(alipayOpenMiniTipsDeliveryCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniTipsDeliveryApi#create");
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
| **alipayOpenMiniTipsDeliveryCreateModel** | **AlipayOpenMiniTipsDeliveryCreateModel**|  | [optional] |

### Return type

**AlipayOpenMiniTipsDeliveryCreateResponseModel**

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

<a name="modify"></a>
# **modify**
> Object modify(alipayOpenMiniTipsDeliveryModifyModel)

小程序收藏引导投放活动修改

小程序收藏引导投放活动修改接口，目前支持活动状态的修改，包括暂停、恢复、终止单个收藏引导活动。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniTipsDeliveryApi;

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

    AlipayOpenMiniTipsDeliveryApi apiInstance = new AlipayOpenMiniTipsDeliveryApi(defaultClient);
    AlipayOpenMiniTipsDeliveryModifyModel alipayOpenMiniTipsDeliveryModifyModel = new AlipayOpenMiniTipsDeliveryModifyModel(); // AlipayOpenMiniTipsDeliveryModifyModel | 
    try {
      Object result = apiInstance.modify(alipayOpenMiniTipsDeliveryModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniTipsDeliveryApi#modify");
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
| **alipayOpenMiniTipsDeliveryModifyModel** | **AlipayOpenMiniTipsDeliveryModifyModel**|  | [optional] |

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
> AlipayOpenMiniTipsDeliveryQueryResponseModel query(alipayOpenMiniTipsDeliveryQueryModel)

小程序收藏引导投放活动详情查询

小程序收藏引导投放活动配置详情查询接口，获取当前活动ID对应活动的配置及状态信息。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniTipsDeliveryApi;

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

    AlipayOpenMiniTipsDeliveryApi apiInstance = new AlipayOpenMiniTipsDeliveryApi(defaultClient);
    AlipayOpenMiniTipsDeliveryQueryModel alipayOpenMiniTipsDeliveryQueryModel = new AlipayOpenMiniTipsDeliveryQueryModel(); // AlipayOpenMiniTipsDeliveryQueryModel | 
    try {
      AlipayOpenMiniTipsDeliveryQueryResponseModel result = apiInstance.query(alipayOpenMiniTipsDeliveryQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniTipsDeliveryApi#query");
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
| **alipayOpenMiniTipsDeliveryQueryModel** | **AlipayOpenMiniTipsDeliveryQueryModel**|  | [optional] |

### Return type

**AlipayOpenMiniTipsDeliveryQueryResponseModel**

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

