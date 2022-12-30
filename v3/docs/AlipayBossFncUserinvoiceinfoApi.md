# AlipayBossFncUserinvoiceinfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayBossFncUserinvoiceinfoApi.md#create) | **POST** /v3/alipay/boss/fnc/userinvoiceinfo/create | 新增客户开票资料 |
| [**modify**](AlipayBossFncUserinvoiceinfoApi.md#modify) | **POST** /v3/alipay/boss/fnc/userinvoiceinfo/modify | 修改用户开票资料 |
| [**query**](AlipayBossFncUserinvoiceinfoApi.md#query) | **GET** /v3/alipay/boss/fnc/userinvoiceinfo/query | 根据PID获取相关的开票资料 |


<a name="create"></a>
# **create**
> AlipayBossFncUserinvoiceinfoCreateResponseModel create(alipayBossFncUserinvoiceinfoCreateModel)

新增客户开票资料

申请开票alipay.boss.fnc.invoice.create之前需要维护的开票资料信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayBossFncUserinvoiceinfoApi;

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

    AlipayBossFncUserinvoiceinfoApi apiInstance = new AlipayBossFncUserinvoiceinfoApi(defaultClient);
    AlipayBossFncUserinvoiceinfoCreateModel alipayBossFncUserinvoiceinfoCreateModel = new AlipayBossFncUserinvoiceinfoCreateModel(); // AlipayBossFncUserinvoiceinfoCreateModel | 
    try {
      AlipayBossFncUserinvoiceinfoCreateResponseModel result = apiInstance.create(alipayBossFncUserinvoiceinfoCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayBossFncUserinvoiceinfoApi#create");
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
| **alipayBossFncUserinvoiceinfoCreateModel** | **AlipayBossFncUserinvoiceinfoCreateModel**|  | [optional] |

### Return type

**AlipayBossFncUserinvoiceinfoCreateResponseModel**

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
> Object modify(alipayBossFncUserinvoiceinfoModifyModel)

修改用户开票资料

通过查询用户的开票资料（alipay.boss.fnc.userinvoiceinfo.query）后进行开票资料的修改

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayBossFncUserinvoiceinfoApi;

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

    AlipayBossFncUserinvoiceinfoApi apiInstance = new AlipayBossFncUserinvoiceinfoApi(defaultClient);
    AlipayBossFncUserinvoiceinfoModifyModel alipayBossFncUserinvoiceinfoModifyModel = new AlipayBossFncUserinvoiceinfoModifyModel(); // AlipayBossFncUserinvoiceinfoModifyModel | 
    try {
      Object result = apiInstance.modify(alipayBossFncUserinvoiceinfoModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayBossFncUserinvoiceinfoApi#modify");
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
| **alipayBossFncUserinvoiceinfoModifyModel** | **AlipayBossFncUserinvoiceinfoModifyModel**|  | [optional] |

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
> AlipayBossFncUserinvoiceinfoQueryResponseModel query(pid)

根据PID获取相关的开票资料

根据PID获取相关的开票资料

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayBossFncUserinvoiceinfoApi;

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

    AlipayBossFncUserinvoiceinfoApi apiInstance = new AlipayBossFncUserinvoiceinfoApi(defaultClient);
    String pid = "2088001007243670"; // String | 开票pid/mid/ou，唯一标识商户信息/集团用户信息的ID
    try {
      AlipayBossFncUserinvoiceinfoQueryResponseModel result = apiInstance.query(pid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayBossFncUserinvoiceinfoApi#query");
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
| **pid** | **String**| 开票pid/mid/ou，唯一标识商户信息/集团用户信息的ID | [optional] |

### Return type

**AlipayBossFncUserinvoiceinfoQueryResponseModel**

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

