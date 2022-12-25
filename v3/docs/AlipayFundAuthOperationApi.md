# AlipayFundAuthOperationApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancel**](AlipayFundAuthOperationApi.md#cancel) | **POST** /v3/alipay/fund/auth/operation/cancel | 资金授权撤销接口 |


<a name="cancel"></a>
# **cancel**
> AlipayFundAuthOperationCancelResponseModel cancel(alipayFundAuthOperationCancelModel)

资金授权撤销接口

只有商户由于业务系统处理超时需要终止后续业务处理或者授权结果未知时可调用撤销，其他正常授权冻结的操作如需实现相同功能请调用资金授权解冻服务。提交资金授权后调用【资金授权操作查询】，没有明确的授权结果再调用【资金授权撤销】

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundAuthOperationApi;

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

    AlipayFundAuthOperationApi apiInstance = new AlipayFundAuthOperationApi(defaultClient);
    AlipayFundAuthOperationCancelModel alipayFundAuthOperationCancelModel = new AlipayFundAuthOperationCancelModel(); // AlipayFundAuthOperationCancelModel | 
    try {
      AlipayFundAuthOperationCancelResponseModel result = apiInstance.cancel(alipayFundAuthOperationCancelModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundAuthOperationApi#cancel");
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
| **alipayFundAuthOperationCancelModel** | **AlipayFundAuthOperationCancelModel**|  | [optional] |

### Return type

**AlipayFundAuthOperationCancelResponseModel**

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

