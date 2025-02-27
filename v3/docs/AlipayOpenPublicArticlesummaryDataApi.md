# AlipayOpenPublicArticlesummaryDataApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayOpenPublicArticlesummaryDataApi.md#batchquery) | **POST** /v3/alipay/open/public/articlesummary/data/batchquery | 图文分析-按时间查询数据接口 |


<a name="batchquery"></a>
# **batchquery**
> AlipayOpenPublicArticlesummaryDataBatchqueryResponseModel batchquery()

图文分析-按时间查询数据接口

开发者可以通过图文分析接口查询30天内，所有历史发布的图文消息的数据，包括送达人数、曝光人数、图文阅读人数、分享人数等信息。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicArticlesummaryDataApi;

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

    AlipayOpenPublicArticlesummaryDataApi apiInstance = new AlipayOpenPublicArticlesummaryDataApi(defaultClient);
    try {
      AlipayOpenPublicArticlesummaryDataBatchqueryResponseModel result = apiInstance.batchquery();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicArticlesummaryDataApi#batchquery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**AlipayOpenPublicArticlesummaryDataBatchqueryResponseModel**

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

