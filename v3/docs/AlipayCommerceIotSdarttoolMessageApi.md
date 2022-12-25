# AlipayCommerceIotSdarttoolMessageApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayCommerceIotSdarttoolMessageApi.md#query) | **GET** /v3/alipay/commerce/iot/sdarttool/message/query | 消息查询 |
| [**send**](AlipayCommerceIotSdarttoolMessageApi.md#send) | **POST** /v3/alipay/commerce/iot/sdarttool/message/send | IOT消息服务 |


<a name="query"></a>
# **query**
> AlipayCommerceIotSdarttoolMessageQueryResponseModel query(messageNo)

消息查询

isv通过消息id查询消息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceIotSdarttoolMessageApi;

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

    AlipayCommerceIotSdarttoolMessageApi apiInstance = new AlipayCommerceIotSdarttoolMessageApi(defaultClient);
    String messageNo = "201911250000021611"; // String | 消息ID
    try {
      AlipayCommerceIotSdarttoolMessageQueryResponseModel result = apiInstance.query(messageNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceIotSdarttoolMessageApi#query");
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
| **messageNo** | **String**| 消息ID | [optional] |

### Return type

**AlipayCommerceIotSdarttoolMessageQueryResponseModel**

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
> AlipayCommerceIotSdarttoolMessageSendResponseModel send(alipayCommerceIotSdarttoolMessageSendModel)

IOT消息服务

ISV通过此接口向IOT设备推送消息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceIotSdarttoolMessageApi;

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

    AlipayCommerceIotSdarttoolMessageApi apiInstance = new AlipayCommerceIotSdarttoolMessageApi(defaultClient);
    AlipayCommerceIotSdarttoolMessageSendModel alipayCommerceIotSdarttoolMessageSendModel = new AlipayCommerceIotSdarttoolMessageSendModel(); // AlipayCommerceIotSdarttoolMessageSendModel | 
    try {
      AlipayCommerceIotSdarttoolMessageSendResponseModel result = apiInstance.send(alipayCommerceIotSdarttoolMessageSendModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceIotSdarttoolMessageApi#send");
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
| **alipayCommerceIotSdarttoolMessageSendModel** | **AlipayCommerceIotSdarttoolMessageSendModel**|  | [optional] |

### Return type

**AlipayCommerceIotSdarttoolMessageSendResponseModel**

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

