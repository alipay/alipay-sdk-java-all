# AlipayOpenAgentCommonApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sign**](AlipayOpenAgentCommonApi.md#sign) | **POST** /v3/alipay/open/agent/common/sign | 代签约产品通用接口 |


<a name="sign"></a>
# **sign**
> Object sign(appAuthPic, appDemo, appHomeScreenshot, appItemScreenshot, appPayScreenshot, businessLicenseAuthPic, businessLicensePic, data, h5ExtraPic, h5HomeScreenshot, h5ItemScreenshot, h5PayScreenshot, h5SitesLoa, miniAppScreenshot, shopScenePic, shopSignBoardPic, specialLicensePic, webHomeScreenshot, webItemScreenshot, webPayScreenshot, webSitesLoa)

代签约产品通用接口

三方应用代理签约产品，需要配合开启事务接口使用

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenAgentCommonApi;

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

    AlipayOpenAgentCommonApi apiInstance = new AlipayOpenAgentCommonApi(defaultClient);
    File appAuthPic = new File("/path/to/file"); // File | 
    File appDemo = new File("/path/to/file"); // File | 
    File appHomeScreenshot = new File("/path/to/file"); // File | 
    File appItemScreenshot = new File("/path/to/file"); // File | 
    File appPayScreenshot = new File("/path/to/file"); // File | 
    File businessLicenseAuthPic = new File("/path/to/file"); // File | 
    File businessLicensePic = new File("/path/to/file"); // File | 
    AlipayOpenAgentCommonSignModel data = new AlipayOpenAgentCommonSignModel(); // AlipayOpenAgentCommonSignModel | 
    File h5ExtraPic = new File("/path/to/file"); // File | 
    File h5HomeScreenshot = new File("/path/to/file"); // File | 
    File h5ItemScreenshot = new File("/path/to/file"); // File | 
    File h5PayScreenshot = new File("/path/to/file"); // File | 
    File h5SitesLoa = new File("/path/to/file"); // File | 
    File miniAppScreenshot = new File("/path/to/file"); // File | 
    File shopScenePic = new File("/path/to/file"); // File | 
    File shopSignBoardPic = new File("/path/to/file"); // File | 
    File specialLicensePic = new File("/path/to/file"); // File | 
    File webHomeScreenshot = new File("/path/to/file"); // File | 
    File webItemScreenshot = new File("/path/to/file"); // File | 
    File webPayScreenshot = new File("/path/to/file"); // File | 
    File webSitesLoa = new File("/path/to/file"); // File | 
    try {
      Object result = apiInstance.sign(appAuthPic, appDemo, appHomeScreenshot, appItemScreenshot, appPayScreenshot, businessLicenseAuthPic, businessLicensePic, data, h5ExtraPic, h5HomeScreenshot, h5ItemScreenshot, h5PayScreenshot, h5SitesLoa, miniAppScreenshot, shopScenePic, shopSignBoardPic, specialLicensePic, webHomeScreenshot, webItemScreenshot, webPayScreenshot, webSitesLoa);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenAgentCommonApi#sign");
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
| **data** | **AlipayOpenAgentCommonSignModel**|  | [optional] |
| **h5ExtraPic** | **File**|  | [optional] |
| **h5HomeScreenshot** | **File**|  | [optional] |
| **h5ItemScreenshot** | **File**|  | [optional] |
| **h5PayScreenshot** | **File**|  | [optional] |
| **h5SitesLoa** | **File**|  | [optional] |
| **miniAppScreenshot** | **File**|  | [optional] |
| **shopScenePic** | **File**|  | [optional] |
| **shopSignBoardPic** | **File**|  | [optional] |
| **specialLicensePic** | **File**|  | [optional] |
| **webHomeScreenshot** | **File**|  | [optional] |
| **webItemScreenshot** | **File**|  | [optional] |
| **webPayScreenshot** | **File**|  | [optional] |
| **webSitesLoa** | **File**|  | [optional] |

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

