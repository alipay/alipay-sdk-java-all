# ZolozAuthenticationSmilepayApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**initialize**](ZolozAuthenticationSmilepayApi.md#initialize) | **POST** /v3/zoloz/authentication/smilepay/initialize | 刷脸支付初始化 |


<a name="initialize"></a>
# **initialize**
> ZolozAuthenticationSmilepayInitializeResponseModel initialize()

刷脸支付初始化

通过该接口获取刷脸支付服务的初始化信息，详细字段描述请参考产品说明文档

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZolozAuthenticationSmilepayApi;

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

    ZolozAuthenticationSmilepayApi apiInstance = new ZolozAuthenticationSmilepayApi(defaultClient);
    try {
      ZolozAuthenticationSmilepayInitializeResponseModel result = apiInstance.initialize();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZolozAuthenticationSmilepayApi#initialize");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ZolozAuthenticationSmilepayInitializeResponseModel**

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

