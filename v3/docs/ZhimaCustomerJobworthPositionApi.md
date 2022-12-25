# ZhimaCustomerJobworthPositionApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**add**](ZhimaCustomerJobworthPositionApi.md#add) | **POST** /v3/zhima/customer/jobworth/position/add | 职得工作证岗位收集 |


<a name="add"></a>
# **add**
> ZhimaCustomerJobworthPositionAddResponseModel add(zhimaCustomerJobworthPositionAddModel)

职得工作证岗位收集

保存商户传入岗位信息，当接口调用成功，业务问题时返回subcode

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaCustomerJobworthPositionApi;

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

    ZhimaCustomerJobworthPositionApi apiInstance = new ZhimaCustomerJobworthPositionApi(defaultClient);
    ZhimaCustomerJobworthPositionAddModel zhimaCustomerJobworthPositionAddModel = new ZhimaCustomerJobworthPositionAddModel(); // ZhimaCustomerJobworthPositionAddModel | 
    try {
      ZhimaCustomerJobworthPositionAddResponseModel result = apiInstance.add(zhimaCustomerJobworthPositionAddModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaCustomerJobworthPositionApi#add");
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
| **zhimaCustomerJobworthPositionAddModel** | **ZhimaCustomerJobworthPositionAddModel**|  | [optional] |

### Return type

**ZhimaCustomerJobworthPositionAddResponseModel**

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

