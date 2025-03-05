# ZolozAuthenticationCustomerFtokenApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](ZolozAuthenticationCustomerFtokenApi.md#query) | **POST** /v3/zoloz/authentication/customer/ftoken/query | 查询刷脸结果信息接口 |


<a name="query"></a>
# **query**
> ZolozAuthenticationCustomerFtokenQueryResponseModel query(zolozAuthenticationCustomerFtokenQueryModel)

查询刷脸结果信息接口

查询刷脸结果信息接口

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZolozAuthenticationCustomerFtokenApi;

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

    ZolozAuthenticationCustomerFtokenApi apiInstance = new ZolozAuthenticationCustomerFtokenApi(defaultClient);
    ZolozAuthenticationCustomerFtokenQueryModel zolozAuthenticationCustomerFtokenQueryModel = new ZolozAuthenticationCustomerFtokenQueryModel(); // ZolozAuthenticationCustomerFtokenQueryModel | 
    try {
      ZolozAuthenticationCustomerFtokenQueryResponseModel result = apiInstance.query(zolozAuthenticationCustomerFtokenQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZolozAuthenticationCustomerFtokenApi#query");
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
| **zolozAuthenticationCustomerFtokenQueryModel** | **ZolozAuthenticationCustomerFtokenQueryModel**|  | [optional] |

### Return type

**ZolozAuthenticationCustomerFtokenQueryResponseModel**

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

