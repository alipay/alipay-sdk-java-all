# AlipayOpenSpIsvOperationApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sync**](AlipayOpenSpIsvOperationApi.md#sync) | **POST** /v3/alipay/open/sp/isv/operation/sync | 服务商作业结果数据回传 |


<a name="sync"></a>
# **sync**
> Object sync(alipayOpenSpIsvOperationSyncModel)

服务商作业结果数据回传

针对SSB业务中，S1回传S2推广过程中，获得的作业结果数据

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSpIsvOperationApi;

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

    AlipayOpenSpIsvOperationApi apiInstance = new AlipayOpenSpIsvOperationApi(defaultClient);
    AlipayOpenSpIsvOperationSyncModel alipayOpenSpIsvOperationSyncModel = new AlipayOpenSpIsvOperationSyncModel(); // AlipayOpenSpIsvOperationSyncModel | 
    try {
      Object result = apiInstance.sync(alipayOpenSpIsvOperationSyncModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSpIsvOperationApi#sync");
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
| **alipayOpenSpIsvOperationSyncModel** | **AlipayOpenSpIsvOperationSyncModel**|  | [optional] |

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

