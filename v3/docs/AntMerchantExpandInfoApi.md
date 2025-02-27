# AntMerchantExpandInfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AntMerchantExpandInfoApi.md#query) | **POST** /v3/ant/merchant/expand/info/query | 蚂蚁商户信息查询接口 |


<a name="query"></a>
# **query**
> AntMerchantExpandInfoQueryResponseModel query(antMerchantExpandInfoQueryModel)

蚂蚁商户信息查询接口

提供商户号查询商户基础信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AntMerchantExpandInfoApi;

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

    AntMerchantExpandInfoApi apiInstance = new AntMerchantExpandInfoApi(defaultClient);
    AntMerchantExpandInfoQueryModel antMerchantExpandInfoQueryModel = new AntMerchantExpandInfoQueryModel(); // AntMerchantExpandInfoQueryModel | 
    try {
      AntMerchantExpandInfoQueryResponseModel result = apiInstance.query(antMerchantExpandInfoQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntMerchantExpandInfoApi#query");
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
| **antMerchantExpandInfoQueryModel** | **AntMerchantExpandInfoQueryModel**|  | [optional] |

### Return type

**AntMerchantExpandInfoQueryResponseModel**

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

