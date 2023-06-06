# AlipayDataBillBailApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayDataBillBailApi.md#query) | **GET** /v3/alipay/data/bill/bail/query | 支付宝商家账户保证金查询 |


<a name="query"></a>
# **query**
> AlipayDataBillBailQueryResponseModel query(startTime, endTime, bailType, transLogId, bizOrigNo)

支付宝商家账户保证金查询

为支付宝商家提供支付宝账户保证金信息，供对账使用。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayDataBillBailApi;

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

    AlipayDataBillBailApi apiInstance = new AlipayDataBillBailApi(defaultClient);
    String startTime = "2019-01-01 00:00:00"; // String | 保证金流水创建时间的起始范围
    String endTime = "2019-01-02 00:00:00"; // String | 保证金流水创建时间的结束范围。与起始时间间隔不超过31天。查询结果为起始时间至结束时间的左闭右开区间
    String bailType = "TMALL_S_BAIL"; // String | 保证金类型，目前支持TMALL_S_BAIL-天猫保证金，TAOBAO_BAIL-淘宝保证金
    String transLogId = "20190101***"; // String | 保证金流水号。如果查询参数中指定流水号，则只查询流水号相关的记录
    String bizOrigNo = "1***"; // String | 业务基础订单号。如果查询参数中指定订单号，则只查询相关的记录
    try {
      AlipayDataBillBailQueryResponseModel result = apiInstance.query(startTime, endTime, bailType, transLogId, bizOrigNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayDataBillBailApi#query");
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
| **startTime** | **String**| 保证金流水创建时间的起始范围 | [optional] |
| **endTime** | **String**| 保证金流水创建时间的结束范围。与起始时间间隔不超过31天。查询结果为起始时间至结束时间的左闭右开区间 | [optional] |
| **bailType** | **String**| 保证金类型，目前支持TMALL_S_BAIL-天猫保证金，TAOBAO_BAIL-淘宝保证金 | [optional] |
| **transLogId** | **String**| 保证金流水号。如果查询参数中指定流水号，则只查询流水号相关的记录 | [optional] |
| **bizOrigNo** | **String**| 业务基础订单号。如果查询参数中指定订单号，则只查询相关的记录 | [optional] |

### Return type

**AlipayDataBillBailQueryResponseModel**

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

