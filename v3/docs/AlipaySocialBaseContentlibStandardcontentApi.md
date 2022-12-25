# AlipaySocialBaseContentlibStandardcontentApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipaySocialBaseContentlibStandardcontentApi.md#batchquery) | **POST** /v3/alipay/social/base/contentlib/standardcontent/batchquery | 内容批量查询接口 |


<a name="batchquery"></a>
# **batchquery**
> AlipaySocialBaseContentlibStandardcontentBatchqueryResponseModel batchquery(alipaySocialBaseContentlibStandardcontentBatchqueryModel)

内容批量查询接口

支付宝生活号+查询当前账号下发布过的内容及对应详情信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipaySocialBaseContentlibStandardcontentApi;

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

    AlipaySocialBaseContentlibStandardcontentApi apiInstance = new AlipaySocialBaseContentlibStandardcontentApi(defaultClient);
    AlipaySocialBaseContentlibStandardcontentBatchqueryModel alipaySocialBaseContentlibStandardcontentBatchqueryModel = new AlipaySocialBaseContentlibStandardcontentBatchqueryModel(); // AlipaySocialBaseContentlibStandardcontentBatchqueryModel | 
    try {
      AlipaySocialBaseContentlibStandardcontentBatchqueryResponseModel result = apiInstance.batchquery(alipaySocialBaseContentlibStandardcontentBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipaySocialBaseContentlibStandardcontentApi#batchquery");
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
| **alipaySocialBaseContentlibStandardcontentBatchqueryModel** | **AlipaySocialBaseContentlibStandardcontentBatchqueryModel**|  | [optional] |

### Return type

**AlipaySocialBaseContentlibStandardcontentBatchqueryResponseModel**

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

