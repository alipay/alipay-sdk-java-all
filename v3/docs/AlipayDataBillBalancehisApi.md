# AlipayDataBillBalancehisApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayDataBillBalancehisApi.md#query) | **GET** /v3/alipay/data/bill/balancehis/query | 支付宝商家账户历史余额查询 |


<a name="query"></a>
# **query**
> AlipayDataBillBalancehisQueryResponseModel query(bizDate, bizMonth)

支付宝商家账户历史余额查询

为支付宝商家提供支付宝账户历史余额信息，供对账使用。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayDataBillBalancehisApi;

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

    AlipayDataBillBalancehisApi apiInstance = new AlipayDataBillBalancehisApi(defaultClient);
    String bizDate = "2019-08-01"; // String | 查询指定自然日的起初余额和期末余额，biz_date与biz_month传入参数互斥
    String bizMonth = "2019-08"; // String | 查询指定自然月的起初余额和期末余额，biz_date与biz_month传入参数互斥
    try {
      AlipayDataBillBalancehisQueryResponseModel result = apiInstance.query(bizDate, bizMonth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayDataBillBalancehisApi#query");
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
| **bizDate** | **String**| 查询指定自然日的起初余额和期末余额，biz_date与biz_month传入参数互斥 | [optional] |
| **bizMonth** | **String**| 查询指定自然月的起初余额和期末余额，biz_date与biz_month传入参数互斥 | [optional] |

### Return type

**AlipayDataBillBalancehisQueryResponseModel**

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

