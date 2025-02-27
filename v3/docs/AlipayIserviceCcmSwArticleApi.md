# AlipayIserviceCcmSwArticleApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayIserviceCcmSwArticleApi.md#batchquery) | **POST** /v3/alipay/iservice/ccm/sw/article/batchquery | 知识库-问答-批量查询 |
| [**create**](AlipayIserviceCcmSwArticleApi.md#create) | **POST** /v3/alipay/iservice/ccm/sw/article/create | 知识库-问答-创建 |
| [**delete**](AlipayIserviceCcmSwArticleApi.md#delete) | **POST** /v3/alipay/iservice/ccm/sw/article/delete | 知识库-问答-删除 |
| [**get**](AlipayIserviceCcmSwArticleApi.md#get) | **POST** /v3/alipay/iservice/ccm/sw/article/get | 知识库-问答-获取 |
| [**modify**](AlipayIserviceCcmSwArticleApi.md#modify) | **POST** /v3/alipay/iservice/ccm/sw/article/modify | 知识库-问答-修改 |


<a name="batchquery"></a>
# **batchquery**
> AlipayIserviceCcmSwArticleBatchqueryResponseModel batchquery(alipayIserviceCcmSwArticleBatchqueryModel)

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
    AlipayIserviceCcmSwArticleBatchqueryModel alipayIserviceCcmSwArticleBatchqueryModel = new AlipayIserviceCcmSwArticleBatchqueryModel(); // AlipayIserviceCcmSwArticleBatchqueryModel | 
    try {
      AlipayIserviceCcmSwArticleBatchqueryResponseModel result = apiInstance.batchquery(alipayIserviceCcmSwArticleBatchqueryModel);
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
| **alipayIserviceCcmSwArticleBatchqueryModel** | **AlipayIserviceCcmSwArticleBatchqueryModel**|  | [optional] |

### Return type

**AlipayIserviceCcmSwArticleBatchqueryResponseModel**

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
> Object delete(alipayIserviceCcmSwArticleDeleteModel)

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
    AlipayIserviceCcmSwArticleDeleteModel alipayIserviceCcmSwArticleDeleteModel = new AlipayIserviceCcmSwArticleDeleteModel(); // AlipayIserviceCcmSwArticleDeleteModel | 
    try {
      Object result = apiInstance.delete(alipayIserviceCcmSwArticleDeleteModel);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alipayIserviceCcmSwArticleDeleteModel** | **AlipayIserviceCcmSwArticleDeleteModel**|  | [optional] |

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

<a name="get"></a>
# **get**
> AlipayIserviceCcmSwArticleGetResponseModel get(alipayIserviceCcmSwArticleGetModel)

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
    AlipayIserviceCcmSwArticleGetModel alipayIserviceCcmSwArticleGetModel = new AlipayIserviceCcmSwArticleGetModel(); // AlipayIserviceCcmSwArticleGetModel | 
    try {
      AlipayIserviceCcmSwArticleGetResponseModel result = apiInstance.get(alipayIserviceCcmSwArticleGetModel);
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
| **alipayIserviceCcmSwArticleGetModel** | **AlipayIserviceCcmSwArticleGetModel**|  | [optional] |

### Return type

**AlipayIserviceCcmSwArticleGetResponseModel**

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

