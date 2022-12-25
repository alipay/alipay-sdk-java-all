# ZhimaCreditPeZmgoBizoptApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**close**](ZhimaCreditPeZmgoBizoptApi.md#close) | **POST** /v3/zhima/credit/pe/zmgo/bizopt/close | 芝麻GO签约关单 |


<a name="close"></a>
# **close**
> ZhimaCreditPeZmgoBizoptCloseResponseModel close(zhimaCreditPeZmgoBizoptCloseModel)

芝麻GO签约关单

签约芝麻GO时，在签约申请时会生初始状态的签约单，如果后续不进行签约确认，可通过此接口关闭签约单

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaCreditPeZmgoBizoptApi;

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

    ZhimaCreditPeZmgoBizoptApi apiInstance = new ZhimaCreditPeZmgoBizoptApi(defaultClient);
    ZhimaCreditPeZmgoBizoptCloseModel zhimaCreditPeZmgoBizoptCloseModel = new ZhimaCreditPeZmgoBizoptCloseModel(); // ZhimaCreditPeZmgoBizoptCloseModel | 
    try {
      ZhimaCreditPeZmgoBizoptCloseResponseModel result = apiInstance.close(zhimaCreditPeZmgoBizoptCloseModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaCreditPeZmgoBizoptApi#close");
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
| **zhimaCreditPeZmgoBizoptCloseModel** | **ZhimaCreditPeZmgoBizoptCloseModel**|  | [optional] |

### Return type

**ZhimaCreditPeZmgoBizoptCloseResponseModel**

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

