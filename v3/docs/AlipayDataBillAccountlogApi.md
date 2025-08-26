# AlipayDataBillAccountlogApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayDataBillAccountlogApi.md#query) | **GET** /v3/alipay/data/bill/accountlog/query | 支付宝商家账户账务明细查询 |


<a name="query"></a>
# **query**
> AlipayDataBillAccountlogQueryResponseModel query(startTime, endTime, alipayOrderNo, merchantOrderNo, pageNo, pageSize, transCode, agreementNo, agreementProductCode, billUserId, openId)

支付宝商家账户账务明细查询

为支付宝商家提供支付宝账户的账务流水信息，供对账使用。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayDataBillAccountlogApi;

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

    AlipayDataBillAccountlogApi apiInstance = new AlipayDataBillAccountlogApi(defaultClient);
    String startTime = "2019-01-01 00:00:00"; // String | 账务流水创建时间的起始范围。只能查询一年内的记录。精确查询不需要指定
    String endTime = "2019-01-02 00:00:00"; // String | 账务流水创建时间的结束范围。与起始时间间隔不超过31天。查询结果为起始时间至结束时间的左闭右开区间。精确查询不需要指定
    String alipayOrderNo = "20190101***"; // String | 支付宝订单号，通过支付宝订单号精确查询相关的流水明细，商户订单号与支付宝订单号互斥
    String merchantOrderNo = "TX***"; // String | 商户订单号，通过商户订单号精确查询相关的流水明细，商户订单号与支付宝订单号互斥
    String pageNo = "1"; // String | 分页号，从1开始
    String pageSize = "2000"; // String | 分页大小1000-2000，默认2000
    String transCode = "101101,301101"; // String | 账务的类型代码，特殊场景下使用
    String agreementNo = "20215606000635888888"; // String | 协议授权码，特殊场景下使用
    String agreementProductCode = "FUND_SIGN_WITHHOLDING"; // String | 协议产品码。特殊场景下使用
    String billUserId = "2088123456789012"; // String | 指定用户做账单查询
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 用于标记支付宝用户在应用下的唯一标识
    try {
      AlipayDataBillAccountlogQueryResponseModel result = apiInstance.query(startTime, endTime, alipayOrderNo, merchantOrderNo, pageNo, pageSize, transCode, agreementNo, agreementProductCode, billUserId, openId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayDataBillAccountlogApi#query");
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
| **startTime** | **String**| 账务流水创建时间的起始范围。只能查询一年内的记录。精确查询不需要指定 | [optional] |
| **endTime** | **String**| 账务流水创建时间的结束范围。与起始时间间隔不超过31天。查询结果为起始时间至结束时间的左闭右开区间。精确查询不需要指定 | [optional] |
| **alipayOrderNo** | **String**| 支付宝订单号，通过支付宝订单号精确查询相关的流水明细，商户订单号与支付宝订单号互斥 | [optional] |
| **merchantOrderNo** | **String**| 商户订单号，通过商户订单号精确查询相关的流水明细，商户订单号与支付宝订单号互斥 | [optional] |
| **pageNo** | **String**| 分页号，从1开始 | [optional] |
| **pageSize** | **String**| 分页大小1000-2000，默认2000 | [optional] |
| **transCode** | **String**| 账务的类型代码，特殊场景下使用 | [optional] |
| **agreementNo** | **String**| 协议授权码，特殊场景下使用 | [optional] |
| **agreementProductCode** | **String**| 协议产品码。特殊场景下使用 | [optional] |
| **billUserId** | **String**| 指定用户做账单查询 | [optional] |
| **openId** | **String**| 用于标记支付宝用户在应用下的唯一标识 | [optional] |

### Return type

**AlipayDataBillAccountlogQueryResponseModel**

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

