# AlipayDataBillTransferApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayDataBillTransferApi.md#query) | **GET** /v3/alipay/data/bill/transfer/query | 支付宝商家账户充值，转账，提现查询 |


<a name="query"></a>
# **query**
> AlipayDataBillTransferQueryResponseModel query(startTime, endTime, type, pageNo, pageSize)

支付宝商家账户充值，转账，提现查询

为支付宝商家提供支付宝账户充值，转账，提现信息，供对账使用。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayDataBillTransferApi;

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

    AlipayDataBillTransferApi apiInstance = new AlipayDataBillTransferApi(defaultClient);
    String startTime = "2019-01-01 00:00:00"; // String | 充值、转账、提现流水业务时间的起始范围
    String endTime = "2019-01-02 00:00:00"; // String | 充值、转账、提现流水业务时间的结束范围。与起始时间间隔不超过31天。查询结果为起始时间至结束时间的左闭右开区间
    String type = "DEPOSIT"; // String | 转账类型：充值-DEPOSIT，提现-WITHDRAW，转账-TRANSFER。
    String pageNo = "1"; // String | 分页号，从1开始
    String pageSize = "2000"; // String | 分页大小1000-2000，默认2000
    try {
      AlipayDataBillTransferQueryResponseModel result = apiInstance.query(startTime, endTime, type, pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayDataBillTransferApi#query");
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
| **pageNo** | **String**| 分页号，从1开始 | [optional] |
| **pageSize** | **String**| 分页大小1000-2000，默认2000 | [optional] |

### Return type

**AlipayDataBillTransferQueryResponseModel**

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

