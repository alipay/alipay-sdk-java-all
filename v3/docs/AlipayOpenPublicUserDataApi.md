# AlipayOpenPublicUserDataApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayOpenPublicUserDataApi.md#batchquery) | **POST** /v3/alipay/open/public/user/data/batchquery | 用户分析数据查询接口 |


<a name="batchquery"></a>
# **batchquery**
> AlipayOpenPublicUserDataBatchqueryResponseModel batchquery(alipayOpenPublicUserDataBatchqueryModel)

用户分析数据查询接口

通过此接口，开发者可以根据时间查询30天内的关注用户人数、取消关注用户人数、净增关注人数、累计关注人数信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicUserDataApi;

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

    AlipayOpenPublicUserDataApi apiInstance = new AlipayOpenPublicUserDataApi(defaultClient);
    AlipayOpenPublicUserDataBatchqueryModel alipayOpenPublicUserDataBatchqueryModel = new AlipayOpenPublicUserDataBatchqueryModel(); // AlipayOpenPublicUserDataBatchqueryModel | 
    try {
      AlipayOpenPublicUserDataBatchqueryResponseModel result = apiInstance.batchquery(alipayOpenPublicUserDataBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicUserDataApi#batchquery");
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
| **alipayOpenPublicUserDataBatchqueryModel** | **AlipayOpenPublicUserDataBatchqueryModel**|  | [optional] |

### Return type

**AlipayOpenPublicUserDataBatchqueryResponseModel**

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

