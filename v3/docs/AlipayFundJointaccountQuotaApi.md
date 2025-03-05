# AlipayFundJointaccountQuotaApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayFundJointaccountQuotaApi.md#query) | **GET** /v3/alipay/fund/jointaccount/quota/query | 查询账户额度详情 |


<a name="query"></a>
# **query**
> AlipayFundJointaccountQuotaQueryResponseModel query(productCode, bizScene, accountId, memberId, memberOpenId, operateRole, agreementNo)

查询账户额度详情

查询账户额度详情

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundJointaccountQuotaApi;

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

    AlipayFundJointaccountQuotaApi apiInstance = new AlipayFundJointaccountQuotaApi(defaultClient);
    String productCode = "ENTERPRISE_PAY"; // String | 产品码
    String bizScene = "DEFAULT"; // String | 业务场景
    String accountId = "2088900976746215"; // String | 账户ID
    String memberId = "2088900976746215"; // String | 员工ID
    String memberOpenId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 员工的openid
    String operateRole = "CREATOR"; // String | 角色：创建方(CREATOR)、参与方(PARTICIPANT)
    String agreementNo = "208890097674621512312"; // String | 授权协议号
    try {
      AlipayFundJointaccountQuotaQueryResponseModel result = apiInstance.query(productCode, bizScene, accountId, memberId, memberOpenId, operateRole, agreementNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundJointaccountQuotaApi#query");
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
| **productCode** | **String**| 产品码 | [optional] |
| **bizScene** | **String**| 业务场景 | [optional] |
| **accountId** | **String**| 账户ID | [optional] |
| **memberId** | **String**| 员工ID | [optional] |
| **memberOpenId** | **String**| 员工的openid | [optional] |
| **operateRole** | **String**| 角色：创建方(CREATOR)、参与方(PARTICIPANT) | [optional] |
| **agreementNo** | **String**| 授权协议号 | [optional] |

### Return type

**AlipayFundJointaccountQuotaQueryResponseModel**

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

