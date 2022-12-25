# AlipayOpenPublicLifeLabelApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayOpenPublicLifeLabelApi.md#batchquery) | **POST** /v3/alipay/open/public/life/label/batchquery | 标签批量查询接口 |
| [**create**](AlipayOpenPublicLifeLabelApi.md#create) | **POST** /v3/alipay/open/public/life/label/create | 创建标签接口 |
| [**delete**](AlipayOpenPublicLifeLabelApi.md#delete) | **DELETE** /v3/alipay/open/public/life/label/delete | 标签删除接口 |
| [**modify**](AlipayOpenPublicLifeLabelApi.md#modify) | **POST** /v3/alipay/open/public/life/label/modify | 标签修改接口 |


<a name="batchquery"></a>
# **batchquery**
> AlipayOpenPublicLifeLabelBatchqueryResponseModel batchquery()

标签批量查询接口

开发者可调用该接口查询生活号支持的标签列表，其中包括生活号通用标签、生活号自定义标签以及数据实验室标签。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicLifeLabelApi;

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

    AlipayOpenPublicLifeLabelApi apiInstance = new AlipayOpenPublicLifeLabelApi(defaultClient);
    try {
      AlipayOpenPublicLifeLabelBatchqueryResponseModel result = apiInstance.batchquery();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicLifeLabelApi#batchquery");
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

**AlipayOpenPublicLifeLabelBatchqueryResponseModel**

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
> AlipayOpenPublicLifeLabelCreateResponseModel create(alipayOpenPublicLifeLabelCreateModel)

创建标签接口

开发者可使用该API创建自定义标签

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicLifeLabelApi;

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

    AlipayOpenPublicLifeLabelApi apiInstance = new AlipayOpenPublicLifeLabelApi(defaultClient);
    AlipayOpenPublicLifeLabelCreateModel alipayOpenPublicLifeLabelCreateModel = new AlipayOpenPublicLifeLabelCreateModel(); // AlipayOpenPublicLifeLabelCreateModel | 
    try {
      AlipayOpenPublicLifeLabelCreateResponseModel result = apiInstance.create(alipayOpenPublicLifeLabelCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicLifeLabelApi#create");
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
| **alipayOpenPublicLifeLabelCreateModel** | **AlipayOpenPublicLifeLabelCreateModel**|  | [optional] |

### Return type

**AlipayOpenPublicLifeLabelCreateResponseModel**

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
> Object delete(labelId)

标签删除接口

开发者可调用此API删除自定义标签

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicLifeLabelApi;

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

    AlipayOpenPublicLifeLabelApi apiInstance = new AlipayOpenPublicLifeLabelApi(defaultClient);
    String labelId = "10000"; // String | 标签 id，只支持生活号自定义标签。通过 <a href=\"https://opendocs.alipay.com/apis/api_6/alipay.open.public.life.label.create\">alipay.open.public.life.label.create</a>(创建标签接口)创建自定义标签后获取。
    try {
      Object result = apiInstance.delete(labelId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicLifeLabelApi#delete");
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
| **labelId** | **String**| 标签 id，只支持生活号自定义标签。通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_6/alipay.open.public.life.label.create\&quot;&gt;alipay.open.public.life.label.create&lt;/a&gt;(创建标签接口)创建自定义标签后获取。 | [optional] |

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
> Object modify(alipayOpenPublicLifeLabelModifyModel)

标签修改接口

开发者可调用此API修改自定义标签的名称

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicLifeLabelApi;

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

    AlipayOpenPublicLifeLabelApi apiInstance = new AlipayOpenPublicLifeLabelApi(defaultClient);
    AlipayOpenPublicLifeLabelModifyModel alipayOpenPublicLifeLabelModifyModel = new AlipayOpenPublicLifeLabelModifyModel(); // AlipayOpenPublicLifeLabelModifyModel | 
    try {
      Object result = apiInstance.modify(alipayOpenPublicLifeLabelModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicLifeLabelApi#modify");
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
| **alipayOpenPublicLifeLabelModifyModel** | **AlipayOpenPublicLifeLabelModifyModel**|  | [optional] |

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

