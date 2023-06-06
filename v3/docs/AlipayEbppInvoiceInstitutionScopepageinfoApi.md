# AlipayEbppInvoiceInstitutionScopepageinfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayEbppInvoiceInstitutionScopepageinfoApi.md#query) | **GET** /v3/alipay/ebpp/invoice/institution/scopepageinfo/query | 分页查询制度下人员 |


<a name="query"></a>
# **query**
> AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel query(accountId, agreementNo, enterpriseId, institutionId, ownerType, pageNum, pageSize)

分页查询制度下人员

分页查询制度下适用范围列表

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceInstitutionScopepageinfoApi;

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

    AlipayEbppInvoiceInstitutionScopepageinfoApi apiInstance = new AlipayEbppInvoiceInstitutionScopepageinfoApi(defaultClient);
    String accountId = "2088000194958956"; // String | 企业共同账户id
    String agreementNo = "20215425001112341234"; // String | 授权签约协议号
    String enterpriseId = "2088000194958956"; // String | 企业id
    String institutionId = "2022071800152609780000004052"; // String | 制度id
    String ownerType = "PHONE"; // String | 适配id类型
    Integer pageNum = 10; // Integer | 页码
    Integer pageSize = 100; // Integer | 页大小
    try {
      AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel result = apiInstance.query(accountId, agreementNo, enterpriseId, institutionId, ownerType, pageNum, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceInstitutionScopepageinfoApi#query");
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
| **enterpriseId** | **String**| 企业id | [optional] |
| **institutionId** | **String**| 制度id | [optional] |
| **ownerType** | **String**| 适配id类型 | [optional] |
| **pageNum** | **Integer**| 页码 | [optional] |
| **pageSize** | **Integer**| 页大小 | [optional] |

### Return type

**AlipayEbppInvoiceInstitutionScopepageinfoQueryResponseModel**

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

