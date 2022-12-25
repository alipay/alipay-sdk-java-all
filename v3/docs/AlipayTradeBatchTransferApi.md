# AlipayTradeBatchTransferApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayTradeBatchTransferApi.md#query) | **GET** /v3/alipay/trade/batch/transfer/query | 请款分账查询接口 |


<a name="query"></a>
# **query**
> AlipayTradeBatchTransferQueryResponseModel query(outRequestNo, settleNo, extendParams)

请款分账查询接口

针对请款分账接口的查询功能

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeBatchTransferApi;

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

    AlipayTradeBatchTransferApi apiInstance = new AlipayTradeBatchTransferApi(defaultClient);
    String outRequestNo = "20180101"; // String | 批量结算时传入的外部流水号，与settle_no二者必填其一。 out_request_no和settle_no如果同时存在，优先取settle_no
    String settleNo = "2019050510032002040000053220"; // String | 结算单据号，与out_request_no二者必填其一
    String extendParams = "{\"key\":\"value\"}"; // String | 扩展字段
    try {
      AlipayTradeBatchTransferQueryResponseModel result = apiInstance.query(outRequestNo, settleNo, extendParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeBatchTransferApi#query");
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
| **outRequestNo** | **String**| 批量结算时传入的外部流水号，与settle_no二者必填其一。 out_request_no和settle_no如果同时存在，优先取settle_no | [optional] |
| **settleNo** | **String**| 结算单据号，与out_request_no二者必填其一 | [optional] |
| **extendParams** | **String**| 扩展字段 | [optional] |

### Return type

**AlipayTradeBatchTransferQueryResponseModel**

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

