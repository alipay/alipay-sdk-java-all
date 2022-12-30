# AlipayEbppInvoiceExpenserulesEmployeerulesApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayEbppInvoiceExpenserulesEmployeerulesApi.md#query) | **GET** /v3/alipay/ebpp/invoice/expenserules/employeerules/query | 查询员工绑定的所有费控规则 |


<a name="query"></a>
# **query**
> AlipayEbppInvoiceExpenserulesEmployeerulesQueryResponseModel query(accountId, agreementNo, employeeId, employeeOpenId, pageNum, pageSize)

查询员工绑定的所有费控规则

分页查询指定员工绑定的所有费控规则，默认返回所有有效和无效规则，查询结果按费控规则的创建时间倒序

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceExpenserulesEmployeerulesApi;

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

    AlipayEbppInvoiceExpenserulesEmployeerulesApi apiInstance = new AlipayEbppInvoiceExpenserulesEmployeerulesApi(defaultClient);
    String accountId = "208800019495xxxx"; // String | 企业ID
    String agreementNo = "2021542500111234xxxx"; // String | 授权签约协议号
    String employeeId = "208852286537xxxx"; // String | 未切换open_id时使用此字段：员工ID
    String employeeOpenId = "abcdxxxx"; // String | 切换open_id后使用此字段：员工的open_id
    Integer pageNum = 1; // Integer | 页码，默认值为1
    Integer pageSize = 20; // Integer | 每页行数，默认值为20
    try {
      AlipayEbppInvoiceExpenserulesEmployeerulesQueryResponseModel result = apiInstance.query(accountId, agreementNo, employeeId, employeeOpenId, pageNum, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceExpenserulesEmployeerulesApi#query");
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
| **employeeId** | **String**| 未切换open_id时使用此字段：员工ID | [optional] |
| **employeeOpenId** | **String**| 切换open_id后使用此字段：员工的open_id | [optional] |
| **pageNum** | **Integer**| 页码，默认值为1 | [optional] |
| **pageSize** | **Integer**| 每页行数，默认值为20 | [optional] |

### Return type

**AlipayEbppInvoiceExpenserulesEmployeerulesQueryResponseModel**

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

