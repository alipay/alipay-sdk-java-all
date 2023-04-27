# AlipayCommerceEcEmployeeInviteApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayCommerceEcEmployeeInviteApi.md#query) | **GET** /v3/alipay/commerce/ec/employee/invite | 获取员工邀请链接 |


<a name="query"></a>
# **query**
> AlipayCommerceEcEmployeeInviteQueryResponseModel query(enterpriseId, employeeId, pageContentCode)

获取员工邀请链接

获取员工邀请链接，若只传入企业ID企业则邀请链接对企业员工均有效，若传入了企业ID和员工ID则链接只对传入的员工ID有效

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcEmployeeInviteApi;

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

    AlipayCommerceEcEmployeeInviteApi apiInstance = new AlipayCommerceEcEmployeeInviteApi(defaultClient);
    String enterpriseId = "2088985758939"; // String | 企业id
    String employeeId = "2288099887700000"; // String | 企业码员工ID
    String pageContentCode = "PCC_STANDARD"; // String | 页面内容code
    try {
      AlipayCommerceEcEmployeeInviteQueryResponseModel result = apiInstance.query(enterpriseId, employeeId, pageContentCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcEmployeeInviteApi#query");
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
| **enterpriseId** | **String**| 企业id | [optional] |
| **employeeId** | **String**| 企业码员工ID | [optional] |
| **pageContentCode** | **String**| 页面内容code | [optional] |

### Return type

**AlipayCommerceEcEmployeeInviteQueryResponseModel**

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

