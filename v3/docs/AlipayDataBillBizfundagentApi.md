# AlipayDataBillBizfundagentApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayDataBillBizfundagentApi.md#query) | **GET** /v3/alipay/data/bill/bizfundagent/query | ISV代理商户资金业务账单查询 |


<a name="query"></a>
# **query**
> AlipayDataBillBizfundagentQueryResponseModel query(startTime, endTime, pageNo, pageSize, agreementNo, accountBookId)

ISV代理商户资金业务账单查询

用于ISV代理商户查询商户的资金业务账单

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayDataBillBizfundagentApi;

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

    AlipayDataBillBizfundagentApi apiInstance = new AlipayDataBillBizfundagentApi(defaultClient);
    String startTime = "2021-01-01 00:00:00"; // String | 账单查询时间范围 -- 起始时间
    String endTime = "2021-02-01 00:00:00"; // String | 账单查询时间范围 -- 结束范围。时间范围最大不超过31天。
    String pageNo = "1"; // String | 页码，从1开始
    String pageSize = "2000"; // String | 分页大小1000-2000，默认2000
    String agreementNo = "20205215001418078112"; // String | ISV与商户授权协议号
    String accountBookId = "20880123456789012"; // String | 记账本id，服务商在帮助商户开通时候获取的唯一身份号
    try {
      AlipayDataBillBizfundagentQueryResponseModel result = apiInstance.query(startTime, endTime, pageNo, pageSize, agreementNo, accountBookId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayDataBillBizfundagentApi#query");
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
| **startTime** | **String**| 账单查询时间范围 -- 起始时间 | [optional] |
| **endTime** | **String**| 账单查询时间范围 -- 结束范围。时间范围最大不超过31天。 | [optional] |
| **pageNo** | **String**| 页码，从1开始 | [optional] |
| **pageSize** | **String**| 分页大小1000-2000，默认2000 | [optional] |
| **agreementNo** | **String**| ISV与商户授权协议号 | [optional] |
| **accountBookId** | **String**| 记账本id，服务商在帮助商户开通时候获取的唯一身份号 | [optional] |

### Return type

**AlipayDataBillBizfundagentQueryResponseModel**

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

