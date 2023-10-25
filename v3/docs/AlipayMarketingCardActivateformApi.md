# AlipayMarketingCardActivateformApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayMarketingCardActivateformApi.md#query) | **GET** /v3/alipay/marketing/card/activateform/query | 查询用户提交的会员卡表单信息 |


<a name="query"></a>
# **query**
> AlipayMarketingCardActivateformQueryResponseModel query(authToken, bizType, templateId, requestId)

查询用户提交的会员卡表单信息

会员卡开卡场景下，用户确认领卡后，跳转到商户开卡处理页面，商户通过该接口查询用户表单信息。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingCardActivateformApi;

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

    AlipayMarketingCardActivateformApi apiInstance = new AlipayMarketingCardActivateformApi(defaultClient);
    String authToken = "authToken_example"; // String | 用户授权令牌
    String bizType = "MEMBER_CARD"; // String | 开放表单信息查询业务类型
    String templateId = "2071828288283883"; // String | 会员卡模板id。使用会员卡模板创建接口(alipay.marketing.card.template.create)返回的结果
    String requestId = "2017021929993993992839493394"; // String | 查询用户表单提交信息的请求id。  网页移动应用&小程序应用：与auth_code  一起通过alipay.marketing.card.activateurl.apply(获取会员卡领卡投放链接)接口callback地址回传。  注意：auth_code（用户授权码）用于换取用户授权令牌 accessToken，后续调用接口需传入accessToken。
    try {
      AlipayMarketingCardActivateformQueryResponseModel result = apiInstance.query(authToken, bizType, templateId, requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingCardActivateformApi#query");
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
| **bizType** | **String**| 开放表单信息查询业务类型 | [optional] |
| **templateId** | **String**| 会员卡模板id。使用会员卡模板创建接口(alipay.marketing.card.template.create)返回的结果 | [optional] |
| **requestId** | **String**| 查询用户表单提交信息的请求id。  网页移动应用&amp;小程序应用：与auth_code  一起通过alipay.marketing.card.activateurl.apply(获取会员卡领卡投放链接)接口callback地址回传。  注意：auth_code（用户授权码）用于换取用户授权令牌 accessToken，后续调用接口需传入accessToken。 | [optional] |

### Return type

**AlipayMarketingCardActivateformQueryResponseModel**

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

