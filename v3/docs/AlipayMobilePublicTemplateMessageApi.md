# AlipayMobilePublicTemplateMessageApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**delete**](AlipayMobilePublicTemplateMessageApi.md#delete) | **POST** /v3/alipay/mobile/public/template/message/delete | 模板消息删除接口 |
| [**get**](AlipayMobilePublicTemplateMessageApi.md#get) | **GET** /v3/alipay/mobile/public/template/message/get | 模板消息领取接口 |
| [**query**](AlipayMobilePublicTemplateMessageApi.md#query) | **POST** /v3/alipay/mobile/public/template/message/query | 模板消息查询接口 |


<a name="delete"></a>
# **delete**
> Object delete(alipayMobilePublicTemplateMessageDeleteModel)

模板消息删除接口

模板消息删除接口

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMobilePublicTemplateMessageApi;

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

    AlipayMobilePublicTemplateMessageApi apiInstance = new AlipayMobilePublicTemplateMessageApi(defaultClient);
    AlipayMobilePublicTemplateMessageDeleteModel alipayMobilePublicTemplateMessageDeleteModel = new AlipayMobilePublicTemplateMessageDeleteModel(); // AlipayMobilePublicTemplateMessageDeleteModel | 
    try {
      Object result = apiInstance.delete(alipayMobilePublicTemplateMessageDeleteModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMobilePublicTemplateMessageApi#delete");
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
| **alipayMobilePublicTemplateMessageDeleteModel** | **AlipayMobilePublicTemplateMessageDeleteModel**|  | [optional] |

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

<a name="get"></a>
# **get**
> AlipayMobilePublicTemplateMessageGetResponseModel get(templateId)

模板消息领取接口

帮助服务窗从服务窗平台（fuwu.alipay.com）公共模板库里领取一个行业的消息模板--消息模板是一种消息的样式，如消费提醒、账单提醒等

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMobilePublicTemplateMessageApi;

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

    AlipayMobilePublicTemplateMessageApi apiInstance = new AlipayMobilePublicTemplateMessageApi(defaultClient);
    String templateId = "TM000000223"; // String | 消息母板id
    try {
      AlipayMobilePublicTemplateMessageGetResponseModel result = apiInstance.get(templateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMobilePublicTemplateMessageApi#get");
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
| **templateId** | **String**| 消息母板id | [optional] |

### Return type

**AlipayMobilePublicTemplateMessageGetResponseModel**

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

<a name="query"></a>
# **query**
> AlipayMobilePublicTemplateMessageQueryResponseModel query(authToken, alipayMobilePublicTemplateMessageQueryModel)

模板消息查询接口

模板消息查询接口

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMobilePublicTemplateMessageApi;

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

    AlipayMobilePublicTemplateMessageApi apiInstance = new AlipayMobilePublicTemplateMessageApi(defaultClient);
    String authToken = "authToken_example"; // String | 用户授权令牌
    AlipayMobilePublicTemplateMessageQueryModel alipayMobilePublicTemplateMessageQueryModel = new AlipayMobilePublicTemplateMessageQueryModel(); // AlipayMobilePublicTemplateMessageQueryModel | 
    try {
      AlipayMobilePublicTemplateMessageQueryResponseModel result = apiInstance.query(authToken, alipayMobilePublicTemplateMessageQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMobilePublicTemplateMessageApi#query");
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
| **authToken** | **String**| 用户授权令牌 | [optional] |
| **alipayMobilePublicTemplateMessageQueryModel** | **AlipayMobilePublicTemplateMessageQueryModel**|  | [optional] |

### Return type

**AlipayMobilePublicTemplateMessageQueryResponseModel**

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

