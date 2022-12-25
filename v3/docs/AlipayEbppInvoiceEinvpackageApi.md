# AlipayEbppInvoiceEinvpackageApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayEbppInvoiceEinvpackageApi.md#query) | **GET** /v3/alipay/ebpp/invoice/einvpackage/query | 查询用户发票包的明细信息 |


<a name="query"></a>
# **query**
> AlipayEbppInvoiceEinvpackageQueryResponseModel query(encryptedUid, packageId)

查询用户发票包的明细信息

第三方报销软件根据支付宝提供的用户的发票包id，查询对应的发票包的电子发票，ocr纸票和消费记录明细信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceEinvpackageApi;

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

    AlipayEbppInvoiceEinvpackageApi apiInstance = new AlipayEbppInvoiceEinvpackageApi(defaultClient);
    String encryptedUid = "Zhm4AKUE8ShJK6FYfKmk"; // String | 加密过的uid。获取详情参见 <a href=\"https://opendocs.alipay.com/open/017fwh\">\"推\"模式发票报销</a>。
    String packageId = "202004150000000000000000000"; // String | 发票包id。获取详情参见 <a href=\"https://opendocs.alipay.com/open/017fwh\">\"推\"模式发票报销</a>。
    try {
      AlipayEbppInvoiceEinvpackageQueryResponseModel result = apiInstance.query(encryptedUid, packageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceEinvpackageApi#query");
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
| **encryptedUid** | **String**| 加密过的uid。获取详情参见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/017fwh\&quot;&gt;\&quot;推\&quot;模式发票报销&lt;/a&gt;。 | [optional] |
| **packageId** | **String**| 发票包id。获取详情参见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/017fwh\&quot;&gt;\&quot;推\&quot;模式发票报销&lt;/a&gt;。 | [optional] |

### Return type

**AlipayEbppInvoiceEinvpackageQueryResponseModel**

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

