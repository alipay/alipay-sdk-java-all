# AlipayCommerceEducateCampusInstitutionsApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**add**](AlipayCommerceEducateCampusInstitutionsApi.md#add) | **POST** /v3/alipay/commerce/educate/campus/institutions/add | 入驻学校信息 |
| [**query**](AlipayCommerceEducateCampusInstitutionsApi.md#query) | **POST** /v3/alipay/commerce/educate/campus/institutions/query | 查询学校信息 |


<a name="add"></a>
# **add**
> AlipayCommerceEducateCampusInstitutionsAddResponseModel add(alipayCommerceEducateCampusInstitutionsAddModel)

入驻学校信息

学校信息入驻

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEducateCampusInstitutionsApi;

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

    AlipayCommerceEducateCampusInstitutionsApi apiInstance = new AlipayCommerceEducateCampusInstitutionsApi(defaultClient);
    AlipayCommerceEducateCampusInstitutionsAddModel alipayCommerceEducateCampusInstitutionsAddModel = new AlipayCommerceEducateCampusInstitutionsAddModel(); // AlipayCommerceEducateCampusInstitutionsAddModel | 
    try {
      AlipayCommerceEducateCampusInstitutionsAddResponseModel result = apiInstance.add(alipayCommerceEducateCampusInstitutionsAddModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEducateCampusInstitutionsApi#add");
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
| **alipayCommerceEducateCampusInstitutionsAddModel** | **AlipayCommerceEducateCampusInstitutionsAddModel**|  | [optional] |

### Return type

**AlipayCommerceEducateCampusInstitutionsAddResponseModel**

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
> AlipayCommerceEducateCampusInstitutionsQueryResponseModel query(alipayCommerceEducateCampusInstitutionsQueryModel)

查询学校信息

可以通过学校库产品查询支付宝系统中是否已存在对应的学校，避免重复入驻，以及通过该接口查询入驻的进度：入驻成功则会返回学校信息，失败则不会返回

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEducateCampusInstitutionsApi;

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

    AlipayCommerceEducateCampusInstitutionsApi apiInstance = new AlipayCommerceEducateCampusInstitutionsApi(defaultClient);
    AlipayCommerceEducateCampusInstitutionsQueryModel alipayCommerceEducateCampusInstitutionsQueryModel = new AlipayCommerceEducateCampusInstitutionsQueryModel(); // AlipayCommerceEducateCampusInstitutionsQueryModel | 
    try {
      AlipayCommerceEducateCampusInstitutionsQueryResponseModel result = apiInstance.query(alipayCommerceEducateCampusInstitutionsQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEducateCampusInstitutionsApi#query");
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
| **alipayCommerceEducateCampusInstitutionsQueryModel** | **AlipayCommerceEducateCampusInstitutionsQueryModel**|  | [optional] |

### Return type

**AlipayCommerceEducateCampusInstitutionsQueryResponseModel**

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

