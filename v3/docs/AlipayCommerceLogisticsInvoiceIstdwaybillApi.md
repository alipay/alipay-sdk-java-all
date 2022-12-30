# AlipayCommerceLogisticsInvoiceIstdwaybillApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayCommerceLogisticsInvoiceIstdwaybillApi.md#create) | **POST** /v3/alipay/commerce/logistics/invoice/istdwaybill/create | 开即时配送订单发票 |
| [**query**](AlipayCommerceLogisticsInvoiceIstdwaybillApi.md#query) | **GET** /v3/alipay/commerce/logistics/invoice/istdwaybill/query | 查询即时配送订单的开票结果 |


<a name="create"></a>
# **create**
> AlipayCommerceLogisticsInvoiceIstdwaybillCreateResponseModel create(alipayCommerceLogisticsInvoiceIstdwaybillCreateModel)

开即时配送订单发票

开即时配送订单发票

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceLogisticsInvoiceIstdwaybillApi;

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

    AlipayCommerceLogisticsInvoiceIstdwaybillApi apiInstance = new AlipayCommerceLogisticsInvoiceIstdwaybillApi(defaultClient);
    AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel alipayCommerceLogisticsInvoiceIstdwaybillCreateModel = new AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel(); // AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel | 
    try {
      AlipayCommerceLogisticsInvoiceIstdwaybillCreateResponseModel result = apiInstance.create(alipayCommerceLogisticsInvoiceIstdwaybillCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceLogisticsInvoiceIstdwaybillApi#create");
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
| **alipayCommerceLogisticsInvoiceIstdwaybillCreateModel** | **AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel**|  | [optional] |

### Return type

**AlipayCommerceLogisticsInvoiceIstdwaybillCreateResponseModel**

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

<a name="query"></a>
# **query**
> AlipayCommerceLogisticsInvoiceIstdwaybillQueryResponseModel query(logisticsCode, outInvoiceRequestNo)

查询即时配送订单的开票结果

查询即时配送订单的开票结果

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceLogisticsInvoiceIstdwaybillApi;

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

    AlipayCommerceLogisticsInvoiceIstdwaybillApi apiInstance = new AlipayCommerceLogisticsInvoiceIstdwaybillApi(defaultClient);
    String logisticsCode = "FENGNIAO"; // String | 即时配送公司编码
    String outInvoiceRequestNo = "out_invoice_no_00001"; // String | 开票请求流水号
    try {
      AlipayCommerceLogisticsInvoiceIstdwaybillQueryResponseModel result = apiInstance.query(logisticsCode, outInvoiceRequestNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceLogisticsInvoiceIstdwaybillApi#query");
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
| **logisticsCode** | **String**| 即时配送公司编码 | [optional] |
| **outInvoiceRequestNo** | **String**| 开票请求流水号 | [optional] |

### Return type

**AlipayCommerceLogisticsInvoiceIstdwaybillQueryResponseModel**

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

