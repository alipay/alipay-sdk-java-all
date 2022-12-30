# AlipayBossFncInvoiceApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apply**](AlipayBossFncInvoiceApi.md#apply) | **POST** /v3/alipay/boss/fnc/invoice/apply | 应收开票申请(根据账单申请) |
| [**batchquery**](AlipayBossFncInvoiceApi.md#batchquery) | **POST** /v3/alipay/boss/fnc/invoice/batchquery | 应收发票综合查询 |
| [**query**](AlipayBossFncInvoiceApi.md#query) | **GET** /v3/alipay/boss/fnc/invoice/query | 根据发票ID查询发票信息 |


<a name="apply"></a>
# **apply**
> AlipayBossFncInvoiceApplyResponseModel apply(alipayBossFncInvoiceApplyModel)

应收开票申请(根据账单申请)

根据账单申请应收发票开票

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayBossFncInvoiceApi;

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

    AlipayBossFncInvoiceApi apiInstance = new AlipayBossFncInvoiceApi(defaultClient);
    AlipayBossFncInvoiceApplyModel alipayBossFncInvoiceApplyModel = new AlipayBossFncInvoiceApplyModel(); // AlipayBossFncInvoiceApplyModel | 
    try {
      AlipayBossFncInvoiceApplyResponseModel result = apiInstance.apply(alipayBossFncInvoiceApplyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayBossFncInvoiceApi#apply");
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
| **alipayBossFncInvoiceApplyModel** | **AlipayBossFncInvoiceApplyModel**|  | [optional] |

### Return type

**AlipayBossFncInvoiceApplyResponseModel**

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

<a name="batchquery"></a>
# **batchquery**
> AlipayBossFncInvoiceBatchqueryResponseModel batchquery(alipayBossFncInvoiceBatchqueryModel)

应收发票综合查询

根据综合查询条件查询对应发票信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayBossFncInvoiceApi;

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

    AlipayBossFncInvoiceApi apiInstance = new AlipayBossFncInvoiceApi(defaultClient);
    AlipayBossFncInvoiceBatchqueryModel alipayBossFncInvoiceBatchqueryModel = new AlipayBossFncInvoiceBatchqueryModel(); // AlipayBossFncInvoiceBatchqueryModel | 
    try {
      AlipayBossFncInvoiceBatchqueryResponseModel result = apiInstance.batchquery(alipayBossFncInvoiceBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayBossFncInvoiceApi#batchquery");
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
| **alipayBossFncInvoiceBatchqueryModel** | **AlipayBossFncInvoiceBatchqueryModel**|  | [optional] |

### Return type

**AlipayBossFncInvoiceBatchqueryResponseModel**

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
> AlipayBossFncInvoiceQueryResponseModel query(invoiceId)

根据发票ID查询发票信息

根据发票综合查询接口（alipay.boss.fnc.invoice.batchquery）查询到发票列表后，再根据每个发票对应的发票id查询发票的详细信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayBossFncInvoiceApi;

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

    AlipayBossFncInvoiceApi apiInstance = new AlipayBossFncInvoiceApi(defaultClient);
    String invoiceId = "如：2017060210122000040400270002815483"; // String | 查询ID：用于标示一张发票，通过发票综合查询可以查询到该ID。
    try {
      AlipayBossFncInvoiceQueryResponseModel result = apiInstance.query(invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayBossFncInvoiceApi#query");
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
| **invoiceId** | **String**| 查询ID：用于标示一张发票，通过发票综合查询可以查询到该ID。 | [optional] |

### Return type

**AlipayBossFncInvoiceQueryResponseModel**

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

