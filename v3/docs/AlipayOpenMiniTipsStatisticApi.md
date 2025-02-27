# AlipayOpenMiniTipsStatisticApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenMiniTipsStatisticApi.md#query) | **POST** /v3/alipay/open/mini/tips/statistic/query | 小程序收藏引导汇总数据查询 |


<a name="query"></a>
# **query**
> AlipayOpenMiniTipsStatisticQueryResponseModel query(alipayOpenMiniTipsStatisticQueryModel)

小程序收藏引导汇总数据查询

小程序收藏引导tips文案投放汇总数据查询接口。可查询小程序维度或活动维度的tips曝光uv，收藏uv，以及收藏转化率

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniTipsStatisticApi;

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

    AlipayOpenMiniTipsStatisticApi apiInstance = new AlipayOpenMiniTipsStatisticApi(defaultClient);
    AlipayOpenMiniTipsStatisticQueryModel alipayOpenMiniTipsStatisticQueryModel = new AlipayOpenMiniTipsStatisticQueryModel(); // AlipayOpenMiniTipsStatisticQueryModel | 
    try {
      AlipayOpenMiniTipsStatisticQueryResponseModel result = apiInstance.query(alipayOpenMiniTipsStatisticQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniTipsStatisticApi#query");
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
| **alipayOpenMiniTipsStatisticQueryModel** | **AlipayOpenMiniTipsStatisticQueryModel**|  | [optional] |

### Return type

**AlipayOpenMiniTipsStatisticQueryResponseModel**

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

