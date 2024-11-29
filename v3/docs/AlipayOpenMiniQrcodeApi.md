# AlipayOpenMiniQrcodeApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bind**](AlipayOpenMiniQrcodeApi.md#bind) | **POST** /v3/alipay/open/mini/qrcode/bind | 关联普通二维码 |
| [**query**](AlipayOpenMiniQrcodeApi.md#query) | **GET** /v3/alipay/open/mini/qrcode/query | 查询普通二维码 |
| [**unbind**](AlipayOpenMiniQrcodeApi.md#unbind) | **POST** /v3/alipay/open/mini/qrcode/unbind | 删除已关联普通二维码 |


<a name="bind"></a>
# **bind**
> AlipayOpenMiniQrcodeBindResponseModel bind(alipayOpenMiniQrcodeBindModel)

关联普通二维码

商户可不需更换线下二维码，通过该接口完成配置后，用户用支付宝扫描普通二维码时打开小程序并跳转到指定页面，普通二维码关联小程序最多可设置100条规则。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniQrcodeApi;

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

    AlipayOpenMiniQrcodeApi apiInstance = new AlipayOpenMiniQrcodeApi(defaultClient);
    AlipayOpenMiniQrcodeBindModel alipayOpenMiniQrcodeBindModel = new AlipayOpenMiniQrcodeBindModel(); // AlipayOpenMiniQrcodeBindModel | 
    try {
      AlipayOpenMiniQrcodeBindResponseModel result = apiInstance.bind(alipayOpenMiniQrcodeBindModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniQrcodeApi#bind");
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
| **alipayOpenMiniQrcodeBindModel** | **AlipayOpenMiniQrcodeBindModel**|  | [optional] |

### Return type

**AlipayOpenMiniQrcodeBindResponseModel**

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

<a name="query"></a>
# **query**
> AlipayOpenMiniQrcodeQueryResponseModel query(pageNo, pageSize)

查询普通二维码

通过appId查询商户关联的普通二维码路由信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniQrcodeApi;

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

    AlipayOpenMiniQrcodeApi apiInstance = new AlipayOpenMiniQrcodeApi(defaultClient);
    Integer pageNo = 1; // Integer | 页码
    Integer pageSize = 10; // Integer | 每页条数，最大为10
    try {
      AlipayOpenMiniQrcodeQueryResponseModel result = apiInstance.query(pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniQrcodeApi#query");
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
| **pageNo** | **Integer**| 页码 | [optional] |
| **pageSize** | **Integer**| 每页条数，最大为10 | [optional] |

### Return type

**AlipayOpenMiniQrcodeQueryResponseModel**

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

<a name="unbind"></a>
# **unbind**
> Object unbind(alipayOpenMiniQrcodeUnbindModel)

删除已关联普通二维码

删除已关联普通二维码

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniQrcodeApi;

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

    AlipayOpenMiniQrcodeApi apiInstance = new AlipayOpenMiniQrcodeApi(defaultClient);
    AlipayOpenMiniQrcodeUnbindModel alipayOpenMiniQrcodeUnbindModel = new AlipayOpenMiniQrcodeUnbindModel(); // AlipayOpenMiniQrcodeUnbindModel | 
    try {
      Object result = apiInstance.unbind(alipayOpenMiniQrcodeUnbindModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniQrcodeApi#unbind");
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
| **alipayOpenMiniQrcodeUnbindModel** | **AlipayOpenMiniQrcodeUnbindModel**|  | [optional] |

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

