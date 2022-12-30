# AlipayEbppInvoiceIssueruleApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayEbppInvoiceIssueruleApi.md#create) | **POST** /v3/alipay/ebpp/invoice/issuerule/create | 新增发放规则 |
| [**delete**](AlipayEbppInvoiceIssueruleApi.md#delete) | **POST** /v3/alipay/ebpp/invoice/issuerule/delete | 删除发放规则 |
| [**modify**](AlipayEbppInvoiceIssueruleApi.md#modify) | **POST** /v3/alipay/ebpp/invoice/issuerule/modify | 编辑发放规则 |


<a name="create"></a>
# **create**
> AlipayEbppInvoiceIssueruleCreateResponseModel create(alipayEbppInvoiceIssueruleCreateModel)

新增发放规则

新增发放规则

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceIssueruleApi;

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

    AlipayEbppInvoiceIssueruleApi apiInstance = new AlipayEbppInvoiceIssueruleApi(defaultClient);
    AlipayEbppInvoiceIssueruleCreateModel alipayEbppInvoiceIssueruleCreateModel = new AlipayEbppInvoiceIssueruleCreateModel(); // AlipayEbppInvoiceIssueruleCreateModel | 
    try {
      AlipayEbppInvoiceIssueruleCreateResponseModel result = apiInstance.create(alipayEbppInvoiceIssueruleCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceIssueruleApi#create");
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
| **alipayEbppInvoiceIssueruleCreateModel** | **AlipayEbppInvoiceIssueruleCreateModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceIssueruleCreateResponseModel**

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
> AlipayEbppInvoiceIssueruleDeleteResponseModel delete(alipayEbppInvoiceIssueruleDeleteModel)

删除发放规则

删除发放规则

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceIssueruleApi;

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

    AlipayEbppInvoiceIssueruleApi apiInstance = new AlipayEbppInvoiceIssueruleApi(defaultClient);
    AlipayEbppInvoiceIssueruleDeleteModel alipayEbppInvoiceIssueruleDeleteModel = new AlipayEbppInvoiceIssueruleDeleteModel(); // AlipayEbppInvoiceIssueruleDeleteModel | 
    try {
      AlipayEbppInvoiceIssueruleDeleteResponseModel result = apiInstance.delete(alipayEbppInvoiceIssueruleDeleteModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceIssueruleApi#delete");
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
| **alipayEbppInvoiceIssueruleDeleteModel** | **AlipayEbppInvoiceIssueruleDeleteModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceIssueruleDeleteResponseModel**

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
> AlipayEbppInvoiceIssueruleModifyResponseModel modify(alipayEbppInvoiceIssueruleModifyModel)

编辑发放规则

编辑发放规则

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceIssueruleApi;

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

    AlipayEbppInvoiceIssueruleApi apiInstance = new AlipayEbppInvoiceIssueruleApi(defaultClient);
    AlipayEbppInvoiceIssueruleModifyModel alipayEbppInvoiceIssueruleModifyModel = new AlipayEbppInvoiceIssueruleModifyModel(); // AlipayEbppInvoiceIssueruleModifyModel | 
    try {
      AlipayEbppInvoiceIssueruleModifyResponseModel result = apiInstance.modify(alipayEbppInvoiceIssueruleModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceIssueruleApi#modify");
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
| **alipayEbppInvoiceIssueruleModifyModel** | **AlipayEbppInvoiceIssueruleModifyModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceIssueruleModifyResponseModel**

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

