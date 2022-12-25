# AlipayOpenMiniTemplatemsgMaketingApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayOpenMiniTemplatemsgMaketingApi.md#batchquery) | **POST** /v3/alipay/open/mini/templatemsg/maketing/batchquery | 小程序模板消息营销投放详情分页批量查询 |


<a name="batchquery"></a>
# **batchquery**
> AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel batchquery(alipayOpenMiniTemplatemsgMaketingBatchqueryModel)

小程序模板消息营销投放详情分页批量查询

小程序模板消息营销投放详情分页批量查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniTemplatemsgMaketingApi;

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

    AlipayOpenMiniTemplatemsgMaketingApi apiInstance = new AlipayOpenMiniTemplatemsgMaketingApi(defaultClient);
    AlipayOpenMiniTemplatemsgMaketingBatchqueryModel alipayOpenMiniTemplatemsgMaketingBatchqueryModel = new AlipayOpenMiniTemplatemsgMaketingBatchqueryModel(); // AlipayOpenMiniTemplatemsgMaketingBatchqueryModel | 
    try {
      AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel result = apiInstance.batchquery(alipayOpenMiniTemplatemsgMaketingBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniTemplatemsgMaketingApi#batchquery");
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
| **alipayOpenMiniTemplatemsgMaketingBatchqueryModel** | **AlipayOpenMiniTemplatemsgMaketingBatchqueryModel**|  | [optional] |

### Return type

**AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel**

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

