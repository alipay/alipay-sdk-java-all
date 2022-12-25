# AlipayOpenAppApiSceneApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenAppApiSceneApi.md#query) | **GET** /v3/alipay/open/app/api/scene/query | 查询接口字段使用场景 |


<a name="query"></a>
# **query**
> AlipayOpenAppApiSceneQueryResponseModel query(fieldName, apiName)

查询接口字段使用场景

在申请接口出参中用户敏感信息字段时，本接口用于获取所申请接口字段的使用场景

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenAppApiSceneApi;

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

    AlipayOpenAppApiSceneApi apiInstance = new AlipayOpenAppApiSceneApi(defaultClient);
    String fieldName = "mobile"; // String | 接口出参字段英文名。
    String apiName = "alipay.user.info.share"; // String | 接口英文名。
    try {
      AlipayOpenAppApiSceneQueryResponseModel result = apiInstance.query(fieldName, apiName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenAppApiSceneApi#query");
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
| **fieldName** | **String**| 接口出参字段英文名。 | [optional] |
| **apiName** | **String**| 接口英文名。 | [optional] |

### Return type

**AlipayOpenAppApiSceneQueryResponseModel**

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

