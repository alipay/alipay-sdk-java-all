# AlipayOpenSpMerchantInconsistentApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approve**](AlipayOpenSpMerchantInconsistentApi.md#approve) | **POST** /v3/alipay/open/sp/merchant/inconsistent/approve | 非同人商家进件资料审批 |


<a name="approve"></a>
# **approve**
> AlipayOpenSpMerchantInconsistentApproveResponseModel approve(alipayOpenSpMerchantInconsistentApproveModel)

非同人商家进件资料审批

针对服务优选扫码点餐小程序，用于收集并审核非同人商家的进件资料。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSpMerchantInconsistentApi;

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

    AlipayOpenSpMerchantInconsistentApi apiInstance = new AlipayOpenSpMerchantInconsistentApi(defaultClient);
    AlipayOpenSpMerchantInconsistentApproveModel alipayOpenSpMerchantInconsistentApproveModel = new AlipayOpenSpMerchantInconsistentApproveModel(); // AlipayOpenSpMerchantInconsistentApproveModel | 
    try {
      AlipayOpenSpMerchantInconsistentApproveResponseModel result = apiInstance.approve(alipayOpenSpMerchantInconsistentApproveModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSpMerchantInconsistentApi#approve");
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
| **alipayOpenSpMerchantInconsistentApproveModel** | **AlipayOpenSpMerchantInconsistentApproveModel**|  | [optional] |

### Return type

**AlipayOpenSpMerchantInconsistentApproveResponseModel**

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

