# AlipayOpenAuthAppAesApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](AlipayOpenAuthAppAesApi.md#get) | **GET** /v3/alipay/open/auth/app/aes/get | 授权应用aes密钥查询 |
| [**set**](AlipayOpenAuthAppAesApi.md#set) | **POST** /v3/alipay/open/auth/app/aes/set | 授权应用aes密钥设置 |


<a name="get"></a>
# **get**
> AlipayOpenAuthAppAesGetResponseModel get(merchantAppId)

授权应用aes密钥查询

商家应用授权给ISV服务商代管理应用场景下，ISV开发者使用三方应用appId发起调用，通过该接口获取商户应用的AES密钥。接口返回的商户应用aes密钥内容为加密内容，需要ISV使用三方应用的AES密钥对接口返回进行解密。java sdk内部会自动完成解密返回明文内容。&lt;a href&#x3D;\&quot;https://docs.open.alipay.com/common/104567\&quot; target&#x3D;\&quot;_blank\&quot;&gt;SDK AES加解密支持&lt;/a&gt;

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenAuthAppAesApi;

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

    AlipayOpenAuthAppAesApi apiInstance = new AlipayOpenAuthAppAesApi(defaultClient);
    String merchantAppId = "20191223601234564"; // String | 商家应用appId
    try {
      AlipayOpenAuthAppAesGetResponseModel result = apiInstance.get(merchantAppId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenAuthAppAesApi#get");
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
| **merchantAppId** | **String**| 商家应用appId | [optional] |

### Return type

**AlipayOpenAuthAppAesGetResponseModel**

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

<a name="set"></a>
# **set**
> AlipayOpenAuthAppAesSetResponseModel set(alipayOpenAuthAppAesSetModel)

授权应用aes密钥设置

商家应用授权给ISV服务商代管理应用场景下，ISV开发者使用三方应用appId发起调用，通过该接口设置商户应用的AES密钥。接口返回的商户应用aes密钥内容为加密内容，需要ISV使用三方应用的AES密钥对接口返回进行解密。java sdk内部会自动完成解密返回明文内容。&lt;a href&#x3D;\&quot;https://docs.open.alipay.com/common/104567\&quot; target&#x3D;\&quot;_blank\&quot;&gt;SDK AES加解密支持。&lt;/a&gt;

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenAuthAppAesApi;

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

    AlipayOpenAuthAppAesApi apiInstance = new AlipayOpenAuthAppAesApi(defaultClient);
    AlipayOpenAuthAppAesSetModel alipayOpenAuthAppAesSetModel = new AlipayOpenAuthAppAesSetModel(); // AlipayOpenAuthAppAesSetModel | 
    try {
      AlipayOpenAuthAppAesSetResponseModel result = apiInstance.set(alipayOpenAuthAppAesSetModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenAuthAppAesApi#set");
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
| **alipayOpenAuthAppAesSetModel** | **AlipayOpenAuthAppAesSetModel**|  | [optional] |

### Return type

**AlipayOpenAuthAppAesSetResponseModel**

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

