# AlipayEbppInvoiceExpensecontrolQuotaApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayEbppInvoiceExpensecontrolQuotaApi.md#create) | **POST** /v3/alipay/ebpp/invoice/expensecontrol/quota/create | 创建余额/点券 |
| [**modify**](AlipayEbppInvoiceExpensecontrolQuotaApi.md#modify) | **POST** /v3/alipay/ebpp/invoice/expensecontrol/quota/modify | 修改余额/点券 |
| [**query**](AlipayEbppInvoiceExpensecontrolQuotaApi.md#query) | **POST** /v3/alipay/ebpp/invoice/expensecontrol/quota/query | 查询余额/点券 |


<a name="create"></a>
# **create**
> AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel create(alipayEbppInvoiceExpensecontrolQuotaCreateModel)

创建余额/点券

创建余额或者点券

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceExpensecontrolQuotaApi;

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

    AlipayEbppInvoiceExpensecontrolQuotaApi apiInstance = new AlipayEbppInvoiceExpensecontrolQuotaApi(defaultClient);
    AlipayEbppInvoiceExpensecontrolQuotaCreateModel alipayEbppInvoiceExpensecontrolQuotaCreateModel = new AlipayEbppInvoiceExpensecontrolQuotaCreateModel(); // AlipayEbppInvoiceExpensecontrolQuotaCreateModel | 
    try {
      AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel result = apiInstance.create(alipayEbppInvoiceExpensecontrolQuotaCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceExpensecontrolQuotaApi#create");
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
| **alipayEbppInvoiceExpensecontrolQuotaCreateModel** | **AlipayEbppInvoiceExpensecontrolQuotaCreateModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceExpensecontrolQuotaCreateResponseModel**

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
> AlipayEbppInvoiceExpensecontrolQuotaModifyResponseModel modify(alipayEbppInvoiceExpensecontrolQuotaModifyModel)

修改余额/点券

修改余额或点券对应的额度，可用于增加额度、减少额度、删除额度等操作。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceExpensecontrolQuotaApi;

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

    AlipayEbppInvoiceExpensecontrolQuotaApi apiInstance = new AlipayEbppInvoiceExpensecontrolQuotaApi(defaultClient);
    AlipayEbppInvoiceExpensecontrolQuotaModifyModel alipayEbppInvoiceExpensecontrolQuotaModifyModel = new AlipayEbppInvoiceExpensecontrolQuotaModifyModel(); // AlipayEbppInvoiceExpensecontrolQuotaModifyModel | 
    try {
      AlipayEbppInvoiceExpensecontrolQuotaModifyResponseModel result = apiInstance.modify(alipayEbppInvoiceExpensecontrolQuotaModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceExpensecontrolQuotaApi#modify");
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
| **alipayEbppInvoiceExpensecontrolQuotaModifyModel** | **AlipayEbppInvoiceExpensecontrolQuotaModifyModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceExpensecontrolQuotaModifyResponseModel**

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
> AlipayEbppInvoiceExpensecontrolQuotaQueryResponseModel query(alipayEbppInvoiceExpensecontrolQuotaQueryModel)

查询余额/点券

查询余额或者点券

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceExpensecontrolQuotaApi;

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

    AlipayEbppInvoiceExpensecontrolQuotaApi apiInstance = new AlipayEbppInvoiceExpensecontrolQuotaApi(defaultClient);
    AlipayEbppInvoiceExpensecontrolQuotaQueryModel alipayEbppInvoiceExpensecontrolQuotaQueryModel = new AlipayEbppInvoiceExpensecontrolQuotaQueryModel(); // AlipayEbppInvoiceExpensecontrolQuotaQueryModel | 
    try {
      AlipayEbppInvoiceExpensecontrolQuotaQueryResponseModel result = apiInstance.query(alipayEbppInvoiceExpensecontrolQuotaQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceExpensecontrolQuotaApi#query");
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
| **alipayEbppInvoiceExpensecontrolQuotaQueryModel** | **AlipayEbppInvoiceExpensecontrolQuotaQueryModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceExpensecontrolQuotaQueryResponseModel**

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

