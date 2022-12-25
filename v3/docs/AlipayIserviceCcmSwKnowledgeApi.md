# AlipayIserviceCcmSwKnowledgeApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modify**](AlipayIserviceCcmSwKnowledgeApi.md#modify) | **POST** /v3/alipay/iservice/ccm/sw/knowledge/modify | 知识库问答管理 |


<a name="modify"></a>
# **modify**
> AlipayIserviceCcmSwKnowledgeModifyResponseModel modify(alipayIserviceCcmSwKnowledgeModifyModel)

知识库问答管理

知识库问答管理

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayIserviceCcmSwKnowledgeApi;

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

    AlipayIserviceCcmSwKnowledgeApi apiInstance = new AlipayIserviceCcmSwKnowledgeApi(defaultClient);
    AlipayIserviceCcmSwKnowledgeModifyModel alipayIserviceCcmSwKnowledgeModifyModel = new AlipayIserviceCcmSwKnowledgeModifyModel(); // AlipayIserviceCcmSwKnowledgeModifyModel | 
    try {
      AlipayIserviceCcmSwKnowledgeModifyResponseModel result = apiInstance.modify(alipayIserviceCcmSwKnowledgeModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayIserviceCcmSwKnowledgeApi#modify");
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
| **alipayIserviceCcmSwKnowledgeModifyModel** | **AlipayIserviceCcmSwKnowledgeModifyModel**|  | [optional] |

### Return type

**AlipayIserviceCcmSwKnowledgeModifyResponseModel**

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

