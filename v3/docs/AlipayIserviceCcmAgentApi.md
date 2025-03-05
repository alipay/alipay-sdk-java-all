# AlipayIserviceCcmAgentApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayIserviceCcmAgentApi.md#create) | **POST** /v3/alipay/iservice/ccm/agent/create | 新增客服接口 |
| [**delete**](AlipayIserviceCcmAgentApi.md#delete) | **DELETE** /v3/alipay/iservice/ccm/agent/delete | 删除客服接口 |
| [**get**](AlipayIserviceCcmAgentApi.md#get) | **GET** /v3/alipay/iservice/ccm/agent/get | 查询客服详情 |
| [**modify**](AlipayIserviceCcmAgentApi.md#modify) | **POST** /v3/alipay/iservice/ccm/agent/modify | 更新客服接口 |
| [**query**](AlipayIserviceCcmAgentApi.md#query) | **POST** /v3/alipay/iservice/ccm/agent/query | 客服查询接口 |


<a name="create"></a>
# **create**
> AlipayIserviceCcmAgentCreateResponseModel create(alipayIserviceCcmAgentCreateModel)

新增客服接口

新增一个CCM客服

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmAgentApi;

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

    AlipayIserviceCcmAgentApi apiInstance = new AlipayIserviceCcmAgentApi(defaultClient);
    AlipayIserviceCcmAgentCreateModel alipayIserviceCcmAgentCreateModel = new AlipayIserviceCcmAgentCreateModel(); // AlipayIserviceCcmAgentCreateModel | 
    try {
      AlipayIserviceCcmAgentCreateResponseModel result = apiInstance.create(alipayIserviceCcmAgentCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmAgentApi#create");
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
| **alipayIserviceCcmAgentCreateModel** | **AlipayIserviceCcmAgentCreateModel**|  | [optional] |

### Return type

**AlipayIserviceCcmAgentCreateResponseModel**

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
> Object delete(id)

删除客服接口

管理员删除一个客服

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmAgentApi;

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

    AlipayIserviceCcmAgentApi apiInstance = new AlipayIserviceCcmAgentApi(defaultClient);
    String id = "2019032101896769"; // String | 客服id
    try {
      Object result = apiInstance.delete(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmAgentApi#delete");
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
| **id** | **String**| 客服id | [optional] |

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
> AlipayIserviceCcmAgentGetResponseModel get(id, jobNumber, userChannel, externalUserId)

查询客服详情

ISV或商户查询获取某个客服的详细信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmAgentApi;

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

    AlipayIserviceCcmAgentApi apiInstance = new AlipayIserviceCcmAgentApi(defaultClient);
    String id = "2018101801902073"; // String | 客服id
    String jobNumber = "0001"; // String | 客服工号
    String userChannel = "ALIPAY"; // String | 客服账号渠道, ALIPAY:支付宝账号 user_channel和external_user_id必须配对使用
    String externalUserId = "2088xxx"; // String | 客服账号id，当user_channel=ALIPAY时，此id为支付宝2088id external_user_id和user_channel必须配对使用
    try {
      AlipayIserviceCcmAgentGetResponseModel result = apiInstance.get(id, jobNumber, userChannel, externalUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmAgentApi#get");
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
| **id** | **String**| 客服id | [optional] |
| **jobNumber** | **String**| 客服工号 | [optional] |
| **userChannel** | **String**| 客服账号渠道, ALIPAY:支付宝账号 user_channel和external_user_id必须配对使用 | [optional] |
| **externalUserId** | **String**| 客服账号id，当user_channel&#x3D;ALIPAY时，此id为支付宝2088id external_user_id和user_channel必须配对使用 | [optional] |

### Return type

**AlipayIserviceCcmAgentGetResponseModel**

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
> Object modify(alipayIserviceCcmAgentModifyModel)

更新客服接口

管理员修改客服信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmAgentApi;

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

    AlipayIserviceCcmAgentApi apiInstance = new AlipayIserviceCcmAgentApi(defaultClient);
    AlipayIserviceCcmAgentModifyModel alipayIserviceCcmAgentModifyModel = new AlipayIserviceCcmAgentModifyModel(); // AlipayIserviceCcmAgentModifyModel | 
    try {
      Object result = apiInstance.modify(alipayIserviceCcmAgentModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmAgentApi#modify");
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
| **alipayIserviceCcmAgentModifyModel** | **AlipayIserviceCcmAgentModifyModel**|  | [optional] |

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
> AlipayIserviceCcmAgentQueryResponseModel query(alipayIserviceCcmAgentQueryModel)

客服查询接口

根据指定的查询条件查询客服列表

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmAgentApi;

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

    AlipayIserviceCcmAgentApi apiInstance = new AlipayIserviceCcmAgentApi(defaultClient);
    AlipayIserviceCcmAgentQueryModel alipayIserviceCcmAgentQueryModel = new AlipayIserviceCcmAgentQueryModel(); // AlipayIserviceCcmAgentQueryModel | 
    try {
      AlipayIserviceCcmAgentQueryResponseModel result = apiInstance.query(alipayIserviceCcmAgentQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmAgentApi#query");
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
| **alipayIserviceCcmAgentQueryModel** | **AlipayIserviceCcmAgentQueryModel**|  | [optional] |

### Return type

**AlipayIserviceCcmAgentQueryResponseModel**

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

