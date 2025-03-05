# AlipayOpenPublicGroupCrowdApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenPublicGroupCrowdApi.md#query) | **POST** /v3/alipay/open/public/group/crowd/query | 人群数量查询 |


<a name="query"></a>
# **query**
> AlipayOpenPublicGroupCrowdQueryResponseModel query(alipayOpenPublicGroupCrowdQueryModel)

人群数量查询

用户可以指定自己创建的分组，调用接口查询对应的人群数量，人群必须大于50人才能正常返回，否则报错。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicGroupCrowdApi;

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

    AlipayOpenPublicGroupCrowdApi apiInstance = new AlipayOpenPublicGroupCrowdApi(defaultClient);
    AlipayOpenPublicGroupCrowdQueryModel alipayOpenPublicGroupCrowdQueryModel = new AlipayOpenPublicGroupCrowdQueryModel(); // AlipayOpenPublicGroupCrowdQueryModel | 
    try {
      AlipayOpenPublicGroupCrowdQueryResponseModel result = apiInstance.query(alipayOpenPublicGroupCrowdQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicGroupCrowdApi#query");
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
| **alipayOpenPublicGroupCrowdQueryModel** | **AlipayOpenPublicGroupCrowdQueryModel**|  | [optional] |

### Return type

**AlipayOpenPublicGroupCrowdQueryResponseModel**

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

