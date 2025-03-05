# AlipayOpenSpOpporDetailApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenSpOpporDetailApi.md#query) | **GET** /v3/alipay/open/sp/oppor/detail/query | 商机作业详情查询 |


<a name="query"></a>
# **query**
> AlipayOpenSpOpporDetailQueryResponseModel query(isvPid, opporId)

商机作业详情查询

商机作业详情查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSpOpporDetailApi;

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

    AlipayOpenSpOpporDetailApi apiInstance = new AlipayOpenSpOpporDetailApi(defaultClient);
    String isvPid = "2088501013445414"; // String | 服务商pid
    String opporId = "2022041403518351"; // String | 商机作业Id
    try {
      AlipayOpenSpOpporDetailQueryResponseModel result = apiInstance.query(isvPid, opporId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSpOpporDetailApi#query");
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
| **opporId** | **String**| 商机作业Id | [optional] |

### Return type

**AlipayOpenSpOpporDetailQueryResponseModel**

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

