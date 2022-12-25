# AlipayFundTransToaccountApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**transfer**](AlipayFundTransToaccountApi.md#transfer) | **POST** /v3/alipay/fund/trans/toaccount/transfer | 单笔转账到支付宝账户接口 |


<a name="transfer"></a>
# **transfer**
> AlipayFundTransToaccountTransferResponseModel transfer(alipayFundTransToaccountTransferModel)

单笔转账到支付宝账户接口

单笔转账到支付宝账户接口是基于支付宝的资金处理能力，为了满足支付宝商家向其他支付宝账户转账的需求，针对有部分开发能力的商家，提供通过API接口完成支付宝账户间的转账的功能。 该接口适用行业较广，比如商家间的货款结算，商家给个人用户发放佣金等。（目前已对该接口能力做了升级，后续建议调用新接口alipay.fund.trans.uni.transfer）

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundTransToaccountApi;

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

    AlipayFundTransToaccountApi apiInstance = new AlipayFundTransToaccountApi(defaultClient);
    AlipayFundTransToaccountTransferModel alipayFundTransToaccountTransferModel = new AlipayFundTransToaccountTransferModel(); // AlipayFundTransToaccountTransferModel | 
    try {
      AlipayFundTransToaccountTransferResponseModel result = apiInstance.transfer(alipayFundTransToaccountTransferModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundTransToaccountApi#transfer");
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
| **alipayFundTransToaccountTransferModel** | **AlipayFundTransToaccountTransferModel**|  | [optional] |

### Return type

**AlipayFundTransToaccountTransferResponseModel**

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

