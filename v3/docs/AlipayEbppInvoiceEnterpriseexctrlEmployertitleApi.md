# AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi.md#batchquery) | **POST** /v3/alipay/ebpp/invoice/enterpriseexctrl/employertitle/batchquery | 企业抬头：分页查询企业抬头信息 |
| [**create**](AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi.md#create) | **POST** /v3/alipay/ebpp/invoice/enterpriseexctrl/employertitle/create | 企业抬头：新增企业抬头 |
| [**modify**](AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi.md#modify) | **PUT** /v3/alipay/ebpp/invoice/enterpriseexctrl/employertitle | 企业抬头：修改企业抬头 |
| [**query**](AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi.md#query) | **GET** /v3/alipay/ebpp/invoice/enterpriseexctrl/employertitle/query | 企业抬头：查询企业抬头 |


<a name="batchquery"></a>
# **batchquery**
> AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryResponseModel batchquery(alipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel)

企业抬头：分页查询企业抬头信息

分页查询企业抬头列表

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi;

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

    AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi apiInstance = new AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi(defaultClient);
    AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel alipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel = new AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel(); // AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel | 
    try {
      AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryResponseModel result = apiInstance.batchquery(alipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi#batchquery");
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
| **alipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel** | **AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryResponseModel**

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

<a name="create"></a>
# **create**
> AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateResponseModel create(alipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel)

企业抬头：新增企业抬头

新增一条企业开票抬头

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi;

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

    AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi apiInstance = new AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi(defaultClient);
    AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel alipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel = new AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel(); // AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel | 
    try {
      AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateResponseModel result = apiInstance.create(alipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi#create");
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
| **alipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel** | **AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateResponseModel**

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
> AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyResponseModel modify(alipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel)

企业抬头：修改企业抬头

修改企业开票抬头

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi;

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

    AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi apiInstance = new AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi(defaultClient);
    AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel alipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel = new AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel(); // AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel | 
    try {
      AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyResponseModel result = apiInstance.modify(alipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi#modify");
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
| **alipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel** | **AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyResponseModel**

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
> AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel query(accountId, enterpriseId, agreementNo, titleId, taxRegisterNo)

企业抬头：查询企业抬头

根据抬头ID查询企业抬头详情

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi;

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

    AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi apiInstance = new AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi(defaultClient);
    String accountId = "2088000194958956"; // String | 企业共同账户id
    String enterpriseId = "2088123412341234"; // String | 企业id
    String agreementNo = "20215425001181407500"; // String | 授权签约协议号
    String titleId = "2022110200152710030000000003"; // String | 抬头ID
    String taxRegisterNo = "9133*********5852F"; // String | 税号
    try {
      AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel result = apiInstance.query(accountId, enterpriseId, agreementNo, titleId, taxRegisterNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceEnterpriseexctrlEmployertitleApi#query");
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
| **accountId** | **String**| 企业共同账户id | [optional] |
| **enterpriseId** | **String**| 企业id | [optional] |
| **agreementNo** | **String**| 授权签约协议号 | [optional] |
| **titleId** | **String**| 抬头ID | [optional] |
| **taxRegisterNo** | **String**| 税号 | [optional] |

### Return type

**AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponseModel**

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

