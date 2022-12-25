# AlipayOpenSpOpporPageApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenSpOpporPageApi.md#query) | **GET** /v3/alipay/open/sp/oppor/page/query | 商机作业列表查询 |


<a name="query"></a>
# **query**
> AlipayOpenSpOpporPageQueryResponseModel query(isvPid, statusList, pageSize, pageNum)

商机作业列表查询

商机作业列表查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSpOpporPageApi;

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

    AlipayOpenSpOpporPageApi apiInstance = new AlipayOpenSpOpporPageApi(defaultClient);
    String isvPid = "2088302213873401"; // String | 服务商pid
    String statusList = "WAIT_MER_CONFIRM,MER_CONFIRMED,MER_REJECTED,EXPANDING,EXPANDED,EXPAND_FAILED"; // String | 作业记录状态列表,以,拼接传入
    String pageSize = "10"; // String | 页大小
    String pageNum = "1"; // String | 页数
    try {
      AlipayOpenSpOpporPageQueryResponseModel result = apiInstance.query(isvPid, statusList, pageSize, pageNum);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSpOpporPageApi#query");
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
| **isvPid** | **String**| 服务商pid | [optional] |
| **statusList** | **String**| 作业记录状态列表,以,拼接传入 | [optional] |
| **pageSize** | **String**| 页大小 | [optional] |
| **pageNum** | **String**| 页数 | [optional] |

### Return type

**AlipayOpenSpOpporPageQueryResponseModel**

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

