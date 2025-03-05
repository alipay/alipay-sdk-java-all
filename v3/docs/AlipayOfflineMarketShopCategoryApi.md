# AlipayOfflineMarketShopCategoryApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOfflineMarketShopCategoryApi.md#query) | **GET** /v3/alipay/offline/market/shop/category/query | 门店类目配置查询接口 |


<a name="query"></a>
# **query**
> AlipayOfflineMarketShopCategoryQueryResponseModel query(categoryId, opRole)

门店类目配置查询接口

用于查询可用于开店的类目，以及类目上的配置约束信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOfflineMarketShopCategoryApi;

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

    AlipayOfflineMarketShopCategoryApi apiInstance = new AlipayOfflineMarketShopCategoryApi(defaultClient);
    String categoryId = "2015050700000000"; // String | 类目ID，如果为空则查询全部类目。
    String opRole = "ISV"; // String | 表示接口业务的调用方身份,默认不填标识为ISV。
    try {
      AlipayOfflineMarketShopCategoryQueryResponseModel result = apiInstance.query(categoryId, opRole);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOfflineMarketShopCategoryApi#query");
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
| **categoryId** | **String**| 类目ID，如果为空则查询全部类目。 | [optional] |
| **opRole** | **String**| 表示接口业务的调用方身份,默认不填标识为ISV。 | [optional] |

### Return type

**AlipayOfflineMarketShopCategoryQueryResponseModel**

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

