# AlipayFundUsertradeApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayFundUsertradeApi.md#batchquery) | **POST** /v3/alipay/fund/usertrade/batchquery | 用户交易数据查询 |


<a name="batchquery"></a>
# **batchquery**
> AlipayFundUsertradeBatchqueryResponseModel batchquery(authToken, alipayFundUsertradeBatchqueryModel)

用户交易数据查询

资金团队会监听指定门店相关的用户交易数据，并且，在用户授权后，开放该接口给到外部调用，查询用户近期内的交易数据。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundUsertradeApi;

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

    AlipayFundUsertradeApi apiInstance = new AlipayFundUsertradeApi(defaultClient);
    String authToken = "authToken_example"; // String | 用户授权令牌
    AlipayFundUsertradeBatchqueryModel alipayFundUsertradeBatchqueryModel = new AlipayFundUsertradeBatchqueryModel(); // AlipayFundUsertradeBatchqueryModel | 
    try {
      AlipayFundUsertradeBatchqueryResponseModel result = apiInstance.batchquery(authToken, alipayFundUsertradeBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundUsertradeApi#batchquery");
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
| **authToken** | **String**| 用户授权令牌 | [optional] |
| **alipayFundUsertradeBatchqueryModel** | **AlipayFundUsertradeBatchqueryModel**|  | [optional] |

### Return type

**AlipayFundUsertradeBatchqueryResponseModel**

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

