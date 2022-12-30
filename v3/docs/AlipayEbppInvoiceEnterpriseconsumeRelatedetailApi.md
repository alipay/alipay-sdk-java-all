# AlipayEbppInvoiceEnterpriseconsumeRelatedetailApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayEbppInvoiceEnterpriseconsumeRelatedetailApi.md#query) | **GET** /v3/alipay/ebpp/invoice/enterpriseconsume/relatedetail/query | 合花账单关联详情查询 |


<a name="query"></a>
# **query**
> AlipayEbppInvoiceEnterpriseconsumeRelatedetailQueryResponseModel query(accountId, agreementNo, voucherId)

合花账单关联详情查询

合花账单关联详情查询，通过凭证ID获取这个账单详细信息和关联的凭证详细信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceEnterpriseconsumeRelatedetailApi;

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

    AlipayEbppInvoiceEnterpriseconsumeRelatedetailApi apiInstance = new AlipayEbppInvoiceEnterpriseconsumeRelatedetailApi(defaultClient);
    String accountId = "2088123456789000"; // String | 企业ID
    String agreementNo = "20205820659822371223"; // String | 授权签约协议号
    String voucherId = "2020123100152601930000003650"; // String | 账单凭证ID
    try {
      AlipayEbppInvoiceEnterpriseconsumeRelatedetailQueryResponseModel result = apiInstance.query(accountId, agreementNo, voucherId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceEnterpriseconsumeRelatedetailApi#query");
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
| **accountId** | **String**| 企业ID | [optional] |
| **agreementNo** | **String**| 授权签约协议号 | [optional] |
| **voucherId** | **String**| 账单凭证ID | [optional] |

### Return type

**AlipayEbppInvoiceEnterpriseconsumeRelatedetailQueryResponseModel**

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

