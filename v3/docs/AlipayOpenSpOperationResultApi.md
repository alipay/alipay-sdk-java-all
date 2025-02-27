# AlipayOpenSpOperationResultApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenSpOperationResultApi.md#query) | **POST** /v3/alipay/open/sp/operation/result/query | 查询服务商代运营操作结果 |


<a name="query"></a>
# **query**
> AlipayOpenSpOperationResultQueryResponseModel query(alipayOpenSpOperationResultQueryModel)

查询服务商代运营操作结果

查询服务商代运营操作（代运营授权或者账号绑定）结果。提供两种查询方式： 方式一：operate_type + batch_no，提供基于操作批次的精确查询，只查询本操作批次的代运营操作结果，不反映最终代运营操作结果。 方式一查询方式优先级更高。 方式二：operate_type + access_product_code + merchant_no + alipay_account 参数组合，可以查询代运营操作最终结果，任意一个操作批次成功都会体现在最终结果中。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSpOperationResultApi;

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

    AlipayOpenSpOperationResultApi apiInstance = new AlipayOpenSpOperationResultApi(defaultClient);
    AlipayOpenSpOperationResultQueryModel alipayOpenSpOperationResultQueryModel = new AlipayOpenSpOperationResultQueryModel(); // AlipayOpenSpOperationResultQueryModel | 
    try {
      AlipayOpenSpOperationResultQueryResponseModel result = apiInstance.query(alipayOpenSpOperationResultQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSpOperationResultApi#query");
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
| **alipayOpenSpOperationResultQueryModel** | **AlipayOpenSpOperationResultQueryModel**|  | [optional] |

### Return type

**AlipayOpenSpOperationResultQueryResponseModel**

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

