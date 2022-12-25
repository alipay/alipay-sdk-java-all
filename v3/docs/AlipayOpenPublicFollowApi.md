# AlipayOpenPublicFollowApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayOpenPublicFollowApi.md#batchquery) | **POST** /v3/alipay/open/public/follow/batchquery | 获取关注者列表 |


<a name="batchquery"></a>
# **batchquery**
> AlipayOpenPublicFollowBatchqueryResponseModel batchquery(alipayOpenPublicFollowBatchqueryModel)

获取关注者列表

公众号可通过本接口来获取账号的关注者列表，关注者列表由一串userId组成。一次拉取调用最多拉取10000个关注者的userId，可以通过多次拉取的方式来满足需求。 公众号可通过本接口来获取账号的关注者列表，关注者列表由一串userId组成。一次拉取调用最多拉取10000个关注者的userId，可以通过多次拉取的方式来满足需求。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicFollowApi;

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

    AlipayOpenPublicFollowApi apiInstance = new AlipayOpenPublicFollowApi(defaultClient);
    AlipayOpenPublicFollowBatchqueryModel alipayOpenPublicFollowBatchqueryModel = new AlipayOpenPublicFollowBatchqueryModel(); // AlipayOpenPublicFollowBatchqueryModel | 
    try {
      AlipayOpenPublicFollowBatchqueryResponseModel result = apiInstance.batchquery(alipayOpenPublicFollowBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicFollowApi#batchquery");
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
| **alipayOpenPublicFollowBatchqueryModel** | **AlipayOpenPublicFollowBatchqueryModel**|  | [optional] |

### Return type

**AlipayOpenPublicFollowBatchqueryResponseModel**

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

