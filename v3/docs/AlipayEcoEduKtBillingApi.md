# AlipayEcoEduKtBillingApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modify**](AlipayEcoEduKtBillingApi.md#modify) | **POST** /v3/alipay/eco/edu/kt/billing/modify | 教育缴费账单状态同步接口 |
| [**query**](AlipayEcoEduKtBillingApi.md#query) | **POST** /v3/alipay/eco/edu/kt/billing/query | 缴费账单查询 |
| [**send**](AlipayEcoEduKtBillingApi.md#send) | **POST** /v3/alipay/eco/edu/kt/billing/send | 教育缴费账单发送接口 |


<a name="modify"></a>
# **modify**
> AlipayEcoEduKtBillingModifyResponseModel modify()

教育缴费账单状态同步接口

isv向支付宝－中小学－教育缴费发送教育缴费账单后，家长在支付宝－中小学－教育缴费中对账单完成支付操作且支付成功，ISV在自有系统内容对账，完成后通过此接口同步对账后的账单状态。状态分为：缴费成功、缴费失败。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoEduKtBillingApi;

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

    AlipayEcoEduKtBillingApi apiInstance = new AlipayEcoEduKtBillingApi(defaultClient);
    try {
      AlipayEcoEduKtBillingModifyResponseModel result = apiInstance.modify();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoEduKtBillingApi#modify");
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

**AlipayEcoEduKtBillingModifyResponseModel**

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
> AlipayEcoEduKtBillingQueryResponseModel query()

缴费账单查询

缴费账单查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoEduKtBillingApi;

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

    AlipayEcoEduKtBillingApi apiInstance = new AlipayEcoEduKtBillingApi(defaultClient);
    try {
      AlipayEcoEduKtBillingQueryResponseModel result = apiInstance.query();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoEduKtBillingApi#query");
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

**AlipayEcoEduKtBillingQueryResponseModel**

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

<a name="send"></a>
# **send**
> AlipayEcoEduKtBillingSendResponseModel send(alipayEcoEduKtBillingSendModel)

教育缴费账单发送接口

商家发送教育缴费账单给孩子，家长在支付宝可以查看自己绑定的孩子的缴费账单。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoEduKtBillingApi;

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

    AlipayEcoEduKtBillingApi apiInstance = new AlipayEcoEduKtBillingApi(defaultClient);
    AlipayEcoEduKtBillingSendModel alipayEcoEduKtBillingSendModel = new AlipayEcoEduKtBillingSendModel(); // AlipayEcoEduKtBillingSendModel | 
    try {
      AlipayEcoEduKtBillingSendResponseModel result = apiInstance.send(alipayEcoEduKtBillingSendModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoEduKtBillingApi#send");
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
| **alipayEcoEduKtBillingSendModel** | **AlipayEcoEduKtBillingSendModel**|  | [optional] |

### Return type

**AlipayEcoEduKtBillingSendResponseModel**

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

