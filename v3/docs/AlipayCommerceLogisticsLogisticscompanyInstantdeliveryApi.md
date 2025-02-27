# AlipayCommerceLogisticsLogisticscompanyInstantdeliveryApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayCommerceLogisticsLogisticscompanyInstantdeliveryApi.md#query) | **POST** /v3/alipay/commerce/logistics/logisticscompany/instantdelivery/query | 查询支付宝支持的即时配送公司 |


<a name="query"></a>
# **query**
> AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel query()

查询支付宝支持的即时配送公司

查询支付宝支持的即时配送公司

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceLogisticsLogisticscompanyInstantdeliveryApi;

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

    AlipayCommerceLogisticsLogisticscompanyInstantdeliveryApi apiInstance = new AlipayCommerceLogisticsLogisticscompanyInstantdeliveryApi(defaultClient);
    try {
      AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel result = apiInstance.query();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceLogisticsLogisticscompanyInstantdeliveryApi#query");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**AlipayCommerceLogisticsLogisticscompanyInstantdeliveryQueryResponseModel**

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

