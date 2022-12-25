# AlipayOpenMiniInnerversionConditionApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayOpenMiniInnerversionConditionApi.md#batchquery) | **POST** /v3/alipay/open/mini/innerversion/condition/batchquery | 根据状态批量查询版本信息 |


<a name="batchquery"></a>
# **batchquery**
> AlipayOpenMiniInnerversionConditionBatchqueryResponseModel batchquery(alipayOpenMiniInnerversionConditionBatchqueryModel)

根据状态批量查询版本信息

小程序提供一套针对一二方场景的开发者提供一套统一的内部能力开放体系，定向输出赋能

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerversionConditionApi;

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

    AlipayOpenMiniInnerversionConditionApi apiInstance = new AlipayOpenMiniInnerversionConditionApi(defaultClient);
    AlipayOpenMiniInnerversionConditionBatchqueryModel alipayOpenMiniInnerversionConditionBatchqueryModel = new AlipayOpenMiniInnerversionConditionBatchqueryModel(); // AlipayOpenMiniInnerversionConditionBatchqueryModel | 
    try {
      AlipayOpenMiniInnerversionConditionBatchqueryResponseModel result = apiInstance.batchquery(alipayOpenMiniInnerversionConditionBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerversionConditionApi#batchquery");
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
| **alipayOpenMiniInnerversionConditionBatchqueryModel** | **AlipayOpenMiniInnerversionConditionBatchqueryModel**|  | [optional] |

### Return type

**AlipayOpenMiniInnerversionConditionBatchqueryResponseModel**

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

