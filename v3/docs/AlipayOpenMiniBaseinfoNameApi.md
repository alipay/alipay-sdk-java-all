# AlipayOpenMiniBaseinfoNameApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**check**](AlipayOpenMiniBaseinfoNameApi.md#check) | **GET** /v3/alipay/open/mini/baseinfo/name/check | 小程序名称检测 |


<a name="check"></a>
# **check**
> AlipayOpenMiniBaseinfoNameCheckResponseModel check(appName)

小程序名称检测

小程序名称检测。包含小程序名称基础校验、名称重复、存在敏感信息、存在品牌词、名称宽泛等检测能力。若返回“check_code”：“NONE”，说明小程序名称未检测出异常。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniBaseinfoNameApi;

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

    AlipayOpenMiniBaseinfoNameApi apiInstance = new AlipayOpenMiniBaseinfoNameApi(defaultClient);
    String appName = "吱声小铺"; // String | 小程序名字，长度限制 3~30 个字符，仅支持包含简体中文、数字、英文、下划线、+、-。
    try {
      AlipayOpenMiniBaseinfoNameCheckResponseModel result = apiInstance.check(appName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniBaseinfoNameApi#check");
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
| **appName** | **String**| 小程序名字，长度限制 3~30 个字符，仅支持包含简体中文、数字、英文、下划线、+、-。 | [optional] |

### Return type

**AlipayOpenMiniBaseinfoNameCheckResponseModel**

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

