# AlipayEbppInvoiceMerchantEnterstatusApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayEbppInvoiceMerchantEnterstatusApi.md#query) | **GET** /v3/alipay/ebpp/invoice/merchant/enterstatus/query | 商户入驻流程状态查询 |


<a name="query"></a>
# **query**
> AlipayEbppInvoiceMerchantEnterstatusQueryResponseModel query(mShortName, productCode, processId)

商户入驻流程状态查询

提供给替商户批量入驻的服务商，主动查询入驻流程的状态。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceMerchantEnterstatusApi;

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

    AlipayEbppInvoiceMerchantEnterstatusApi apiInstance = new AlipayEbppInvoiceMerchantEnterstatusApi(defaultClient);
    String mShortName = "MYJF"; // String | 商户品牌简称，只能由大写字母、下划线、数字组成，且必须以大写字母开头。
    String productCode = "STANDARD_INVOICE"; // String | 商户门店入驻的产品码,STANDARD_INVOICE:扫码开票，INVOICE_RETURN:企业自建-发票回传，INVOICE_EXPENSE:发票报销，PAYMENT_OPEN:支付即开票，PAY_FEE_OPEN:缴费后开票。
    String processId = "1234567"; // String | 工单流水号（如果不填则默认查询最近一条工单）
    try {
      AlipayEbppInvoiceMerchantEnterstatusQueryResponseModel result = apiInstance.query(mShortName, productCode, processId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceMerchantEnterstatusApi#query");
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
| **mShortName** | **String**| 商户品牌简称，只能由大写字母、下划线、数字组成，且必须以大写字母开头。 | [optional] |
| **productCode** | **String**| 商户门店入驻的产品码,STANDARD_INVOICE:扫码开票，INVOICE_RETURN:企业自建-发票回传，INVOICE_EXPENSE:发票报销，PAYMENT_OPEN:支付即开票，PAY_FEE_OPEN:缴费后开票。 | [optional] |
| **processId** | **String**| 工单流水号（如果不填则默认查询最近一条工单） | [optional] |

### Return type

**AlipayEbppInvoiceMerchantEnterstatusQueryResponseModel**

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

