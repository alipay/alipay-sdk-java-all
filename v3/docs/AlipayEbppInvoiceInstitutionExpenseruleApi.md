# AlipayEbppInvoiceInstitutionExpenseruleApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayEbppInvoiceInstitutionExpenseruleApi.md#create) | **POST** /v3/alipay/ebpp/invoice/institution/expenserule/create | 创建费控使用规则 |
| [**delete**](AlipayEbppInvoiceInstitutionExpenseruleApi.md#delete) | **POST** /v3/alipay/ebpp/invoice/institution/expenserule/delete | 删除使用规则 |
| [**modify**](AlipayEbppInvoiceInstitutionExpenseruleApi.md#modify) | **POST** /v3/alipay/ebpp/invoice/institution/expenserule/modify | 编辑使用规则 |


<a name="create"></a>
# **create**
> AlipayEbppInvoiceInstitutionExpenseruleCreateResponseModel create(alipayEbppInvoiceInstitutionExpenseruleCreateModel)

创建费控使用规则

创建费控使用规则

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceInstitutionExpenseruleApi;

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

    AlipayEbppInvoiceInstitutionExpenseruleApi apiInstance = new AlipayEbppInvoiceInstitutionExpenseruleApi(defaultClient);
    AlipayEbppInvoiceInstitutionExpenseruleCreateModel alipayEbppInvoiceInstitutionExpenseruleCreateModel = new AlipayEbppInvoiceInstitutionExpenseruleCreateModel(); // AlipayEbppInvoiceInstitutionExpenseruleCreateModel | 
    try {
      AlipayEbppInvoiceInstitutionExpenseruleCreateResponseModel result = apiInstance.create(alipayEbppInvoiceInstitutionExpenseruleCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceInstitutionExpenseruleApi#create");
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
| **alipayEbppInvoiceInstitutionExpenseruleCreateModel** | **AlipayEbppInvoiceInstitutionExpenseruleCreateModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceInstitutionExpenseruleCreateResponseModel**

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
> AlipayEbppInvoiceInstitutionExpenseruleDeleteResponseModel delete(alipayEbppInvoiceInstitutionExpenseruleDeleteModel)

删除使用规则

删除制度下使用规则

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceInstitutionExpenseruleApi;

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

    AlipayEbppInvoiceInstitutionExpenseruleApi apiInstance = new AlipayEbppInvoiceInstitutionExpenseruleApi(defaultClient);
    AlipayEbppInvoiceInstitutionExpenseruleDeleteModel alipayEbppInvoiceInstitutionExpenseruleDeleteModel = new AlipayEbppInvoiceInstitutionExpenseruleDeleteModel(); // AlipayEbppInvoiceInstitutionExpenseruleDeleteModel | 
    try {
      AlipayEbppInvoiceInstitutionExpenseruleDeleteResponseModel result = apiInstance.delete(alipayEbppInvoiceInstitutionExpenseruleDeleteModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceInstitutionExpenseruleApi#delete");
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
| **alipayEbppInvoiceInstitutionExpenseruleDeleteModel** | **AlipayEbppInvoiceInstitutionExpenseruleDeleteModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceInstitutionExpenseruleDeleteResponseModel**

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
> AlipayEbppInvoiceInstitutionExpenseruleModifyResponseModel modify(alipayEbppInvoiceInstitutionExpenseruleModifyModel)

编辑使用规则

编辑制度下的使用规则

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceInstitutionExpenseruleApi;

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

    AlipayEbppInvoiceInstitutionExpenseruleApi apiInstance = new AlipayEbppInvoiceInstitutionExpenseruleApi(defaultClient);
    AlipayEbppInvoiceInstitutionExpenseruleModifyModel alipayEbppInvoiceInstitutionExpenseruleModifyModel = new AlipayEbppInvoiceInstitutionExpenseruleModifyModel(); // AlipayEbppInvoiceInstitutionExpenseruleModifyModel | 
    try {
      AlipayEbppInvoiceInstitutionExpenseruleModifyResponseModel result = apiInstance.modify(alipayEbppInvoiceInstitutionExpenseruleModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceInstitutionExpenseruleApi#modify");
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
| **alipayEbppInvoiceInstitutionExpenseruleModifyModel** | **AlipayEbppInvoiceInstitutionExpenseruleModifyModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceInstitutionExpenseruleModifyResponseModel**

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

