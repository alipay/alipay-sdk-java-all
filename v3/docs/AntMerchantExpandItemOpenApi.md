# AntMerchantExpandItemOpenApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AntMerchantExpandItemOpenApi.md#batchquery) | **POST** /v3/ant/merchant/expand/item/open/batchquery | 批量查询商品接口 |
| [**create**](AntMerchantExpandItemOpenApi.md#create) | **POST** /v3/ant/merchant/expand/item/open/create | 创建商品接口 |
| [**delete**](AntMerchantExpandItemOpenApi.md#delete) | **DELETE** /v3/ant/merchant/expand/item/open/delete | 删除商品接口 |
| [**modify**](AntMerchantExpandItemOpenApi.md#modify) | **POST** /v3/ant/merchant/expand/item/open/modify | 修改商品接口 |
| [**query**](AntMerchantExpandItemOpenApi.md#query) | **GET** /v3/ant/merchant/expand/item/open/query | 查询商品接口 |


<a name="batchquery"></a>
# **batchquery**
> AntMerchantExpandItemOpenBatchqueryResponseModel batchquery(antMerchantExpandItemOpenBatchqueryModel)

批量查询商品接口

用于ISV或商户批量查询商品

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AntMerchantExpandItemOpenApi;

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

    AntMerchantExpandItemOpenApi apiInstance = new AntMerchantExpandItemOpenApi(defaultClient);
    AntMerchantExpandItemOpenBatchqueryModel antMerchantExpandItemOpenBatchqueryModel = new AntMerchantExpandItemOpenBatchqueryModel(); // AntMerchantExpandItemOpenBatchqueryModel | 
    try {
      AntMerchantExpandItemOpenBatchqueryResponseModel result = apiInstance.batchquery(antMerchantExpandItemOpenBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntMerchantExpandItemOpenApi#batchquery");
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
| **antMerchantExpandItemOpenBatchqueryModel** | **AntMerchantExpandItemOpenBatchqueryModel**|  | [optional] |

### Return type

**AntMerchantExpandItemOpenBatchqueryResponseModel**

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
> AntMerchantExpandItemOpenCreateResponseModel create(antMerchantExpandItemOpenCreateModel)

创建商品接口

用于ISV或商户创建商品

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AntMerchantExpandItemOpenApi;

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

    AntMerchantExpandItemOpenApi apiInstance = new AntMerchantExpandItemOpenApi(defaultClient);
    AntMerchantExpandItemOpenCreateModel antMerchantExpandItemOpenCreateModel = new AntMerchantExpandItemOpenCreateModel(); // AntMerchantExpandItemOpenCreateModel | 
    try {
      AntMerchantExpandItemOpenCreateResponseModel result = apiInstance.create(antMerchantExpandItemOpenCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntMerchantExpandItemOpenApi#create");
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
| **antMerchantExpandItemOpenCreateModel** | **AntMerchantExpandItemOpenCreateModel**|  | [optional] |

### Return type

**AntMerchantExpandItemOpenCreateResponseModel**

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
> Object delete(itemId)

删除商品接口

用于ISV或商户删除商品

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AntMerchantExpandItemOpenApi;

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

    AntMerchantExpandItemOpenApi apiInstance = new AntMerchantExpandItemOpenApi(defaultClient);
    String itemId = "2019073100702219000000100000"; // String | 商品ID
    try {
      Object result = apiInstance.delete(itemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntMerchantExpandItemOpenApi#delete");
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
| **itemId** | **String**| 商品ID | [optional] |

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
> Object modify(antMerchantExpandItemOpenModifyModel)

修改商品接口

用于ISV或商户修改商品

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AntMerchantExpandItemOpenApi;

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

    AntMerchantExpandItemOpenApi apiInstance = new AntMerchantExpandItemOpenApi(defaultClient);
    AntMerchantExpandItemOpenModifyModel antMerchantExpandItemOpenModifyModel = new AntMerchantExpandItemOpenModifyModel(); // AntMerchantExpandItemOpenModifyModel | 
    try {
      Object result = apiInstance.modify(antMerchantExpandItemOpenModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntMerchantExpandItemOpenApi#modify");
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
| **antMerchantExpandItemOpenModifyModel** | **AntMerchantExpandItemOpenModifyModel**|  | [optional] |

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
> AntMerchantExpandItemOpenQueryResponseModel query(targetId, scene, targetType, status)

查询商品接口

用于ISV或商户查询商品

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AntMerchantExpandItemOpenApi;

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

    AntMerchantExpandItemOpenApi apiInstance = new AntMerchantExpandItemOpenApi(defaultClient);
    String targetId = "2018090600502000000022501261"; // String | 商品归属主体ID 例：商品归属主体类型target_type为店铺，则商品归属主体ID为店铺ID（支付宝侧店铺ID）；归属主体类型target_type为小程序，则归属主体ID为小程序ID
    String scene = "APP_ORDER"; // String | 场景码（具体值请参见产品文档）。
    String targetType = "8"; // String | 商品归属主体类型。枚举如下： 5：店铺。 8：小程序。
    String status = "EFFECT"; // String | 商品状态
    try {
      AntMerchantExpandItemOpenQueryResponseModel result = apiInstance.query(targetId, scene, targetType, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntMerchantExpandItemOpenApi#query");
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
| **targetId** | **String**| 商品归属主体ID 例：商品归属主体类型target_type为店铺，则商品归属主体ID为店铺ID（支付宝侧店铺ID）；归属主体类型target_type为小程序，则归属主体ID为小程序ID | [optional] |
| **scene** | **String**| 场景码（具体值请参见产品文档）。 | [optional] |
| **targetType** | **String**| 商品归属主体类型。枚举如下： 5：店铺。 8：小程序。 | [optional] |
| **status** | **String**| 商品状态 | [optional] |

### Return type

**AntMerchantExpandItemOpenQueryResponseModel**

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

