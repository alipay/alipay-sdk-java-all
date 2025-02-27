# AlipayEbppInvoiceInstitutionPageinfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayEbppInvoiceInstitutionPageinfoApi.md#query) | **GET** /v3/alipay/ebpp/invoice/institution/pageinfo/query | 费控制度分页查询 |


<a name="query"></a>
# **query**
> AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel query(accountId, agreementNo, enterpriseId, pageNum, pageSize)

费控制度分页查询

制度分页查询，返回制度基本信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceInstitutionPageinfoApi;

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

    AlipayEbppInvoiceInstitutionPageinfoApi apiInstance = new AlipayEbppInvoiceInstitutionPageinfoApi(defaultClient);
    String accountId = "2088000194958956"; // String | 企业共同账户id
    String agreementNo = "20215425001112341234"; // String | 授权签约协议号
    String enterpriseId = "2088000194958956"; // String | 企业ID
    Integer pageNum = 10; // Integer | 页码
    Integer pageSize = 100; // Integer | 页大小
    try {
      AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel result = apiInstance.query(accountId, agreementNo, enterpriseId, pageNum, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceInstitutionPageinfoApi#query");
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
| **accountId** | **String**| 企业共同账户id | [optional] |
| **agreementNo** | **String**| 授权签约协议号 | [optional] |
| **enterpriseId** | **String**| 企业ID | [optional] |
| **pageNum** | **Integer**| 页码 | [optional] |
| **pageSize** | **Integer**| 页大小 | [optional] |

### Return type

**AlipayEbppInvoiceInstitutionPageinfoQueryResponseModel**

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

