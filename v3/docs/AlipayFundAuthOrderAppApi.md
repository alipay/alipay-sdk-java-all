# AlipayFundAuthOrderAppApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**freeze**](AlipayFundAuthOrderAppApi.md#freeze) | **POST** /v3/alipay/fund/auth/order/app/freeze | 线上资金授权冻结接口 |


<a name="freeze"></a>
# **freeze**
> AlipayFundAuthOrderAppFreezeResponseModel freeze(alipayFundAuthOrderAppFreezeModel)

线上资金授权冻结接口

创建支付宝授权订单并完成资金冻结。适用于线上场景完成资金授权, 例如从商户APP端拉起支付宝收银台完成冻结。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundAuthOrderAppApi;

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

    AlipayFundAuthOrderAppApi apiInstance = new AlipayFundAuthOrderAppApi(defaultClient);
    AlipayFundAuthOrderAppFreezeModel alipayFundAuthOrderAppFreezeModel = new AlipayFundAuthOrderAppFreezeModel(); // AlipayFundAuthOrderAppFreezeModel | 
    try {
      AlipayFundAuthOrderAppFreezeResponseModel result = apiInstance.freeze(alipayFundAuthOrderAppFreezeModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundAuthOrderAppApi#freeze");
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
| **alipayFundAuthOrderAppFreezeModel** | **AlipayFundAuthOrderAppFreezeModel**|  | [optional] |

### Return type

**AlipayFundAuthOrderAppFreezeResponseModel**

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

