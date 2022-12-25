# AlipayEbppInvoiceSyncSimpleApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**send**](AlipayEbppInvoiceSyncSimpleApi.md#send) | **POST** /v3/alipay/ebpp/invoice/sync/simple/send | 简单模式发票回传接口 |


<a name="send"></a>
# **send**
> Object send(alipayEbppInvoiceSyncSimpleSendModel)

简单模式发票回传接口

商户或ISV将发票信息发送至发票管家。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceSyncSimpleApi;

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

    AlipayEbppInvoiceSyncSimpleApi apiInstance = new AlipayEbppInvoiceSyncSimpleApi(defaultClient);
    AlipayEbppInvoiceSyncSimpleSendModel alipayEbppInvoiceSyncSimpleSendModel = new AlipayEbppInvoiceSyncSimpleSendModel(); // AlipayEbppInvoiceSyncSimpleSendModel | 
    try {
      Object result = apiInstance.send(alipayEbppInvoiceSyncSimpleSendModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceSyncSimpleApi#send");
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
| **alipayEbppInvoiceSyncSimpleSendModel** | **AlipayEbppInvoiceSyncSimpleSendModel**|  | [optional] |

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

