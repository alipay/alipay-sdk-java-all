# AlipayEbppInvoiceApplyInvApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**upload**](AlipayEbppInvoiceApplyInvApi.md#upload) | **PUT** /v3/alipay/ebpp/invoice/apply/inv/upload | 发票回传 |


<a name="upload"></a>
# **upload**
> AlipayEbppInvoiceApplyInvUploadResponseModel upload(alipayEbppInvoiceApplyInvUploadModel)

发票回传

发票回传接口适用于以下场景： 1、间联开票模式：阿里发票平台向ISV提交了原始发票申请，商户在ISV后台开具发票成功后，基于申请ID(apply_id)回传发票至阿里发票平台归集与交付。 2、直连开票模式：阿里发票平台请求ISV开票，ISV系统异步执行开票事务后，基于开票流水号(serial_no)回传开票结果至阿里发票平台归集与交付。 3、ISV直接回传发票给阿里发票平台，进行归集，并交付给业务前台和用户。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceApplyInvApi;

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

    AlipayEbppInvoiceApplyInvApi apiInstance = new AlipayEbppInvoiceApplyInvApi(defaultClient);
    AlipayEbppInvoiceApplyInvUploadModel alipayEbppInvoiceApplyInvUploadModel = new AlipayEbppInvoiceApplyInvUploadModel(); // AlipayEbppInvoiceApplyInvUploadModel | 
    try {
      AlipayEbppInvoiceApplyInvUploadResponseModel result = apiInstance.upload(alipayEbppInvoiceApplyInvUploadModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceApplyInvApi#upload");
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
| **alipayEbppInvoiceApplyInvUploadModel** | **AlipayEbppInvoiceApplyInvUploadModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceApplyInvUploadResponseModel**

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

