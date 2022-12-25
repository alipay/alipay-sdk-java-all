# AlipayDataBillBuyApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayDataBillBuyApi.md#query) | **GET** /v3/alipay/data/bill/buy/query | 支付宝商家账户买入交易查询 |


<a name="query"></a>
# **query**
> AlipayDataBillBuyQueryResponseModel query(startTime, endTime, alipayOrderNo, merchantOrderNo, storeNo, pageNo, pageSize)

支付宝商家账户买入交易查询

为支付宝商家提供支付宝账户买入交易信息，供对账使用。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayDataBillBuyApi;

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

    AlipayDataBillBuyApi apiInstance = new AlipayDataBillBuyApi(defaultClient);
    String startTime = "2019-01-01 00:00:00"; // String | 交易流水创建时间的起始范围
    String endTime = "2019-01-02 00:00:00"; // String | 交易流水创建时间的结束范围。与起始时间间隔不超过31天。查询结果为起始时间至结束时间的左闭右开区间
    String alipayOrderNo = "20190101***"; // String | 支付宝交易流水号。如果查询参数中指定流水号，则只查询流水号相关的记录
    String merchantOrderNo = "TX***"; // String | 商户交易号。如果查询参数中指定交易号，则只查询相关的记录
    String storeNo = "门店1"; // String | 门店编号，模糊搜索
    String pageNo = "1"; // String | 分页号，从1开始
    String pageSize = "2000"; // String | 分页大小1000-2000，默认2000
    try {
      AlipayDataBillBuyQueryResponseModel result = apiInstance.query(startTime, endTime, alipayOrderNo, merchantOrderNo, storeNo, pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayDataBillBuyApi#query");
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
| **startTime** | **String**| 交易流水创建时间的起始范围 | [optional] |
| **endTime** | **String**| 交易流水创建时间的结束范围。与起始时间间隔不超过31天。查询结果为起始时间至结束时间的左闭右开区间 | [optional] |
| **alipayOrderNo** | **String**| 支付宝交易流水号。如果查询参数中指定流水号，则只查询流水号相关的记录 | [optional] |
| **merchantOrderNo** | **String**| 商户交易号。如果查询参数中指定交易号，则只查询相关的记录 | [optional] |
| **storeNo** | **String**| 门店编号，模糊搜索 | [optional] |
| **pageNo** | **String**| 分页号，从1开始 | [optional] |
| **pageSize** | **String**| 分页大小1000-2000，默认2000 | [optional] |

### Return type

**AlipayDataBillBuyQueryResponseModel**

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

