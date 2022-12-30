# AlipayEbppInvoiceTitleListApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](AlipayEbppInvoiceTitleListApi.md#get) | **GET** /v3/alipay/ebpp/invoice/title/list/get | 获取指定用户所有的有效抬头列表 |


<a name="get"></a>
# **get**
> AlipayEbppInvoiceTitleListGetResponseModel get(authToken, userId)

获取指定用户所有的有效抬头列表

用于服务商在用户授权的情况下获取用户的发票抬头列表供用户使用。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceTitleListApi;

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

    AlipayEbppInvoiceTitleListApi apiInstance = new AlipayEbppInvoiceTitleListApi(defaultClient);
    String authToken = "authToken_example"; // String | 用户授权令牌
    String userId = "2088000000000000"; // String | 支付宝用户id
    try {
      AlipayEbppInvoiceTitleListGetResponseModel result = apiInstance.get(authToken, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceTitleListApi#get");
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
| **authToken** | **String**| 用户授权令牌 | [optional] |
| **userId** | **String**| 支付宝用户id | [optional] |

### Return type

**AlipayEbppInvoiceTitleListGetResponseModel**

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

