# AlipayEbppInvoiceExpenserulesEmployeeApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayEbppInvoiceExpenserulesEmployeeApi.md#query) | **GET** /v3/alipay/ebpp/invoice/expenserules/employee/query | 查询费控规则员工 |


<a name="query"></a>
# **query**
> AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel query(accountId, agreementNo, enterpriseId, standardId, pageNum, pageSize)

查询费控规则员工

查询费控规则员工

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceExpenserulesEmployeeApi;

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

    AlipayEbppInvoiceExpenserulesEmployeeApi apiInstance = new AlipayEbppInvoiceExpenserulesEmployeeApi(defaultClient);
    String accountId = "2088123456789000"; // String | 共同账号ID
    String agreementNo = "20205820659822371223"; // String | 授权签约协议号
    String enterpriseId = "2088000194958956"; // String | 企业码企业id
    String standardId = "2021081900152601000000000101"; // String | 费控规则ID
    Integer pageNum = 1; // Integer | 页数
    Integer pageSize = 20; // Integer | 页大小
    try {
      AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel result = apiInstance.query(accountId, agreementNo, enterpriseId, standardId, pageNum, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceExpenserulesEmployeeApi#query");
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
| **accountId** | **String**| 共同账号ID | [optional] |
| **agreementNo** | **String**| 授权签约协议号 | [optional] |
| **enterpriseId** | **String**| 企业码企业id | [optional] |
| **standardId** | **String**| 费控规则ID | [optional] |
| **pageNum** | **Integer**| 页数 | [optional] |
| **pageSize** | **Integer**| 页大小 | [optional] |

### Return type

**AlipayEbppInvoiceExpenserulesEmployeeQueryResponseModel**

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

