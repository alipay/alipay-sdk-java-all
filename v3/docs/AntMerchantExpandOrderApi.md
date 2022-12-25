# AntMerchantExpandOrderApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AntMerchantExpandOrderApi.md#query) | **GET** /v3/ant/merchant/order/{order_id} | 商户申请单查询 |


<a name="query"></a>
# **query**
> AntMerchantExpandOrderQueryResponseModel query(orderId)

商户申请单查询

服务商根据申请单id，查询自己提交的商户进件、管理等申请单

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AntMerchantExpandOrderApi;

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

    AntMerchantExpandOrderApi apiInstance = new AntMerchantExpandOrderApi(defaultClient);
    String orderId = "2017112200502000000004754299"; // String | 申请单 id。 1.蚂蚁门店管理场景：通过 <a href=\"https://opendocs.alipay.com/apis/014tmc\">ant.merchant.expand.shop.create</a>(蚂蚁店铺创建)接口进件时返回的order_id。 2.直付通二级商户进件场景：通过<a href=\"https://opendocs.alipay.com/pre-apis/00a8e3\">ant.merchant.expand.indirect.zft.create</a>(直付通二级商户创建)接口进件时返回的order_id。
    try {
      AntMerchantExpandOrderQueryResponseModel result = apiInstance.query(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntMerchantExpandOrderApi#query");
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
| **orderId** | **String**| 申请单 id。 1.蚂蚁门店管理场景：通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/014tmc\&quot;&gt;ant.merchant.expand.shop.create&lt;/a&gt;(蚂蚁店铺创建)接口进件时返回的order_id。 2.直付通二级商户进件场景：通过&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/pre-apis/00a8e3\&quot;&gt;ant.merchant.expand.indirect.zft.create&lt;/a&gt;(直付通二级商户创建)接口进件时返回的order_id。 | |

### Return type

**AntMerchantExpandOrderQueryResponseModel**

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

