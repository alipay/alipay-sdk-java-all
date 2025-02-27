# AlipayFundJointaccountQuotaApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayFundJointaccountQuotaApi.md#query) | **POST** /v3/alipay/fund/jointaccount/quota/query | 查询账户额度详情 |


<a name="query"></a>
# **query**
> AlipayFundJointaccountQuotaQueryResponseModel query(alipayFundJointaccountQuotaQueryModel)

查询账户额度详情

查询账户额度详情

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundJointaccountQuotaApi;

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

    AlipayFundJointaccountQuotaApi apiInstance = new AlipayFundJointaccountQuotaApi(defaultClient);
    AlipayFundJointaccountQuotaQueryModel alipayFundJointaccountQuotaQueryModel = new AlipayFundJointaccountQuotaQueryModel(); // AlipayFundJointaccountQuotaQueryModel | 
    try {
      AlipayFundJointaccountQuotaQueryResponseModel result = apiInstance.query(alipayFundJointaccountQuotaQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundJointaccountQuotaApi#query");
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
| **alipayFundJointaccountQuotaQueryModel** | **AlipayFundJointaccountQuotaQueryModel**|  | [optional] |

### Return type

**AlipayFundJointaccountQuotaQueryResponseModel**

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

