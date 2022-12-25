# AlipayFundAuthOperationDetailApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayFundAuthOperationDetailApi.md#query) | **GET** /v3/alipay/fund/auth/operation/detail/query | 资金授权操作查询接口 |


<a name="query"></a>
# **query**
> AlipayFundAuthOperationDetailQueryResponseModel query(authNo, outOrderNo, operationId, outRequestNo, operationType, queryOptions)

资金授权操作查询接口

通过该接口可以查询单笔明细的详细信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundAuthOperationDetailApi;

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

    AlipayFundAuthOperationDetailApi apiInstance = new AlipayFundAuthOperationDetailApi(defaultClient);
    String authNo = "2014021601002000640012345678"; // String | 支付宝授权资金订单号。 与商户的授权资金订单号不能同时为空，二者都传入时，以支付宝资金授权订单号为准，该参数与支付宝授权资金操作流水号配对使用。
    String outOrderNo = "8077735255938023"; // String | 商户的授权资金订单号。 与支付宝的授权资金订单号不能同时为空，二者都传入时，以支付宝的授权资金订单号为准，该参数与商户的授权资金操作流水号配对使用。 该值与资金冻结时 out_order_no一致。
    String operationId = "20140216010020006400"; // String | 支付宝的授权资金操作流水号。 与商户的授权资金操作流水号不能同时为空，二者都传入时，以支付宝的授权资金操作流水号为准，该参数与支付宝授权资金订单号配对使用。
    String outRequestNo = "20140216001001"; // String | 商户的授权资金操作流水号。 与支付宝的授权资金操作流水号不能同时为空，二者都传入时，以支付宝的授权资金操作流水号为准，该参数与商户的授权资金订单号配对使用。 查询冻结明细时，该值与发起冻结操作时传入的out_request_no一致； 查询解冻明细时，该值与发起解冻操作时传入的out_request_no一致； 查询支付明细时，该值与发起转支付操作时传入的out_trade_no一致。
    String operationType = "FREEZE"; // String | 需要查询的授权资金操作类型。 可选值FREEZE/UNFREEZE/PAY，分别对应冻结、解冻、支付明细类型； 未传入本参数时，如果仅查询出单笔明细则直接返回，如果查询出多笔则优先返回冻结明细、无冻结明细时返回解冻明细； 当传入本参数时，则严格按照该操作类型返回对应明细
    List<String> queryOptions = Arrays.asList(); // List<String> | 需要查询的额外信息
    try {
      AlipayFundAuthOperationDetailQueryResponseModel result = apiInstance.query(authNo, outOrderNo, operationId, outRequestNo, operationType, queryOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundAuthOperationDetailApi#query");
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
| **authNo** | **String**| 支付宝授权资金订单号。 与商户的授权资金订单号不能同时为空，二者都传入时，以支付宝资金授权订单号为准，该参数与支付宝授权资金操作流水号配对使用。 | [optional] |
| **outOrderNo** | **String**| 商户的授权资金订单号。 与支付宝的授权资金订单号不能同时为空，二者都传入时，以支付宝的授权资金订单号为准，该参数与商户的授权资金操作流水号配对使用。 该值与资金冻结时 out_order_no一致。 | [optional] |
| **operationId** | **String**| 支付宝的授权资金操作流水号。 与商户的授权资金操作流水号不能同时为空，二者都传入时，以支付宝的授权资金操作流水号为准，该参数与支付宝授权资金订单号配对使用。 | [optional] |
| **outRequestNo** | **String**| 商户的授权资金操作流水号。 与支付宝的授权资金操作流水号不能同时为空，二者都传入时，以支付宝的授权资金操作流水号为准，该参数与商户的授权资金订单号配对使用。 查询冻结明细时，该值与发起冻结操作时传入的out_request_no一致； 查询解冻明细时，该值与发起解冻操作时传入的out_request_no一致； 查询支付明细时，该值与发起转支付操作时传入的out_trade_no一致。 | [optional] |
| **operationType** | **String**| 需要查询的授权资金操作类型。 可选值FREEZE/UNFREEZE/PAY，分别对应冻结、解冻、支付明细类型； 未传入本参数时，如果仅查询出单笔明细则直接返回，如果查询出多笔则优先返回冻结明细、无冻结明细时返回解冻明细； 当传入本参数时，则严格按照该操作类型返回对应明细 | [optional] |
| **queryOptions** | **List&lt;String&gt;**| 需要查询的额外信息 | [optional] |

### Return type

**AlipayFundAuthOperationDetailQueryResponseModel**

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

