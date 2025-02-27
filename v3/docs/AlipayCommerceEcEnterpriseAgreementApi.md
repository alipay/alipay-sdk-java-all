# AlipayCommerceEcEnterpriseAgreementApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayCommerceEcEnterpriseAgreementApi.md#query) | **GET** /v3/alipay/commerce/ec/enterprise/agreement | 查询企业签约企业码信息 |


<a name="query"></a>
# **query**
> AlipayCommerceEcEnterpriseAgreementQueryResponseModel query(enterpriseId, accountId)

查询企业签约企业码信息

查询企业签约企业码信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcEnterpriseAgreementApi;

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

    AlipayCommerceEcEnterpriseAgreementApi apiInstance = new AlipayCommerceEcEnterpriseAgreementApi(defaultClient);
    String enterpriseId = "2088441399627416"; // String | 企业id；enterprise_id与account_id至少传一个，如果都传了优先使用enterprise_id
    String accountId = "2088610274867962"; // String | 资金共同账号id；enterprise_id与account_id至少传一个，如果都传了优先使用enterprise_id
    try {
      AlipayCommerceEcEnterpriseAgreementQueryResponseModel result = apiInstance.query(enterpriseId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcEnterpriseAgreementApi#query");
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
| **enterpriseId** | **String**| 企业id；enterprise_id与account_id至少传一个，如果都传了优先使用enterprise_id | [optional] |
| **accountId** | **String**| 资金共同账号id；enterprise_id与account_id至少传一个，如果都传了优先使用enterprise_id | [optional] |

### Return type

**AlipayCommerceEcEnterpriseAgreementQueryResponseModel**

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

