# AlipayIserviceCcmSwTreecategoryApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayIserviceCcmSwTreecategoryApi.md#batchquery) | **GET** /v3/alipay/iservice/ccm/sw/treecategory/batchquery | 知识库-节点-批量查询 |
| [**create**](AlipayIserviceCcmSwTreecategoryApi.md#create) | **PUT** /v3/alipay/iservice/ccm/sw/treecategory/create | 知识库-节点-创建 |
| [**delete**](AlipayIserviceCcmSwTreecategoryApi.md#delete) | **DELETE** /v3/alipay/iservice/ccm/sw/treecategory/delete | 知识库-节点-删除 |
| [**modify**](AlipayIserviceCcmSwTreecategoryApi.md#modify) | **PATCH** /v3/alipay/iservice/ccm/sw/treecategory/modify | 知识库-节点-修改 |


<a name="batchquery"></a>
# **batchquery**
> AlipayIserviceCcmSwTreecategoryBatchqueryResponseModel batchquery(ccsInstanceId, libraryId, name, pageNum, pageSize)

知识库-节点-批量查询

知识库-节点-批量查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmSwTreecategoryApi;

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

    AlipayIserviceCcmSwTreecategoryApi apiInstance = new AlipayIserviceCcmSwTreecategoryApi(defaultClient);
    String ccsInstanceId = "ZPNASDK"; // String | 子部门ID，不传为默认部门
    Integer libraryId = 1; // Integer | 知识库ID
    String name = "服务群"; // String | 节点名称
    Integer pageNum = 1; // Integer | 页数，page_size不能为空
    Integer pageSize = 10; // Integer | 页显示大小，page_num不能为空
    try {
      AlipayIserviceCcmSwTreecategoryBatchqueryResponseModel result = apiInstance.batchquery(ccsInstanceId, libraryId, name, pageNum, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmSwTreecategoryApi#batchquery");
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
| **name** | **String**| 节点名称 | [optional] |
| **pageNum** | **Integer**| 页数，page_size不能为空 | [optional] |
| **pageSize** | **Integer**| 页显示大小，page_num不能为空 | [optional] |

### Return type

**AlipayIserviceCcmSwTreecategoryBatchqueryResponseModel**

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
> AlipayIserviceCcmSwTreecategoryCreateResponseModel create(alipayIserviceCcmSwTreecategoryCreateModel)

知识库-节点-创建

知识库-节点-创建

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmSwTreecategoryApi;

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

    AlipayIserviceCcmSwTreecategoryApi apiInstance = new AlipayIserviceCcmSwTreecategoryApi(defaultClient);
    AlipayIserviceCcmSwTreecategoryCreateModel alipayIserviceCcmSwTreecategoryCreateModel = new AlipayIserviceCcmSwTreecategoryCreateModel(); // AlipayIserviceCcmSwTreecategoryCreateModel | 
    try {
      AlipayIserviceCcmSwTreecategoryCreateResponseModel result = apiInstance.create(alipayIserviceCcmSwTreecategoryCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmSwTreecategoryApi#create");
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
| **alipayIserviceCcmSwTreecategoryCreateModel** | **AlipayIserviceCcmSwTreecategoryCreateModel**|  | [optional] |

### Return type

**AlipayIserviceCcmSwTreecategoryCreateResponseModel**

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

知识库-节点-删除

知识库-节点-删除

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmSwTreecategoryApi;

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

    AlipayIserviceCcmSwTreecategoryApi apiInstance = new AlipayIserviceCcmSwTreecategoryApi(defaultClient);
    try {
      Object result = apiInstance.delete();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmSwTreecategoryApi#delete");
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

<a name="modify"></a>
# **modify**
> Object modify(alipayIserviceCcmSwTreecategoryModifyModel)

知识库-节点-修改

知识库-节点-修改

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmSwTreecategoryApi;

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

    AlipayIserviceCcmSwTreecategoryApi apiInstance = new AlipayIserviceCcmSwTreecategoryApi(defaultClient);
    AlipayIserviceCcmSwTreecategoryModifyModel alipayIserviceCcmSwTreecategoryModifyModel = new AlipayIserviceCcmSwTreecategoryModifyModel(); // AlipayIserviceCcmSwTreecategoryModifyModel | 
    try {
      Object result = apiInstance.modify(alipayIserviceCcmSwTreecategoryModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmSwTreecategoryApi#modify");
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
| **alipayIserviceCcmSwTreecategoryModifyModel** | **AlipayIserviceCcmSwTreecategoryModifyModel**|  | [optional] |

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

