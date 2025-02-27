# AlipayMerchantItemFileApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**upload**](AlipayMerchantItemFileApi.md#upload) | **POST** /v3/alipay/merchant/item/file/upload | 商品文件上传接口 |


<a name="upload"></a>
# **upload**
> AlipayMerchantItemFileUploadResponseModel upload()

商品文件上传接口

商户把商品对应的图片文件、普通文件信息上传到支付宝，后续通过该接口返回的素材ID来和支付宝交互

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMerchantItemFileApi;

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

    AlipayMerchantItemFileApi apiInstance = new AlipayMerchantItemFileApi(defaultClient);
    try {
      AlipayMerchantItemFileUploadResponseModel result = apiInstance.upload();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMerchantItemFileApi#upload");
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

**AlipayMerchantItemFileUploadResponseModel**

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

