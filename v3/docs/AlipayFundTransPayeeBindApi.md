# AlipayFundTransPayeeBindApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayFundTransPayeeBindApi.md#query) | **GET** /v3/alipay/fund/trans/payee/bind/query | 资金收款账号绑定关系查询 |


<a name="query"></a>
# **query**
> AlipayFundTransPayeeBindQueryResponseModel query(identity, identityType)

资金收款账号绑定关系查询

资金收款账号绑定关系查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundTransPayeeBindApi;

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

    AlipayFundTransPayeeBindApi apiInstance = new AlipayFundTransPayeeBindApi(defaultClient);
    String identity = "230100199901010001"; // String | 证件号
    String identityType = "IDENTITY_CARD"; // String | 证件类型,暂仅支持 IDENTITY_CARD （身份证）
    try {
      AlipayFundTransPayeeBindQueryResponseModel result = apiInstance.query(identity, identityType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundTransPayeeBindApi#query");
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
| **identity** | **String**| 证件号 | [optional] |
| **identityType** | **String**| 证件类型,暂仅支持 IDENTITY_CARD （身份证） | [optional] |

### Return type

**AlipayFundTransPayeeBindQueryResponseModel**

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

