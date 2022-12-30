# AlipayCommerceLogisticsWaybillIstddetailApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayCommerceLogisticsWaybillIstddetailApi.md#query) | **GET** /v3/alipay/commerce/logistics/waybill/istddetail/query | 查询即时配送运单详情 |


<a name="query"></a>
# **query**
> AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel query(shopNo, outOrderNo, orderNo, logisticsCode, waybillNo)

查询即时配送运单详情

查询即时配送运单详情

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceLogisticsWaybillIstddetailApi;

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

    AlipayCommerceLogisticsWaybillIstddetailApi apiInstance = new AlipayCommerceLogisticsWaybillIstddetailApi(defaultClient);
    String shopNo = "shopno001"; // String | 商家门店编号
    String outOrderNo = "2020090411140000000000777000216122"; // String | 商家订单号
    String orderNo = "2020090411130000000000772400280352"; // String | 支付宝订单流水号
    String logisticsCode = "FENGNIAO"; // String | 即时配送公司编码
    String waybillNo = "waybillno001"; // String | 即时配送运单编号
    try {
      AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel result = apiInstance.query(shopNo, outOrderNo, orderNo, logisticsCode, waybillNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceLogisticsWaybillIstddetailApi#query");
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
| **shopNo** | **String**| 商家门店编号 | [optional] |
| **outOrderNo** | **String**| 商家订单号 | [optional] |
| **orderNo** | **String**| 支付宝订单流水号 | [optional] |
| **logisticsCode** | **String**| 即时配送公司编码 | [optional] |
| **waybillNo** | **String**| 即时配送运单编号 | [optional] |

### Return type

**AlipayCommerceLogisticsWaybillIstddetailQueryResponseModel**

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

