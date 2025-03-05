# AlipayEbppPdeductApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pay**](AlipayEbppPdeductApi.md#pay) | **POST** /v3/alipay/ebpp/pdeduct/pay | 公共事业缴费直连代扣扣款支付接口 |


<a name="pay"></a>
# **pay**
> AlipayEbppPdeductPayResponseModel pay(alipayEbppPdeductPayModel)

公共事业缴费直连代扣扣款支付接口

直连代扣机构根据用户个人签约协议，按期按账单请求从用户账户扣款的接口。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppPdeductApi;

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

    AlipayEbppPdeductApi apiInstance = new AlipayEbppPdeductApi(defaultClient);
    AlipayEbppPdeductPayModel alipayEbppPdeductPayModel = new AlipayEbppPdeductPayModel(); // AlipayEbppPdeductPayModel | 
    try {
      AlipayEbppPdeductPayResponseModel result = apiInstance.pay(alipayEbppPdeductPayModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppPdeductApi#pay");
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
| **alipayEbppPdeductPayModel** | **AlipayEbppPdeductPayModel**|  | [optional] |

### Return type

**AlipayEbppPdeductPayResponseModel**

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

