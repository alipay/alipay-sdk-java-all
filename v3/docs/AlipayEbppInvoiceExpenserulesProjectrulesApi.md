# AlipayEbppInvoiceExpenserulesProjectrulesApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modify**](AlipayEbppInvoiceExpenserulesProjectrulesApi.md#modify) | **POST** /v3/alipay/ebpp/invoice/expenserules/projectrules/modify | 修改项目费控规则 |


<a name="modify"></a>
# **modify**
> AlipayEbppInvoiceExpenserulesProjectrulesModifyResponseModel modify(alipayEbppInvoiceExpenserulesProjectrulesModifyModel)

修改项目费控规则

企业在ISV修改在企业码中创建的项目规则

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceExpenserulesProjectrulesApi;

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

    AlipayEbppInvoiceExpenserulesProjectrulesApi apiInstance = new AlipayEbppInvoiceExpenserulesProjectrulesApi(defaultClient);
    AlipayEbppInvoiceExpenserulesProjectrulesModifyModel alipayEbppInvoiceExpenserulesProjectrulesModifyModel = new AlipayEbppInvoiceExpenserulesProjectrulesModifyModel(); // AlipayEbppInvoiceExpenserulesProjectrulesModifyModel | 
    try {
      AlipayEbppInvoiceExpenserulesProjectrulesModifyResponseModel result = apiInstance.modify(alipayEbppInvoiceExpenserulesProjectrulesModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceExpenserulesProjectrulesApi#modify");
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
| **alipayEbppInvoiceExpenserulesProjectrulesModifyModel** | **AlipayEbppInvoiceExpenserulesProjectrulesModifyModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceExpenserulesProjectrulesModifyResponseModel**

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

