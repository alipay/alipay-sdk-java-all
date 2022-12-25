# AlipayOpenAgentCommonsignApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**confirm**](AlipayOpenAgentCommonsignApi.md#confirm) | **POST** /v3/alipay/open/agent/commonsign/confirm | 代商户签约，提交信息确认接口 |


<a name="confirm"></a>
# **confirm**
> AlipayOpenAgentCommonsignConfirmResponseModel confirm(alipayOpenAgentCommonsignConfirmModel)

代商户签约，提交信息确认接口

三方应用代理签约产品，上传商户信息后，确认提交信息。可以配合开启事务接口使用。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenAgentCommonsignApi;

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

    AlipayOpenAgentCommonsignApi apiInstance = new AlipayOpenAgentCommonsignApi(defaultClient);
    AlipayOpenAgentCommonsignConfirmModel alipayOpenAgentCommonsignConfirmModel = new AlipayOpenAgentCommonsignConfirmModel(); // AlipayOpenAgentCommonsignConfirmModel | 
    try {
      AlipayOpenAgentCommonsignConfirmResponseModel result = apiInstance.confirm(alipayOpenAgentCommonsignConfirmModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenAgentCommonsignApi#confirm");
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
| **alipayOpenAgentCommonsignConfirmModel** | **AlipayOpenAgentCommonsignConfirmModel**|  | [optional] |

### Return type

**AlipayOpenAgentCommonsignConfirmResponseModel**

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

