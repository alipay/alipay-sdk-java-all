# AlipayOpenSearchBoxactivityApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apply**](AlipayOpenSearchBoxactivityApi.md#apply) | **POST** /v3/alipay/open/search/boxactivity/apply | 申请创建搜索直达活动配置 |
| [**batchquery**](AlipayOpenSearchBoxactivityApi.md#batchquery) | **POST** /v3/alipay/open/search/boxactivity/batchquery | 批量查询搜索直达活动配置 |
| [**modify**](AlipayOpenSearchBoxactivityApi.md#modify) | **POST** /v3/alipay/open/search/boxactivity/modify | 修改搜索直达活动配置 |
| [**offline**](AlipayOpenSearchBoxactivityApi.md#offline) | **POST** /v3/alipay/open/search/boxactivity/offline | 下架搜索直达活动 |
| [**query**](AlipayOpenSearchBoxactivityApi.md#query) | **GET** /v3/alipay/open/search/boxactivity/query | 查询搜索直达活动配置详情 |


<a name="apply"></a>
# **apply**
> AlipayOpenSearchBoxactivityApplyResponseModel apply(alipayOpenSearchBoxactivityApplyModel)

申请创建搜索直达活动配置

当搜索直达处于上架状态时，通过该接口来创建banner活动。相关概念和说明详见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/mini/03fjba\&quot;&gt; 搜索直达 &lt;/a&gt;。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSearchBoxactivityApi;

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

    AlipayOpenSearchBoxactivityApi apiInstance = new AlipayOpenSearchBoxactivityApi(defaultClient);
    AlipayOpenSearchBoxactivityApplyModel alipayOpenSearchBoxactivityApplyModel = new AlipayOpenSearchBoxactivityApplyModel(); // AlipayOpenSearchBoxactivityApplyModel | 
    try {
      AlipayOpenSearchBoxactivityApplyResponseModel result = apiInstance.apply(alipayOpenSearchBoxactivityApplyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSearchBoxactivityApi#apply");
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
| **alipayOpenSearchBoxactivityApplyModel** | **AlipayOpenSearchBoxactivityApplyModel**|  | [optional] |

### Return type

**AlipayOpenSearchBoxactivityApplyResponseModel**

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

<a name="batchquery"></a>
# **batchquery**
> AlipayOpenSearchBoxactivityBatchqueryResponseModel batchquery(alipayOpenSearchBoxactivityBatchqueryModel)

批量查询搜索直达活动配置

批量查询多个搜索直达banner的活动信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSearchBoxactivityApi;

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

    AlipayOpenSearchBoxactivityApi apiInstance = new AlipayOpenSearchBoxactivityApi(defaultClient);
    AlipayOpenSearchBoxactivityBatchqueryModel alipayOpenSearchBoxactivityBatchqueryModel = new AlipayOpenSearchBoxactivityBatchqueryModel(); // AlipayOpenSearchBoxactivityBatchqueryModel | 
    try {
      AlipayOpenSearchBoxactivityBatchqueryResponseModel result = apiInstance.batchquery(alipayOpenSearchBoxactivityBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSearchBoxactivityApi#batchquery");
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
| **alipayOpenSearchBoxactivityBatchqueryModel** | **AlipayOpenSearchBoxactivityBatchqueryModel**|  | [optional] |

### Return type

**AlipayOpenSearchBoxactivityBatchqueryResponseModel**

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
> Object modify(alipayOpenSearchBoxactivityModifyModel)

修改搜索直达活动配置

修改搜索直达活动配置

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSearchBoxactivityApi;

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

    AlipayOpenSearchBoxactivityApi apiInstance = new AlipayOpenSearchBoxactivityApi(defaultClient);
    AlipayOpenSearchBoxactivityModifyModel alipayOpenSearchBoxactivityModifyModel = new AlipayOpenSearchBoxactivityModifyModel(); // AlipayOpenSearchBoxactivityModifyModel | 
    try {
      Object result = apiInstance.modify(alipayOpenSearchBoxactivityModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSearchBoxactivityApi#modify");
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
| **alipayOpenSearchBoxactivityModifyModel** | **AlipayOpenSearchBoxactivityModifyModel**|  | [optional] |

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

<a name="offline"></a>
# **offline**
> Object offline(alipayOpenSearchBoxactivityOfflineModel)

下架搜索直达活动

需要下架某个banner活动时，可通过此接口来进行下架操作

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSearchBoxactivityApi;

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

    AlipayOpenSearchBoxactivityApi apiInstance = new AlipayOpenSearchBoxactivityApi(defaultClient);
    AlipayOpenSearchBoxactivityOfflineModel alipayOpenSearchBoxactivityOfflineModel = new AlipayOpenSearchBoxactivityOfflineModel(); // AlipayOpenSearchBoxactivityOfflineModel | 
    try {
      Object result = apiInstance.offline(alipayOpenSearchBoxactivityOfflineModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSearchBoxactivityApi#offline");
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
| **alipayOpenSearchBoxactivityOfflineModel** | **AlipayOpenSearchBoxactivityOfflineModel**|  | [optional] |

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

<a name="query"></a>
# **query**
> AlipayOpenSearchBoxactivityQueryResponseModel query(boxActivityId, merchantId)

查询搜索直达活动配置详情

查询单个搜索直达banner的活动信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSearchBoxactivityApi;

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

    AlipayOpenSearchBoxactivityApi apiInstance = new AlipayOpenSearchBoxactivityApi(defaultClient);
    String boxActivityId = "20211223000000100000"; // String | 搜索直达活动id
    String merchantId = "2088xxxxxxxxxxxx"; // String | 商户id，代运营模式下传入。代运营模式，需要服务商已获得商家\"运营支付宝小程序\"授权。
    try {
      AlipayOpenSearchBoxactivityQueryResponseModel result = apiInstance.query(boxActivityId, merchantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSearchBoxactivityApi#query");
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
| **boxActivityId** | **String**| 搜索直达活动id | [optional] |
| **merchantId** | **String**| 商户id，代运营模式下传入。代运营模式，需要服务商已获得商家\&quot;运营支付宝小程序\&quot;授权。 | [optional] |

### Return type

**AlipayOpenSearchBoxactivityQueryResponseModel**

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

