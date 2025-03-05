# AlipayFundEnterprisepayGroupApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**add**](AlipayFundEnterprisepayGroupApi.md#add) | **POST** /v3/alipay/fund/enterprisepay/group/add | 因公付新增账户下群组 |
| [**delete**](AlipayFundEnterprisepayGroupApi.md#delete) | **DELETE** /v3/alipay/fund/enterprisepay/group/delete | 因公付删除账户下群组 |
| [**modify**](AlipayFundEnterprisepayGroupApi.md#modify) | **POST** /v3/alipay/fund/enterprisepay/group/modify | 因公付更新账户下群组 |
| [**query**](AlipayFundEnterprisepayGroupApi.md#query) | **GET** /v3/alipay/fund/enterprisepay/group/query | 因公付查询账户下群组 |


<a name="add"></a>
# **add**
> AlipayFundEnterprisepayGroupAddResponseModel add(alipayFundEnterprisepayGroupAddModel)

因公付新增账户下群组

创建因公付群组，包含群组信息和出资信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundEnterprisepayGroupApi;

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

    AlipayFundEnterprisepayGroupApi apiInstance = new AlipayFundEnterprisepayGroupApi(defaultClient);
    AlipayFundEnterprisepayGroupAddModel alipayFundEnterprisepayGroupAddModel = new AlipayFundEnterprisepayGroupAddModel(); // AlipayFundEnterprisepayGroupAddModel | 
    try {
      AlipayFundEnterprisepayGroupAddResponseModel result = apiInstance.add(alipayFundEnterprisepayGroupAddModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundEnterprisepayGroupApi#add");
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
| **alipayFundEnterprisepayGroupAddModel** | **AlipayFundEnterprisepayGroupAddModel**|  | [optional] |

### Return type

**AlipayFundEnterprisepayGroupAddResponseModel**

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
> Object delete(productCode, bizScene, accountId, agreementNo, outBizNo)

因公付删除账户下群组

因公付删除账户下群组

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundEnterprisepayGroupApi;

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

    AlipayFundEnterprisepayGroupApi apiInstance = new AlipayFundEnterprisepayGroupApi(defaultClient);
    String productCode = "ENTERPRISE_PAY"; // String | 产品码，默认值 ENTERPRISE_PAY
    String bizScene = "ANT_GROUP"; // String | 场景码，联系支付宝分配
    String accountId = "2088888888"; // String | 企业签约账户ID
    String agreementNo = "1231231321323"; // String | 平台和企业的三方授权协议号
    String outBizNo = "12123123"; // String | 外部业务号
    try {
      Object result = apiInstance.delete(productCode, bizScene, accountId, agreementNo, outBizNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundEnterprisepayGroupApi#delete");
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
| **productCode** | **String**| 产品码，默认值 ENTERPRISE_PAY | [optional] |
| **bizScene** | **String**| 场景码，联系支付宝分配 | [optional] |
| **accountId** | **String**| 企业签约账户ID | [optional] |
| **agreementNo** | **String**| 平台和企业的三方授权协议号 | [optional] |
| **outBizNo** | **String**| 外部业务号 | [optional] |

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
> Object modify(alipayFundEnterprisepayGroupModifyModel)

因公付更新账户下群组

因公付更新账户下群组

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundEnterprisepayGroupApi;

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

    AlipayFundEnterprisepayGroupApi apiInstance = new AlipayFundEnterprisepayGroupApi(defaultClient);
    AlipayFundEnterprisepayGroupModifyModel alipayFundEnterprisepayGroupModifyModel = new AlipayFundEnterprisepayGroupModifyModel(); // AlipayFundEnterprisepayGroupModifyModel | 
    try {
      Object result = apiInstance.modify(alipayFundEnterprisepayGroupModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundEnterprisepayGroupApi#modify");
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
| **alipayFundEnterprisepayGroupModifyModel** | **AlipayFundEnterprisepayGroupModifyModel**|  | [optional] |

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
> AlipayFundEnterprisepayGroupQueryResponseModel query(productCode, bizScene, accountId, agreementNo, outBizNo)

因公付查询账户下群组

查询因公付群组，包含群组信息和对应的出资主体

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundEnterprisepayGroupApi;

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

    AlipayFundEnterprisepayGroupApi apiInstance = new AlipayFundEnterprisepayGroupApi(defaultClient);
    String productCode = "ENTERPRISE_PAY"; // String | 产品码，默认值 ENTERPRISE_PAY
    String bizScene = "ANT_GROUP"; // String | 场景码，联系支付宝分配
    String accountId = "2088888888"; // String | 企业签约账户ID
    String agreementNo = "1231231321323"; // String | 平台和企业的三方授权协议号
    String outBizNo = "12312313"; // String | 外部业务号，外部群组号
    try {
      AlipayFundEnterprisepayGroupQueryResponseModel result = apiInstance.query(productCode, bizScene, accountId, agreementNo, outBizNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundEnterprisepayGroupApi#query");
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
| **productCode** | **String**| 产品码，默认值 ENTERPRISE_PAY | [optional] |
| **bizScene** | **String**| 场景码，联系支付宝分配 | [optional] |
| **accountId** | **String**| 企业签约账户ID | [optional] |
| **agreementNo** | **String**| 平台和企业的三方授权协议号 | [optional] |
| **outBizNo** | **String**| 外部业务号，外部群组号 | [optional] |

### Return type

**AlipayFundEnterprisepayGroupQueryResponseModel**

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

