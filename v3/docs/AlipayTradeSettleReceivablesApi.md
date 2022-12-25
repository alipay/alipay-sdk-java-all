# AlipayTradeSettleReceivablesApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayTradeSettleReceivablesApi.md#query) | **POST** /v3/alipay/trade/settle/receivables/query | 待结算查询 |


<a name="query"></a>
# **query**
> AlipayTradeSettleReceivablesQueryResponseModel query(alipayTradeSettleReceivablesQueryModel)

待结算查询

对外提供待结算资金查询的能力。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeSettleReceivablesApi;

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

    AlipayTradeSettleReceivablesApi apiInstance = new AlipayTradeSettleReceivablesApi(defaultClient);
    AlipayTradeSettleReceivablesQueryModel alipayTradeSettleReceivablesQueryModel = new AlipayTradeSettleReceivablesQueryModel(); // AlipayTradeSettleReceivablesQueryModel | 
    try {
      AlipayTradeSettleReceivablesQueryResponseModel result = apiInstance.query(alipayTradeSettleReceivablesQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeSettleReceivablesApi#query");
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
| **alipayTradeSettleReceivablesQueryModel** | **AlipayTradeSettleReceivablesQueryModel**|  | [optional] |

### Return type

**AlipayTradeSettleReceivablesQueryResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

