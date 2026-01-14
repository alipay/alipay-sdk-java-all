# AlipayOpenServicemarketCommodityShopApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**offline**](AlipayOpenServicemarketCommodityShopApi.md#offline) | **POST** /v3/alipay/open/servicemarket/commodity/shop/offline | 门店插件下架操作 |


<a name="offline"></a>
# **offline**
> Object offline(alipayOpenServicemarketCommodityShopOfflineModel)

门店插件下架操作

本接口需要商户授权服务商门店操作权限后，服务商可对商户门店上的插件进行下架操作

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenServicemarketCommodityShopApi;

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

    AlipayOpenServicemarketCommodityShopApi apiInstance = new AlipayOpenServicemarketCommodityShopApi(defaultClient);
    AlipayOpenServicemarketCommodityShopOfflineModel alipayOpenServicemarketCommodityShopOfflineModel = new AlipayOpenServicemarketCommodityShopOfflineModel(); // AlipayOpenServicemarketCommodityShopOfflineModel | 
    try {
      Object result = apiInstance.offline(alipayOpenServicemarketCommodityShopOfflineModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenServicemarketCommodityShopApi#offline");
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
| **alipayOpenServicemarketCommodityShopOfflineModel** | **AlipayOpenServicemarketCommodityShopOfflineModel**|  | [optional] |

### Return type

**Object**

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

