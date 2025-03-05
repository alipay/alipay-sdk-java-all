# AlipayFundAccountbookNotifyApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayFundAccountbookNotifyApi.md#query) | **GET** /v3/alipay/fund/accountbook/notify/query | 记账本通知订阅关系查询接口 |
| [**subscribe**](AlipayFundAccountbookNotifyApi.md#subscribe) | **POST** /v3/alipay/fund/accountbook/notify/subscribe | 记账本通知订阅接口 |
| [**unsubscribe**](AlipayFundAccountbookNotifyApi.md#unsubscribe) | **POST** /v3/alipay/fund/accountbook/notify/unsubscribe | 记账本通知取消订阅接口 |


<a name="query"></a>
# **query**
> AlipayFundAccountbookNotifyQueryResponseModel query(productCode, bizScene, accountBookId, agreementNo)

记账本通知订阅关系查询接口

ISV通过此接口查询指定记账本的入金和出金通知的订阅关系

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundAccountbookNotifyApi;

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

    AlipayFundAccountbookNotifyApi apiInstance = new AlipayFundAccountbookNotifyApi(defaultClient);
    String productCode = "SATF_FUND_BOOK"; // String | 产品码。固定为SATF_FUND_BOOK
    String bizScene = "DEFAULT"; // String | 场景码。固定为DEFAULT
    String accountBookId = "2088000147677710"; // String | 记账本ID
    String agreementNo = "20205724001102186227"; // String | 协议号。 若是基于协议的记账本，则agreement_no必传； 若是自创建的记账本，则agreement_no不传；
    try {
      AlipayFundAccountbookNotifyQueryResponseModel result = apiInstance.query(productCode, bizScene, accountBookId, agreementNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundAccountbookNotifyApi#query");
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
| **productCode** | **String**| 产品码。固定为SATF_FUND_BOOK | [optional] |
| **bizScene** | **String**| 场景码。固定为DEFAULT | [optional] |
| **accountBookId** | **String**| 记账本ID | [optional] |
| **agreementNo** | **String**| 协议号。 若是基于协议的记账本，则agreement_no必传； 若是自创建的记账本，则agreement_no不传； | [optional] |

### Return type

**AlipayFundAccountbookNotifyQueryResponseModel**

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

<a name="subscribe"></a>
# **subscribe**
> AlipayFundAccountbookNotifySubscribeResponseModel subscribe(alipayFundAccountbookNotifySubscribeModel)

记账本通知订阅接口

ISV通过此接口订阅指定记账本的入金和出金通知。目前只有非OpenAPI方式的充值通知（比如大额来账、贷款入金）

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundAccountbookNotifyApi;

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

    AlipayFundAccountbookNotifyApi apiInstance = new AlipayFundAccountbookNotifyApi(defaultClient);
    AlipayFundAccountbookNotifySubscribeModel alipayFundAccountbookNotifySubscribeModel = new AlipayFundAccountbookNotifySubscribeModel(); // AlipayFundAccountbookNotifySubscribeModel | 
    try {
      AlipayFundAccountbookNotifySubscribeResponseModel result = apiInstance.subscribe(alipayFundAccountbookNotifySubscribeModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundAccountbookNotifyApi#subscribe");
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
| **alipayFundAccountbookNotifySubscribeModel** | **AlipayFundAccountbookNotifySubscribeModel**|  | [optional] |

### Return type

**AlipayFundAccountbookNotifySubscribeResponseModel**

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

<a name="unsubscribe"></a>
# **unsubscribe**
> AlipayFundAccountbookNotifyUnsubscribeResponseModel unsubscribe(alipayFundAccountbookNotifyUnsubscribeModel)

记账本通知取消订阅接口

ISV通过此接口取消订阅指定记账本的入金和出金通知

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundAccountbookNotifyApi;

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

    AlipayFundAccountbookNotifyApi apiInstance = new AlipayFundAccountbookNotifyApi(defaultClient);
    AlipayFundAccountbookNotifyUnsubscribeModel alipayFundAccountbookNotifyUnsubscribeModel = new AlipayFundAccountbookNotifyUnsubscribeModel(); // AlipayFundAccountbookNotifyUnsubscribeModel | 
    try {
      AlipayFundAccountbookNotifyUnsubscribeResponseModel result = apiInstance.unsubscribe(alipayFundAccountbookNotifyUnsubscribeModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundAccountbookNotifyApi#unsubscribe");
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
| **alipayFundAccountbookNotifyUnsubscribeModel** | **AlipayFundAccountbookNotifyUnsubscribeModel**|  | [optional] |

### Return type

**AlipayFundAccountbookNotifyUnsubscribeResponseModel**

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

