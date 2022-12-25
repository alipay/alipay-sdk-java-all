# AlipayTradeRoyaltyRelationApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayTradeRoyaltyRelationApi.md#batchquery) | **POST** /v3/alipay/trade/royalty/relation/batchquery | 分账关系查询 |
| [**bind**](AlipayTradeRoyaltyRelationApi.md#bind) | **POST** /v3/alipay/trade/royalty/relation/bind | 分账关系绑定 |
| [**unbind**](AlipayTradeRoyaltyRelationApi.md#unbind) | **POST** /v3/alipay/trade/royalty/relation/unbind | 分账关系解绑 |


<a name="batchquery"></a>
# **batchquery**
> AlipayTradeRoyaltyRelationBatchqueryResponseModel batchquery(alipayTradeRoyaltyRelationBatchqueryModel)

分账关系查询

当商户签约分账产品后，授权ISV帮其进行分账关系的维护。本接口用于商户与分账方的关系查询。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeRoyaltyRelationApi;

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

    AlipayTradeRoyaltyRelationApi apiInstance = new AlipayTradeRoyaltyRelationApi(defaultClient);
    AlipayTradeRoyaltyRelationBatchqueryModel alipayTradeRoyaltyRelationBatchqueryModel = new AlipayTradeRoyaltyRelationBatchqueryModel(); // AlipayTradeRoyaltyRelationBatchqueryModel | 
    try {
      AlipayTradeRoyaltyRelationBatchqueryResponseModel result = apiInstance.batchquery(alipayTradeRoyaltyRelationBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeRoyaltyRelationApi#batchquery");
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
| **alipayTradeRoyaltyRelationBatchqueryModel** | **AlipayTradeRoyaltyRelationBatchqueryModel**|  | [optional] |

### Return type

**AlipayTradeRoyaltyRelationBatchqueryResponseModel**

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

<a name="bind"></a>
# **bind**
> AlipayTradeRoyaltyRelationBindResponseModel bind(alipayTradeRoyaltyRelationBindModel)

分账关系绑定

当商户签约分账产品后，授权ISV帮其进行分账关系的维护。本接口用于商户与分账方的关系绑定。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeRoyaltyRelationApi;

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

    AlipayTradeRoyaltyRelationApi apiInstance = new AlipayTradeRoyaltyRelationApi(defaultClient);
    AlipayTradeRoyaltyRelationBindModel alipayTradeRoyaltyRelationBindModel = new AlipayTradeRoyaltyRelationBindModel(); // AlipayTradeRoyaltyRelationBindModel | 
    try {
      AlipayTradeRoyaltyRelationBindResponseModel result = apiInstance.bind(alipayTradeRoyaltyRelationBindModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeRoyaltyRelationApi#bind");
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
| **alipayTradeRoyaltyRelationBindModel** | **AlipayTradeRoyaltyRelationBindModel**|  | [optional] |

### Return type

**AlipayTradeRoyaltyRelationBindResponseModel**

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

<a name="unbind"></a>
# **unbind**
> AlipayTradeRoyaltyRelationUnbindResponseModel unbind(alipayTradeRoyaltyRelationUnbindModel)

分账关系解绑

当商户签约分账产品后，授权ISV帮其进行分账关系的维护。本接口用于商户与分账方的关系解绑。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeRoyaltyRelationApi;

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

    AlipayTradeRoyaltyRelationApi apiInstance = new AlipayTradeRoyaltyRelationApi(defaultClient);
    AlipayTradeRoyaltyRelationUnbindModel alipayTradeRoyaltyRelationUnbindModel = new AlipayTradeRoyaltyRelationUnbindModel(); // AlipayTradeRoyaltyRelationUnbindModel | 
    try {
      AlipayTradeRoyaltyRelationUnbindResponseModel result = apiInstance.unbind(alipayTradeRoyaltyRelationUnbindModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeRoyaltyRelationApi#unbind");
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
| **alipayTradeRoyaltyRelationUnbindModel** | **AlipayTradeRoyaltyRelationUnbindModel**|  | [optional] |

### Return type

**AlipayTradeRoyaltyRelationUnbindResponseModel**

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

