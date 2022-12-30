# AlipayEbppInvoiceExpensecontrolIssuebatchApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancel**](AlipayEbppInvoiceExpensecontrolIssuebatchApi.md#cancel) | **POST** /v3/alipay/ebpp/invoice/expensecontrol/issuebatch/cancel | 作废额度发放 |
| [**create**](AlipayEbppInvoiceExpensecontrolIssuebatchApi.md#create) | **POST** /v3/alipay/ebpp/invoice/expensecontrol/issuebatch/create | 手动发放额度接口 |


<a name="cancel"></a>
# **cancel**
> AlipayEbppInvoiceExpensecontrolIssuebatchCancelResponseModel cancel(alipayEbppInvoiceExpensecontrolIssuebatchCancelModel)

作废额度发放

通过发放批次id，作废当前批次下发放的额度

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceExpensecontrolIssuebatchApi;

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

    AlipayEbppInvoiceExpensecontrolIssuebatchApi apiInstance = new AlipayEbppInvoiceExpensecontrolIssuebatchApi(defaultClient);
    AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel alipayEbppInvoiceExpensecontrolIssuebatchCancelModel = new AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel(); // AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel | 
    try {
      AlipayEbppInvoiceExpensecontrolIssuebatchCancelResponseModel result = apiInstance.cancel(alipayEbppInvoiceExpensecontrolIssuebatchCancelModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceExpensecontrolIssuebatchApi#cancel");
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
| **alipayEbppInvoiceExpensecontrolIssuebatchCancelModel** | **AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceExpensecontrolIssuebatchCancelResponseModel**

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
> AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel create(alipayEbppInvoiceExpensecontrolIssuebatchCreateModel)

手动发放额度接口

通过该接口对企业下的员工进行批量的额度发放。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceExpensecontrolIssuebatchApi;

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

    AlipayEbppInvoiceExpensecontrolIssuebatchApi apiInstance = new AlipayEbppInvoiceExpensecontrolIssuebatchApi(defaultClient);
    AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel alipayEbppInvoiceExpensecontrolIssuebatchCreateModel = new AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel(); // AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel | 
    try {
      AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel result = apiInstance.create(alipayEbppInvoiceExpensecontrolIssuebatchCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceExpensecontrolIssuebatchApi#create");
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
| **alipayEbppInvoiceExpensecontrolIssuebatchCreateModel** | **AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceExpensecontrolIssuebatchCreateResponseModel**

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

