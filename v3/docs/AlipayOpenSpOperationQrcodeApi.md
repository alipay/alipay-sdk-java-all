# AlipayOpenSpOperationQrcodeApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenSpOperationQrcodeApi.md#query) | **POST** /v3/alipay/open/sp/operation/qrcode/query | 查询代运营授权或者账号绑定二维码 |


<a name="query"></a>
# **query**
> AlipayOpenSpOperationQrcodeQueryResponseModel query(alipayOpenSpOperationQrcodeQueryModel)

查询代运营授权或者账号绑定二维码

面向服务商，查询发起代运营授权或者账号绑定的二维码。代间联商户代运营时，推荐使用接口同步返回的recommend_accounts字段中的账号扫码确认。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSpOperationQrcodeApi;

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

    AlipayOpenSpOperationQrcodeApi apiInstance = new AlipayOpenSpOperationQrcodeApi(defaultClient);
    AlipayOpenSpOperationQrcodeQueryModel alipayOpenSpOperationQrcodeQueryModel = new AlipayOpenSpOperationQrcodeQueryModel(); // AlipayOpenSpOperationQrcodeQueryModel | 
    try {
      AlipayOpenSpOperationQrcodeQueryResponseModel result = apiInstance.query(alipayOpenSpOperationQrcodeQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSpOperationQrcodeApi#query");
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
| **alipayOpenSpOperationQrcodeQueryModel** | **AlipayOpenSpOperationQrcodeQueryModel**|  | [optional] |

### Return type

**AlipayOpenSpOperationQrcodeQueryResponseModel**

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

