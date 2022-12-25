# AlipayTradeBatchSettleApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayTradeBatchSettleApi.md#query) | **POST** /v3/alipay/trade/batch/settle/query | 批量结算查询 |


<a name="query"></a>
# **query**
> AlipayTradeBatchSettleQueryResponseModel query(alipayTradeBatchSettleQueryModel)

批量结算查询

商户请求批量结算结果查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeBatchSettleApi;

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

    AlipayTradeBatchSettleApi apiInstance = new AlipayTradeBatchSettleApi(defaultClient);
    AlipayTradeBatchSettleQueryModel alipayTradeBatchSettleQueryModel = new AlipayTradeBatchSettleQueryModel(); // AlipayTradeBatchSettleQueryModel | 
    try {
      AlipayTradeBatchSettleQueryResponseModel result = apiInstance.query(alipayTradeBatchSettleQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeBatchSettleApi#query");
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
| **alipayTradeBatchSettleQueryModel** | **AlipayTradeBatchSettleQueryModel**|  | [optional] |

### Return type

**AlipayTradeBatchSettleQueryResponseModel**

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

