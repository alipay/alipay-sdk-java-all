# AlipayMarketingActivityMerchantApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayMarketingActivityMerchantApi.md#batchquery) | **GET** /v3/alipay/marketing/activity/{activity_id}/merchant/batchquery | 查询活动可用商户 |


<a name="batchquery"></a>
# **batchquery**
> AlipayMarketingActivityMerchantBatchqueryResponseModel batchquery(activityId, merchantId, pageNum, pageSize, merchantAccessMode)

查询活动可用商户

通过此接口可查询活动的可用商户,判断活动是否在某商户可用，来决定是否展示。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityMerchantApi;

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

    AlipayMarketingActivityMerchantApi apiInstance = new AlipayMarketingActivityMerchantApi(defaultClient);
    String activityId = "2016042700826004508401111111"; // String | 活动id
    String merchantId = "2088202967380463"; // String | 商户PID,默认为当前接口调用商户  限制:  接口调用者必须有商户代运营权限。   代运营授权流程https://opendocs.alipay.com/mini/01hm6i#%E4%BB%A3%E8%BF%90%E8%90%A5%E6%8E%88%E6%9D%83
    Integer pageNum = 1; // Integer | 分页查询页码。  限制:  必须为大于0的整数
    Integer pageSize = 20; // Integer | 分页查询单页数据条数。  限制:  1.必须为大于0的整数  2.每页最大值为20
    String merchantAccessMode = "AGENCY_MODE"; // String | 商户接入模式  枚举值 SELF_MODE 商户自接入模式 AGENCY_MODE 服务商代接入模式
    try {
      AlipayMarketingActivityMerchantBatchqueryResponseModel result = apiInstance.batchquery(activityId, merchantId, pageNum, pageSize, merchantAccessMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityMerchantApi#batchquery");
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
| **merchantAccessMode** | **String**| 商户接入模式  枚举值 SELF_MODE 商户自接入模式 AGENCY_MODE 服务商代接入模式 | [optional] |

### Return type

**AlipayMarketingActivityMerchantBatchqueryResponseModel**

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

