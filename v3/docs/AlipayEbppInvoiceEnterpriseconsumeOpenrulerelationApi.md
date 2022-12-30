# AlipayEbppInvoiceEnterpriseconsumeOpenrulerelationApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayEbppInvoiceEnterpriseconsumeOpenrulerelationApi.md#create) | **POST** /v3/alipay/ebpp/invoice/enterpriseconsume/openrulerelation/create | 新增开票规则并绑定费控规则 |


<a name="create"></a>
# **create**
> AlipayEbppInvoiceEnterpriseconsumeOpenrulerelationCreateResponseModel create(alipayEbppInvoiceEnterpriseconsumeOpenrulerelationCreateModel)

新增开票规则并绑定费控规则

新增开票规则并自动绑定到费控规则

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceEnterpriseconsumeOpenrulerelationApi;

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

    AlipayEbppInvoiceEnterpriseconsumeOpenrulerelationApi apiInstance = new AlipayEbppInvoiceEnterpriseconsumeOpenrulerelationApi(defaultClient);
    AlipayEbppInvoiceEnterpriseconsumeOpenrulerelationCreateModel alipayEbppInvoiceEnterpriseconsumeOpenrulerelationCreateModel = new AlipayEbppInvoiceEnterpriseconsumeOpenrulerelationCreateModel(); // AlipayEbppInvoiceEnterpriseconsumeOpenrulerelationCreateModel | 
    try {
      AlipayEbppInvoiceEnterpriseconsumeOpenrulerelationCreateResponseModel result = apiInstance.create(alipayEbppInvoiceEnterpriseconsumeOpenrulerelationCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceEnterpriseconsumeOpenrulerelationApi#create");
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
| **alipayEbppInvoiceEnterpriseconsumeOpenrulerelationCreateModel** | **AlipayEbppInvoiceEnterpriseconsumeOpenrulerelationCreateModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceEnterpriseconsumeOpenrulerelationCreateResponseModel**

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

