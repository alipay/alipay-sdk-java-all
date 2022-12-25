# ZhimaCustomerJobworthJobdataApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**add**](ZhimaCustomerJobworthJobdataApi.md#add) | **POST** /v3/zhima/customer/jobworth/jobdata/add | 工作证职业数据回流接口 |


<a name="add"></a>
# **add**
> ZhimaCustomerJobworthJobdataAddResponseModel add(zhimaCustomerJobworthJobdataAddModel)

工作证职业数据回流接口

合作的三方伙伴通过该接口，将数据回传到工作证

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaCustomerJobworthJobdataApi;

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

    ZhimaCustomerJobworthJobdataApi apiInstance = new ZhimaCustomerJobworthJobdataApi(defaultClient);
    ZhimaCustomerJobworthJobdataAddModel zhimaCustomerJobworthJobdataAddModel = new ZhimaCustomerJobworthJobdataAddModel(); // ZhimaCustomerJobworthJobdataAddModel | 
    try {
      ZhimaCustomerJobworthJobdataAddResponseModel result = apiInstance.add(zhimaCustomerJobworthJobdataAddModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaCustomerJobworthJobdataApi#add");
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
| **zhimaCustomerJobworthJobdataAddModel** | **ZhimaCustomerJobworthJobdataAddModel**|  | [optional] |

### Return type

**ZhimaCustomerJobworthJobdataAddResponseModel**

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

