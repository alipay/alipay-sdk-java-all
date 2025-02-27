# AlipayDataDataserviceAdPromotepageApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayDataDataserviceAdPromotepageApi.md#batchquery) | **GET** /v3/alipay/data/dataservice/ad/promotepage/batchquery | 自建推广页列表批量查询 |
| [**download**](AlipayDataDataserviceAdPromotepageApi.md#download) | **GET** /v3/alipay/data/dataservice/ad/promotepage/download | 自建推广页留资数据查询 |


<a name="batchquery"></a>
# **batchquery**
> AlipayDataDataserviceAdPromotepageBatchqueryResponseModel batchquery(bizToken, principalTag, type, pageNo, pageSize)

自建推广页列表批量查询

用于获取指定商家的自建推广页列表

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayDataDataserviceAdPromotepageApi;

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

    AlipayDataDataserviceAdPromotepageApi apiInstance = new AlipayDataDataserviceAdPromotepageApi(defaultClient);
    String bizToken = "HYjofejnnlp89730202bcklHH"; // String | 代理商访问灯火平台的token
    String principalTag = "yfvbv133498"; // String | 商家标志
    String type = "COLLECT_INFO"; // String | 推广页类型：COLLECT_INFO -  免费留资；TRADE - 付费留资； OPERATION_PAID - 运营商付费留资；待扩展
    Integer pageNo = 1; // Integer | 分页参数之页数，从1开始
    Integer pageSize = 100; // Integer | 分页参数之每页大小，最大1000
    try {
      AlipayDataDataserviceAdPromotepageBatchqueryResponseModel result = apiInstance.batchquery(bizToken, principalTag, type, pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayDataDataserviceAdPromotepageApi#batchquery");
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
| **bizToken** | **String**| 代理商访问灯火平台的token | [optional] |
| **principalTag** | **String**| 商家标志 | [optional] |
| **type** | **String**| 推广页类型：COLLECT_INFO -  免费留资；TRADE - 付费留资； OPERATION_PAID - 运营商付费留资；待扩展 | [optional] |
| **pageNo** | **Integer**| 分页参数之页数，从1开始 | [optional] |
| **pageSize** | **Integer**| 分页参数之每页大小，最大1000 | [optional] |

### Return type

**AlipayDataDataserviceAdPromotepageBatchqueryResponseModel**

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

<a name="download"></a>
# **download**
> AlipayDataDataserviceAdPromotepageDownloadResponseModel download(bizToken, principalTag, promotePageId, startDate, endDate, pageNo, pageSize)

自建推广页留资数据查询

用于获取指定商家指定推广页的留资数据

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayDataDataserviceAdPromotepageApi;

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

    AlipayDataDataserviceAdPromotepageApi apiInstance = new AlipayDataDataserviceAdPromotepageApi(defaultClient);
    String bizToken = "HYjofejnnlp89730202bcklHH"; // String | 代理商访问灯火平台的token
    String principalTag = "yfvbv133498"; // String | 商家标志
    Integer promotePageId = 2018374; // Integer | 推广页id
    String startDate = "\"2020-12-12\""; // String | 留资开始日期，格式：yyyy-mm-dd，不能早于30天前
    String endDate = "“2020-12-13”"; // String | 留资结束日期，格式：yyyy-mm-dd；不能晚于当天
    Integer pageNo = 1; // Integer | 分页参数之页数，从1开始
    Integer pageSize = 100; // Integer | 分页参数之每页大小，最大1000
    try {
      AlipayDataDataserviceAdPromotepageDownloadResponseModel result = apiInstance.download(bizToken, principalTag, promotePageId, startDate, endDate, pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayDataDataserviceAdPromotepageApi#download");
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
| **bizToken** | **String**| 代理商访问灯火平台的token | [optional] |
| **principalTag** | **String**| 商家标志 | [optional] |
| **promotePageId** | **Integer**| 推广页id | [optional] |
| **startDate** | **String**| 留资开始日期，格式：yyyy-mm-dd，不能早于30天前 | [optional] |
| **endDate** | **String**| 留资结束日期，格式：yyyy-mm-dd；不能晚于当天 | [optional] |
| **pageNo** | **Integer**| 分页参数之页数，从1开始 | [optional] |
| **pageSize** | **Integer**| 分页参数之每页大小，最大1000 | [optional] |

### Return type

**AlipayDataDataserviceAdPromotepageDownloadResponseModel**

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

