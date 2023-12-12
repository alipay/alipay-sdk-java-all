# AlipayOpenMiniVersionAuditApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apply**](AlipayOpenMiniVersionAuditApi.md#apply) | **POST** /v3/alipay/open/mini/version/audit/apply | 小程序提交审核 |
| [**cancel**](AlipayOpenMiniVersionAuditApi.md#cancel) | **POST** /v3/alipay/open/mini/version/audit/cancel | 小程序撤销审核 |


<a name="apply"></a>
# **apply**
> AlipayOpenMiniVersionAuditApplyResponseModel apply(appLogo, data, fifthLicensePic, fifthScreenShot, firstLicensePic, firstScreenShot, firstSpecialLicensePic, fourthLicensePic, fourthScreenShot, outDoorPic, secondLicensePic, secondScreenShot, secondSpecialLicensePic, testFileName, thirdLicensePic, thirdScreenShot, thirdSpecialLicensePic)

小程序提交审核

小程序提交审核。 1、本接口中关于小程序基础信息的一些字段例如小程序名称、小程序logo、客服电话等，这些信息如果你前期已经设置过，平台将会在你本次调用接口的时候，将上一次设置的信息自动填入，所以允许你本次调用时不传入。如果你前期还未设置过这些信息，则本次调用是需要必传的。具体的字段要求详见每个字段的描述。你可以用alipay.open.mini.version.detail.query接口查询小程序信息之前是否已经设置。 2、小程序版本信息例如小程序版本号、小程序版本描述，这些信息是需要你每次调用接口必传的。 3、本接口涉及到“审核流程拆分”、“审核加急”、“自动上架”的功能，具体功能详见接口字段audit_rule、speed_up、auto_online描述。 4、普通模板构建的商家小程序限 5个小程序/模板/日，可以升级为标准版，标准版没有数量限制。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniVersionAuditApi;

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

    AlipayOpenMiniVersionAuditApi apiInstance = new AlipayOpenMiniVersionAuditApi(defaultClient);
    File appLogo = new File("/path/to/file"); // File | 
    AlipayOpenMiniVersionAuditApplyModel data = new AlipayOpenMiniVersionAuditApplyModel(); // AlipayOpenMiniVersionAuditApplyModel | 
    File fifthLicensePic = new File("/path/to/file"); // File | 
    File fifthScreenShot = new File("/path/to/file"); // File | 
    File firstLicensePic = new File("/path/to/file"); // File | 
    File firstScreenShot = new File("/path/to/file"); // File | 
    File firstSpecialLicensePic = new File("/path/to/file"); // File | 
    File fourthLicensePic = new File("/path/to/file"); // File | 
    File fourthScreenShot = new File("/path/to/file"); // File | 
    File outDoorPic = new File("/path/to/file"); // File | 
    File secondLicensePic = new File("/path/to/file"); // File | 
    File secondScreenShot = new File("/path/to/file"); // File | 
    File secondSpecialLicensePic = new File("/path/to/file"); // File | 
    File testFileName = new File("/path/to/file"); // File | 
    File thirdLicensePic = new File("/path/to/file"); // File | 
    File thirdScreenShot = new File("/path/to/file"); // File | 
    File thirdSpecialLicensePic = new File("/path/to/file"); // File | 
    try {
      AlipayOpenMiniVersionAuditApplyResponseModel result = apiInstance.apply(appLogo, data, fifthLicensePic, fifthScreenShot, firstLicensePic, firstScreenShot, firstSpecialLicensePic, fourthLicensePic, fourthScreenShot, outDoorPic, secondLicensePic, secondScreenShot, secondSpecialLicensePic, testFileName, thirdLicensePic, thirdScreenShot, thirdSpecialLicensePic);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniVersionAuditApi#apply");
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
| **appLogo** | **File**|  | [optional] |
| **data** | **AlipayOpenMiniVersionAuditApplyModel**|  | [optional] |
| **fifthLicensePic** | **File**|  | [optional] |
| **fifthScreenShot** | **File**|  | [optional] |
| **firstLicensePic** | **File**|  | [optional] |
| **firstScreenShot** | **File**|  | [optional] |
| **firstSpecialLicensePic** | **File**|  | [optional] |
| **fourthLicensePic** | **File**|  | [optional] |
| **fourthScreenShot** | **File**|  | [optional] |
| **outDoorPic** | **File**|  | [optional] |
| **secondLicensePic** | **File**|  | [optional] |
| **secondScreenShot** | **File**|  | [optional] |
| **secondSpecialLicensePic** | **File**|  | [optional] |
| **testFileName** | **File**|  | [optional] |
| **thirdLicensePic** | **File**|  | [optional] |
| **thirdScreenShot** | **File**|  | [optional] |
| **thirdSpecialLicensePic** | **File**|  | [optional] |

### Return type

**AlipayOpenMiniVersionAuditApplyResponseModel**

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

<a name="cancel"></a>
# **cancel**
> Object cancel(alipayOpenMiniVersionAuditCancelModel)

小程序撤销审核

三方实例化小程序撤销审核

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniVersionAuditApi;

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

    AlipayOpenMiniVersionAuditApi apiInstance = new AlipayOpenMiniVersionAuditApi(defaultClient);
    AlipayOpenMiniVersionAuditCancelModel alipayOpenMiniVersionAuditCancelModel = new AlipayOpenMiniVersionAuditCancelModel(); // AlipayOpenMiniVersionAuditCancelModel | 
    try {
      Object result = apiInstance.cancel(alipayOpenMiniVersionAuditCancelModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniVersionAuditApi#cancel");
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
| **alipayOpenMiniVersionAuditCancelModel** | **AlipayOpenMiniVersionAuditCancelModel**|  | [optional] |

### Return type

**Object**

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

