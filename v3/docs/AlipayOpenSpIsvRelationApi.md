# AlipayOpenSpIsvRelationApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenSpIsvRelationApi.md#query) | **GET** /v3/alipay/open/sp/isv/relation/query | spcenter服务商推广关系查询 |


<a name="query"></a>
# **query**
> AlipayOpenSpIsvRelationQueryResponseModel query(commodityId, pageSize, pageNum)

spcenter服务商推广关系查询

用于开发服务商查询已与其达成推广关系的地推服务商信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSpIsvRelationApi;

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

    AlipayOpenSpIsvRelationApi apiInstance = new AlipayOpenSpIsvRelationApi(defaultClient);
    String commodityId = "SS010301000000001908"; // String | 服务市场商品Code
    String pageSize = "10"; // String | 每页数量，范围(1-100)。默认：10
    String pageNum = "1"; // String | 当前页码，从1开始。默认：1
    try {
      AlipayOpenSpIsvRelationQueryResponseModel result = apiInstance.query(commodityId, pageSize, pageNum);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSpIsvRelationApi#query");
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
| **commodityId** | **String**| 服务市场商品Code | [optional] |
| **pageSize** | **String**| 每页数量，范围(1-100)。默认：10 | [optional] |
| **pageNum** | **String**| 当前页码，从1开始。默认：1 | [optional] |

### Return type

**AlipayOpenSpIsvRelationQueryResponseModel**

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

