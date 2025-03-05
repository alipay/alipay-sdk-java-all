# AlipayCommerceOperationBankActivityApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayCommerceOperationBankActivityApi.md#query) | **GET** /v3/alipay/commerce/operation/bank/activity/query | 银行活动信息查询 |


<a name="query"></a>
# **query**
> AlipayCommerceOperationBankActivityQueryResponseModel query(openId, userId)

银行活动信息查询

银行活动信息查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceOperationBankActivityApi;

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

    AlipayCommerceOperationBankActivityApi apiInstance = new AlipayCommerceOperationBankActivityApi(defaultClient);
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 支付宝openId
    String userId = "208822294389xxxx"; // String | 蚂蚁统一会员ID
    try {
      AlipayCommerceOperationBankActivityQueryResponseModel result = apiInstance.query(openId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceOperationBankActivityApi#query");
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
| **openId** | **String**| 支付宝openId | [optional] |
| **userId** | **String**| 蚂蚁统一会员ID | [optional] |

### Return type

**AlipayCommerceOperationBankActivityQueryResponseModel**

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

