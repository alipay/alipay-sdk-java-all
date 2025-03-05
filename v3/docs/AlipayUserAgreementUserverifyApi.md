# AlipayUserAgreementUserverifyApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apply**](AlipayUserAgreementUserverifyApi.md#apply) | **POST** /v3/alipay/user/agreement/userverify/apply | 协议用户一致性验证 |
| [**query**](AlipayUserAgreementUserverifyApi.md#query) | **GET** /v3/alipay/user/agreement/userverify/query | 用户协议鉴权查询结果 |


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

<a name="query"></a>
# **query**
> AlipayUserAgreementUserverifyQueryResponseModel query(agreementNo, applyToken)

用户协议鉴权查询结果

商户使用用户验证申请接口时，获取token，然后通过次接口回去验证状态

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
    String agreementNo = "20170502000610755993"; // String | 协议号
    String applyToken = "MDEDUCT0068292ca377d1d44b65fa24ec9cd89132f"; // String | 申请时获取的token
    try {
      AlipayUserAgreementUserverifyQueryResponseModel result = apiInstance.query(agreementNo, applyToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayUserAgreementUserverifyApi#query");
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
| **agreementNo** | **String**| 协议号 | [optional] |
| **applyToken** | **String**| 申请时获取的token | [optional] |

### Return type

**AlipayUserAgreementUserverifyQueryResponseModel**

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

