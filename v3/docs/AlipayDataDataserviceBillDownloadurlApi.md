# AlipayDataDataserviceBillDownloadurlApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayDataDataserviceBillDownloadurlApi.md#query) | **GET** /v3/alipay/data/dataservice/bill/downloadurl/query | 查询对账单下载地址 |


<a name="query"></a>
# **query**
> AlipayDataDataserviceBillDownloadurlQueryResponseModel query(billType, billDate, smid)

查询对账单下载地址

为方便商户快速查账，支持商户通过本接口获取商户离线账单下载地址

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayDataDataserviceBillDownloadurlApi;

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

    AlipayDataDataserviceBillDownloadurlApi apiInstance = new AlipayDataDataserviceBillDownloadurlApi(defaultClient);
    String billType = "trade"; // String | 账单类型，商户通过接口或商户经开放平台授权后其所属服务商通过接口可以获取以下账单类型。
    String billDate = "2025-05-01"; // String | 账单时间： <p> * 日账单格式为yyyy-MM-dd，最早可下载近6年的日账单。不支持下载当日账单，只能下载前一日24点前的账单数据（T+1），当日数据一般于次日 9 点前生成，特殊情况可能延迟。</p> <p> * 月账单格式为yyyy-MM，最早可下载近6年的月账单。不支持下载当月账单，只能下载上一月账单数据，当月账单一般在次月 3 日生成，特殊情况可能延迟。</p> <p> * 当biz_type为settlementMerge时候，时间为汇总批次结算资金到账的日期，日期格式为yyyy-MM-dd，最早可下载<u>2023年4月17日</u>及以后的账单。</p> <p> * 接口调用仅支持下载近6年的账单，更多账单请前往 b.alipay.com 对账中心-账单下载页下载。</p>
    String smid = "2088123412341234"; // String | 二级商户smid，这个参数只在bill_type是trade_zft_merchant时才能使用
    try {
      AlipayDataDataserviceBillDownloadurlQueryResponseModel result = apiInstance.query(billType, billDate, smid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayDataDataserviceBillDownloadurlApi#query");
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
| **billType** | **String**| 账单类型，商户通过接口或商户经开放平台授权后其所属服务商通过接口可以获取以下账单类型。 | [optional] |
| **billDate** | **String**| 账单时间： &lt;p&gt; * 日账单格式为yyyy-MM-dd，最早可下载近6年的日账单。不支持下载当日账单，只能下载前一日24点前的账单数据（T+1），当日数据一般于次日 9 点前生成，特殊情况可能延迟。&lt;/p&gt; &lt;p&gt; * 月账单格式为yyyy-MM，最早可下载近6年的月账单。不支持下载当月账单，只能下载上一月账单数据，当月账单一般在次月 3 日生成，特殊情况可能延迟。&lt;/p&gt; &lt;p&gt; * 当biz_type为settlementMerge时候，时间为汇总批次结算资金到账的日期，日期格式为yyyy-MM-dd，最早可下载&lt;u&gt;2023年4月17日&lt;/u&gt;及以后的账单。&lt;/p&gt; &lt;p&gt; * 接口调用仅支持下载近6年的账单，更多账单请前往 b.alipay.com 对账中心-账单下载页下载。&lt;/p&gt; | [optional] |
| **smid** | **String**| 二级商户smid，这个参数只在bill_type是trade_zft_merchant时才能使用 | [optional] |

### Return type

**AlipayDataDataserviceBillDownloadurlQueryResponseModel**

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

