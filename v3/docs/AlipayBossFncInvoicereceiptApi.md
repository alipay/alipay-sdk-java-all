# AlipayBossFncInvoicereceiptApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayBossFncInvoicereceiptApi.md#batchquery) | **POST** /v3/alipay/boss/fnc/invoicereceipt/batchquery | 根据月账单号集合和来源查询开票单据及金额汇总 |
| [**create**](AlipayBossFncInvoicereceiptApi.md#create) | **POST** /v3/alipay/boss/fnc/invoicereceipt/create | 账单变更同步接口月帐单创建消息同步 |


<a name="batchquery"></a>
# **batchquery**
> AlipayBossFncInvoicereceiptBatchqueryResponseModel batchquery(alipayBossFncInvoicereceiptBatchqueryModel)

根据月账单号集合和来源查询开票单据及金额汇总

根据月账单号集合和来源查询开票单据及金额汇总

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayBossFncInvoicereceiptApi;

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

    AlipayBossFncInvoicereceiptApi apiInstance = new AlipayBossFncInvoicereceiptApi(defaultClient);
    AlipayBossFncInvoicereceiptBatchqueryModel alipayBossFncInvoicereceiptBatchqueryModel = new AlipayBossFncInvoicereceiptBatchqueryModel(); // AlipayBossFncInvoicereceiptBatchqueryModel | 
    try {
      AlipayBossFncInvoicereceiptBatchqueryResponseModel result = apiInstance.batchquery(alipayBossFncInvoicereceiptBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayBossFncInvoicereceiptApi#batchquery");
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
| **alipayBossFncInvoicereceiptBatchqueryModel** | **AlipayBossFncInvoicereceiptBatchqueryModel**|  | [optional] |

### Return type

**AlipayBossFncInvoicereceiptBatchqueryResponseModel**

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
> Object create(alipayBossFncInvoicereceiptCreateModel)

账单变更同步接口月帐单创建消息同步

月帐单创建消息同步

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayBossFncInvoicereceiptApi;

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

    AlipayBossFncInvoicereceiptApi apiInstance = new AlipayBossFncInvoicereceiptApi(defaultClient);
    AlipayBossFncInvoicereceiptCreateModel alipayBossFncInvoicereceiptCreateModel = new AlipayBossFncInvoicereceiptCreateModel(); // AlipayBossFncInvoicereceiptCreateModel | 
    try {
      Object result = apiInstance.create(alipayBossFncInvoicereceiptCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayBossFncInvoicereceiptApi#create");
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
| **alipayBossFncInvoicereceiptCreateModel** | **AlipayBossFncInvoicereceiptCreateModel**|  | [optional] |

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

