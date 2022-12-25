# AnttechOceanbaseTestplatformTaskApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AnttechOceanbaseTestplatformTaskApi.md#query) | **POST** /v3/anttech/oceanbase/testplatform/task/query | 获取ob开源官网提测平台待执行任务接口 |


<a name="query"></a>
# **query**
> AnttechOceanbaseTestplatformTaskQueryResponseModel query(anttechOceanbaseTestplatformTaskQueryModel)

获取ob开源官网提测平台待执行任务接口

获取ob开源官网提测平台待执行任务接口，用于测试任务

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AnttechOceanbaseTestplatformTaskApi;

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

    AnttechOceanbaseTestplatformTaskApi apiInstance = new AnttechOceanbaseTestplatformTaskApi(defaultClient);
    AnttechOceanbaseTestplatformTaskQueryModel anttechOceanbaseTestplatformTaskQueryModel = new AnttechOceanbaseTestplatformTaskQueryModel(); // AnttechOceanbaseTestplatformTaskQueryModel | 
    try {
      AnttechOceanbaseTestplatformTaskQueryResponseModel result = apiInstance.query(anttechOceanbaseTestplatformTaskQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnttechOceanbaseTestplatformTaskApi#query");
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
| **anttechOceanbaseTestplatformTaskQueryModel** | **AnttechOceanbaseTestplatformTaskQueryModel**|  | [optional] |

### Return type

**AnttechOceanbaseTestplatformTaskQueryResponseModel**

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

