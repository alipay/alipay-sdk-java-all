# AlipayOpenSearchAbilityApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayOpenSearchAbilityApi.md#batchquery) | **POST** /v3/alipay/open/search/ability/batchquery | 搜索运营列表分页查询 |


<a name="batchquery"></a>
# **batchquery**
> AlipayOpenSearchAbilityBatchqueryResponseModel batchquery(alipayOpenSearchAbilityBatchqueryModel)

搜索运营列表分页查询

搜索运营列表分页查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSearchAbilityApi;

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

    AlipayOpenSearchAbilityApi apiInstance = new AlipayOpenSearchAbilityApi(defaultClient);
    AlipayOpenSearchAbilityBatchqueryModel alipayOpenSearchAbilityBatchqueryModel = new AlipayOpenSearchAbilityBatchqueryModel(); // AlipayOpenSearchAbilityBatchqueryModel | 
    try {
      AlipayOpenSearchAbilityBatchqueryResponseModel result = apiInstance.batchquery(alipayOpenSearchAbilityBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSearchAbilityApi#batchquery");
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
| **alipayOpenSearchAbilityBatchqueryModel** | **AlipayOpenSearchAbilityBatchqueryModel**|  | [optional] |

### Return type

**AlipayOpenSearchAbilityBatchqueryResponseModel**

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

