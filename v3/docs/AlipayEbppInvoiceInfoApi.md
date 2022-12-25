# AlipayEbppInvoiceInfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**send**](AlipayEbppInvoiceInfoApi.md#send) | **POST** /v3/alipay/ebpp/invoice/info/send | 发票信息回传接口（新版） |


<a name="send"></a>
# **send**
> AlipayEbppInvoiceInfoSendResponseModel send(alipayEbppInvoiceInfoSendModel)

发票信息回传接口（新版）

商户或ISV将发票信息发送至发票管家。例如：商户为用户开出发票之后，通过该接口将发票发送到买家支付宝的发票管家中，买家可在发票管家中查看发票。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceInfoApi;

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

    AlipayEbppInvoiceInfoApi apiInstance = new AlipayEbppInvoiceInfoApi(defaultClient);
    AlipayEbppInvoiceInfoSendModel alipayEbppInvoiceInfoSendModel = new AlipayEbppInvoiceInfoSendModel(); // AlipayEbppInvoiceInfoSendModel | 
    try {
      AlipayEbppInvoiceInfoSendResponseModel result = apiInstance.send(alipayEbppInvoiceInfoSendModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceInfoApi#send");
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
| **alipayEbppInvoiceInfoSendModel** | **AlipayEbppInvoiceInfoSendModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceInfoSendResponseModel**

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

