# AlipayOpenMiniTipsStatisticApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenMiniTipsStatisticApi.md#query) | **GET** /v3/alipay/open/mini/tips/statistic/query | 小程序收藏引导汇总数据查询 |


<a name="query"></a>
# **query**
> AlipayOpenMiniTipsStatisticQueryResponseModel query(deliveryId, queryType, startDate, endDate)

小程序收藏引导汇总数据查询

小程序收藏引导tips文案投放汇总数据查询接口。可查询小程序维度或活动维度的tips曝光uv，收藏uv，以及收藏转化率。请先配置投放活动，否则查询结果返回参数为空。

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
    String deliveryId = "20220308000000934758"; // String | 收藏引导投放活动ID，供查询收藏引导活动配置接口调用 ，当以小程序维度查询数据（query_type为app）时delivery_id为空
    String queryType = "app"; // String | 查询类型，表示以当前维度进行数据聚合。
    String startDate = "20220322"; // String | 查询开始日期，精度为天
    String endDate = "20220328"; // String | 查询截止日期，精度为天
    try {
      AlipayOpenMiniTipsStatisticQueryResponseModel result = apiInstance.query(deliveryId, queryType, startDate, endDate);
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
| **deliveryId** | **String**| 收藏引导投放活动ID，供查询收藏引导活动配置接口调用 ，当以小程序维度查询数据（query_type为app）时delivery_id为空 | [optional] |
| **queryType** | **String**| 查询类型，表示以当前维度进行数据聚合。 | [optional] |
| **startDate** | **String**| 查询开始日期，精度为天 | [optional] |
| **endDate** | **String**| 查询截止日期，精度为天 | [optional] |

### Return type

**AlipayOpenMiniTipsStatisticQueryResponseModel**

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

