# AlipayOpenSearchAppkeywordApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apply**](AlipayOpenSearchAppkeywordApi.md#apply) | **POST** /v3/alipay/open/search/appkeyword/apply | 提报搜索关键词 |
| [**batchquery**](AlipayOpenSearchAppkeywordApi.md#batchquery) | **GET** /v3/alipay/open/search/appkeyword/batchquery | 查询小程序已配置关键词 |
| [**delete**](AlipayOpenSearchAppkeywordApi.md#delete) | **POST** /v3/alipay/open/search/appkeyword/delete | 删除搜索关键词 |
| [**querystatus**](AlipayOpenSearchAppkeywordApi.md#querystatus) | **GET** /v3/alipay/open/search/appkeyword/querystatus | 查询小程序搜索关键词的审核工单的状态 |


<a name="apply"></a>
# **apply**
> AlipayOpenSearchAppkeywordApplyResponseModel apply(alipayOpenSearchAppkeywordApplyModel)

提报搜索关键词

提报搜索关键词

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSearchAppkeywordApi;

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

    AlipayOpenSearchAppkeywordApi apiInstance = new AlipayOpenSearchAppkeywordApi(defaultClient);
    AlipayOpenSearchAppkeywordApplyModel alipayOpenSearchAppkeywordApplyModel = new AlipayOpenSearchAppkeywordApplyModel(); // AlipayOpenSearchAppkeywordApplyModel | 
    try {
      AlipayOpenSearchAppkeywordApplyResponseModel result = apiInstance.apply(alipayOpenSearchAppkeywordApplyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSearchAppkeywordApi#apply");
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
| **alipayOpenSearchAppkeywordApplyModel** | **AlipayOpenSearchAppkeywordApplyModel**|  | [optional] |

### Return type

**AlipayOpenSearchAppkeywordApplyResponseModel**

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
> AlipayOpenSearchAppkeywordBatchqueryResponseModel batchquery(targetAppid, status, pageNumber, pageSize)

查询小程序已配置关键词

查询小程序已配置关键词

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSearchAppkeywordApi;

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

    AlipayOpenSearchAppkeywordApi apiInstance = new AlipayOpenSearchAppkeywordApi(defaultClient);
    String targetAppid = "2021001120654127"; // String | 小程序id
    String status = "ONLINE"; // String | 关键词的状态，枚举值，不传该字段表示查询所有状态
    Integer pageNumber = 1; // Integer | 当前页
    Integer pageSize = 10; // Integer | 每页显示条数
    try {
      AlipayOpenSearchAppkeywordBatchqueryResponseModel result = apiInstance.batchquery(targetAppid, status, pageNumber, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSearchAppkeywordApi#batchquery");
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
| **targetAppid** | **String**| 小程序id | [optional] |
| **status** | **String**| 关键词的状态，枚举值，不传该字段表示查询所有状态 | [optional] |
| **pageNumber** | **Integer**| 当前页 | [optional] |
| **pageSize** | **Integer**| 每页显示条数 | [optional] |

### Return type

**AlipayOpenSearchAppkeywordBatchqueryResponseModel**

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

<a name="delete"></a>
# **delete**
> Object delete(alipayOpenSearchAppkeywordDeleteModel)

删除搜索关键词

删除搜索关键词

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSearchAppkeywordApi;

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

    AlipayOpenSearchAppkeywordApi apiInstance = new AlipayOpenSearchAppkeywordApi(defaultClient);
    AlipayOpenSearchAppkeywordDeleteModel alipayOpenSearchAppkeywordDeleteModel = new AlipayOpenSearchAppkeywordDeleteModel(); // AlipayOpenSearchAppkeywordDeleteModel | 
    try {
      Object result = apiInstance.delete(alipayOpenSearchAppkeywordDeleteModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSearchAppkeywordApi#delete");
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
| **alipayOpenSearchAppkeywordDeleteModel** | **AlipayOpenSearchAppkeywordDeleteModel**|  | [optional] |

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

<a name="querystatus"></a>
# **querystatus**
> AlipayOpenSearchAppkeywordQuerystatusResponseModel querystatus(targetAppid, applyNo)

查询小程序搜索关键词的审核工单的状态

查询小程序搜索关键词的审核工单的状态

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSearchAppkeywordApi;

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

    AlipayOpenSearchAppkeywordApi apiInstance = new AlipayOpenSearchAppkeywordApi(defaultClient);
    String targetAppid = "2021001120654127"; // String | 小程序id
    String applyNo = "20220519000000108026"; // String | 审核工单id，提报接口的返回值
    try {
      AlipayOpenSearchAppkeywordQuerystatusResponseModel result = apiInstance.querystatus(targetAppid, applyNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSearchAppkeywordApi#querystatus");
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
| **targetAppid** | **String**| 小程序id | [optional] |
| **applyNo** | **String**| 审核工单id，提报接口的返回值 | [optional] |

### Return type

**AlipayOpenSearchAppkeywordQuerystatusResponseModel**

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

