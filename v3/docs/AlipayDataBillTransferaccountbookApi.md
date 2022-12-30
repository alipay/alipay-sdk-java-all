# AlipayDataBillTransferaccountbookApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayDataBillTransferaccountbookApi.md#query) | **GET** /v3/alipay/data/bill/transferaccountbook/query | 子账本充提转账单查询(incubating) |


<a name="query"></a>
# **query**
> AlipayDataBillTransferaccountbookQueryResponseModel query(startTime, endTime, type, agreementNo, storeNo, pageNo, pageSize)

子账本充提转账单查询(incubating)

子账本充提转账单查询（子账本业务定制接口）

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayDataBillTransferaccountbookApi;

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

    AlipayDataBillTransferaccountbookApi apiInstance = new AlipayDataBillTransferaccountbookApi(defaultClient);
    String startTime = "2019-01-01 00:00:00"; // String | 充值、转账、提现流水业务时间的起始范围
    String endTime = "2019-01-02 00:00:00"; // String | 充值、转账、提现流水业务时间的结束范围。与起始时间间隔不超过31天。查询结果为起始时间至结束时间的左闭右开区间
    String type = "TRANSFER"; // String | 转账类型：充值-DEPOSIT，提现-WITHDRAW，转账-TRANSFER。
    String agreementNo = "20205215001418078112"; // String | 协议号
    String storeNo = "2088000117463004"; // String | 子账本号，或者子账本名称。模糊查询
    String pageNo = "1"; // String | 分页号，从1开始
    String pageSize = "2000"; // String | 分页大小1000-2000，默认2000
    try {
      AlipayDataBillTransferaccountbookQueryResponseModel result = apiInstance.query(startTime, endTime, type, agreementNo, storeNo, pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayDataBillTransferaccountbookApi#query");
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
| **startTime** | **String**| 充值、转账、提现流水业务时间的起始范围 | [optional] |
| **endTime** | **String**| 充值、转账、提现流水业务时间的结束范围。与起始时间间隔不超过31天。查询结果为起始时间至结束时间的左闭右开区间 | [optional] |
| **type** | **String**| 转账类型：充值-DEPOSIT，提现-WITHDRAW，转账-TRANSFER。 | [optional] |
| **agreementNo** | **String**| 协议号 | [optional] |
| **storeNo** | **String**| 子账本号，或者子账本名称。模糊查询 | [optional] |
| **pageNo** | **String**| 分页号，从1开始 | [optional] |
| **pageSize** | **String**| 分页大小1000-2000，默认2000 | [optional] |

### Return type

**AlipayDataBillTransferaccountbookQueryResponseModel**

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

