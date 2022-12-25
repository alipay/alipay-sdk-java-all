# AlipayFundAccountApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayFundAccountApi.md#query) | **GET** /v3/alipay/fund/account/query | 支付宝资金账户资产查询接口 |


<a name="query"></a>
# **query**
> AlipayFundAccountQueryResponseModel query(merchantUserId, alipayUserId, alipayOpenId, accountProductCode, accountType, accountSceneCode, extInfo)

支付宝资金账户资产查询接口

可查询请求方的支付宝账户余额信息。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundAccountApi;

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

    AlipayFundAccountApi apiInstance = new AlipayFundAccountApi(defaultClient);
    String merchantUserId = "243893499"; // String | 商户会员的唯一标识。如果传入的user_id为虚拟账户userId，此字段必传并比对一致性。
    String alipayUserId = "2088301409188095"; // String | 支付宝会员 id。
    String alipayOpenId = "061P6NAblcWDWJoDRxSVvOYz-ufp-3wQaA4E_szQyMFTXse"; // String | 支付宝openId
    String accountProductCode = "DING_ACCOUNT"; // String | 开户产品码。如果查询托管子户余额，必传且必须传入与开户时传入的值一致。
    String accountType = "ACCTRANS_ACCOUNT"; // String | 查询的账号类型，查询余额账户值为ACCTRANS_ACCOUNT。必填。
    String accountSceneCode = "SCENE_000_000_000"; // String | 开户场景码，与开户产品码不可同时传递。
    String extInfo = "{\"agreement_no\":\"2019000000000\"}"; // String | JSON格式，传递业务扩展参数。
    try {
      AlipayFundAccountQueryResponseModel result = apiInstance.query(merchantUserId, alipayUserId, alipayOpenId, accountProductCode, accountType, accountSceneCode, extInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundAccountApi#query");
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
| **merchantUserId** | **String**| 商户会员的唯一标识。如果传入的user_id为虚拟账户userId，此字段必传并比对一致性。 | [optional] |
| **alipayUserId** | **String**| 支付宝会员 id。 | [optional] |
| **alipayOpenId** | **String**| 支付宝openId | [optional] |
| **accountProductCode** | **String**| 开户产品码。如果查询托管子户余额，必传且必须传入与开户时传入的值一致。 | [optional] |
| **accountType** | **String**| 查询的账号类型，查询余额账户值为ACCTRANS_ACCOUNT。必填。 | [optional] |
| **accountSceneCode** | **String**| 开户场景码，与开户产品码不可同时传递。 | [optional] |
| **extInfo** | **String**| JSON格式，传递业务扩展参数。 | [optional] |

### Return type

**AlipayFundAccountQueryResponseModel**

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

