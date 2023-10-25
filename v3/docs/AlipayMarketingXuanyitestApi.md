# AlipayMarketingXuanyitestApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**transfer**](AlipayMarketingXuanyitestApi.md#transfer) | **POST** /v3/alipay/marketing/xuanyitest/transfer | 资源化测试4.0 |


<a name="transfer"></a>
# **transfer**
> AlipayMarketingXuanyitestTransferResponseModel transfer(alipayMarketingXuanyitestTransferModel)

资源化测试4.0

功能测试，我有一个test，不会匹配上

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingXuanyitestApi;

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

    AlipayMarketingXuanyitestApi apiInstance = new AlipayMarketingXuanyitestApi(defaultClient);
    AlipayMarketingXuanyitestTransferModel alipayMarketingXuanyitestTransferModel = new AlipayMarketingXuanyitestTransferModel(); // AlipayMarketingXuanyitestTransferModel | 
    try {
      AlipayMarketingXuanyitestTransferResponseModel result = apiInstance.transfer(alipayMarketingXuanyitestTransferModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingXuanyitestApi#transfer");
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
| **alipayMarketingXuanyitestTransferModel** | **AlipayMarketingXuanyitestTransferModel**|  | [optional] |

### Return type

**AlipayMarketingXuanyitestTransferResponseModel**

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

