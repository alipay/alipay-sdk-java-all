# AlipayMerchantTradecomplainApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayMerchantTradecomplainApi.md#batchquery) | **POST** /v3/alipay/merchant/tradecomplain/batchquery | 查询交易投诉列表 |
| [**query**](AlipayMerchantTradecomplainApi.md#query) | **GET** /v3/alipay/merchant/tradecomplain/{complain_event_id} | 查询单条交易投诉详情 |


<a name="batchquery"></a>
# **batchquery**
> AlipayMerchantTradecomplainBatchqueryResponseModel batchquery(alipayMerchantTradecomplainBatchqueryModel)

查询交易投诉列表

开发者根据其应用id查询用户在其应用（小程序、生活号）的投诉单列表记录。投诉单列表以分页查询方式返回。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMerchantTradecomplainApi;

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

    AlipayMerchantTradecomplainApi apiInstance = new AlipayMerchantTradecomplainApi(defaultClient);
    AlipayMerchantTradecomplainBatchqueryModel alipayMerchantTradecomplainBatchqueryModel = new AlipayMerchantTradecomplainBatchqueryModel(); // AlipayMerchantTradecomplainBatchqueryModel | 
    try {
      AlipayMerchantTradecomplainBatchqueryResponseModel result = apiInstance.batchquery(alipayMerchantTradecomplainBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMerchantTradecomplainApi#batchquery");
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
| **alipayMerchantTradecomplainBatchqueryModel** | **AlipayMerchantTradecomplainBatchqueryModel**|  | [optional] |

### Return type

**AlipayMerchantTradecomplainBatchqueryResponseModel**

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
> AlipayMerchantTradecomplainQueryResponseModel query(complainEventId)

查询单条交易投诉详情

开发者根据支付宝侧投诉单号查询该笔投诉详细记录。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMerchantTradecomplainApi;

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

    AlipayMerchantTradecomplainApi apiInstance = new AlipayMerchantTradecomplainApi(defaultClient);
    String complainEventId = "2020092300102000000001459758"; // String | 支付宝侧投诉单号
    try {
      AlipayMerchantTradecomplainQueryResponseModel result = apiInstance.query(complainEventId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMerchantTradecomplainApi#query");
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
| **complainEventId** | **String**| 支付宝侧投诉单号 | |

### Return type

**AlipayMerchantTradecomplainQueryResponseModel**

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

