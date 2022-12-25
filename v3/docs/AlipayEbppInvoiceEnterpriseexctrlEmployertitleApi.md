# AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modify**](AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi.md#modify) | **PUT** /v3/alipay/ebpp/invoice/enterpriseexctrl/employertitle | 修改企业抬头 |


<a name="modify"></a>
# **modify**
> AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyResponseModel modify(alipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel)

修改企业抬头

修改企业开票抬头

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi;

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

    AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi apiInstance = new AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi(defaultClient);
    AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel alipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel = new AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel(); // AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel | 
    try {
      AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyResponseModel result = apiInstance.modify(alipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi#modify");
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
| **alipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel** | **AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyResponseModel**

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

