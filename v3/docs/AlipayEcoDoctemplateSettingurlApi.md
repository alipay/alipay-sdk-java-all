# AlipayEcoDoctemplateSettingurlApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayEcoDoctemplateSettingurlApi.md#query) | **GET** /v3/alipay/eco/doctemplate/settingurl/query | 获取合同模板设置地址（E签宝） |


<a name="query"></a>
# **query**
> AlipayEcoDoctemplateSettingurlQueryResponseModel query(targetAppId, templateId)

获取合同模板设置地址（E签宝）

通过创建合同模板接口返回的模板ID（templateId）获取合同模板的配置地址。在模板设置页面上进行模板输入组件、签署区设置后，即可基于模板发起合同签署。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoDoctemplateSettingurlApi;

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

    AlipayEcoDoctemplateSettingurlApi apiInstance = new AlipayEcoDoctemplateSettingurlApi(defaultClient);
    String targetAppId = "targetAppId_example"; // String | 目标isv应用ID
    String templateId = "0016801a4ec24e548a93b094856b735c"; // String | 合同模板id。通过<a href =\"https://opendocs.alipay.com/apis/api_50/alipay.eco.doc.template.create\">创建合同模版</a>（alipay.eco.doc.template.create）接口获取。
    try {
      AlipayEcoDoctemplateSettingurlQueryResponseModel result = apiInstance.query(targetAppId, templateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoDoctemplateSettingurlApi#query");
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
| **templateId** | **String**| 合同模板id。通过&lt;a href &#x3D;\&quot;https://opendocs.alipay.com/apis/api_50/alipay.eco.doc.template.create\&quot;&gt;创建合同模版&lt;/a&gt;（alipay.eco.doc.template.create）接口获取。 | [optional] |

### Return type

**AlipayEcoDoctemplateSettingurlQueryResponseModel**

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

