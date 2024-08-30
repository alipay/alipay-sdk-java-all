# AlipayCommerceEcEmployeeInviteApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayCommerceEcEmployeeInviteApi.md#query) | **GET** /v3/alipay/commerce/ec/employee/invite | 获取员工签约激活链接 |


<a name="query"></a>
# **query**
> AlipayCommerceEcEmployeeInviteQueryResponseModel query(enterpriseId, employeeId, pageContentCode, withholdingSignStr, createShareCode)

获取员工签约激活链接

获取员工签约激活链接

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
    String employeeId = "2288099887700000"; // String | 企业码员工ID，签约适用对象为指定员工时填写
    String pageContentCode = "PCC_STANDARD"; // String | 用于展示不同的页面文案，使用标准页面文案是无需传值
    String withholdingSignStr = "biz_content=%7B%22access_params%22%3A%7B%22personal_product_code%22%3A%22GENERAL_WITHHOLDING_P%22%2C%22sign_scene%22%3A%22INDUSTRY%7CMULTI_MEDIA%22%7D&sign=111&app_id=2017090501336035&method=alipay.user.agreement.page.sign&version=1.0"; // String | 代扣签约串。需要签约代扣协议时，必传，返回的签约链接会拼接上代扣签约串。
    String createShareCode = "Y"; // String | 是否生成签约吱口令，不传默认为N
    try {
      AlipayCommerceEcEmployeeInviteQueryResponseModel result = apiInstance.query(enterpriseId, employeeId, pageContentCode, withholdingSignStr, createShareCode);
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
| **employeeId** | **String**| 企业码员工ID，签约适用对象为指定员工时填写 | [optional] |
| **pageContentCode** | **String**| 用于展示不同的页面文案，使用标准页面文案是无需传值 | [optional] |
| **withholdingSignStr** | **String**| 代扣签约串。需要签约代扣协议时，必传，返回的签约链接会拼接上代扣签约串。 | [optional] |
| **createShareCode** | **String**| 是否生成签约吱口令，不传默认为N | [optional] |

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

