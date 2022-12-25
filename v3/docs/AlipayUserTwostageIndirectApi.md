# AlipayUserTwostageIndirectApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**use**](AlipayUserTwostageIndirectApi.md#use) | **POST** /v3/alipay/user/twostage/indirect/use | 双联二阶段 |


<a name="use"></a>
# **use**
> AlipayUserTwostageIndirectUseResponseModel use(alipayUserTwostageIndirectUseModel)

双联二阶段

间连模式通过双联向银行输出付款码查UID接口. 双联二阶段里，授权之后调用该接口，进行解码并校验双联pid、银行orgId、isv sourceId及学校smid之间的级联关系；检查授权关系；解码并返回用户uid

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayUserTwostageIndirectApi;

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

    AlipayUserTwostageIndirectApi apiInstance = new AlipayUserTwostageIndirectApi(defaultClient);
    AlipayUserTwostageIndirectUseModel alipayUserTwostageIndirectUseModel = new AlipayUserTwostageIndirectUseModel(); // AlipayUserTwostageIndirectUseModel | 
    try {
      AlipayUserTwostageIndirectUseResponseModel result = apiInstance.use(alipayUserTwostageIndirectUseModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayUserTwostageIndirectApi#use");
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
| **alipayUserTwostageIndirectUseModel** | **AlipayUserTwostageIndirectUseModel**|  | [optional] |

### Return type

**AlipayUserTwostageIndirectUseResponseModel**

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

