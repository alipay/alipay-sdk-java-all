# AlipayEbppInvoiceExpensesceneMerchantApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayEbppInvoiceExpensesceneMerchantApi.md#query) | **GET** /v3/alipay/ebpp/invoice/expensescene/merchant/query | 查询企业可用商户信息 |


<a name="query"></a>
# **query**
> AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel query(accountId, agreementNo, enterpriseId, roleId, pid, shopId, expenseType, pageNum, pageSize)

查询企业可用商户信息

查询企业可用商户信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceExpensesceneMerchantApi;

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

    AlipayEbppInvoiceExpensesceneMerchantApi apiInstance = new AlipayEbppInvoiceExpensesceneMerchantApi(defaultClient);
    String accountId = "2088xxx"; // String | 共同账户ID
    String agreementNo = "2088xxx"; // String | 授权签约协议号
    String enterpriseId = "2088xxx"; // String | 企业ID
    String roleId = "2088xxx"; // String | 商户ID
    String pid = "2088xxx"; // String | 商户ID
    String shopId = "2088xxx"; // String | 门店ID
    String expenseType = "MEAL"; // String | 费用类型 MEAL - 工作餐
    Integer pageNum = 1; // Integer | 页码
    Integer pageSize = 20; // Integer | 每页行数（最大100）
    try {
      AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel result = apiInstance.query(accountId, agreementNo, enterpriseId, roleId, pid, shopId, expenseType, pageNum, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceExpensesceneMerchantApi#query");
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
| **accountId** | **String**| 共同账户ID | [optional] |
| **agreementNo** | **String**| 授权签约协议号 | [optional] |
| **enterpriseId** | **String**| 企业ID | [optional] |
| **roleId** | **String**| 商户ID | [optional] |
| **pid** | **String**| 商户ID | [optional] |
| **shopId** | **String**| 门店ID | [optional] |
| **expenseType** | **String**| 费用类型 MEAL - 工作餐 | [optional] |
| **pageNum** | **Integer**| 页码 | [optional] |
| **pageSize** | **Integer**| 每页行数（最大100） | [optional] |

### Return type

**AlipayEbppInvoiceExpensesceneMerchantQueryResponseModel**

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

