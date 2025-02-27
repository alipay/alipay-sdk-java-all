# AlipayEbppInvoiceExpenserulesSceneruleApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayEbppInvoiceExpenserulesSceneruleApi.md#create) | **POST** /v3/alipay/ebpp/invoice/expenserules/scenerule/create | 创建费控规则 |
| [**modify**](AlipayEbppInvoiceExpenserulesSceneruleApi.md#modify) | **POST** /v3/alipay/ebpp/invoice/expenserules/scenerule/modify | 修改费控规则 |
| [**query**](AlipayEbppInvoiceExpenserulesSceneruleApi.md#query) | **POST** /v3/alipay/ebpp/invoice/expenserules/scenerule/query | 查询费控规则信息 |


<a name="create"></a>
# **create**
> AlipayEbppInvoiceExpenserulesSceneruleCreateResponseModel create(alipayEbppInvoiceExpenserulesSceneruleCreateModel)

创建费控规则

创建费控规则，例如：创建一条有效期为2021-08-01 00:00:00到2031-08-01 00:00:00的福利餐费控规则，限制对应员工的单日消费金额不超过100元；

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceExpenserulesSceneruleApi;

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

    AlipayEbppInvoiceExpenserulesSceneruleApi apiInstance = new AlipayEbppInvoiceExpenserulesSceneruleApi(defaultClient);
    AlipayEbppInvoiceExpenserulesSceneruleCreateModel alipayEbppInvoiceExpenserulesSceneruleCreateModel = new AlipayEbppInvoiceExpenserulesSceneruleCreateModel(); // AlipayEbppInvoiceExpenserulesSceneruleCreateModel | 
    try {
      AlipayEbppInvoiceExpenserulesSceneruleCreateResponseModel result = apiInstance.create(alipayEbppInvoiceExpenserulesSceneruleCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceExpenserulesSceneruleApi#create");
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
| **alipayEbppInvoiceExpenserulesSceneruleCreateModel** | **AlipayEbppInvoiceExpenserulesSceneruleCreateModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceExpenserulesSceneruleCreateResponseModel**

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
> AlipayEbppInvoiceExpenserulesSceneruleModifyResponseModel modify(alipayEbppInvoiceExpenserulesSceneruleModifyModel)

修改费控规则

修改费控规则

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceExpenserulesSceneruleApi;

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

    AlipayEbppInvoiceExpenserulesSceneruleApi apiInstance = new AlipayEbppInvoiceExpenserulesSceneruleApi(defaultClient);
    AlipayEbppInvoiceExpenserulesSceneruleModifyModel alipayEbppInvoiceExpenserulesSceneruleModifyModel = new AlipayEbppInvoiceExpenserulesSceneruleModifyModel(); // AlipayEbppInvoiceExpenserulesSceneruleModifyModel | 
    try {
      AlipayEbppInvoiceExpenserulesSceneruleModifyResponseModel result = apiInstance.modify(alipayEbppInvoiceExpenserulesSceneruleModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceExpenserulesSceneruleApi#modify");
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
| **alipayEbppInvoiceExpenserulesSceneruleModifyModel** | **AlipayEbppInvoiceExpenserulesSceneruleModifyModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceExpenserulesSceneruleModifyResponseModel**

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
> AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel query(alipayEbppInvoiceExpenserulesSceneruleQueryModel)

查询费控规则信息

查询费控规则信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceExpenserulesSceneruleApi;

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

    AlipayEbppInvoiceExpenserulesSceneruleApi apiInstance = new AlipayEbppInvoiceExpenserulesSceneruleApi(defaultClient);
    AlipayEbppInvoiceExpenserulesSceneruleQueryModel alipayEbppInvoiceExpenserulesSceneruleQueryModel = new AlipayEbppInvoiceExpenserulesSceneruleQueryModel(); // AlipayEbppInvoiceExpenserulesSceneruleQueryModel | 
    try {
      AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel result = apiInstance.query(alipayEbppInvoiceExpenserulesSceneruleQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceExpenserulesSceneruleApi#query");
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
| **alipayEbppInvoiceExpenserulesSceneruleQueryModel** | **AlipayEbppInvoiceExpenserulesSceneruleQueryModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel**

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

