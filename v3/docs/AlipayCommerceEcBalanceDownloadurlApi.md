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
    String enterpriseId = "100000000000001000921"; // String | 企业ID
    String accountId = "2088000295356628"; // String | 共同账户ID，没有企业ID可以用此ID查询
    String agreementNo = "20205820659822371223"; // String | 授权签约协议号，以共同账户ID查询时必传
    String billType = "enterprisetrade"; // String | 账单类型，商户通过接口或商户经开放平台授权后其所属服务商通过接口可以获取以下账单类型，支持： enterprisetrade：商户基于企业码交易收单的业务账单;
    String billDate = "2022-06-22"; // String | 账单时间： 日账单格式为yyyy-MM-dd，最早可下载2016年1月1日开始的日账单。不支持下载当日账单，只能下载前一日24点前的账单数据（T+1），当日数据一般于次日 9 点前生成，特殊情况可能延迟。 月账单格式为yyyy-MM，最早可下载2016年1月开始的月账单。不支持下载当月账单，只能下载上一月账单数据，当月账单一般在次月 3 日生成，特殊情况可能延迟。
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
| **accountId** | **String**| 共同账户ID，没有企业ID可以用此ID查询 | [optional] |
| **agreementNo** | **String**| 授权签约协议号，以共同账户ID查询时必传 | [optional] |
| **billType** | **String**| 账单类型，商户通过接口或商户经开放平台授权后其所属服务商通过接口可以获取以下账单类型，支持： enterprisetrade：商户基于企业码交易收单的业务账单; | [optional] |
| **billDate** | **String**| 账单时间： 日账单格式为yyyy-MM-dd，最早可下载2016年1月1日开始的日账单。不支持下载当日账单，只能下载前一日24点前的账单数据（T+1），当日数据一般于次日 9 点前生成，特殊情况可能延迟。 月账单格式为yyyy-MM，最早可下载2016年1月开始的月账单。不支持下载当月账单，只能下载上一月账单数据，当月账单一般在次月 3 日生成，特殊情况可能延迟。 | [optional] |

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

