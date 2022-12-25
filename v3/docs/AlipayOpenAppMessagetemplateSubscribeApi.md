# AlipayOpenAppMessagetemplateSubscribeApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenAppMessagetemplateSubscribeApi.md#query) | **POST** /v3/alipay/open/app/messagetemplate/subscribe/query | 模板订阅关系查询 |


<a name="query"></a>
# **query**
> AlipayOpenAppMessagetemplateSubscribeQueryResponseModel query(alipayOpenAppMessagetemplateSubscribeQueryModel)

模板订阅关系查询

商户使用该接口可以查询用户对其消息模板的订阅关系，可以根据是否订阅引导用户进行订阅和精准触达消息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenAppMessagetemplateSubscribeApi;

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

    AlipayOpenAppMessagetemplateSubscribeApi apiInstance = new AlipayOpenAppMessagetemplateSubscribeApi(defaultClient);
    AlipayOpenAppMessagetemplateSubscribeQueryModel alipayOpenAppMessagetemplateSubscribeQueryModel = new AlipayOpenAppMessagetemplateSubscribeQueryModel(); // AlipayOpenAppMessagetemplateSubscribeQueryModel | 
    try {
      AlipayOpenAppMessagetemplateSubscribeQueryResponseModel result = apiInstance.query(alipayOpenAppMessagetemplateSubscribeQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenAppMessagetemplateSubscribeApi#query");
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
| **alipayOpenAppMessagetemplateSubscribeQueryModel** | **AlipayOpenAppMessagetemplateSubscribeQueryModel**|  | [optional] |

### Return type

**AlipayOpenAppMessagetemplateSubscribeQueryResponseModel**

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

