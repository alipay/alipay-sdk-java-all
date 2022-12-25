# AlipaySecurityDataSssApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipaySecurityDataSssApi.md#create) | **POST** /v3/alipay/security/data/sss/create/{a} | 文档回归测试勿动openapi_openid_post多场景 |


<a name="create"></a>
# **create**
> AlipaySecurityDataSssCreateResponseModel create(a, b, bOpenId, alipaySecurityDataSssCreateModel)

文档回归测试勿动openapi_openid_post多场景

文档回归测试勿动openapi_openid_post多场景

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipaySecurityDataSssApi;

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

    AlipaySecurityDataSssApi apiInstance = new AlipaySecurityDataSssApi(defaultClient);
    Integer a = 1; // Integer | path.数字，无枚举，有注意事项
    String b = "12"; // String | 有枚举，必须，有openid，有注意事项
    String bOpenId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 有枚举，必须，有openid，有注意事项
    AlipaySecurityDataSssCreateModel alipaySecurityDataSssCreateModel = new AlipaySecurityDataSssCreateModel(); // AlipaySecurityDataSssCreateModel | 
    try {
      AlipaySecurityDataSssCreateResponseModel result = apiInstance.create(a, b, bOpenId, alipaySecurityDataSssCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipaySecurityDataSssApi#create");
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
| **a** | **Integer**| path.数字，无枚举，有注意事项 | |
| **b** | **String**| 有枚举，必须，有openid，有注意事项 | [optional] |
| **bOpenId** | **String**| 有枚举，必须，有openid，有注意事项 | [optional] |
| **alipaySecurityDataSssCreateModel** | **AlipaySecurityDataSssCreateModel**|  | [optional] |

### Return type

**AlipaySecurityDataSssCreateResponseModel**

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

