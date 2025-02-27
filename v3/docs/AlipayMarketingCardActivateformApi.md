# AlipayMarketingCardActivateformApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayMarketingCardActivateformApi.md#query) | **POST** /v3/alipay/marketing/card/activateform/query | 查询用户提交的会员卡表单信息 |


<a name="query"></a>
# **query**
> AlipayMarketingCardActivateformQueryResponseModel query(authToken, alipayMarketingCardActivateformQueryModel)

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
    AlipayMarketingCardActivateformQueryModel alipayMarketingCardActivateformQueryModel = new AlipayMarketingCardActivateformQueryModel(); // AlipayMarketingCardActivateformQueryModel | 
    try {
      AlipayMarketingCardActivateformQueryResponseModel result = apiInstance.query(authToken, alipayMarketingCardActivateformQueryModel);
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
| **alipayMarketingCardActivateformQueryModel** | **AlipayMarketingCardActivateformQueryModel**|  | [optional] |

### Return type

**AlipayMarketingCardActivateformQueryResponseModel**

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

