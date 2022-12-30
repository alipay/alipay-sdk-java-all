# AlipayFundJointaccountTradeApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayFundJointaccountTradeApi.md#query) | **GET** /v3/alipay/fund/jointaccount/trade/query | 共同账户交易查询 |


<a name="query"></a>
# **query**
> AlipayFundJointaccountTradeQueryResponseModel query(productCode, bizScene, memberId, accountId, agreementNo, tradeNo, platformOrderId)

共同账户交易查询

共同账户交易查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundJointaccountTradeApi;

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

    AlipayFundJointaccountTradeApi apiInstance = new AlipayFundJointaccountTradeApi(defaultClient);
    String productCode = "ENTERPRISE_PAY"; // String | 销售产品码
    String bizScene = "ELE_ONLINE"; // String | 业务场景
    String memberId = "208811123123"; // String | 成员ID，消费发起人
    String accountId = "208811123123"; // String | 企业账户ID
    String agreementNo = "12312312313123"; // String | 三方授权协议号
    String tradeNo = "12312313123"; // String | 支付宝交易订单号
    String platformOrderId = "781773393333012410369282"; // String | 外部平台订单号。使用该参数查询时，返回结果见trade_info_list
    try {
      AlipayFundJointaccountTradeQueryResponseModel result = apiInstance.query(productCode, bizScene, memberId, accountId, agreementNo, tradeNo, platformOrderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundJointaccountTradeApi#query");
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
| **productCode** | **String**| 销售产品码 | [optional] |
| **bizScene** | **String**| 业务场景 | [optional] |
| **memberId** | **String**| 成员ID，消费发起人 | [optional] |
| **accountId** | **String**| 企业账户ID | [optional] |
| **agreementNo** | **String**| 三方授权协议号 | [optional] |
| **tradeNo** | **String**| 支付宝交易订单号 | [optional] |
| **platformOrderId** | **String**| 外部平台订单号。使用该参数查询时，返回结果见trade_info_list | [optional] |

### Return type

**AlipayFundJointaccountTradeQueryResponseModel**

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

