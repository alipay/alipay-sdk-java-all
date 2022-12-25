# AlipayEbppInvoiceMerchantlistEnterApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apply**](AlipayEbppInvoiceMerchantlistEnterApi.md#apply) | **POST** /v3/alipay/ebpp/invoice/merchantlist/enter/apply | 商户批量入驻申请接口 |


<a name="apply"></a>
# **apply**
> AlipayEbppInvoiceMerchantlistEnterApplyResponseModel apply(alipayEbppInvoiceMerchantlistEnterApplyModel)

商户批量入驻申请接口

针对已经在支付宝入驻的服务方，使用该接口导入服务方后面的开票商户

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceMerchantlistEnterApi;

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

    AlipayEbppInvoiceMerchantlistEnterApi apiInstance = new AlipayEbppInvoiceMerchantlistEnterApi(defaultClient);
    AlipayEbppInvoiceMerchantlistEnterApplyModel alipayEbppInvoiceMerchantlistEnterApplyModel = new AlipayEbppInvoiceMerchantlistEnterApplyModel(); // AlipayEbppInvoiceMerchantlistEnterApplyModel | 
    try {
      AlipayEbppInvoiceMerchantlistEnterApplyResponseModel result = apiInstance.apply(alipayEbppInvoiceMerchantlistEnterApplyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceMerchantlistEnterApi#apply");
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
| **alipayEbppInvoiceMerchantlistEnterApplyModel** | **AlipayEbppInvoiceMerchantlistEnterApplyModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceMerchantlistEnterApplyResponseModel**

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

