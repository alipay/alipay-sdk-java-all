# AlipayEbppInvoiceExpensecomsueOutsourceApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**notify**](AlipayEbppInvoiceExpensecomsueOutsourceApi.md#notify) | **POST** /v3/alipay/ebpp/invoice/expensecomsue/outsource/notify | 同步外部额度变更（交易形式） |


<a name="notify"></a>
# **notify**
> AlipayEbppInvoiceExpensecomsueOutsourceNotifyResponseModel notify(alipayEbppInvoiceExpensecomsueOutsourceNotifyModel)

同步外部额度变更（交易形式）

外部和企业码进行额度共管的时候，外部以交易的形式（支付、退款）将外部发生的额度变更同步给企业码

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceExpensecomsueOutsourceApi;

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

    AlipayEbppInvoiceExpensecomsueOutsourceApi apiInstance = new AlipayEbppInvoiceExpensecomsueOutsourceApi(defaultClient);
    AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel alipayEbppInvoiceExpensecomsueOutsourceNotifyModel = new AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel(); // AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel | 
    try {
      AlipayEbppInvoiceExpensecomsueOutsourceNotifyResponseModel result = apiInstance.notify(alipayEbppInvoiceExpensecomsueOutsourceNotifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceExpensecomsueOutsourceApi#notify");
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
| **alipayEbppInvoiceExpensecomsueOutsourceNotifyModel** | **AlipayEbppInvoiceExpensecomsueOutsourceNotifyModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceExpensecomsueOutsourceNotifyResponseModel**

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

