# AlipayCommerceEcBalanceDownloadurlApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayCommerceEcBalanceDownloadurlApi.md#query) | **GET** /v3/alipay/commerce/ec/balance/downloadurl/query | 对账单文件下载接口 |


<a name="query"></a>
# **query**
> AlipayCommerceEcBalanceDownloadurlQueryResponseModel query(enterpriseId, accountId, agreementNo, billType, billDate)

对账单文件下载接口

对账单文件下载接口

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcBalanceDownloadurlApi;

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

    AlipayCommerceEcBalanceDownloadurlApi apiInstance = new AlipayCommerceEcBalanceDownloadurlApi(defaultClient);
    String enterpriseId = "2088123456789000"; // String | 企业ID
    String accountId = "2088000295356628"; // String | 共同账户ID
    String agreementNo = "20205820659822371223"; // String | 授权签约协议号
    String billType = "enterprisetrade"; // String | 账单类型
    String billDate = "yyyy-MM-dd"; // String | 账单时间
    try {
      AlipayCommerceEcBalanceDownloadurlQueryResponseModel result = apiInstance.query(enterpriseId, accountId, agreementNo, billType, billDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcBalanceDownloadurlApi#query");
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
| **enterpriseId** | **String**| 企业ID | [optional] |
| **accountId** | **String**| 共同账户ID | [optional] |
| **agreementNo** | **String**| 授权签约协议号 | [optional] |
| **billType** | **String**| 账单类型 | [optional] |
| **billDate** | **String**| 账单时间 | [optional] |

### Return type

**AlipayCommerceEcBalanceDownloadurlQueryResponseModel**

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

