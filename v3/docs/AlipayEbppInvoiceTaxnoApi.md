# AlipayEbppInvoiceTaxnoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayEbppInvoiceTaxnoApi.md#batchquery) | **GET** /v3/alipay/ebpp/invoice/taxno/batchquery | 获取指定企业的发票要素列表 |


<a name="batchquery"></a>
# **batchquery**
> AlipayEbppInvoiceTaxnoBatchqueryResponseModel batchquery(authToken, taxNo, invoiceKindList, scene, startInvoiceDate, endInvoiceDate, limitSize, enableTradeOut, pageNum)

获取指定企业的发票要素列表

根据购买方税号获取用户的发票关键要素列表，该接口目前适用于发票报销场景

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceTaxnoApi;

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

    AlipayEbppInvoiceTaxnoApi apiInstance = new AlipayEbppInvoiceTaxnoApi(defaultClient);
    String authToken = "authToken_example"; // String | 用户授权令牌
    String taxNo = "123"; // String | 企业税号
    List<String> invoiceKindList = Arrays.asList(); // List<String> | 查询票种列表。枚举值如下： *PLAIN：增值税电子普通发票； *SPECIAL：增值税专用发票； *PLAIN_INVOICE：增值税普通发票； *PAPER_INVOICE：增值税普通发票（卷式）； *SALSE_INVOICE：机动车销售统一发票。
    String scene = "INVOICE_EXPENSE"; // String | 发票要素获取应用场景。<a href=\"https://opendocs.alipay.com/open/10691/bv8s88\">\"拉\"模式报销</a> 固定为 INVOICE_EXPENSE 表示发票报销。
    String startInvoiceDate = "2017-01-11"; // String | 查询起始时间，精确到天（按开票日期查询） start_invoice_date和end_invoice_date传值要求 1.同时为空时，返回最近半年200条数据 2.必须同时为空 或 同时不为空 3.结束日期不能大于当前日期 4.开始时间和结束时间跨度不能超过6个月
    String endInvoiceDate = "2017-07-11"; // String | 查询结束时间，精确到天（按开票日期查询） start_invoice_date和end_invoice_date传值要求 1.同时为空时，返回最近半年200条数据 2.必须同时为空 或 同时不为空 3.结束日期不能大于当前日期 4.开始时间和结束时间跨度不能超过6个月
    Integer limitSize = 20; // Integer | 查询结果上限笔数，最大值20
    String enableTradeOut = "true"; // String | 默认值为false。true为输出交易信息，false为不输出交易信息。
    Integer pageNum = 1; // Integer | 当前页码，为空时默认第一页
    try {
      AlipayEbppInvoiceTaxnoBatchqueryResponseModel result = apiInstance.batchquery(authToken, taxNo, invoiceKindList, scene, startInvoiceDate, endInvoiceDate, limitSize, enableTradeOut, pageNum);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceTaxnoApi#batchquery");
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
| **authToken** | **String**| 用户授权令牌 | [optional] |
| **taxNo** | **String**| 企业税号 | [optional] |
| **invoiceKindList** | **List&lt;String&gt;**| 查询票种列表。枚举值如下： *PLAIN：增值税电子普通发票； *SPECIAL：增值税专用发票； *PLAIN_INVOICE：增值税普通发票； *PAPER_INVOICE：增值税普通发票（卷式）； *SALSE_INVOICE：机动车销售统一发票。 | [optional] |
| **scene** | **String**| 发票要素获取应用场景。&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/10691/bv8s88\&quot;&gt;\&quot;拉\&quot;模式报销&lt;/a&gt; 固定为 INVOICE_EXPENSE 表示发票报销。 | [optional] |
| **startInvoiceDate** | **String**| 查询起始时间，精确到天（按开票日期查询） start_invoice_date和end_invoice_date传值要求 1.同时为空时，返回最近半年200条数据 2.必须同时为空 或 同时不为空 3.结束日期不能大于当前日期 4.开始时间和结束时间跨度不能超过6个月 | [optional] |
| **endInvoiceDate** | **String**| 查询结束时间，精确到天（按开票日期查询） start_invoice_date和end_invoice_date传值要求 1.同时为空时，返回最近半年200条数据 2.必须同时为空 或 同时不为空 3.结束日期不能大于当前日期 4.开始时间和结束时间跨度不能超过6个月 | [optional] |
| **limitSize** | **Integer**| 查询结果上限笔数，最大值20 | [optional] |
| **enableTradeOut** | **String**| 默认值为false。true为输出交易信息，false为不输出交易信息。 | [optional] |
| **pageNum** | **Integer**| 当前页码，为空时默认第一页 | [optional] |

### Return type

**AlipayEbppInvoiceTaxnoBatchqueryResponseModel**

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

