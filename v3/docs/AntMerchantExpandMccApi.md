# AntMerchantExpandMccApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AntMerchantExpandMccApi.md#query) | **GET** /3/ant/merchant/mcc/query | 商户mcc信息查询 |


<a name="query"></a>
# **query**
> Object query(mccCodeList)

商户mcc信息查询

用于查询商户的新版本mcc行业信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AntMerchantExpandMccApi;

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

    AntMerchantExpandMccApi apiInstance = new AntMerchantExpandMccApi(defaultClient);
    String mccCodeList = "B0001,B0002"; // String | 传入需要查询的code列表，以分号分隔；注：如果需要查询完整类目树，可以传入ROOT
    try {
      Object result = apiInstance.query(mccCodeList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntMerchantExpandMccApi#query");
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
| **mccCodeList** | **String**| 传入需要查询的code列表，以分号分隔；注：如果需要查询完整类目树，可以传入ROOT | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

