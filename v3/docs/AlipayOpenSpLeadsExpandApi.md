# AlipayOpenSpLeadsExpandApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayOpenSpLeadsExpandApi.md#create) | **POST** /v3/alipay/open/sp/leads/expand/create | 在线写入商机库 |


<a name="create"></a>
# **create**
> AlipayOpenSpLeadsExpandCreateResponseModel create(alipayOpenSpLeadsExpandCreateModel)

在线写入商机库

在线写入商机库

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSpLeadsExpandApi;

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

    AlipayOpenSpLeadsExpandApi apiInstance = new AlipayOpenSpLeadsExpandApi(defaultClient);
    AlipayOpenSpLeadsExpandCreateModel alipayOpenSpLeadsExpandCreateModel = new AlipayOpenSpLeadsExpandCreateModel(); // AlipayOpenSpLeadsExpandCreateModel | 
    try {
      AlipayOpenSpLeadsExpandCreateResponseModel result = apiInstance.create(alipayOpenSpLeadsExpandCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSpLeadsExpandApi#create");
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
| **alipayOpenSpLeadsExpandCreateModel** | **AlipayOpenSpLeadsExpandCreateModel**|  | [optional] |

### Return type

**AlipayOpenSpLeadsExpandCreateResponseModel**

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

