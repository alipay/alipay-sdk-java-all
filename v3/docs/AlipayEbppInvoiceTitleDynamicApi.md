# AlipayEbppInvoiceTitleDynamicApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](AlipayEbppInvoiceTitleDynamicApi.md#get) | **GET** /v3/alipay/ebpp/invoice/title/dynamic/get | 根据动态码查询发票抬头 |


<a name="get"></a>
# **get**
> AlipayEbppInvoiceTitleDynamicGetResponseModel get(barCode)

根据动态码查询发票抬头

支付宝钱包内的发票管家app在用户抬头展示页面会显示对应该抬头的动态条形码，通过本接口，可根据条形码中数字串获取对应的用户抬头信息。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceTitleDynamicApi;

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

    AlipayEbppInvoiceTitleDynamicApi apiInstance = new AlipayEbppInvoiceTitleDynamicApi(defaultClient);
    String barCode = "82771888"; // String | 抬头动态码
    try {
      AlipayEbppInvoiceTitleDynamicGetResponseModel result = apiInstance.get(barCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceTitleDynamicApi#get");
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
| **barCode** | **String**| 抬头动态码 | [optional] |

### Return type

**AlipayEbppInvoiceTitleDynamicGetResponseModel**

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

