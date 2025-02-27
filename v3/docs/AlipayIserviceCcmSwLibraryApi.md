# AlipayIserviceCcmSwLibraryApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayIserviceCcmSwLibraryApi.md#batchquery) | **POST** /v3/alipay/iservice/ccm/sw/library/batchquery | 知识库-库-批量查询 |
| [**create**](AlipayIserviceCcmSwLibraryApi.md#create) | **POST** /v3/alipay/iservice/ccm/sw/library/create | 知识库-库-创建 |
| [**delete**](AlipayIserviceCcmSwLibraryApi.md#delete) | **POST** /v3/alipay/iservice/ccm/sw/library/delete | 知识库-库-删除 |
| [**modify**](AlipayIserviceCcmSwLibraryApi.md#modify) | **POST** /v3/alipay/iservice/ccm/sw/library/modify | 知识库-库-修改 |


<a name="batchquery"></a>
# **batchquery**
> AlipayIserviceCcmSwLibraryBatchqueryResponseModel batchquery(alipayIserviceCcmSwLibraryBatchqueryModel)

知识库-库-批量查询

知识库-库-批量查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmSwLibraryApi;

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

    AlipayIserviceCcmSwLibraryApi apiInstance = new AlipayIserviceCcmSwLibraryApi(defaultClient);
    AlipayIserviceCcmSwLibraryBatchqueryModel alipayIserviceCcmSwLibraryBatchqueryModel = new AlipayIserviceCcmSwLibraryBatchqueryModel(); // AlipayIserviceCcmSwLibraryBatchqueryModel | 
    try {
      AlipayIserviceCcmSwLibraryBatchqueryResponseModel result = apiInstance.batchquery(alipayIserviceCcmSwLibraryBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmSwLibraryApi#batchquery");
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
| **alipayIserviceCcmSwLibraryBatchqueryModel** | **AlipayIserviceCcmSwLibraryBatchqueryModel**|  | [optional] |

### Return type

**AlipayIserviceCcmSwLibraryBatchqueryResponseModel**

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
> AlipayIserviceCcmSwLibraryCreateResponseModel create(alipayIserviceCcmSwLibraryCreateModel)

知识库-库-创建

知识库-库-创建

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmSwLibraryApi;

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

    AlipayIserviceCcmSwLibraryApi apiInstance = new AlipayIserviceCcmSwLibraryApi(defaultClient);
    AlipayIserviceCcmSwLibraryCreateModel alipayIserviceCcmSwLibraryCreateModel = new AlipayIserviceCcmSwLibraryCreateModel(); // AlipayIserviceCcmSwLibraryCreateModel | 
    try {
      AlipayIserviceCcmSwLibraryCreateResponseModel result = apiInstance.create(alipayIserviceCcmSwLibraryCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmSwLibraryApi#create");
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
| **alipayIserviceCcmSwLibraryCreateModel** | **AlipayIserviceCcmSwLibraryCreateModel**|  | [optional] |

### Return type

**AlipayIserviceCcmSwLibraryCreateResponseModel**

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
> Object delete(alipayIserviceCcmSwLibraryDeleteModel)

知识库-库-删除

知识库-库-删除

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmSwLibraryApi;

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

    AlipayIserviceCcmSwLibraryApi apiInstance = new AlipayIserviceCcmSwLibraryApi(defaultClient);
    AlipayIserviceCcmSwLibraryDeleteModel alipayIserviceCcmSwLibraryDeleteModel = new AlipayIserviceCcmSwLibraryDeleteModel(); // AlipayIserviceCcmSwLibraryDeleteModel | 
    try {
      Object result = apiInstance.delete(alipayIserviceCcmSwLibraryDeleteModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmSwLibraryApi#delete");
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
| **alipayIserviceCcmSwLibraryDeleteModel** | **AlipayIserviceCcmSwLibraryDeleteModel**|  | [optional] |

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
> Object modify(alipayIserviceCcmSwLibraryModifyModel)

知识库-库-修改

知识库-库-修改

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmSwLibraryApi;

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

    AlipayIserviceCcmSwLibraryApi apiInstance = new AlipayIserviceCcmSwLibraryApi(defaultClient);
    AlipayIserviceCcmSwLibraryModifyModel alipayIserviceCcmSwLibraryModifyModel = new AlipayIserviceCcmSwLibraryModifyModel(); // AlipayIserviceCcmSwLibraryModifyModel | 
    try {
      Object result = apiInstance.modify(alipayIserviceCcmSwLibraryModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmSwLibraryApi#modify");
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
| **alipayIserviceCcmSwLibraryModifyModel** | **AlipayIserviceCcmSwLibraryModifyModel**|  | [optional] |

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

