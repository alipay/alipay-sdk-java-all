# AlipayOpenAgentFacetofaceApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sign**](AlipayOpenAgentFacetofaceApi.md#sign) | **POST** /v3/alipay/open/agent/facetoface/sign | 代签约当面付产品 |


<a name="sign"></a>
# **sign**
> Object sign(businessLicenseAuthPic, businessLicensePic, data, shopScenePic, shopSignBoardPic, specialLicensePic)

代签约当面付产品

三方应用代理签约当面付产品，需要配合开启事务接口使用

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenAgentFacetofaceApi;

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

    AlipayOpenAgentFacetofaceApi apiInstance = new AlipayOpenAgentFacetofaceApi(defaultClient);
    File businessLicenseAuthPic = new File("/path/to/file"); // File | 
    File businessLicensePic = new File("/path/to/file"); // File | 
    AlipayOpenAgentFacetofaceSignModel data = new AlipayOpenAgentFacetofaceSignModel(); // AlipayOpenAgentFacetofaceSignModel | 
    File shopScenePic = new File("/path/to/file"); // File | 
    File shopSignBoardPic = new File("/path/to/file"); // File | 
    File specialLicensePic = new File("/path/to/file"); // File | 
    try {
      Object result = apiInstance.sign(businessLicenseAuthPic, businessLicensePic, data, shopScenePic, shopSignBoardPic, specialLicensePic);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenAgentFacetofaceApi#sign");
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
| **businessLicenseAuthPic** | **File**|  | [optional] |
| **businessLicensePic** | **File**|  | [optional] |
| **data** | **AlipayOpenAgentFacetofaceSignModel**|  | [optional] |
| **shopScenePic** | **File**|  | [optional] |
| **shopSignBoardPic** | **File**|  | [optional] |
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

