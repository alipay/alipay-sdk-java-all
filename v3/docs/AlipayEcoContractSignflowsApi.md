# AlipayEcoContractSignflowsApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayEcoContractSignflowsApi.md#create) | **POST** /v3/alipay/eco/contract/signflows/create | 创建电子合同签署流程(E签宝) |


<a name="create"></a>
# **create**
> AlipayEcoContractSignflowsCreateResponseModel create(targetAppId, alipayEcoContractSignflowsCreateModel)

创建电子合同签署流程(E签宝)

根据配置好的合同模板，调用接口填充内容并指定签署人创建电子合同签署流程。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoContractSignflowsApi;

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

    AlipayEcoContractSignflowsApi apiInstance = new AlipayEcoContractSignflowsApi(defaultClient);
    String targetAppId = "targetAppId_example"; // String | 目标isv应用ID
    AlipayEcoContractSignflowsCreateModel alipayEcoContractSignflowsCreateModel = new AlipayEcoContractSignflowsCreateModel(); // AlipayEcoContractSignflowsCreateModel | 
    try {
      AlipayEcoContractSignflowsCreateResponseModel result = apiInstance.create(targetAppId, alipayEcoContractSignflowsCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoContractSignflowsApi#create");
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
| **targetAppId** | **String**| 目标isv应用ID | [optional] |
| **alipayEcoContractSignflowsCreateModel** | **AlipayEcoContractSignflowsCreateModel**|  | [optional] |

### Return type

**AlipayEcoContractSignflowsCreateResponseModel**

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

