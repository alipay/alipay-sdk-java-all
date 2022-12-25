# AlipayEbppInvoiceOrderApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayEbppInvoiceOrderApi.md#query) | **GET** /v3/alipay/ebpp/invoice/order/query | 根据外部订单号查询发票信息 |


<a name="query"></a>
# **query**
> AlipayEbppInvoiceOrderQueryResponseModel query(orderNo, mShortName, subMShortName)

根据外部订单号查询发票信息

根据外部订单号查询发票详情信息，适用于外部商户无开票申请ID场景

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceOrderApi;

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

    AlipayEbppInvoiceOrderApi apiInstance = new AlipayEbppInvoiceOrderApi(defaultClient);
    String orderNo = "20200520110046966071"; // String | 开票申请时所传入订单号，不限于支付宝体内交易订单号。如：20200520110046966071
    String mShortName = "KFC"; // String | 定义商户的一级简称,用于标识商户品牌，对应于商户入驻时填写的\"商户品牌简称\"。 如：肯德基：KFC
    String subMShortName = "KFC-HZ-19003"; // String | 定义商户的二级简称,用于标识商户品牌下的分支机构，如门店，对应于商户入驻时填写的\"商户门店简称\"。 如：肯德基-杭州西湖区文一西路店：KFC-HZ-19003 要求：\"商户品牌简称+商户门店简称\"作为确定商户及其下属机构的唯一标识，不可重复。
    try {
      AlipayEbppInvoiceOrderQueryResponseModel result = apiInstance.query(orderNo, mShortName, subMShortName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceOrderApi#query");
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
| **orderNo** | **String**| 开票申请时所传入订单号，不限于支付宝体内交易订单号。如：20200520110046966071 | [optional] |
| **mShortName** | **String**| 定义商户的一级简称,用于标识商户品牌，对应于商户入驻时填写的\&quot;商户品牌简称\&quot;。 如：肯德基：KFC | [optional] |
| **subMShortName** | **String**| 定义商户的二级简称,用于标识商户品牌下的分支机构，如门店，对应于商户入驻时填写的\&quot;商户门店简称\&quot;。 如：肯德基-杭州西湖区文一西路店：KFC-HZ-19003 要求：\&quot;商户品牌简称+商户门店简称\&quot;作为确定商户及其下属机构的唯一标识，不可重复。 | [optional] |

### Return type

**AlipayEbppInvoiceOrderQueryResponseModel**

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

