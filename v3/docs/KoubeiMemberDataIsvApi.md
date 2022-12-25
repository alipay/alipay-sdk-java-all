# KoubeiMemberDataIsvApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](KoubeiMemberDataIsvApi.md#create) | **POST** /v3/koubei/member/data/isv/create | isv 会员CRM数据回流 |


<a name="create"></a>
# **create**
> Object create(koubeiMemberDataIsvCreateModel)

isv 会员CRM数据回流

isv 会员CRM数据回流：isv对接商户，回流会员信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.KoubeiMemberDataIsvApi;

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

    KoubeiMemberDataIsvApi apiInstance = new KoubeiMemberDataIsvApi(defaultClient);
    KoubeiMemberDataIsvCreateModel koubeiMemberDataIsvCreateModel = new KoubeiMemberDataIsvCreateModel(); // KoubeiMemberDataIsvCreateModel | 
    try {
      Object result = apiInstance.create(koubeiMemberDataIsvCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KoubeiMemberDataIsvApi#create");
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
| **koubeiMemberDataIsvCreateModel** | **KoubeiMemberDataIsvCreateModel**|  | [optional] |

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

