# AlipayOpenSearchSubservicekeywordApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apply**](AlipayOpenSearchSubservicekeywordApi.md#apply) | **POST** /v3/alipay/open/search/subservicekeyword/apply | 提报服务关键词 |
| [**batchquery**](AlipayOpenSearchSubservicekeywordApi.md#batchquery) | **GET** /v3/alipay/open/search/subservicekeyword/batchquery | 服务关键词批量查询接口 |
| [**delete**](AlipayOpenSearchSubservicekeywordApi.md#delete) | **POST** /v3/alipay/open/search/subservicekeyword/delete | 删除服务关键词 |


<a name="apply"></a>
# **apply**
> AlipayOpenSearchSubservicekeywordApplyResponseModel apply(alipayOpenSearchSubservicekeywordApplyModel)

提报服务关键词

小程序-服务推广-提报服务关键词

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSearchSubservicekeywordApi;

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

    AlipayOpenSearchSubservicekeywordApi apiInstance = new AlipayOpenSearchSubservicekeywordApi(defaultClient);
    AlipayOpenSearchSubservicekeywordApplyModel alipayOpenSearchSubservicekeywordApplyModel = new AlipayOpenSearchSubservicekeywordApplyModel(); // AlipayOpenSearchSubservicekeywordApplyModel | 
    try {
      AlipayOpenSearchSubservicekeywordApplyResponseModel result = apiInstance.apply(alipayOpenSearchSubservicekeywordApplyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSearchSubservicekeywordApi#apply");
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
| **alipayOpenSearchSubservicekeywordApplyModel** | **AlipayOpenSearchSubservicekeywordApplyModel**|  | [optional] |

### Return type

**AlipayOpenSearchSubservicekeywordApplyResponseModel**

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
> AlipayOpenSearchSubservicekeywordBatchqueryResponseModel batchquery(targetAppid, status, pageNumber, pageSize)

服务关键词批量查询接口

批量查询小程序的服务关键词

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSearchSubservicekeywordApi;

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

    AlipayOpenSearchSubservicekeywordApi apiInstance = new AlipayOpenSearchSubservicekeywordApi(defaultClient);
    String targetAppid = "2021001112626071"; // String | 小程序id
    String status = "ONLINE"; // String | 审核状态，服务关键词的审核状态，枚举值
    Integer pageNumber = 1; // Integer | 分页参数，分页查询时使用
    Integer pageSize = 10; // Integer | 分页参数，分页查询时使用
    try {
      AlipayOpenSearchSubservicekeywordBatchqueryResponseModel result = apiInstance.batchquery(targetAppid, status, pageNumber, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSearchSubservicekeywordApi#batchquery");
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
| **status** | **String**| 审核状态，服务关键词的审核状态，枚举值 | [optional] |
| **pageNumber** | **Integer**| 分页参数，分页查询时使用 | [optional] |
| **pageSize** | **Integer**| 分页参数，分页查询时使用 | [optional] |

### Return type

**AlipayOpenSearchSubservicekeywordBatchqueryResponseModel**

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
> Object delete(alipayOpenSearchSubservicekeywordDeleteModel)

删除服务关键词

删除服务关键词

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSearchSubservicekeywordApi;

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

    AlipayOpenSearchSubservicekeywordApi apiInstance = new AlipayOpenSearchSubservicekeywordApi(defaultClient);
    AlipayOpenSearchSubservicekeywordDeleteModel alipayOpenSearchSubservicekeywordDeleteModel = new AlipayOpenSearchSubservicekeywordDeleteModel(); // AlipayOpenSearchSubservicekeywordDeleteModel | 
    try {
      Object result = apiInstance.delete(alipayOpenSearchSubservicekeywordDeleteModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSearchSubservicekeywordApi#delete");
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
| **alipayOpenSearchSubservicekeywordDeleteModel** | **AlipayOpenSearchSubservicekeywordDeleteModel**|  | [optional] |

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

