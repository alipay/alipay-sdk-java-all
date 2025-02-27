# AlipayOpenSpIsvRelationApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenSpIsvRelationApi.md#query) | **POST** /v3/alipay/open/sp/isv/relation/query | spcenter服务商推广关系查询 |


<a name="query"></a>
# **query**
> AlipayOpenSpIsvRelationQueryResponseModel query(alipayOpenSpIsvRelationQueryModel)

spcenter服务商推广关系查询

用于开发服务商查询已与其达成推广关系的地推服务商信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSpIsvRelationApi;

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

    AlipayOpenSpIsvRelationApi apiInstance = new AlipayOpenSpIsvRelationApi(defaultClient);
    AlipayOpenSpIsvRelationQueryModel alipayOpenSpIsvRelationQueryModel = new AlipayOpenSpIsvRelationQueryModel(); // AlipayOpenSpIsvRelationQueryModel | 
    try {
      AlipayOpenSpIsvRelationQueryResponseModel result = apiInstance.query(alipayOpenSpIsvRelationQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSpIsvRelationApi#query");
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
| **alipayOpenSpIsvRelationQueryModel** | **AlipayOpenSpIsvRelationQueryModel**|  | [optional] |

### Return type

**AlipayOpenSpIsvRelationQueryResponseModel**

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

