# AlipayIserviceCcmSwTreecategoryApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayIserviceCcmSwTreecategoryApi.md#batchquery) | **POST** /v3/alipay/iservice/ccm/sw/treecategory/batchquery | 知识库-节点-批量查询 |
| [**create**](AlipayIserviceCcmSwTreecategoryApi.md#create) | **POST** /v3/alipay/iservice/ccm/sw/treecategory/create | 知识库-节点-创建 |
| [**delete**](AlipayIserviceCcmSwTreecategoryApi.md#delete) | **POST** /v3/alipay/iservice/ccm/sw/treecategory/delete | 知识库-节点-删除 |
| [**modify**](AlipayIserviceCcmSwTreecategoryApi.md#modify) | **POST** /v3/alipay/iservice/ccm/sw/treecategory/modify | 知识库-节点-修改 |


<a name="batchquery"></a>
# **batchquery**
> AlipayIserviceCcmSwTreecategoryBatchqueryResponseModel batchquery(alipayIserviceCcmSwTreecategoryBatchqueryModel)

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
    AlipayIserviceCcmSwTreecategoryBatchqueryModel alipayIserviceCcmSwTreecategoryBatchqueryModel = new AlipayIserviceCcmSwTreecategoryBatchqueryModel(); // AlipayIserviceCcmSwTreecategoryBatchqueryModel | 
    try {
      AlipayIserviceCcmSwTreecategoryBatchqueryResponseModel result = apiInstance.batchquery(alipayIserviceCcmSwTreecategoryBatchqueryModel);
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
| **alipayIserviceCcmSwTreecategoryBatchqueryModel** | **AlipayIserviceCcmSwTreecategoryBatchqueryModel**|  | [optional] |

### Return type

**AlipayIserviceCcmSwTreecategoryBatchqueryResponseModel**

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
> Object delete(alipayIserviceCcmSwTreecategoryDeleteModel)

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
    AlipayIserviceCcmSwTreecategoryDeleteModel alipayIserviceCcmSwTreecategoryDeleteModel = new AlipayIserviceCcmSwTreecategoryDeleteModel(); // AlipayIserviceCcmSwTreecategoryDeleteModel | 
    try {
      Object result = apiInstance.delete(alipayIserviceCcmSwTreecategoryDeleteModel);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alipayIserviceCcmSwTreecategoryDeleteModel** | **AlipayIserviceCcmSwTreecategoryDeleteModel**|  | [optional] |

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

