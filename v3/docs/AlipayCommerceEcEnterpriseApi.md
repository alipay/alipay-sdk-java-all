# AlipayCommerceEcEnterpriseApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayCommerceEcEnterpriseApi.md#create) | **POST** /v3/alipay/commerce/ec/enterprise/create | 企业入驻 |
| [**delete**](AlipayCommerceEcEnterpriseApi.md#delete) | **POST** /v3/alipay/commerce/ec/enterprise/delete | 企业注销 |
| [**unsign**](AlipayCommerceEcEnterpriseApi.md#unsign) | **GET** /v3/alipay/commerce/ec/enterprise/unsignurl | 企业解约 |


<a name="create"></a>
# **create**
> AlipayCommerceEcEnterpriseCreateResponseModel create(alipayCommerceEcEnterpriseCreateModel)

企业入驻

企业入驻，并返回签约链接

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcEnterpriseApi;

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

    AlipayCommerceEcEnterpriseApi apiInstance = new AlipayCommerceEcEnterpriseApi(defaultClient);
    AlipayCommerceEcEnterpriseCreateModel alipayCommerceEcEnterpriseCreateModel = new AlipayCommerceEcEnterpriseCreateModel(); // AlipayCommerceEcEnterpriseCreateModel | 
    try {
      AlipayCommerceEcEnterpriseCreateResponseModel result = apiInstance.create(alipayCommerceEcEnterpriseCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcEnterpriseApi#create");
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
| **alipayCommerceEcEnterpriseCreateModel** | **AlipayCommerceEcEnterpriseCreateModel**|  | [optional] |

### Return type

**AlipayCommerceEcEnterpriseCreateResponseModel**

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
> AlipayCommerceEcEnterpriseDeleteResponseModel delete(alipayCommerceEcEnterpriseDeleteModel)

企业注销

企业注销，清理企业数据

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcEnterpriseApi;

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

    AlipayCommerceEcEnterpriseApi apiInstance = new AlipayCommerceEcEnterpriseApi(defaultClient);
    AlipayCommerceEcEnterpriseDeleteModel alipayCommerceEcEnterpriseDeleteModel = new AlipayCommerceEcEnterpriseDeleteModel(); // AlipayCommerceEcEnterpriseDeleteModel | 
    try {
      AlipayCommerceEcEnterpriseDeleteResponseModel result = apiInstance.delete(alipayCommerceEcEnterpriseDeleteModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcEnterpriseApi#delete");
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
| **alipayCommerceEcEnterpriseDeleteModel** | **AlipayCommerceEcEnterpriseDeleteModel**|  | [optional] |

### Return type

**AlipayCommerceEcEnterpriseDeleteResponseModel**

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

<a name="unsign"></a>
# **unsign**
> AlipayCommerceEcEnterpriseUnsignResponseModel unsign(enterpriseId, accountId, agreementNo)

企业解约

企业解约，获取解约链接，点击链接跳转到解约页面，进行解约协议

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcEnterpriseApi;

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

    AlipayCommerceEcEnterpriseApi apiInstance = new AlipayCommerceEcEnterpriseApi(defaultClient);
    String enterpriseId = "208893900430"; // String | 通过企业码2.0签约接口签约，只填写企业id，无需填写共同账户id和授权签约协议号。
    String accountId = "208849300303"; // String | 通过企业码1.0接口签约的共同账户，和agreement_no搭配使用。
    String agreementNo = "29300309290200200"; // String | 可通过签约消息获取。配合共同账户id使用，当填写企业共同账户id时，此字段必填。
    try {
      AlipayCommerceEcEnterpriseUnsignResponseModel result = apiInstance.unsign(enterpriseId, accountId, agreementNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcEnterpriseApi#unsign");
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
| **enterpriseId** | **String**| 通过企业码2.0签约接口签约，只填写企业id，无需填写共同账户id和授权签约协议号。 | [optional] |
| **accountId** | **String**| 通过企业码1.0接口签约的共同账户，和agreement_no搭配使用。 | [optional] |
| **agreementNo** | **String**| 可通过签约消息获取。配合共同账户id使用，当填写企业共同账户id时，此字段必填。 | [optional] |

### Return type

**AlipayCommerceEcEnterpriseUnsignResponseModel**

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

