# AlipayMarketingActivityApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayMarketingActivityApi.md#batchquery) | **POST** /v3/alipay/marketing/activity/batchquery | 条件查询活动列表 |
| [**consult**](AlipayMarketingActivityApi.md#consult) | **POST** /v3/alipay/marketing/activity/consult | 活动领取咨询接口 |
| [**query**](AlipayMarketingActivityApi.md#query) | **GET** /v3/alipay/marketing/activity/{activity_id} | 查询活动详情 |


<a name="batchquery"></a>
# **batchquery**
> AlipayMarketingActivityBatchqueryResponseModel batchquery(alipayMarketingActivityBatchqueryModel)

条件查询活动列表

通过此接口可查询多个活动的摘要信息。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityApi;

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

    AlipayMarketingActivityApi apiInstance = new AlipayMarketingActivityApi(defaultClient);
    AlipayMarketingActivityBatchqueryModel alipayMarketingActivityBatchqueryModel = new AlipayMarketingActivityBatchqueryModel(); // AlipayMarketingActivityBatchqueryModel | 
    try {
      AlipayMarketingActivityBatchqueryResponseModel result = apiInstance.batchquery(alipayMarketingActivityBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityApi#batchquery");
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
| **alipayMarketingActivityBatchqueryModel** | **AlipayMarketingActivityBatchqueryModel**|  | [optional] |

### Return type

**AlipayMarketingActivityBatchqueryResponseModel**

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
> AlipayMarketingActivityConsultResponseModel consult(alipayMarketingActivityConsultModel)

活动领取咨询接口

通过此接口可以咨询用户是否可以领取该活动优惠券，决定是否对用户展示该活动信息。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityApi;

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

    AlipayMarketingActivityApi apiInstance = new AlipayMarketingActivityApi(defaultClient);
    AlipayMarketingActivityConsultModel alipayMarketingActivityConsultModel = new AlipayMarketingActivityConsultModel(); // AlipayMarketingActivityConsultModel | 
    try {
      AlipayMarketingActivityConsultResponseModel result = apiInstance.consult(alipayMarketingActivityConsultModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityApi#consult");
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
| **alipayMarketingActivityConsultModel** | **AlipayMarketingActivityConsultModel**|  | [optional] |

### Return type

**AlipayMarketingActivityConsultResponseModel**

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
> AlipayMarketingActivityQueryResponseModel query(activityId, merchantId, merchantAccessMode)

查询活动详情

通过此接口可以查询活动详情，包括支付券和商家券活动。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityApi;

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

    AlipayMarketingActivityApi apiInstance = new AlipayMarketingActivityApi(defaultClient);
    String activityId = "2016042700826004508401111111"; // String | 活动id
    String merchantId = "2088202967380463"; // String | 商户PID,默认为当前接口调用商户。
    String merchantAccessMode = "AGENCY_MODE"; // String | 商户接入模式。
    try {
      AlipayMarketingActivityQueryResponseModel result = apiInstance.query(activityId, merchantId, merchantAccessMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityApi#query");
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
| **activityId** | **String**| 活动id | |
| **merchantId** | **String**| 商户PID,默认为当前接口调用商户。 | [optional] |
| **merchantAccessMode** | **String**| 商户接入模式。 | [optional] |

### Return type

**AlipayMarketingActivityQueryResponseModel**

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

