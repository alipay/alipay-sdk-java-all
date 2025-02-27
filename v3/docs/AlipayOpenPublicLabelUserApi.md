# AlipayOpenPublicLabelUserApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenPublicLabelUserApi.md#query) | **POST** /v3/alipay/open/public/label/user/query | 公众号标签管理-查询用户标签 |


<a name="query"></a>
# **query**
> AlipayOpenPublicLabelUserQueryResponseModel query(alipayOpenPublicLabelUserQueryModel)

公众号标签管理-查询用户标签

开发者可以使用该接口查询某个用户的所有标签

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicLabelUserApi;

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

    AlipayOpenPublicLabelUserApi apiInstance = new AlipayOpenPublicLabelUserApi(defaultClient);
    AlipayOpenPublicLabelUserQueryModel alipayOpenPublicLabelUserQueryModel = new AlipayOpenPublicLabelUserQueryModel(); // AlipayOpenPublicLabelUserQueryModel | 
    try {
      AlipayOpenPublicLabelUserQueryResponseModel result = apiInstance.query(alipayOpenPublicLabelUserQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicLabelUserApi#query");
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
| **alipayOpenPublicLabelUserQueryModel** | **AlipayOpenPublicLabelUserQueryModel**|  | [optional] |

### Return type

**AlipayOpenPublicLabelUserQueryResponseModel**

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

