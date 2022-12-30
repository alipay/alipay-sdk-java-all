# AlipayEbppInvoiceEnterpriseMerchantrelationApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayEbppInvoiceEnterpriseMerchantrelationApi.md#create) | **POST** /v3/alipay/ebpp/invoice/enterprise/merchantrelation/create | 创建企业商户关系 |


<a name="create"></a>
# **create**
> AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel create(enterpriseId, alipayEbppInvoiceEnterpriseMerchantrelationCreateModel)

创建企业商户关系

根据交易流水号创建企业商户绑定关系

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceEnterpriseMerchantrelationApi;

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

    AlipayEbppInvoiceEnterpriseMerchantrelationApi apiInstance = new AlipayEbppInvoiceEnterpriseMerchantrelationApi(defaultClient);
    String enterpriseId = "2088xxx"; // String | 企业ID
    AlipayEbppInvoiceEnterpriseMerchantrelationCreateModel alipayEbppInvoiceEnterpriseMerchantrelationCreateModel = new AlipayEbppInvoiceEnterpriseMerchantrelationCreateModel(); // AlipayEbppInvoiceEnterpriseMerchantrelationCreateModel | 
    try {
      AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel result = apiInstance.create(enterpriseId, alipayEbppInvoiceEnterpriseMerchantrelationCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceEnterpriseMerchantrelationApi#create");
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
| **enterpriseId** | **String**| 企业ID | [optional] |
| **alipayEbppInvoiceEnterpriseMerchantrelationCreateModel** | **AlipayEbppInvoiceEnterpriseMerchantrelationCreateModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceEnterpriseMerchantrelationCreateResponseModel**

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

