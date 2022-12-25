# AlipayEbppInvoiceFileOutputApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayEbppInvoiceFileOutputApi.md#query) | **GET** /v3/alipay/ebpp/invoice/file/output/query | 获取电子发票原文件 |


<a name="query"></a>
# **query**
> AlipayEbppInvoiceFileOutputQueryResponseModel query(userId, openId, invoiceCode, invoiceNo, scene, skipExpenseProgressSync)

获取电子发票原文件

根据发票代码，发票号码获取用户的普通增值税电子发票pdf文件  查询权限要求： 发票属于当前isv报销单据进行状态（支持的状态有 EXPENSE_APPLY－用户已提交申请 EXPENSE_APPROVAL_PASS －报销审核通过 EXPENSE_FINISHED－报销完结）

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceFileOutputApi;

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

    AlipayEbppInvoiceFileOutputApi apiInstance = new AlipayEbppInvoiceFileOutputApi(defaultClient);
    String userId = "2088550000000"; // String | 发票归属用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 发票归属用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
    String invoiceCode = "123"; // String | 发票代码  字段长度（10-12位）
    String invoiceNo = "111"; // String | 发票号码  字段长度（8-10位）
    String scene = "INVOICE_EXPENSE"; // String | 发票pdf文件下载应用场景。固定为 INVOICE_EXPENSE  表示发票报销。
    Boolean skipExpenseProgressSync = false; // Boolean | 是否跳过发票报销状态同步；当为true时，跳过报销状态同步校验。默认为false，需要先做报销状态同步
    try {
      AlipayEbppInvoiceFileOutputQueryResponseModel result = apiInstance.query(userId, openId, invoiceCode, invoiceNo, scene, skipExpenseProgressSync);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceFileOutputApi#query");
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
| **userId** | **String**| 发票归属用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。 | [optional] |
| **openId** | **String**| 发票归属用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。 | [optional] |
| **invoiceCode** | **String**| 发票代码  字段长度（10-12位） | [optional] |
| **invoiceNo** | **String**| 发票号码  字段长度（8-10位） | [optional] |
| **scene** | **String**| 发票pdf文件下载应用场景。固定为 INVOICE_EXPENSE  表示发票报销。 | [optional] |
| **skipExpenseProgressSync** | **Boolean**| 是否跳过发票报销状态同步；当为true时，跳过报销状态同步校验。默认为false，需要先做报销状态同步 | [optional] |

### Return type

**AlipayEbppInvoiceFileOutputQueryResponseModel**

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

