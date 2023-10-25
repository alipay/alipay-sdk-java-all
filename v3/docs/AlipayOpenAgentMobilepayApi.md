# AlipayOpenAgentMobilepayApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sign**](AlipayOpenAgentMobilepayApi.md#sign) | **POST** /v3/alipay/open/agent/mobilepay/sign | 代签约APP支付产品 |


<a name="sign"></a>
# **sign**
> Object sign(appAuthPic, appDemo, appHomeScreenshot, appItemScreenshot, appPayScreenshot, businessLicenseAuthPic, businessLicensePic, data, homeScreenshot, inAppScreenshot, payScreenshot, specialLicensePic)

代签约APP支付产品

三方应用代理签约APP支付产品，需要配合开启事务接口使用

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenAgentMobilepayApi;

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

    AlipayOpenAgentMobilepayApi apiInstance = new AlipayOpenAgentMobilepayApi(defaultClient);
    File appAuthPic = new File("/path/to/file"); // File | 
    File appDemo = new File("/path/to/file"); // File | 
    File appHomeScreenshot = new File("/path/to/file"); // File | 
    File appItemScreenshot = new File("/path/to/file"); // File | 
    File appPayScreenshot = new File("/path/to/file"); // File | 
    File businessLicenseAuthPic = new File("/path/to/file"); // File | 
    File businessLicensePic = new File("/path/to/file"); // File | 
    AlipayOpenAgentMobilepaySignModel data = new AlipayOpenAgentMobilepaySignModel(); // AlipayOpenAgentMobilepaySignModel | 
    File homeScreenshot = new File("/path/to/file"); // File | 
    File inAppScreenshot = new File("/path/to/file"); // File | 
    File payScreenshot = new File("/path/to/file"); // File | 
    File specialLicensePic = new File("/path/to/file"); // File | 
    try {
      Object result = apiInstance.sign(appAuthPic, appDemo, appHomeScreenshot, appItemScreenshot, appPayScreenshot, businessLicenseAuthPic, businessLicensePic, data, homeScreenshot, inAppScreenshot, payScreenshot, specialLicensePic);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenAgentMobilepayApi#sign");
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
| **appAuthPic** | **File**|  | [optional] |
| **appDemo** | **File**|  | [optional] |
| **appHomeScreenshot** | **File**|  | [optional] |
| **appItemScreenshot** | **File**|  | [optional] |
| **appPayScreenshot** | **File**|  | [optional] |
| **businessLicenseAuthPic** | **File**|  | [optional] |
| **businessLicensePic** | **File**|  | [optional] |
| **data** | **AlipayOpenAgentMobilepaySignModel**|  | [optional] |
| **homeScreenshot** | **File**|  | [optional] |
| **inAppScreenshot** | **File**|  | [optional] |
| **payScreenshot** | **File**|  | [optional] |
| **specialLicensePic** | **File**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

