# AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailApi.md#query) | **GET** /v3/alipay/ebpp/invoice/enterpriseconsume/summaryinvoicedetail/query | 查询汇总发票详情 |


<a name="query"></a>
# **query**
> AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel query(accountId, agreementNo, summaryId)

查询汇总发票详情

根据汇总开票通知拿到的开票批次ID查询汇总发票详情

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailApi;

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

    AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailApi apiInstance = new AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailApi(defaultClient);
    String accountId = "2088000237836238"; // String | 企业 ID
    String agreementNo = "20205820659822371223"; // String | 授权签约协议号
    String summaryId = "2021080400152500230000000881"; // String | 开票批次 ID
    try {
      AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel result = apiInstance.query(accountId, agreementNo, summaryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailApi#query");
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
| **accountId** | **String**| 企业 ID | [optional] |
| **agreementNo** | **String**| 授权签约协议号 | [optional] |
| **summaryId** | **String**| 开票批次 ID | [optional] |

### Return type

**AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponseModel**

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

