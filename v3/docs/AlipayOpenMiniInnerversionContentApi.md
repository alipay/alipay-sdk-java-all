# AlipayOpenMiniInnerversionContentApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**rollback**](AlipayOpenMiniInnerversionContentApi.md#rollback) | **POST** /v3/alipay/open/mini/innerversion/content/rollback | 内部链路回滚版本 |


<a name="rollback"></a>
# **rollback**
> Object rollback(alipayOpenMiniInnerversionContentRollbackModel)

内部链路回滚版本

针对一二方场景的开发者，小程序提供一套统一的内部能力体系，定向输出赋能，本接口主要用于回滚版本 

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerversionContentApi;

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

    AlipayOpenMiniInnerversionContentApi apiInstance = new AlipayOpenMiniInnerversionContentApi(defaultClient);
    AlipayOpenMiniInnerversionContentRollbackModel alipayOpenMiniInnerversionContentRollbackModel = new AlipayOpenMiniInnerversionContentRollbackModel(); // AlipayOpenMiniInnerversionContentRollbackModel | 
    try {
      Object result = apiInstance.rollback(alipayOpenMiniInnerversionContentRollbackModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerversionContentApi#rollback");
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
| **alipayOpenMiniInnerversionContentRollbackModel** | **AlipayOpenMiniInnerversionContentRollbackModel**|  | [optional] |

### Return type

**Object**

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

