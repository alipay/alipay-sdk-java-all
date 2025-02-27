# AlipayFundJointaccountMemberApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayFundJointaccountMemberApi.md#batchquery) | **POST** /v3/alipay/fund/jointaccount/member/batchquery | 企业批量查询员工信息（分页） |
| [**bind**](AlipayFundJointaccountMemberApi.md#bind) | **POST** /v3/alipay/fund/jointaccount/member/bind | 因公付邀请员工 |
| [**consult**](AlipayFundJointaccountMemberApi.md#consult) | **POST** /v3/alipay/fund/jointaccount/member/consult | 员企关系咨询 |
| [**query**](AlipayFundJointaccountMemberApi.md#query) | **POST** /v3/alipay/fund/jointaccount/member/query | 企业查询员工列表 |
| [**unbind**](AlipayFundJointaccountMemberApi.md#unbind) | **POST** /v3/alipay/fund/jointaccount/member/unbind | 企业删除员工 |


<a name="batchquery"></a>
# **batchquery**
> AlipayFundJointaccountMemberBatchqueryResponseModel batchquery(alipayFundJointaccountMemberBatchqueryModel)

企业批量查询员工信息（分页）

企业查询员工列表，支持分页，支持按登录号精确查询，支持按会员号精确查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundJointaccountMemberApi;

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

    AlipayFundJointaccountMemberApi apiInstance = new AlipayFundJointaccountMemberApi(defaultClient);
    AlipayFundJointaccountMemberBatchqueryModel alipayFundJointaccountMemberBatchqueryModel = new AlipayFundJointaccountMemberBatchqueryModel(); // AlipayFundJointaccountMemberBatchqueryModel | 
    try {
      AlipayFundJointaccountMemberBatchqueryResponseModel result = apiInstance.batchquery(alipayFundJointaccountMemberBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundJointaccountMemberApi#batchquery");
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
| **alipayFundJointaccountMemberBatchqueryModel** | **AlipayFundJointaccountMemberBatchqueryModel**|  | [optional] |

### Return type

**AlipayFundJointaccountMemberBatchqueryResponseModel**

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

<a name="bind"></a>
# **bind**
> AlipayFundJointaccountMemberBindResponseModel bind(alipayFundJointaccountMemberBindModel)

因公付邀请员工

因公付邀请员工

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundJointaccountMemberApi;

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

    AlipayFundJointaccountMemberApi apiInstance = new AlipayFundJointaccountMemberApi(defaultClient);
    AlipayFundJointaccountMemberBindModel alipayFundJointaccountMemberBindModel = new AlipayFundJointaccountMemberBindModel(); // AlipayFundJointaccountMemberBindModel | 
    try {
      AlipayFundJointaccountMemberBindResponseModel result = apiInstance.bind(alipayFundJointaccountMemberBindModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundJointaccountMemberApi#bind");
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
| **alipayFundJointaccountMemberBindModel** | **AlipayFundJointaccountMemberBindModel**|  | [optional] |

### Return type

**AlipayFundJointaccountMemberBindResponseModel**

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

<a name="consult"></a>
# **consult**
> AlipayFundJointaccountMemberConsultResponseModel consult(alipayFundJointaccountMemberConsultModel)

员企关系咨询

返回输入的员工列表是否在指定企业组织中

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundJointaccountMemberApi;

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

    AlipayFundJointaccountMemberApi apiInstance = new AlipayFundJointaccountMemberApi(defaultClient);
    AlipayFundJointaccountMemberConsultModel alipayFundJointaccountMemberConsultModel = new AlipayFundJointaccountMemberConsultModel(); // AlipayFundJointaccountMemberConsultModel | 
    try {
      AlipayFundJointaccountMemberConsultResponseModel result = apiInstance.consult(alipayFundJointaccountMemberConsultModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundJointaccountMemberApi#consult");
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
| **alipayFundJointaccountMemberConsultModel** | **AlipayFundJointaccountMemberConsultModel**|  | [optional] |

### Return type

**AlipayFundJointaccountMemberConsultResponseModel**

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
> AlipayFundJointaccountMemberQueryResponseModel query(alipayFundJointaccountMemberQueryModel)

企业查询员工列表

企业查询员工列表

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundJointaccountMemberApi;

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

    AlipayFundJointaccountMemberApi apiInstance = new AlipayFundJointaccountMemberApi(defaultClient);
    AlipayFundJointaccountMemberQueryModel alipayFundJointaccountMemberQueryModel = new AlipayFundJointaccountMemberQueryModel(); // AlipayFundJointaccountMemberQueryModel | 
    try {
      AlipayFundJointaccountMemberQueryResponseModel result = apiInstance.query(alipayFundJointaccountMemberQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundJointaccountMemberApi#query");
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
| **alipayFundJointaccountMemberQueryModel** | **AlipayFundJointaccountMemberQueryModel**|  | [optional] |

### Return type

**AlipayFundJointaccountMemberQueryResponseModel**

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

<a name="unbind"></a>
# **unbind**
> Object unbind(alipayFundJointaccountMemberUnbindModel)

企业删除员工

企业删除员工

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundJointaccountMemberApi;

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

    AlipayFundJointaccountMemberApi apiInstance = new AlipayFundJointaccountMemberApi(defaultClient);
    AlipayFundJointaccountMemberUnbindModel alipayFundJointaccountMemberUnbindModel = new AlipayFundJointaccountMemberUnbindModel(); // AlipayFundJointaccountMemberUnbindModel | 
    try {
      Object result = apiInstance.unbind(alipayFundJointaccountMemberUnbindModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundJointaccountMemberApi#unbind");
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
| **alipayFundJointaccountMemberUnbindModel** | **AlipayFundJointaccountMemberUnbindModel**|  | [optional] |

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

