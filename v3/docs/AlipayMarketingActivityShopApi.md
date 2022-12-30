# AlipayMarketingActivityShopApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayMarketingActivityShopApi.md#batchquery) | **GET** /v3/alipay/marketing/activity/{activity_id}/shop/batchquery | 查询活动可用门店 |


<a name="batchquery"></a>
# **batchquery**
> AlipayMarketingActivityShopBatchqueryResponseModel batchquery(activityId, merchantId, pageNum, pageSize, productVersion, merchantAccessMode)

查询活动可用门店

通过此接口可查询活动的可用门店，判断券是否在某门店可用，来决定是否展示。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityShopApi;

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

    AlipayMarketingActivityShopApi apiInstance = new AlipayMarketingActivityShopApi(defaultClient);
    String activityId = "2016042700826004508401111111"; // String | 活动id
    String merchantId = "2088202967380463"; // String | 商户PID,默认为当前接口调用商户  限制:  接口调用者必须有商户代运营权限。   代运营授权流程https://opendocs.alipay.com/mini/01hm6i#%E4%BB%A3%E8%BF%90%E8%90%A5%E6%8E%88%E6%9D%83
    Integer pageNum = 1; // Integer | 分页查询页码。  限制:  必须为大于0的整数
    Integer pageSize = 20; // Integer | 分页查询单页数据条数。  限制:  1.必须为大于0的整数  2.每页最大值为20
    String productVersion = "2.0.0"; // String | 版本号  枚举值: 2.0.0
    String merchantAccessMode = "AGENCY_MODE"; // String | 商户接入模式  枚举值 SELF_MODE 商户自接入模式 AGENCY_MODE 服务商代接入模式
    try {
      AlipayMarketingActivityShopBatchqueryResponseModel result = apiInstance.batchquery(activityId, merchantId, pageNum, pageSize, productVersion, merchantAccessMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityShopApi#batchquery");
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
| **merchantId** | **String**| 商户PID,默认为当前接口调用商户  限制:  接口调用者必须有商户代运营权限。   代运营授权流程https://opendocs.alipay.com/mini/01hm6i#%E4%BB%A3%E8%BF%90%E8%90%A5%E6%8E%88%E6%9D%83 | [optional] |
| **pageNum** | **Integer**| 分页查询页码。  限制:  必须为大于0的整数 | [optional] |
| **pageSize** | **Integer**| 分页查询单页数据条数。  限制:  1.必须为大于0的整数  2.每页最大值为20 | [optional] |
| **productVersion** | **String**| 版本号  枚举值: 2.0.0 | [optional] |
| **merchantAccessMode** | **String**| 商户接入模式  枚举值 SELF_MODE 商户自接入模式 AGENCY_MODE 服务商代接入模式 | [optional] |

### Return type

**AlipayMarketingActivityShopBatchqueryResponseModel**

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

