# AlipayIserviceCcmSwArticleApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayIserviceCcmSwArticleApi.md#batchquery) | **GET** /v3/alipay/iservice/ccm/sw/article/batchquery | 知识库-问答-批量查询 |
| [**create**](AlipayIserviceCcmSwArticleApi.md#create) | **PUT** /v3/alipay/iservice/ccm/sw/article/create | 知识库-问答-创建 |
| [**delete**](AlipayIserviceCcmSwArticleApi.md#delete) | **DELETE** /v3/alipay/iservice/ccm/sw/article/delete | 知识库-问答-删除 |
| [**get**](AlipayIserviceCcmSwArticleApi.md#get) | **GET** /v3/alipay/iservice/ccm/sw/article/get | 知识库-问答-获取 |
| [**modify**](AlipayIserviceCcmSwArticleApi.md#modify) | **PATCH** /v3/alipay/iservice/ccm/sw/article/modify | 知识库-问答-修改 |


<a name="batchquery"></a>
# **batchquery**
> AlipayIserviceCcmSwArticleBatchqueryResponseModel batchquery(ccsInstanceId, libraryId, categoryId, ids, keyword, keywords, status, startTime, endTime, searchCategoryType, searchAllCategory, pageNum, pageSize)

知识库-问答-批量查询

知识库-问答-批量查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmSwArticleApi;

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

    AlipayIserviceCcmSwArticleApi apiInstance = new AlipayIserviceCcmSwArticleApi(defaultClient);
    String ccsInstanceId = "ZPNASDK"; // String | 子部门ID，不传为默认部门
    Integer libraryId = 1; // Integer | 知识库ID
    Integer categoryId = 12; // Integer | 所属类目ID，如果search_all_category为true则不用填
    List<Integer> ids = Arrays.asList(); // List<Integer> | 文章ID集合
    String keyword = "支付宝"; // String | 关键字
    List<String> keywords = Arrays.asList(); // List<String> | 标签
    String status = "PUBLISHED"; // String | 状态，PUBLISHED（已发布），UNPUBLISH（未发布），EXPIRED（失效），DELETED（已删除）
    String startTime = "2020-12-31 00:00:01"; // String | 开始时间，并且结束时间不能为空
    String endTime = "2020-12-31 23:59:59"; // String | 结束时间，并且开始时间不能为空
    String searchCategoryType = "Current"; // String | Current（搜索当前节点）； Children（搜索当前节点以及子节点）
    Boolean searchAllCategory = true; // Boolean | 是否搜索所有类目，如果为true则不用填写category_id值
    Integer pageNum = 1; // Integer | 页数，page_size不能为空
    Integer pageSize = 20; // Integer | 页大小，page_num不能为空
    try {
      AlipayIserviceCcmSwArticleBatchqueryResponseModel result = apiInstance.batchquery(ccsInstanceId, libraryId, categoryId, ids, keyword, keywords, status, startTime, endTime, searchCategoryType, searchAllCategory, pageNum, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmSwArticleApi#batchquery");
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
| **ccsInstanceId** | **String**| 子部门ID，不传为默认部门 | [optional] |
| **libraryId** | **Integer**| 知识库ID | [optional] |
| **categoryId** | **Integer**| 所属类目ID，如果search_all_category为true则不用填 | [optional] |
| **ids** | **List&lt;Integer&gt;**| 文章ID集合 | [optional] |
| **keyword** | **String**| 关键字 | [optional] |
| **keywords** | **List&lt;String&gt;**| 标签 | [optional] |
| **status** | **String**| 状态，PUBLISHED（已发布），UNPUBLISH（未发布），EXPIRED（失效），DELETED（已删除） | [optional] |
| **startTime** | **String**| 开始时间，并且结束时间不能为空 | [optional] |
| **endTime** | **String**| 结束时间，并且开始时间不能为空 | [optional] |
| **searchCategoryType** | **String**| Current（搜索当前节点）； Children（搜索当前节点以及子节点） | [optional] |
| **searchAllCategory** | **Boolean**| 是否搜索所有类目，如果为true则不用填写category_id值 | [optional] |
| **pageNum** | **Integer**| 页数，page_size不能为空 | [optional] |
| **pageSize** | **Integer**| 页大小，page_num不能为空 | [optional] |

### Return type

**AlipayIserviceCcmSwArticleBatchqueryResponseModel**

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

<a name="create"></a>
# **create**
> AlipayIserviceCcmSwArticleCreateResponseModel create(alipayIserviceCcmSwArticleCreateModel)

知识库-问答-创建

知识库-问答-创建

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmSwArticleApi;

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

    AlipayIserviceCcmSwArticleApi apiInstance = new AlipayIserviceCcmSwArticleApi(defaultClient);
    AlipayIserviceCcmSwArticleCreateModel alipayIserviceCcmSwArticleCreateModel = new AlipayIserviceCcmSwArticleCreateModel(); // AlipayIserviceCcmSwArticleCreateModel | 
    try {
      AlipayIserviceCcmSwArticleCreateResponseModel result = apiInstance.create(alipayIserviceCcmSwArticleCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmSwArticleApi#create");
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
| **alipayIserviceCcmSwArticleCreateModel** | **AlipayIserviceCcmSwArticleCreateModel**|  | [optional] |

### Return type

**AlipayIserviceCcmSwArticleCreateResponseModel**

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

<a name="delete"></a>
# **delete**
> Object delete()

知识库-问答-删除

知识库-问答-删除

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmSwArticleApi;

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

    AlipayIserviceCcmSwArticleApi apiInstance = new AlipayIserviceCcmSwArticleApi(defaultClient);
    try {
      Object result = apiInstance.delete();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmSwArticleApi#delete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

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

<a name="get"></a>
# **get**
> AlipayIserviceCcmSwArticleGetResponseModel get(ccsInstanceId, id)

知识库-问答-获取

知识库-问答-获取

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmSwArticleApi;

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

    AlipayIserviceCcmSwArticleApi apiInstance = new AlipayIserviceCcmSwArticleApi(defaultClient);
    String ccsInstanceId = "ZPNASDK"; // String | 子部门ID，不传为默认部门
    Integer id = 1; // Integer | 文章ID
    try {
      AlipayIserviceCcmSwArticleGetResponseModel result = apiInstance.get(ccsInstanceId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmSwArticleApi#get");
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
| **ccsInstanceId** | **String**| 子部门ID，不传为默认部门 | [optional] |
| **id** | **Integer**| 文章ID | [optional] |

### Return type

**AlipayIserviceCcmSwArticleGetResponseModel**

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

<a name="modify"></a>
# **modify**
> Object modify(alipayIserviceCcmSwArticleModifyModel)

知识库-问答-修改

知识库-问答-修改

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmSwArticleApi;

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

    AlipayIserviceCcmSwArticleApi apiInstance = new AlipayIserviceCcmSwArticleApi(defaultClient);
    AlipayIserviceCcmSwArticleModifyModel alipayIserviceCcmSwArticleModifyModel = new AlipayIserviceCcmSwArticleModifyModel(); // AlipayIserviceCcmSwArticleModifyModel | 
    try {
      Object result = apiInstance.modify(alipayIserviceCcmSwArticleModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmSwArticleApi#modify");
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
| **alipayIserviceCcmSwArticleModifyModel** | **AlipayIserviceCcmSwArticleModifyModel**|  | [optional] |

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

