# AlipayFundAuthOrderVoucherApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayFundAuthOrderVoucherApi.md#create) | **POST** /v3/alipay/fund/auth/order/voucher/create | 资金授权发码接口 |


<a name="create"></a>
# **create**
> AlipayFundAuthOrderVoucherCreateResponseModel create(alipayFundAuthOrderVoucherCreateModel)

资金授权发码接口

收银员通过收银台或商户后台调用支付宝接口，生成二维码后，展示给用户，由用户扫描二维码完成资金冻结。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundAuthOrderVoucherApi;

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

    AlipayFundAuthOrderVoucherApi apiInstance = new AlipayFundAuthOrderVoucherApi(defaultClient);
    AlipayFundAuthOrderVoucherCreateModel alipayFundAuthOrderVoucherCreateModel = new AlipayFundAuthOrderVoucherCreateModel(); // AlipayFundAuthOrderVoucherCreateModel | 
    try {
      AlipayFundAuthOrderVoucherCreateResponseModel result = apiInstance.create(alipayFundAuthOrderVoucherCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundAuthOrderVoucherApi#create");
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
| **alipayFundAuthOrderVoucherCreateModel** | **AlipayFundAuthOrderVoucherCreateModel**|  | [optional] |

### Return type

**AlipayFundAuthOrderVoucherCreateResponseModel**

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

