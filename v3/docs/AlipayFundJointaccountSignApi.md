# AlipayFundJointaccountSignApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayFundJointaccountSignApi.md#query) | **GET** /v3/alipay/fund/jointaccount/sign/query | 企业签约结果查询 |


<a name="query"></a>
# **query**
> AlipayFundJointaccountSignQueryResponseModel query(productCode, bizScene, outBizNo, accountId)

企业签约结果查询

通过外部订单号（out_biz_no）主动查询企业签约结果，可用于未收到签约结果通知的补偿操作

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundJointaccountSignApi;

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

    AlipayFundJointaccountSignApi apiInstance = new AlipayFundJointaccountSignApi(defaultClient);
    String productCode = "ENTERPRISE_PAY"; // String | 产品码，默认值 ENTERPRISE_PAY
    String bizScene = "ISV_ALIYUN"; // String | 场景码，联系支付宝分配
    String outBizNo = "123123132"; // String | 外部业务号，查询对应账户状态，优先级高于account_id
    String accountId = "208812312313213"; // String | 企业签约账户ID,用于外部商户已获取企业签约ID，查询账户状态
    try {
      AlipayFundJointaccountSignQueryResponseModel result = apiInstance.query(productCode, bizScene, outBizNo, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundJointaccountSignApi#query");
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
| **productCode** | **String**| 产品码，默认值 ENTERPRISE_PAY | [optional] |
| **bizScene** | **String**| 场景码，联系支付宝分配 | [optional] |
| **outBizNo** | **String**| 外部业务号，查询对应账户状态，优先级高于account_id | [optional] |
| **accountId** | **String**| 企业签约账户ID,用于外部商户已获取企业签约ID，查询账户状态 | [optional] |

### Return type

**AlipayFundJointaccountSignQueryResponseModel**

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

