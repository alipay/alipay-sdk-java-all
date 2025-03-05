# AlipayMarketingCardFormtemplateApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**set**](AlipayMarketingCardFormtemplateApi.md#set) | **POST** /v3/alipay/marketing/card/formtemplate/set | 会员卡开卡表单模板配置 |


<a name="set"></a>
# **set**
> Object set(alipayMarketingCardFormtemplateSetModel)

会员卡开卡表单模板配置

会员卡开卡、用户授权确认

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingCardFormtemplateApi;

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

    AlipayMarketingCardFormtemplateApi apiInstance = new AlipayMarketingCardFormtemplateApi(defaultClient);
    AlipayMarketingCardFormtemplateSetModel alipayMarketingCardFormtemplateSetModel = new AlipayMarketingCardFormtemplateSetModel(); // AlipayMarketingCardFormtemplateSetModel | 
    try {
      Object result = apiInstance.set(alipayMarketingCardFormtemplateSetModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingCardFormtemplateApi#set");
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
| **alipayMarketingCardFormtemplateSetModel** | **AlipayMarketingCardFormtemplateSetModel**|  | [optional] |

### Return type

**Object**

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

