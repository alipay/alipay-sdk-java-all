# AlipayCommerceLogisticsOrderIstdretryApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayCommerceLogisticsOrderIstdretryApi.md#create) | **POST** /v3/alipay/commerce/logistics/order/istdretry/create | 重下即时配送订单 |


<a name="create"></a>
# **create**
> AlipayCommerceLogisticsOrderIstdretryCreateResponseModel create(alipayCommerceLogisticsOrderIstdretryCreateModel)

重下即时配送订单

重下即时配送订单

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceLogisticsOrderIstdretryApi;

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

    AlipayCommerceLogisticsOrderIstdretryApi apiInstance = new AlipayCommerceLogisticsOrderIstdretryApi(defaultClient);
    AlipayCommerceLogisticsOrderIstdretryCreateModel alipayCommerceLogisticsOrderIstdretryCreateModel = new AlipayCommerceLogisticsOrderIstdretryCreateModel(); // AlipayCommerceLogisticsOrderIstdretryCreateModel | 
    try {
      AlipayCommerceLogisticsOrderIstdretryCreateResponseModel result = apiInstance.create(alipayCommerceLogisticsOrderIstdretryCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceLogisticsOrderIstdretryApi#create");
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
| **alipayCommerceLogisticsOrderIstdretryCreateModel** | **AlipayCommerceLogisticsOrderIstdretryCreateModel**|  | [optional] |

### Return type

**AlipayCommerceLogisticsOrderIstdretryCreateResponseModel**

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

