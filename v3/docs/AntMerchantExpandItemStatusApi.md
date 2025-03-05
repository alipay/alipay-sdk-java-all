# AntMerchantExpandItemStatusApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modify**](AntMerchantExpandItemStatusApi.md#modify) | **POST** /v3/ant/merchant/expand/item/status/modify | 商品状态修改接口 |


<a name="modify"></a>
# **modify**
> AntMerchantExpandItemStatusModifyResponseModel modify(antMerchantExpandItemStatusModifyModel)

商品状态修改接口

用于服务商或商户修改商品状态

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AntMerchantExpandItemStatusApi;

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

    AntMerchantExpandItemStatusApi apiInstance = new AntMerchantExpandItemStatusApi(defaultClient);
    AntMerchantExpandItemStatusModifyModel antMerchantExpandItemStatusModifyModel = new AntMerchantExpandItemStatusModifyModel(); // AntMerchantExpandItemStatusModifyModel | 
    try {
      AntMerchantExpandItemStatusModifyResponseModel result = apiInstance.modify(antMerchantExpandItemStatusModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntMerchantExpandItemStatusApi#modify");
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
| **antMerchantExpandItemStatusModifyModel** | **AntMerchantExpandItemStatusModifyModel**|  | [optional] |

### Return type

**AntMerchantExpandItemStatusModifyResponseModel**

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

