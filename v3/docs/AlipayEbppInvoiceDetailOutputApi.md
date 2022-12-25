# AlipayEbppInvoiceDetailOutputApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayEbppInvoiceDetailOutputApi.md#query) | **POST** /v3/alipay/ebpp/invoice/detail/output/query | 获取发票详细信息 |


<a name="query"></a>
# **query**
> AlipayEbppInvoiceDetailOutputQueryResponseModel query(alipayEbppInvoiceDetailOutputQueryModel)

获取发票详细信息

根据发票代码，发票号码获取发票详细信息  查询权限要求：  发票属于当前isv报销单据进行状态（支持的状态有  EXPENSE_APPLY－用户已提交申请  EXPENSE_APPROVAL_PASS －报销审核通过  EXPENSE_FINISHED－报销完结）

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceDetailOutputApi;

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

    AlipayEbppInvoiceDetailOutputApi apiInstance = new AlipayEbppInvoiceDetailOutputApi(defaultClient);
    AlipayEbppInvoiceDetailOutputQueryModel alipayEbppInvoiceDetailOutputQueryModel = new AlipayEbppInvoiceDetailOutputQueryModel(); // AlipayEbppInvoiceDetailOutputQueryModel | 
    try {
      AlipayEbppInvoiceDetailOutputQueryResponseModel result = apiInstance.query(alipayEbppInvoiceDetailOutputQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceDetailOutputApi#query");
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
| **alipayEbppInvoiceDetailOutputQueryModel** | **AlipayEbppInvoiceDetailOutputQueryModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceDetailOutputQueryResponseModel**

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

