# AlipayDataBillBalanceApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayDataBillBalanceApi.md#query) | **GET** /v3/alipay/data/bill/balance/query | 支付宝商家账户当前余额查询 |


<a name="query"></a>
# **query**
> AlipayDataBillBalanceQueryResponseModel query(billUserId)

支付宝商家账户当前余额查询

为支付宝商家提供支付宝账户当前余额信息，包括冻结金额，可用余额和总额，供对账使用。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayDataBillBalanceApi;

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

    AlipayDataBillBalanceApi apiInstance = new AlipayDataBillBalanceApi(defaultClient);
    String billUserId = "2088123456789012"; // String | 目标查询账户（仅支持部分场景，查询自身时候不需要传递当前字段）。
    try {
      AlipayDataBillBalanceQueryResponseModel result = apiInstance.query(billUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayDataBillBalanceApi#query");
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
| **billUserId** | **String**| 目标查询账户（仅支持部分场景，查询自身时候不需要传递当前字段）。 | [optional] |

### Return type

**AlipayDataBillBalanceQueryResponseModel**

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

