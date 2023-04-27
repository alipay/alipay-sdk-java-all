# AlipayUserAgreementPermissionApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayUserAgreementPermissionApi.md#create) | **POST** /v3/alipay/user/agreement/permission/create | 支付宝协议支付许可创建、服务变更接口 |


<a name="create"></a>
# **create**
> AlipayUserAgreementPermissionCreateResponseModel create(alipayUserAgreementPermissionCreateModel)

支付宝协议支付许可创建、服务变更接口

支付宝协议支付许可创建接口、服务变更发送消息提醒接口

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayUserAgreementPermissionApi;

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

    AlipayUserAgreementPermissionApi apiInstance = new AlipayUserAgreementPermissionApi(defaultClient);
    AlipayUserAgreementPermissionCreateModel alipayUserAgreementPermissionCreateModel = new AlipayUserAgreementPermissionCreateModel(); // AlipayUserAgreementPermissionCreateModel | 
    try {
      AlipayUserAgreementPermissionCreateResponseModel result = apiInstance.create(alipayUserAgreementPermissionCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayUserAgreementPermissionApi#create");
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
| **alipayUserAgreementPermissionCreateModel** | **AlipayUserAgreementPermissionCreateModel**|  | [optional] |

### Return type

**AlipayUserAgreementPermissionCreateResponseModel**

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

