# AlipayOpenMiniInnerappServiceApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**publish**](AlipayOpenMiniInnerappServiceApi.md#publish) | **POST** /v3/alipay/open/mini/innerapp/service/publish | 小程序模板发布服务市场 |
| [**query**](AlipayOpenMiniInnerappServiceApi.md#query) | **GET** /v3/alipay/open/mini/innerapp/service/query | 小程序服务市场搜索 |


<a name="publish"></a>
# **publish**
> AlipayOpenMiniInnerappServicePublishResponseModel publish(alipayOpenMiniInnerappServicePublishModel)

小程序模板发布服务市场

小程序提供一套针对一二方场景的开发者提供一套统一的内部能力开放体系，定向输出赋能

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerappServiceApi;

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

    AlipayOpenMiniInnerappServiceApi apiInstance = new AlipayOpenMiniInnerappServiceApi(defaultClient);
    AlipayOpenMiniInnerappServicePublishModel alipayOpenMiniInnerappServicePublishModel = new AlipayOpenMiniInnerappServicePublishModel(); // AlipayOpenMiniInnerappServicePublishModel | 
    try {
      AlipayOpenMiniInnerappServicePublishResponseModel result = apiInstance.publish(alipayOpenMiniInnerappServicePublishModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerappServiceApi#publish");
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
| **alipayOpenMiniInnerappServicePublishModel** | **AlipayOpenMiniInnerappServicePublishModel**|  | [optional] |

### Return type

**AlipayOpenMiniInnerappServicePublishResponseModel**

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
> AlipayOpenMiniInnerappServiceQueryResponseModel query(miniAppId, appSubType, showType, keyword, pageNum, pageSize, appOrigin, includeOffline)

小程序服务市场搜索

小程序服务市场搜索，包括搜索模板和插件

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerappServiceApi;

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

    AlipayOpenMiniInnerappServiceApi apiInstance = new AlipayOpenMiniInnerappServiceApi(defaultClient);
    String miniAppId = "2012211102012056"; // String | 插件id或模板id
    String appSubType = "TINYAPP_TEMPLATE、TINYAPP_PLUGIN"; // String | 小程序应用子类型
    String showType = "SHOW"; // String | 是否在服务市场透出，SHOW展示、HIDE隐藏
    String keyword = "xxxx插件"; // String | 关键词
    String pageNum = "1"; // String | 页码，默认第一页
    String pageSize = "10"; // String | 分页数，默认每页10个
    String appOrigin = "https://yuque.antfin-inc.com/tinyapp-all/qddncu/bidushixiang"; // String | 业务来源，新接入方需要向支付宝申请专用来源，否则不予接入。https://yuque.antfin-inc.com/tinyapp-all/qddncu/bidushixiang
    Boolean includeOffline = true; // Boolean | 是否需要展示offline状态插件，不传默认为false（不展示）
    try {
      AlipayOpenMiniInnerappServiceQueryResponseModel result = apiInstance.query(miniAppId, appSubType, showType, keyword, pageNum, pageSize, appOrigin, includeOffline);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerappServiceApi#query");
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
| **miniAppId** | **String**| 插件id或模板id | [optional] |
| **appSubType** | **String**| 小程序应用子类型 | [optional] |
| **showType** | **String**| 是否在服务市场透出，SHOW展示、HIDE隐藏 | [optional] |
| **keyword** | **String**| 关键词 | [optional] |
| **pageNum** | **String**| 页码，默认第一页 | [optional] |
| **pageSize** | **String**| 分页数，默认每页10个 | [optional] |
| **appOrigin** | **String**| 业务来源，新接入方需要向支付宝申请专用来源，否则不予接入。https://yuque.antfin-inc.com/tinyapp-all/qddncu/bidushixiang | [optional] |
| **includeOffline** | **Boolean**| 是否需要展示offline状态插件，不传默认为false（不展示） | [optional] |

### Return type

**AlipayOpenMiniInnerappServiceQueryResponseModel**

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

