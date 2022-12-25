# AlipayUserPassInstancebatchApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**add**](AlipayUserPassInstancebatchApi.md#add) | **POST** /v3/alipay/user/pass/instancebatch/add | 卡券实例批量发放接口 |


<a name="add"></a>
# **add**
> AlipayUserPassInstancebatchAddResponseModel add(alipayUserPassInstancebatchAddModel)

卡券实例批量发放接口

商家向用户一次性发放多张卡券时使用，常被称作优惠大礼包。支付宝将保证批次的事务型，即要么都成功，要么都失败。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayUserPassInstancebatchApi;

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

    AlipayUserPassInstancebatchApi apiInstance = new AlipayUserPassInstancebatchApi(defaultClient);
    AlipayUserPassInstancebatchAddModel alipayUserPassInstancebatchAddModel = new AlipayUserPassInstancebatchAddModel(); // AlipayUserPassInstancebatchAddModel | 
    try {
      AlipayUserPassInstancebatchAddResponseModel result = apiInstance.add(alipayUserPassInstancebatchAddModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayUserPassInstancebatchApi#add");
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
| **alipayUserPassInstancebatchAddModel** | **AlipayUserPassInstancebatchAddModel**|  | [optional] |

### Return type

**AlipayUserPassInstancebatchAddResponseModel**

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

