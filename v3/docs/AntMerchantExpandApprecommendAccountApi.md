# AntMerchantExpandApprecommendAccountApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AntMerchantExpandApprecommendAccountApi.md#create) | **POST** /v3/ant/merchant/expand/apprecommend/account/create | 关联账号和小程序 |
| [**delete**](AntMerchantExpandApprecommendAccountApi.md#delete) | **DELETE** /v3/ant/merchant/expand/apprecommend/account/delete | 取消关联账号和小程序 |
| [**query**](AntMerchantExpandApprecommendAccountApi.md#query) | **GET** /v3/ant/merchant/expand/apprecommend/account/query | 查询已关联指定APP的账号列表 |


<a name="create"></a>
# **create**
> Object create(antMerchantExpandApprecommendAccountCreateModel)

关联账号和小程序

将账号与小程序进行绑定，用于支付推荐场景

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AntMerchantExpandApprecommendAccountApi;

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

    AntMerchantExpandApprecommendAccountApi apiInstance = new AntMerchantExpandApprecommendAccountApi(defaultClient);
    AntMerchantExpandApprecommendAccountCreateModel antMerchantExpandApprecommendAccountCreateModel = new AntMerchantExpandApprecommendAccountCreateModel(); // AntMerchantExpandApprecommendAccountCreateModel | 
    try {
      Object result = apiInstance.create(antMerchantExpandApprecommendAccountCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntMerchantExpandApprecommendAccountApi#create");
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
| **antMerchantExpandApprecommendAccountCreateModel** | **AntMerchantExpandApprecommendAccountCreateModel**|  | [optional] |

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

<a name="delete"></a>
# **delete**
> Object delete(appNo, accNo)

取消关联账号和小程序

取消账号与小程序的绑定，用于支付推荐场景

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AntMerchantExpandApprecommendAccountApi;

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

    AntMerchantExpandApprecommendAccountApi apiInstance = new AntMerchantExpandApprecommendAccountApi(defaultClient);
    String appNo = "2021000155639069"; // String | 待解绑小程序的app_id
    String accNo = "20880019****4501"; // String | 待解绑账号PID
    try {
      Object result = apiInstance.delete(appNo, accNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntMerchantExpandApprecommendAccountApi#delete");
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
| **appNo** | **String**| 待解绑小程序的app_id | [optional] |
| **accNo** | **String**| 待解绑账号PID | [optional] |

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

<a name="query"></a>
# **query**
> AntMerchantExpandApprecommendAccountQueryResponseModel query(appNo, pageSize, pageNumber)

查询已关联指定APP的账号列表

查询已关联指定APP的账号列表，用于支付推荐场景

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AntMerchantExpandApprecommendAccountApi;

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

    AntMerchantExpandApprecommendAccountApi apiInstance = new AntMerchantExpandApprecommendAccountApi(defaultClient);
    String appNo = "20210001****9069"; // String | 已关联小程序的app_id
    Integer pageSize = 10; // Integer | 单页行数，不能超过100行
    Integer pageNumber = 1; // Integer | 页码
    try {
      AntMerchantExpandApprecommendAccountQueryResponseModel result = apiInstance.query(appNo, pageSize, pageNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntMerchantExpandApprecommendAccountApi#query");
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
| **appNo** | **String**| 已关联小程序的app_id | [optional] |
| **pageSize** | **Integer**| 单页行数，不能超过100行 | [optional] |
| **pageNumber** | **Integer**| 页码 | [optional] |

### Return type

**AntMerchantExpandApprecommendAccountQueryResponseModel**

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

