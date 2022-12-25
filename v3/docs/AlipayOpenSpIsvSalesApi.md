# AlipayOpenSpIsvSalesApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sync**](AlipayOpenSpIsvSalesApi.md#sync) | **POST** /v3/alipay/open/sp/isv/sales/sync | 商户销售数据回传接口 |


<a name="sync"></a>
# **sync**
> Object sync(alipayOpenSpIsvSalesSyncModel)

商户销售数据回传接口

针对SSB业务中，S2推广之后，推广的产品的销售数据回传

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSpIsvSalesApi;

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

    AlipayOpenSpIsvSalesApi apiInstance = new AlipayOpenSpIsvSalesApi(defaultClient);
    AlipayOpenSpIsvSalesSyncModel alipayOpenSpIsvSalesSyncModel = new AlipayOpenSpIsvSalesSyncModel(); // AlipayOpenSpIsvSalesSyncModel | 
    try {
      Object result = apiInstance.sync(alipayOpenSpIsvSalesSyncModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSpIsvSalesApi#sync");
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
| **alipayOpenSpIsvSalesSyncModel** | **AlipayOpenSpIsvSalesSyncModel**|  | [optional] |

### Return type

**Object**

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

