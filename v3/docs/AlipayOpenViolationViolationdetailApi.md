# AlipayOpenViolationViolationdetailApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenViolationViolationdetailApi.md#query) | **GET** /v3/alipay/open/violation/violationdetail/query | 违规记录详情查询 |


<a name="query"></a>
# **query**
> AlipayOpenViolationViolationdetailQueryResponseModel query(violationRecordId)

违规记录详情查询

违规记录详情查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenViolationViolationdetailApi;

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

    AlipayOpenViolationViolationdetailApi apiInstance = new AlipayOpenViolationViolationdetailApi(defaultClient);
    String violationRecordId = "202205240010200000000000000"; // String | 支付宝侧生成的违规记录唯一标识
    try {
      AlipayOpenViolationViolationdetailQueryResponseModel result = apiInstance.query(violationRecordId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenViolationViolationdetailApi#query");
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
| **violationRecordId** | **String**| 支付宝侧生成的违规记录唯一标识 | [optional] |

### Return type

**AlipayOpenViolationViolationdetailQueryResponseModel**

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

