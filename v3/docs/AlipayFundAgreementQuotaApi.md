# AlipayFundAgreementQuotaApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modify**](AlipayFundAgreementQuotaApi.md#modify) | **POST** /v3/alipay/fund/agreement/quota/modify | 额度设置接口 |
| [**query**](AlipayFundAgreementQuotaApi.md#query) | **POST** /v3/alipay/fund/agreement/quota/query | 额度查询接口 |


<a name="modify"></a>
# **modify**
> AlipayFundAgreementQuotaModifyResponseModel modify(alipayFundAgreementQuotaModifyModel)

额度设置接口

基于扣款合约设置付款方额度

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundAgreementQuotaApi;

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

    AlipayFundAgreementQuotaApi apiInstance = new AlipayFundAgreementQuotaApi(defaultClient);
    AlipayFundAgreementQuotaModifyModel alipayFundAgreementQuotaModifyModel = new AlipayFundAgreementQuotaModifyModel(); // AlipayFundAgreementQuotaModifyModel | 
    try {
      AlipayFundAgreementQuotaModifyResponseModel result = apiInstance.modify(alipayFundAgreementQuotaModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundAgreementQuotaApi#modify");
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
| **alipayFundAgreementQuotaModifyModel** | **AlipayFundAgreementQuotaModifyModel**|  | [optional] |

### Return type

**AlipayFundAgreementQuotaModifyResponseModel**

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
> AlipayFundAgreementQuotaQueryResponseModel query(alipayFundAgreementQuotaQueryModel)

额度查询接口

查询基于扣款协议的额度配置查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundAgreementQuotaApi;

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

    AlipayFundAgreementQuotaApi apiInstance = new AlipayFundAgreementQuotaApi(defaultClient);
    AlipayFundAgreementQuotaQueryModel alipayFundAgreementQuotaQueryModel = new AlipayFundAgreementQuotaQueryModel(); // AlipayFundAgreementQuotaQueryModel | 
    try {
      AlipayFundAgreementQuotaQueryResponseModel result = apiInstance.query(alipayFundAgreementQuotaQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundAgreementQuotaApi#query");
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
| **alipayFundAgreementQuotaQueryModel** | **AlipayFundAgreementQuotaQueryModel**|  | [optional] |

### Return type

**AlipayFundAgreementQuotaQueryResponseModel**

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

