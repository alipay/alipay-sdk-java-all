# AlipayMarketingActivityVoucherpackageApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayMarketingActivityVoucherpackageApi.md#batchquery) | **POST** /v3/alipay/marketing/activity/voucherpackage/batchquery | 券包批量查询 |
| [**consult**](AlipayMarketingActivityVoucherpackageApi.md#consult) | **POST** /v3/alipay/marketing/activity/voucherpackage/consult | 券包购买咨询 |
| [**query**](AlipayMarketingActivityVoucherpackageApi.md#query) | **POST** /v3/alipay/marketing/activity/voucherpackage/query | 券包详情查询 |


<a name="batchquery"></a>
# **batchquery**
> AlipayMarketingActivityVoucherpackageBatchqueryResponseModel batchquery(alipayMarketingActivityVoucherpackageBatchqueryModel)

券包批量查询

券包批量查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityVoucherpackageApi;

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

    AlipayMarketingActivityVoucherpackageApi apiInstance = new AlipayMarketingActivityVoucherpackageApi(defaultClient);
    AlipayMarketingActivityVoucherpackageBatchqueryModel alipayMarketingActivityVoucherpackageBatchqueryModel = new AlipayMarketingActivityVoucherpackageBatchqueryModel(); // AlipayMarketingActivityVoucherpackageBatchqueryModel | 
    try {
      AlipayMarketingActivityVoucherpackageBatchqueryResponseModel result = apiInstance.batchquery(alipayMarketingActivityVoucherpackageBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityVoucherpackageApi#batchquery");
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
| **alipayMarketingActivityVoucherpackageBatchqueryModel** | **AlipayMarketingActivityVoucherpackageBatchqueryModel**|  | [optional] |

### Return type

**AlipayMarketingActivityVoucherpackageBatchqueryResponseModel**

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
> AlipayMarketingActivityVoucherpackageConsultResponseModel consult(authToken, alipayMarketingActivityVoucherpackageConsultModel)

券包购买咨询

券包购买咨询，咨询当前用户是否可以购买指定的券包

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityVoucherpackageApi;

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

    AlipayMarketingActivityVoucherpackageApi apiInstance = new AlipayMarketingActivityVoucherpackageApi(defaultClient);
    String authToken = "authToken_example"; // String | 用户授权令牌
    AlipayMarketingActivityVoucherpackageConsultModel alipayMarketingActivityVoucherpackageConsultModel = new AlipayMarketingActivityVoucherpackageConsultModel(); // AlipayMarketingActivityVoucherpackageConsultModel | 
    try {
      AlipayMarketingActivityVoucherpackageConsultResponseModel result = apiInstance.consult(authToken, alipayMarketingActivityVoucherpackageConsultModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityVoucherpackageApi#consult");
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
| **authToken** | **String**| 用户授权令牌 | [optional] |
| **alipayMarketingActivityVoucherpackageConsultModel** | **AlipayMarketingActivityVoucherpackageConsultModel**|  | [optional] |

### Return type

**AlipayMarketingActivityVoucherpackageConsultResponseModel**

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
> AlipayMarketingActivityVoucherpackageQueryResponseModel query(alipayMarketingActivityVoucherpackageQueryModel)

券包详情查询

查询券包详情，包括券包信息和券包下面券信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityVoucherpackageApi;

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

    AlipayMarketingActivityVoucherpackageApi apiInstance = new AlipayMarketingActivityVoucherpackageApi(defaultClient);
    AlipayMarketingActivityVoucherpackageQueryModel alipayMarketingActivityVoucherpackageQueryModel = new AlipayMarketingActivityVoucherpackageQueryModel(); // AlipayMarketingActivityVoucherpackageQueryModel | 
    try {
      AlipayMarketingActivityVoucherpackageQueryResponseModel result = apiInstance.query(alipayMarketingActivityVoucherpackageQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityVoucherpackageApi#query");
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
| **alipayMarketingActivityVoucherpackageQueryModel** | **AlipayMarketingActivityVoucherpackageQueryModel**|  | [optional] |

### Return type

**AlipayMarketingActivityVoucherpackageQueryResponseModel**

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

