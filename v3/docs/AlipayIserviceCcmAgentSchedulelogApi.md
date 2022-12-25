# AlipayIserviceCcmAgentSchedulelogApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayIserviceCcmAgentSchedulelogApi.md#query) | **POST** /v3/alipay/iservice/ccm/agent/schedulelog/query | 查询客服状态变更流水日志 |


<a name="query"></a>
# **query**
> AlipayIserviceCcmAgentSchedulelogQueryResponseModel query(alipayIserviceCcmAgentSchedulelogQueryModel)

查询客服状态变更流水日志

ISV或商户批量查询获取客服状态变更流水日志详细信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmAgentSchedulelogApi;

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

    AlipayIserviceCcmAgentSchedulelogApi apiInstance = new AlipayIserviceCcmAgentSchedulelogApi(defaultClient);
    AlipayIserviceCcmAgentSchedulelogQueryModel alipayIserviceCcmAgentSchedulelogQueryModel = new AlipayIserviceCcmAgentSchedulelogQueryModel(); // AlipayIserviceCcmAgentSchedulelogQueryModel | 
    try {
      AlipayIserviceCcmAgentSchedulelogQueryResponseModel result = apiInstance.query(alipayIserviceCcmAgentSchedulelogQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmAgentSchedulelogApi#query");
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
| **alipayIserviceCcmAgentSchedulelogQueryModel** | **AlipayIserviceCcmAgentSchedulelogQueryModel**|  | [optional] |

### Return type

**AlipayIserviceCcmAgentSchedulelogQueryResponseModel**

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

