# ZhimaCreditPeZmgoPreorderApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](ZhimaCreditPeZmgoPreorderApi.md#create) | **PUT** /v3/zhima/credit/pe/zmgo/preorder/create | 芝麻GO签约预创单 |


<a name="create"></a>
# **create**
> ZhimaCreditPeZmgoPreorderCreateResponseModel create(zhimaCreditPeZmgoPreorderCreateModel)

芝麻GO签约预创单

芝麻GO签约三件套前预创建单据，预传入签约基本参数和自定义配置，并支持动态模板配置能力。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaCreditPeZmgoPreorderApi;

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

    ZhimaCreditPeZmgoPreorderApi apiInstance = new ZhimaCreditPeZmgoPreorderApi(defaultClient);
    ZhimaCreditPeZmgoPreorderCreateModel zhimaCreditPeZmgoPreorderCreateModel = new ZhimaCreditPeZmgoPreorderCreateModel(); // ZhimaCreditPeZmgoPreorderCreateModel | 
    try {
      ZhimaCreditPeZmgoPreorderCreateResponseModel result = apiInstance.create(zhimaCreditPeZmgoPreorderCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaCreditPeZmgoPreorderApi#create");
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
| **zhimaCreditPeZmgoPreorderCreateModel** | **ZhimaCreditPeZmgoPreorderCreateModel**|  | [optional] |

### Return type

**ZhimaCreditPeZmgoPreorderCreateResponseModel**

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

