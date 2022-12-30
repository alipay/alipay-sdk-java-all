# AlipayEbppInvoiceInstitutionApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayEbppInvoiceInstitutionApi.md#create) | **POST** /v3/alipay/ebpp/invoice/institution/create | 制度新增 |
| [**delete**](AlipayEbppInvoiceInstitutionApi.md#delete) | **DELETE** /v3/alipay/ebpp/invoice/institution/delete | 制度删除 |
| [**modify**](AlipayEbppInvoiceInstitutionApi.md#modify) | **POST** /v3/alipay/ebpp/invoice/institution/modify | 制度编辑 |


<a name="create"></a>
# **create**
> AlipayEbppInvoiceInstitutionCreateResponseModel create(alipayEbppInvoiceInstitutionCreateModel)

制度新增

制度新增

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceInstitutionApi;

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

    AlipayEbppInvoiceInstitutionApi apiInstance = new AlipayEbppInvoiceInstitutionApi(defaultClient);
    AlipayEbppInvoiceInstitutionCreateModel alipayEbppInvoiceInstitutionCreateModel = new AlipayEbppInvoiceInstitutionCreateModel(); // AlipayEbppInvoiceInstitutionCreateModel | 
    try {
      AlipayEbppInvoiceInstitutionCreateResponseModel result = apiInstance.create(alipayEbppInvoiceInstitutionCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceInstitutionApi#create");
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
| **alipayEbppInvoiceInstitutionCreateModel** | **AlipayEbppInvoiceInstitutionCreateModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceInstitutionCreateResponseModel**

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
> Object delete(accountId, agreementNo, enterpriseId, institutionId)

制度删除

制度删除

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceInstitutionApi;

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

    AlipayEbppInvoiceInstitutionApi apiInstance = new AlipayEbppInvoiceInstitutionApi(defaultClient);
    String accountId = "2088000194958956"; // String | 企业共同账户id（条件必填）
    String agreementNo = "1234"; // String | 授权签约协议号（条件必填）
    String enterpriseId = "2088123412341234"; // String | 企业id（条件必填）
    String institutionId = "2022031000152617000000000001"; // String | 制度id
    try {
      Object result = apiInstance.delete(accountId, agreementNo, enterpriseId, institutionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceInstitutionApi#delete");
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
| **accountId** | **String**| 企业共同账户id（条件必填） | [optional] |
| **agreementNo** | **String**| 授权签约协议号（条件必填） | [optional] |
| **enterpriseId** | **String**| 企业id（条件必填） | [optional] |
| **institutionId** | **String**| 制度id | [optional] |

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
> Object modify(alipayEbppInvoiceInstitutionModifyModel)

制度编辑

制度编辑

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceInstitutionApi;

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

    AlipayEbppInvoiceInstitutionApi apiInstance = new AlipayEbppInvoiceInstitutionApi(defaultClient);
    AlipayEbppInvoiceInstitutionModifyModel alipayEbppInvoiceInstitutionModifyModel = new AlipayEbppInvoiceInstitutionModifyModel(); // AlipayEbppInvoiceInstitutionModifyModel | 
    try {
      Object result = apiInstance.modify(alipayEbppInvoiceInstitutionModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceInstitutionApi#modify");
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
| **alipayEbppInvoiceInstitutionModifyModel** | **AlipayEbppInvoiceInstitutionModifyModel**|  | [optional] |

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

