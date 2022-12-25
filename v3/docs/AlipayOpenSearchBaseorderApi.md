# AlipayOpenSearchBaseorderApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modify**](AlipayOpenSearchBaseorderApi.md#modify) | **POST** /v3/alipay/open/search/baseorder/modify | 搜索运营提报基础信息工单 |


<a name="modify"></a>
# **modify**
> AlipayOpenSearchBaseorderModifyResponseModel modify(alipayOpenSearchBaseorderModifyModel)

搜索运营提报基础信息工单

搜索运营提报基础信息工单

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSearchBaseorderApi;

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

    AlipayOpenSearchBaseorderApi apiInstance = new AlipayOpenSearchBaseorderApi(defaultClient);
    AlipayOpenSearchBaseorderModifyModel alipayOpenSearchBaseorderModifyModel = new AlipayOpenSearchBaseorderModifyModel(); // AlipayOpenSearchBaseorderModifyModel | 
    try {
      AlipayOpenSearchBaseorderModifyResponseModel result = apiInstance.modify(alipayOpenSearchBaseorderModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSearchBaseorderApi#modify");
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
| **alipayOpenSearchBaseorderModifyModel** | **AlipayOpenSearchBaseorderModifyModel**|  | [optional] |

### Return type

**AlipayOpenSearchBaseorderModifyResponseModel**

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

