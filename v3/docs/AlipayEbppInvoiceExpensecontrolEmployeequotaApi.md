# AlipayEbppInvoiceExpensecontrolEmployeequotaApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayEbppInvoiceExpensecontrolEmployeequotaApi.md#create) | **POST** /v3/alipay/ebpp/invoice/expensecontrol/employeequota/create | 创建余额（特定场景） |


<a name="create"></a>
# **create**
> AlipayEbppInvoiceExpensecontrolEmployeequotaCreateResponseModel create(alipayEbppInvoiceExpensecontrolEmployeequotaCreateModel)

创建余额（特定场景）

创建余额，该接口开放给特定场景。如果需要使用，请联系技术支持。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceExpensecontrolEmployeequotaApi;

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

    AlipayEbppInvoiceExpensecontrolEmployeequotaApi apiInstance = new AlipayEbppInvoiceExpensecontrolEmployeequotaApi(defaultClient);
    AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel alipayEbppInvoiceExpensecontrolEmployeequotaCreateModel = new AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel(); // AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel | 
    try {
      AlipayEbppInvoiceExpensecontrolEmployeequotaCreateResponseModel result = apiInstance.create(alipayEbppInvoiceExpensecontrolEmployeequotaCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceExpensecontrolEmployeequotaApi#create");
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
| **alipayEbppInvoiceExpensecontrolEmployeequotaCreateModel** | **AlipayEbppInvoiceExpensecontrolEmployeequotaCreateModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceExpensecontrolEmployeequotaCreateResponseModel**

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

