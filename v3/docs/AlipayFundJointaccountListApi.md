# AlipayFundJointaccountListApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayFundJointaccountListApi.md#query) | **GET** /v3/alipay/fund/jointaccount/list/query | 企业查询代付账户列表 |


<a name="query"></a>
# **query**
> AlipayFundJointaccountListQueryResponseModel query(productCode, bizScene, operateRole, agreementNo, identity, identityType)

企业查询代付账户列表

企业查询代付账户列表

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundJointaccountListApi;

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

    AlipayFundJointaccountListApi apiInstance = new AlipayFundJointaccountListApi(defaultClient);
    String productCode = "ENTERPRISE_PAY"; // String | 产品码
    String bizScene = "DEFAULT"; // String | 业务场景
    String operateRole = "CREATOR"; // String | 角色：创建方(CREATOR)、参与方(PARTICIPANT)
    String agreementNo = "208890097674621512231"; // String | 授权协议号
    String identity = "name@email.com"; // String | 员工账号：  identity_type是ALIPAY_USER_ID填支付宝会员ID（2088开头）；  是ALIPAY_LOGON_ID 填支付宝登录号
    String identityType = "ALIPAY_LOGON_ID"; // String | 账号类型，目前支持如下类型： 1、ALIPAY_USER_ID 支付宝的会员ID 2、ALIPAY_LOGON_ID：支付宝登录号，支持邮箱和手机号格式
    try {
      AlipayFundJointaccountListQueryResponseModel result = apiInstance.query(productCode, bizScene, operateRole, agreementNo, identity, identityType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundJointaccountListApi#query");
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
| **operateRole** | **String**| 角色：创建方(CREATOR)、参与方(PARTICIPANT) | [optional] |
| **agreementNo** | **String**| 授权协议号 | [optional] |
| **identity** | **String**| 员工账号：  identity_type是ALIPAY_USER_ID填支付宝会员ID（2088开头）；  是ALIPAY_LOGON_ID 填支付宝登录号 | [optional] |
| **identityType** | **String**| 账号类型，目前支持如下类型： 1、ALIPAY_USER_ID 支付宝的会员ID 2、ALIPAY_LOGON_ID：支付宝登录号，支持邮箱和手机号格式 | [optional] |

### Return type

**AlipayFundJointaccountListQueryResponseModel**

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

