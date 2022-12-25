# AlipayOpenPublicMenuDataApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayOpenPublicMenuDataApi.md#batchquery) | **POST** /v3/alipay/open/public/menu/data/batchquery | 菜单分析数据查询接口 |


<a name="batchquery"></a>
# **batchquery**
> AlipayOpenPublicMenuDataBatchqueryResponseModel batchquery(alipayOpenPublicMenuDataBatchqueryModel)

菜单分析数据查询接口

开发者可以根据本接口查询30天内菜单的相关数据，包括菜单点击人数和次数

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicMenuDataApi;

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

    AlipayOpenPublicMenuDataApi apiInstance = new AlipayOpenPublicMenuDataApi(defaultClient);
    AlipayOpenPublicMenuDataBatchqueryModel alipayOpenPublicMenuDataBatchqueryModel = new AlipayOpenPublicMenuDataBatchqueryModel(); // AlipayOpenPublicMenuDataBatchqueryModel | 
    try {
      AlipayOpenPublicMenuDataBatchqueryResponseModel result = apiInstance.batchquery(alipayOpenPublicMenuDataBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicMenuDataApi#batchquery");
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
| **alipayOpenPublicMenuDataBatchqueryModel** | **AlipayOpenPublicMenuDataBatchqueryModel**|  | [optional] |

### Return type

**AlipayOpenPublicMenuDataBatchqueryResponseModel**

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

