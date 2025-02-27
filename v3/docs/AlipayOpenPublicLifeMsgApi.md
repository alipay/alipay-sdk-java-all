# AlipayOpenPublicLifeMsgApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**recall**](AlipayOpenPublicLifeMsgApi.md#recall) | **POST** /v3/alipay/open/public/life/msg/recall | 生活号消息撤回接口 |
| [**send**](AlipayOpenPublicLifeMsgApi.md#send) | **POST** /v3/alipay/open/public/life/msg/send | 生活号广播消息发送接口 |


<a name="recall"></a>
# **recall**
> Object recall()

生活号消息撤回接口

生活号消息撤回接口

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicLifeMsgApi;

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

    AlipayOpenPublicLifeMsgApi apiInstance = new AlipayOpenPublicLifeMsgApi(defaultClient);
    try {
      Object result = apiInstance.recall();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicLifeMsgApi#recall");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

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

<a name="send"></a>
# **send**
> AlipayOpenPublicLifeMsgSendResponseModel send(cover, data)

生活号广播消息发送接口

媒体资讯生活号群发一篇图文或视频类消息，生活号主页以及客户端首页展示消息详情

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicLifeMsgApi;

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

    AlipayOpenPublicLifeMsgApi apiInstance = new AlipayOpenPublicLifeMsgApi(defaultClient);
    File cover = new File("/path/to/file"); // File | 
    AlipayOpenPublicLifeMsgSendModel data = new AlipayOpenPublicLifeMsgSendModel(); // AlipayOpenPublicLifeMsgSendModel | 
    try {
      AlipayOpenPublicLifeMsgSendResponseModel result = apiInstance.send(cover, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicLifeMsgApi#send");
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
| **cover** | **File**|  | [optional] |
| **data** | **AlipayOpenPublicLifeMsgSendModel**|  | [optional] |

### Return type

**AlipayOpenPublicLifeMsgSendResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

