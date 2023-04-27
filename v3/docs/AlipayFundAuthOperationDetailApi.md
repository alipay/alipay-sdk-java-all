# AlipayFundAuthOperationDetailApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayFundAuthOperationDetailApi.md#query) | **POST** /v3/alipay/fund/auth/operation/detail/query | 资金授权操作查询接口 |


<a name="query"></a>
# **query**
> AlipayFundAuthOperationDetailQueryResponseModel query(alipayFundAuthOperationDetailQueryModel)

资金授权操作查询接口

通过该接口可以查询单笔明细的详细信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundAuthOperationDetailApi;

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

    AlipayFundAuthOperationDetailApi apiInstance = new AlipayFundAuthOperationDetailApi(defaultClient);
    AlipayFundAuthOperationDetailQueryModel alipayFundAuthOperationDetailQueryModel = new AlipayFundAuthOperationDetailQueryModel(); // AlipayFundAuthOperationDetailQueryModel | 
    try {
      AlipayFundAuthOperationDetailQueryResponseModel result = apiInstance.query(alipayFundAuthOperationDetailQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundAuthOperationDetailApi#query");
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
| **alipayFundAuthOperationDetailQueryModel** | **AlipayFundAuthOperationDetailQueryModel**|  | [optional] |

### Return type

**AlipayFundAuthOperationDetailQueryResponseModel**

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

