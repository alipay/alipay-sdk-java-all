# AlipayOpenFeeAdjustApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apply**](AlipayOpenFeeAdjustApi.md#apply) | **POST** /v3/alipay/open/fee/adjust/apply | 特殊费率申请 |


<a name="apply"></a>
# **apply**
> Object apply(attachment, certPic, data, shopScenePic, shopSignPic)

特殊费率申请

服务商替代签约或交易传参的商户申请费率

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenFeeAdjustApi;

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

    AlipayOpenFeeAdjustApi apiInstance = new AlipayOpenFeeAdjustApi(defaultClient);
    File attachment = new File("/path/to/file"); // File | 
    File certPic = new File("/path/to/file"); // File | 
    AlipayOpenFeeAdjustApplyModel data = new AlipayOpenFeeAdjustApplyModel(); // AlipayOpenFeeAdjustApplyModel | 
    File shopScenePic = new File("/path/to/file"); // File | 
    File shopSignPic = new File("/path/to/file"); // File | 
    try {
      Object result = apiInstance.apply(attachment, certPic, data, shopScenePic, shopSignPic);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenFeeAdjustApi#apply");
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
| **attachment** | **File**|  | [optional] |
| **certPic** | **File**|  | [optional] |
| **data** | **AlipayOpenFeeAdjustApplyModel**|  | [optional] |
| **shopScenePic** | **File**|  | [optional] |
| **shopSignPic** | **File**|  | [optional] |

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

