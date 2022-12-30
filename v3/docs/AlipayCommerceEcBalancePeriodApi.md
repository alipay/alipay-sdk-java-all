# AlipayCommerceEcBalancePeriodApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modify**](AlipayCommerceEcBalancePeriodApi.md#modify) | **POST** /v3/alipay/commerce/ec/balance/period/modify | 企业码月对账单账期修改 |


<a name="modify"></a>
# **modify**
> AlipayCommerceEcBalancePeriodModifyResponseModel modify(alipayCommerceEcBalancePeriodModifyModel)

企业码月对账单账期修改

用于在企业码B端后台创建的企业调整月对账单账期

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcBalancePeriodApi;

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

    AlipayCommerceEcBalancePeriodApi apiInstance = new AlipayCommerceEcBalancePeriodApi(defaultClient);
    AlipayCommerceEcBalancePeriodModifyModel alipayCommerceEcBalancePeriodModifyModel = new AlipayCommerceEcBalancePeriodModifyModel(); // AlipayCommerceEcBalancePeriodModifyModel | 
    try {
      AlipayCommerceEcBalancePeriodModifyResponseModel result = apiInstance.modify(alipayCommerceEcBalancePeriodModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcBalancePeriodApi#modify");
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
| **alipayCommerceEcBalancePeriodModifyModel** | **AlipayCommerceEcBalancePeriodModifyModel**|  | [optional] |

### Return type

**AlipayCommerceEcBalancePeriodModifyResponseModel**

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

