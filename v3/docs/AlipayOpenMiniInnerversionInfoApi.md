# AlipayOpenMiniInnerversionInfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**delete**](AlipayOpenMiniInnerversionInfoApi.md#delete) | **DELETE** /v3/alipay/open/mini/innerversion/info/delete | 内部链路删除版本 |
| [**query**](AlipayOpenMiniInnerversionInfoApi.md#query) | **GET** /v3/alipay/open/mini/innerversion/info/query | 内部链路小程序版本信息查询 |


<a name="delete"></a>
# **delete**
> Object delete(miniAppId, appOrigin, bundleId, appVersion, pid, instCode)

内部链路删除版本

针对一二方场景的开发者，小程序提供一套统一的内部能力体系，定向输出赋能，本接口主要用于删除版本

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerversionInfoApi;

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

    AlipayOpenMiniInnerversionInfoApi apiInstance = new AlipayOpenMiniInnerversionInfoApi(defaultClient);
    String miniAppId = "2018********"; // String | 小程序ID
    String appOrigin = "ASTORE"; // String | 业务场景来源
    String bundleId = "com.alipay.alipaywallet"; // String | 端信息
    String appVersion = "0.0.1"; // String | 小程序版本号
    String pid = "2088*******"; // String | 操作者ID，支付宝租户必填
    String instCode = "alipay"; // String | 租户信息
    try {
      Object result = apiInstance.delete(miniAppId, appOrigin, bundleId, appVersion, pid, instCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerversionInfoApi#delete");
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
| **miniAppId** | **String**| 小程序ID | [optional] |
| **appOrigin** | **String**| 业务场景来源 | [optional] |
| **bundleId** | **String**| 端信息 | [optional] |
| **appVersion** | **String**| 小程序版本号 | [optional] |
| **pid** | **String**| 操作者ID，支付宝租户必填 | [optional] |
| **instCode** | **String**| 租户信息 | [optional] |

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

<a name="query"></a>
# **query**
> AlipayOpenMiniInnerversionInfoQueryResponseModel query(bundleId, miniAppId, appVersion, appOrigin)

内部链路小程序版本信息查询

小程序提供一套针对一二方场景的开发者提供一套统一的内部能力开放体系，定向输出赋能

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerversionInfoApi;

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

    AlipayOpenMiniInnerversionInfoApi apiInstance = new AlipayOpenMiniInnerversionInfoApi(defaultClient);
    String bundleId = "支付宝：com.alipay.alipaywallet 高德：com.amap.app"; // String | 端信息
    String miniAppId = "2019****"; // String | 小程序ID
    String appVersion = "0.0.1"; // String | 查询版本号
    String appOrigin = "https://yuque.antfin-inc.com/tinyapp-all/qddncu/bidushixiang"; // String | 业务来源，新接入方需要向支付宝申请专用来源，否则不予接入。https://yuque.antfin-inc.com/tinyapp-all/qddncu/bidushixiang
    try {
      AlipayOpenMiniInnerversionInfoQueryResponseModel result = apiInstance.query(bundleId, miniAppId, appVersion, appOrigin);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerversionInfoApi#query");
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
| **bundleId** | **String**| 端信息 | [optional] |
| **miniAppId** | **String**| 小程序ID | [optional] |
| **appVersion** | **String**| 查询版本号 | [optional] |
| **appOrigin** | **String**| 业务来源，新接入方需要向支付宝申请专用来源，否则不予接入。https://yuque.antfin-inc.com/tinyapp-all/qddncu/bidushixiang | [optional] |

### Return type

**AlipayOpenMiniInnerversionInfoQueryResponseModel**

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

