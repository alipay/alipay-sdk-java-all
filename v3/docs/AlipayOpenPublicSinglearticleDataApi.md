# AlipayOpenPublicSinglearticleDataApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayOpenPublicSinglearticleDataApi.md#batchquery) | **POST** /v3/alipay/open/public/singlearticle/data/batchquery | 图文分析-按文章查询数据接口 |


<a name="batchquery"></a>
# **batchquery**
> AlipayOpenPublicSinglearticleDataBatchqueryResponseModel batchquery(alipayOpenPublicSinglearticleDataBatchqueryModel)

图文分析-按文章查询数据接口

开发者可以通过本接口查询最近30天内发布的图文消息的数据，数据包括：发布时间、送达人数、阅读人数、分享人数等。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicSinglearticleDataApi;

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

    AlipayOpenPublicSinglearticleDataApi apiInstance = new AlipayOpenPublicSinglearticleDataApi(defaultClient);
    AlipayOpenPublicSinglearticleDataBatchqueryModel alipayOpenPublicSinglearticleDataBatchqueryModel = new AlipayOpenPublicSinglearticleDataBatchqueryModel(); // AlipayOpenPublicSinglearticleDataBatchqueryModel | 
    try {
      AlipayOpenPublicSinglearticleDataBatchqueryResponseModel result = apiInstance.batchquery(alipayOpenPublicSinglearticleDataBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicSinglearticleDataApi#batchquery");
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
| **alipayOpenPublicSinglearticleDataBatchqueryModel** | **AlipayOpenPublicSinglearticleDataBatchqueryModel**|  | [optional] |

### Return type

**AlipayOpenPublicSinglearticleDataBatchqueryResponseModel**

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

