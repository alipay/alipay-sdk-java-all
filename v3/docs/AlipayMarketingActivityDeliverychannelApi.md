# AlipayMarketingActivityDeliverychannelApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayMarketingActivityDeliverychannelApi.md#query) | **POST** /v3/alipay/marketing/activity/deliverychannel/query | 查询可推广渠道 |


<a name="query"></a>
# **query**
> AlipayMarketingActivityDeliverychannelQueryResponseModel query(alipayMarketingActivityDeliverychannelQueryModel)

查询可推广渠道

查询可推广渠道。该接口会返回可以投放的所有渠道的详细信息。 其中每个渠道的boothCode含义：boothCode表达的是某个渠道可以投放的展位码。例如：支付结果页PAY_RESULT 其中每个渠道的channel含义：表达的是某个固定的渠道。例如：在boothCode &#x3D; PAY_RESULT 的情况下， channel &#x3D; 商户的pid。 该channel就是一个可以投放的渠道，投放后可以在对应的商户的支付结果页看到优惠券。后续创建投放时根据返回的 channel 选择投放渠道

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityDeliverychannelApi;

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

    AlipayMarketingActivityDeliverychannelApi apiInstance = new AlipayMarketingActivityDeliverychannelApi(defaultClient);
    AlipayMarketingActivityDeliverychannelQueryModel alipayMarketingActivityDeliverychannelQueryModel = new AlipayMarketingActivityDeliverychannelQueryModel(); // AlipayMarketingActivityDeliverychannelQueryModel | 
    try {
      AlipayMarketingActivityDeliverychannelQueryResponseModel result = apiInstance.query(alipayMarketingActivityDeliverychannelQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityDeliverychannelApi#query");
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
| **alipayMarketingActivityDeliverychannelQueryModel** | **AlipayMarketingActivityDeliverychannelQueryModel**|  | [optional] |

### Return type

**AlipayMarketingActivityDeliverychannelQueryResponseModel**

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

