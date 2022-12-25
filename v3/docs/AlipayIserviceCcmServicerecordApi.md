# AlipayIserviceCcmServicerecordApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayIserviceCcmServicerecordApi.md#create) | **POST** /v3/alipay/iservice/ccm/servicerecord/create | 创建服务记录 |
| [**modify**](AlipayIserviceCcmServicerecordApi.md#modify) | **POST** /v3/alipay/iservice/ccm/servicerecord/modify | 变更服务记录 |


<a name="create"></a>
# **create**
> AlipayIserviceCcmServicerecordCreateResponseModel create(alipayIserviceCcmServicerecordCreateModel)

创建服务记录

提供给云客服租户自主创建服务记录

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmServicerecordApi;

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

    AlipayIserviceCcmServicerecordApi apiInstance = new AlipayIserviceCcmServicerecordApi(defaultClient);
    AlipayIserviceCcmServicerecordCreateModel alipayIserviceCcmServicerecordCreateModel = new AlipayIserviceCcmServicerecordCreateModel(); // AlipayIserviceCcmServicerecordCreateModel | 
    try {
      AlipayIserviceCcmServicerecordCreateResponseModel result = apiInstance.create(alipayIserviceCcmServicerecordCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmServicerecordApi#create");
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
| **alipayIserviceCcmServicerecordCreateModel** | **AlipayIserviceCcmServicerecordCreateModel**|  | [optional] |

### Return type

**AlipayIserviceCcmServicerecordCreateResponseModel**

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
> Object modify(alipayIserviceCcmServicerecordModifyModel)

变更服务记录

提供给云客服租户自主变更服务记录

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmServicerecordApi;

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

    AlipayIserviceCcmServicerecordApi apiInstance = new AlipayIserviceCcmServicerecordApi(defaultClient);
    AlipayIserviceCcmServicerecordModifyModel alipayIserviceCcmServicerecordModifyModel = new AlipayIserviceCcmServicerecordModifyModel(); // AlipayIserviceCcmServicerecordModifyModel | 
    try {
      Object result = apiInstance.modify(alipayIserviceCcmServicerecordModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmServicerecordApi#modify");
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
| **alipayIserviceCcmServicerecordModifyModel** | **AlipayIserviceCcmServicerecordModifyModel**|  | [optional] |

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

