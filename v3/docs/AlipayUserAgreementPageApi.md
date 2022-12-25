# AlipayUserAgreementPageApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sign**](AlipayUserAgreementPageApi.md#sign) | **POST** /v3/alipay/user/agreement/page/sign | 支付宝个人协议页面签约接口 |


<a name="sign"></a>
# **sign**
> AlipayUserAgreementPageSignResponseModel sign(alipayUserAgreementPageSignModel)

支付宝个人协议页面签约接口

支持用户在支付宝页面完成支付宝代扣协议的签约，目前只支持支付宝钱包H5页面场景。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayUserAgreementPageApi;

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

    AlipayUserAgreementPageApi apiInstance = new AlipayUserAgreementPageApi(defaultClient);
    AlipayUserAgreementPageSignModel alipayUserAgreementPageSignModel = new AlipayUserAgreementPageSignModel(); // AlipayUserAgreementPageSignModel | 
    try {
      AlipayUserAgreementPageSignResponseModel result = apiInstance.sign(alipayUserAgreementPageSignModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayUserAgreementPageApi#sign");
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
| **alipayUserAgreementPageSignModel** | **AlipayUserAgreementPageSignModel**|  | [optional] |

### Return type

**AlipayUserAgreementPageSignResponseModel**

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

