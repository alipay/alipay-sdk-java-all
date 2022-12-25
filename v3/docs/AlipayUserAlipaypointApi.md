# AlipayUserAlipaypointApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**send**](AlipayUserAlipaypointApi.md#send) | **POST** /v3/alipay/user/alipaypoint/send | 集分宝发放接口 |


<a name="send"></a>
# **send**
> AlipayUserAlipaypointSendResponseModel send(alipayUserAlipaypointSendModel)

集分宝发放接口

用于发放商户采购的集分宝给到支付宝用户

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayUserAlipaypointApi;

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

    AlipayUserAlipaypointApi apiInstance = new AlipayUserAlipaypointApi(defaultClient);
    AlipayUserAlipaypointSendModel alipayUserAlipaypointSendModel = new AlipayUserAlipaypointSendModel(); // AlipayUserAlipaypointSendModel | 
    try {
      AlipayUserAlipaypointSendResponseModel result = apiInstance.send(alipayUserAlipaypointSendModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayUserAlipaypointApi#send");
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
| **alipayUserAlipaypointSendModel** | **AlipayUserAlipaypointSendModel**|  | [optional] |

### Return type

**AlipayUserAlipaypointSendResponseModel**

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

