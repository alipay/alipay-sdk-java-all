# AlipayMarketingCampaignCashListApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayMarketingCampaignCashListApi.md#query) | **GET** /v3/alipay/marketing/campaign/cash/list/query | 现金活动列表查询 |


<a name="query"></a>
# **query**
> AlipayMarketingCampaignCashListQueryResponseModel query(campStatus, pageSize, pageIndex)

现金活动列表查询

商户通过开放平台查询自己创建的现金活动列表

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingCampaignCashListApi;

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

    AlipayMarketingCampaignCashListApi apiInstance = new AlipayMarketingCampaignCashListApi(defaultClient);
    String campStatus = "PAID"; // String | 要查询的活动状态,不填默认为 ALL 返回所有类型。枚举支持: *ALL：所有类型的活动。 *CREATED：已创建未打款。 *PAID：已打款。 *READY：活动已开始。 *PAUSE：活动已暂停。 *CLOSED：活动已结束。 *SETTLE：活动已清算。
    String pageSize = "10"; // String | 分页查询时每页返回的列表大小，每页数据最大为 50。
    String pageIndex = "1"; // String | 分页查询时的页码，从1开始
    try {
      AlipayMarketingCampaignCashListQueryResponseModel result = apiInstance.query(campStatus, pageSize, pageIndex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingCampaignCashListApi#query");
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
| **campStatus** | **String**| 要查询的活动状态,不填默认为 ALL 返回所有类型。枚举支持: *ALL：所有类型的活动。 *CREATED：已创建未打款。 *PAID：已打款。 *READY：活动已开始。 *PAUSE：活动已暂停。 *CLOSED：活动已结束。 *SETTLE：活动已清算。 | [optional] |
| **pageSize** | **String**| 分页查询时每页返回的列表大小，每页数据最大为 50。 | [optional] |
| **pageIndex** | **String**| 分页查询时的页码，从1开始 | [optional] |

### Return type

**AlipayMarketingCampaignCashListQueryResponseModel**

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

