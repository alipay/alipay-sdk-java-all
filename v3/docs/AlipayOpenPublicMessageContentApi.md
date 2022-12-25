# AlipayOpenPublicMessageContentApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayOpenPublicMessageContentApi.md#create) | **POST** /v3/alipay/open/public/message/content/create | 创建图文消息内容接口 |
| [**modify**](AlipayOpenPublicMessageContentApi.md#modify) | **POST** /v3/alipay/open/public/message/content/modify | 更新图文消息内容接口 |


<a name="create"></a>
# **create**
> AlipayOpenPublicMessageContentCreateResponseModel create(alipayOpenPublicMessageContentCreateModel)

创建图文消息内容接口

开发者可使用该接口将富文本内容生成生活号图文消息内容链接

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicMessageContentApi;

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

    AlipayOpenPublicMessageContentApi apiInstance = new AlipayOpenPublicMessageContentApi(defaultClient);
    AlipayOpenPublicMessageContentCreateModel alipayOpenPublicMessageContentCreateModel = new AlipayOpenPublicMessageContentCreateModel(); // AlipayOpenPublicMessageContentCreateModel | 
    try {
      AlipayOpenPublicMessageContentCreateResponseModel result = apiInstance.create(alipayOpenPublicMessageContentCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicMessageContentApi#create");
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
| **alipayOpenPublicMessageContentCreateModel** | **AlipayOpenPublicMessageContentCreateModel**|  | [optional] |

### Return type

**AlipayOpenPublicMessageContentCreateResponseModel**

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

<a name="modify"></a>
# **modify**
> AlipayOpenPublicMessageContentModifyResponseModel modify(alipayOpenPublicMessageContentModifyModel)

更新图文消息内容接口

开发者可使用该接口修改已经创建的生活号图文消息素材里的内容

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicMessageContentApi;

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

    AlipayOpenPublicMessageContentApi apiInstance = new AlipayOpenPublicMessageContentApi(defaultClient);
    AlipayOpenPublicMessageContentModifyModel alipayOpenPublicMessageContentModifyModel = new AlipayOpenPublicMessageContentModifyModel(); // AlipayOpenPublicMessageContentModifyModel | 
    try {
      AlipayOpenPublicMessageContentModifyResponseModel result = apiInstance.modify(alipayOpenPublicMessageContentModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicMessageContentApi#modify");
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
| **alipayOpenPublicMessageContentModifyModel** | **AlipayOpenPublicMessageContentModifyModel**|  | [optional] |

### Return type

**AlipayOpenPublicMessageContentModifyResponseModel**

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

