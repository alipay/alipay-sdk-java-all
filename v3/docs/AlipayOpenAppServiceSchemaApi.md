# AlipayOpenAppServiceSchemaApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenAppServiceSchemaApi.md#query) | **GET** /v3/alipay/open/app/service/schema/query | 服务schema下发 |


<a name="query"></a>
# **query**
> AlipayOpenAppServiceSchemaQueryResponseModel query(categoryId, templateType)

服务schema下发

服务schema查询下发

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenAppServiceSchemaApi;

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

    AlipayOpenAppServiceSchemaApi apiInstance = new AlipayOpenAppServiceSchemaApi(defaultClient);
    String categoryId = "c11111"; // String | 类目id, 获取请参考<a href=\"https://opendocs.alipay.com/mini/03ci0w?pathHash=ed3c875c\">各个行业场景服务接入资料</a>
    String templateType = "DEFAULT"; // String | 服务模版类型，默认值:DEFAULT
    try {
      AlipayOpenAppServiceSchemaQueryResponseModel result = apiInstance.query(categoryId, templateType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenAppServiceSchemaApi#query");
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
| **categoryId** | **String**| 类目id, 获取请参考&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/mini/03ci0w?pathHash&#x3D;ed3c875c\&quot;&gt;各个行业场景服务接入资料&lt;/a&gt; | [optional] |
| **templateType** | **String**| 服务模版类型，默认值:DEFAULT | [optional] |

### Return type

**AlipayOpenAppServiceSchemaQueryResponseModel**

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

