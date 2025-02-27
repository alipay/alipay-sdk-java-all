# AlipayUserAgreementUserverifyApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apply**](AlipayUserAgreementUserverifyApi.md#apply) | **POST** /v3/alipay/user/agreement/userverify/apply | 协议用户一致性验证 |


<a name="apply"></a>
# **apply**
> AlipayUserAgreementUserverifyApplyResponseModel apply(alipayUserAgreementUserverifyApplyModel)

协议用户一致性验证

验证协议对应的用户信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayUserAgreementUserverifyApi;

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

    AlipayUserAgreementUserverifyApi apiInstance = new AlipayUserAgreementUserverifyApi(defaultClient);
    AlipayUserAgreementUserverifyApplyModel alipayUserAgreementUserverifyApplyModel = new AlipayUserAgreementUserverifyApplyModel(); // AlipayUserAgreementUserverifyApplyModel | 
    try {
      AlipayUserAgreementUserverifyApplyResponseModel result = apiInstance.apply(alipayUserAgreementUserverifyApplyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayUserAgreementUserverifyApi#apply");
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
| **alipayUserAgreementUserverifyApplyModel** | **AlipayUserAgreementUserverifyApplyModel**|  | [optional] |

### Return type

**AlipayUserAgreementUserverifyApplyResponseModel**

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

