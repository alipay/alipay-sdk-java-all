# AlipayMarketingActivityGoodsApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayMarketingActivityGoodsApi.md#batchquery) | **GET** /v3/alipay/marketing/activity/{activity_id}/goods/batchquery | 查询活动适用商品 |


<a name="batchquery"></a>
# **batchquery**
> AlipayMarketingActivityGoodsBatchqueryResponseModel batchquery(activityId, merchantId, goodsUseType, pageNum, pageSize, productVersion, merchantAccessMode)

查询活动适用商品

通过此接口可查询活动的可用或不可用商品,判断是否在该商品可用，来决定是否展示。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityGoodsApi;

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

    AlipayMarketingActivityGoodsApi apiInstance = new AlipayMarketingActivityGoodsApi(defaultClient);
    String activityId = "2016042700826004508401111111"; // String | 活动id
    String merchantId = "2088202967380463"; // String | 商户PID,默认为当前接口调用商户。
    String goodsUseType = "AVAILABLE"; // String | 活动单品类型。
    Integer pageNum = 1; // Integer | 分页查询页码。 限制: 必须为大于0的整数
    Integer pageSize = 20; // Integer | 分页查询单页数据条数。 限制: 1.必须为大于0的整数 2.每页最大值为20
    String productVersion = "2.0.0"; // String | 版本号  枚举值: 2.0.0
    String merchantAccessMode = "AGENCY_MODE"; // String | 商户接入模式
    try {
      AlipayMarketingActivityGoodsBatchqueryResponseModel result = apiInstance.batchquery(activityId, merchantId, goodsUseType, pageNum, pageSize, productVersion, merchantAccessMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityGoodsApi#batchquery");
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
| **activityId** | **String**| 活动id | |
| **merchantId** | **String**| 商户PID,默认为当前接口调用商户。 | [optional] |
| **goodsUseType** | **String**| 活动单品类型。 | [optional] |
| **pageNum** | **Integer**| 分页查询页码。 限制: 必须为大于0的整数 | [optional] |
| **pageSize** | **Integer**| 分页查询单页数据条数。 限制: 1.必须为大于0的整数 2.每页最大值为20 | [optional] |
| **productVersion** | **String**| 版本号  枚举值: 2.0.0 | [optional] |
| **merchantAccessMode** | **String**| 商户接入模式 | [optional] |

### Return type

**AlipayMarketingActivityGoodsBatchqueryResponseModel**

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

