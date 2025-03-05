# AlipayOpenPublicMatchuserLabelApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayOpenPublicMatchuserLabelApi.md#create) | **POST** /v3/alipay/open/public/matchuser/label/create | 用户打标接口 |
| [**delete**](AlipayOpenPublicMatchuserLabelApi.md#delete) | **POST** /v3/alipay/open/public/matchuser/label/delete | 用户取消标签接口 |


<a name="create"></a>
# **create**
> AlipayOpenPublicMatchuserLabelCreateResponseModel create(alipayOpenPublicMatchuserLabelCreateModel)

用户打标接口

开发者可以使用此接口向匹配到的用户添加指定标签值，每个用户每个标签只能有一个标签值，当向同一个用户添加多个标签值时，最新的标签值会覆盖之前的标签值

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicMatchuserLabelApi;

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

    AlipayOpenPublicMatchuserLabelApi apiInstance = new AlipayOpenPublicMatchuserLabelApi(defaultClient);
    AlipayOpenPublicMatchuserLabelCreateModel alipayOpenPublicMatchuserLabelCreateModel = new AlipayOpenPublicMatchuserLabelCreateModel(); // AlipayOpenPublicMatchuserLabelCreateModel | 
    try {
      AlipayOpenPublicMatchuserLabelCreateResponseModel result = apiInstance.create(alipayOpenPublicMatchuserLabelCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicMatchuserLabelApi#create");
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
| **alipayOpenPublicMatchuserLabelCreateModel** | **AlipayOpenPublicMatchuserLabelCreateModel**|  | [optional] |

### Return type

**AlipayOpenPublicMatchuserLabelCreateResponseModel**

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

<a name="delete"></a>
# **delete**
> AlipayOpenPublicMatchuserLabelDeleteResponseModel delete(alipayOpenPublicMatchuserLabelDeleteModel)

用户取消标签接口

开发者可以使用此接口删除匹配到的支付宝用户的指定标签值

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicMatchuserLabelApi;

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

    AlipayOpenPublicMatchuserLabelApi apiInstance = new AlipayOpenPublicMatchuserLabelApi(defaultClient);
    AlipayOpenPublicMatchuserLabelDeleteModel alipayOpenPublicMatchuserLabelDeleteModel = new AlipayOpenPublicMatchuserLabelDeleteModel(); // AlipayOpenPublicMatchuserLabelDeleteModel | 
    try {
      AlipayOpenPublicMatchuserLabelDeleteResponseModel result = apiInstance.delete(alipayOpenPublicMatchuserLabelDeleteModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicMatchuserLabelApi#delete");
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
| **alipayOpenPublicMatchuserLabelDeleteModel** | **AlipayOpenPublicMatchuserLabelDeleteModel**|  | [optional] |

### Return type

**AlipayOpenPublicMatchuserLabelDeleteResponseModel**

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

