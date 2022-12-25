# AlipayPassInstanceApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**add**](AlipayPassInstanceApi.md#add) | **POST** /v3/alipay/pass/instance/add | 卡券实例发放接口 |
| [**update**](AlipayPassInstanceApi.md#update) | **POST** /v3/alipay/pass/instance/update | 卡券实例更新接口 |


<a name="add"></a>
# **add**
> AlipayPassInstanceAddResponseModel add(alipayPassInstanceAddModel)

卡券实例发放接口

卡券模板生成后，如需将卡券发布给对应的用户，则调用此接口。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayPassInstanceApi;

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

    AlipayPassInstanceApi apiInstance = new AlipayPassInstanceApi(defaultClient);
    AlipayPassInstanceAddModel alipayPassInstanceAddModel = new AlipayPassInstanceAddModel(); // AlipayPassInstanceAddModel | 
    try {
      AlipayPassInstanceAddResponseModel result = apiInstance.add(alipayPassInstanceAddModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayPassInstanceApi#add");
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
| **alipayPassInstanceAddModel** | **AlipayPassInstanceAddModel**|  | [optional] |

### Return type

**AlipayPassInstanceAddResponseModel**

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

<a name="update"></a>
# **update**
> AlipayPassInstanceUpdateResponseModel update(alipayPassInstanceUpdateModel)

卡券实例更新接口

对于已发放的卡券实例，可通过此接口更新信息，通常用于更新使用状态。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayPassInstanceApi;

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

    AlipayPassInstanceApi apiInstance = new AlipayPassInstanceApi(defaultClient);
    AlipayPassInstanceUpdateModel alipayPassInstanceUpdateModel = new AlipayPassInstanceUpdateModel(); // AlipayPassInstanceUpdateModel | 
    try {
      AlipayPassInstanceUpdateResponseModel result = apiInstance.update(alipayPassInstanceUpdateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayPassInstanceApi#update");
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
| **alipayPassInstanceUpdateModel** | **AlipayPassInstanceUpdateModel**|  | [optional] |

### Return type

**AlipayPassInstanceUpdateResponseModel**

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

