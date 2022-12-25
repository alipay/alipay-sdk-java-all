# AlipayOpenMiniTemplateUsageApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenMiniTemplateUsageApi.md#query) | **GET** /v3/alipay/open/mini/template/usage/query | 查询使用模板的小程序列表 |


<a name="query"></a>
# **query**
> AlipayOpenMiniTemplateUsageQueryResponseModel query(templateId, pageNum, pageSize, templateVersion, bundleId)

查询使用模板的小程序列表

查询使用模板的小程序列表

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniTemplateUsageApi;

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

    AlipayOpenMiniTemplateUsageApi apiInstance = new AlipayOpenMiniTemplateUsageApi(defaultClient);
    String templateId = "1"; // String | 小程序模板APPID
    Integer pageNum = 1; // Integer | 查询的页数，起始为 1（第一页） 。默认第一页。
    Integer pageSize = 10; // Integer | 每页的数量，最多查询50个，默认查询10个
    String templateVersion = "0.0.1"; // String | 模板小程序的版本号
    String bundleId = "com.alipay.alipaywallet"; // String | 小程序投放的端参数，例如投放到支付宝钱包是支付宝端。默认支付宝端。支持： com.alipay.alipaywallet:支付宝端； com.alipay.iot.xpaas：支付宝IoT端。
    try {
      AlipayOpenMiniTemplateUsageQueryResponseModel result = apiInstance.query(templateId, pageNum, pageSize, templateVersion, bundleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniTemplateUsageApi#query");
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
| **templateId** | **String**| 小程序模板APPID | [optional] |
| **pageNum** | **Integer**| 查询的页数，起始为 1（第一页） 。默认第一页。 | [optional] |
| **pageSize** | **Integer**| 每页的数量，最多查询50个，默认查询10个 | [optional] |
| **templateVersion** | **String**| 模板小程序的版本号 | [optional] |
| **bundleId** | **String**| 小程序投放的端参数，例如投放到支付宝钱包是支付宝端。默认支付宝端。支持： com.alipay.alipaywallet:支付宝端； com.alipay.iot.xpaas：支付宝IoT端。 | [optional] |

### Return type

**AlipayOpenMiniTemplateUsageQueryResponseModel**

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

