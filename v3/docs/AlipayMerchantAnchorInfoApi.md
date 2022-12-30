# AlipayMerchantAnchorInfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayMerchantAnchorInfoApi.md#query) | **GET** /v3/alipay/merchant/anchor/query | 查询主播信息 |


<a name="query"></a>
# **query**
> AlipayMerchantAnchorInfoQueryResponseModel query(userId, openId, publicId)

查询主播信息

查询主播信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMerchantAnchorInfoApi;

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

    AlipayMerchantAnchorInfoApi apiInstance = new AlipayMerchantAnchorInfoApi(defaultClient);
    String userId = "2088000011112222"; // String | 蚂蚁统一会员ID
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 蚂蚁统一会员ID
    String publicId = "2021000011112222"; // String | 生活号ID
    try {
      AlipayMerchantAnchorInfoQueryResponseModel result = apiInstance.query(userId, openId, publicId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMerchantAnchorInfoApi#query");
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
| **userId** | **String**| 蚂蚁统一会员ID | [optional] |
| **openId** | **String**| 蚂蚁统一会员ID | [optional] |
| **publicId** | **String**| 生活号ID | [optional] |

### Return type

**AlipayMerchantAnchorInfoQueryResponseModel**

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

