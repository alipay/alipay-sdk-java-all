# AlipayOpenInstantdeliveryMerchantshopApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayOpenInstantdeliveryMerchantshopApi.md#batchquery) | **POST** /v3/alipay/open/instantdelivery/merchantshop/batchquery | 即时配送商家门店分页查询 |
| [**modify**](AlipayOpenInstantdeliveryMerchantshopApi.md#modify) | **POST** /v3/alipay/open/instantdelivery/merchantshop/modify | 即时配送商家门店更新 |
| [**query**](AlipayOpenInstantdeliveryMerchantshopApi.md#query) | **GET** /v3/alipay/open/instantdelivery/merchantshop/query | 即时配送商家门店详情查询 |


<a name="batchquery"></a>
# **batchquery**
> AlipayOpenInstantdeliveryMerchantshopBatchqueryResponseModel batchquery(alipayOpenInstantdeliveryMerchantshopBatchqueryModel)

即时配送商家门店分页查询

即时配送场景，商家门店信息分页查询+

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenInstantdeliveryMerchantshopApi;

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

    AlipayOpenInstantdeliveryMerchantshopApi apiInstance = new AlipayOpenInstantdeliveryMerchantshopApi(defaultClient);
    AlipayOpenInstantdeliveryMerchantshopBatchqueryModel alipayOpenInstantdeliveryMerchantshopBatchqueryModel = new AlipayOpenInstantdeliveryMerchantshopBatchqueryModel(); // AlipayOpenInstantdeliveryMerchantshopBatchqueryModel | 
    try {
      AlipayOpenInstantdeliveryMerchantshopBatchqueryResponseModel result = apiInstance.batchquery(alipayOpenInstantdeliveryMerchantshopBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenInstantdeliveryMerchantshopApi#batchquery");
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
| **alipayOpenInstantdeliveryMerchantshopBatchqueryModel** | **AlipayOpenInstantdeliveryMerchantshopBatchqueryModel**|  | [optional] |

### Return type

**AlipayOpenInstantdeliveryMerchantshopBatchqueryResponseModel**

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
> AlipayOpenInstantdeliveryMerchantshopModifyResponseModel modify(alipayOpenInstantdeliveryMerchantshopModifyModel)

即时配送商家门店更新

帮商家更新在即时配送公司的门店

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenInstantdeliveryMerchantshopApi;

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

    AlipayOpenInstantdeliveryMerchantshopApi apiInstance = new AlipayOpenInstantdeliveryMerchantshopApi(defaultClient);
    AlipayOpenInstantdeliveryMerchantshopModifyModel alipayOpenInstantdeliveryMerchantshopModifyModel = new AlipayOpenInstantdeliveryMerchantshopModifyModel(); // AlipayOpenInstantdeliveryMerchantshopModifyModel | 
    try {
      AlipayOpenInstantdeliveryMerchantshopModifyResponseModel result = apiInstance.modify(alipayOpenInstantdeliveryMerchantshopModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenInstantdeliveryMerchantshopApi#modify");
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
| **alipayOpenInstantdeliveryMerchantshopModifyModel** | **AlipayOpenInstantdeliveryMerchantshopModifyModel**|  | [optional] |

### Return type

**AlipayOpenInstantdeliveryMerchantshopModifyResponseModel**

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
> AlipayOpenInstantdeliveryMerchantshopQueryResponseModel query(shopNo)

即时配送商家门店详情查询

即时配送场景，查询商家门店详情信息。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenInstantdeliveryMerchantshopApi;

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

    AlipayOpenInstantdeliveryMerchantshopApi apiInstance = new AlipayOpenInstantdeliveryMerchantshopApi(defaultClient);
    String shopNo = "1000"; // String | 商家门店编码。
    try {
      AlipayOpenInstantdeliveryMerchantshopQueryResponseModel result = apiInstance.query(shopNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenInstantdeliveryMerchantshopApi#query");
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
| **shopNo** | **String**| 商家门店编码。 | [optional] |

### Return type

**AlipayOpenInstantdeliveryMerchantshopQueryResponseModel**

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

