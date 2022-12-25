# AlipayEcoSignflowsUrlApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayEcoSignflowsUrlApi.md#query) | **GET** /v3/alipay/eco/signflows/url/query | 获取签署地址 |


<a name="query"></a>
# **query**
> AlipayEcoSignflowsUrlQueryResponseModel query(targetAppId, flowId, thirdPartyUserId, orgThirdPartyUserId)

获取签署地址

创建流程后，获取指定签署人的签署链接地址，可在应用内集成H5签署页，或者通过短信发送签署链接。 传入个人唯一标识，则获取的签署任务链接仅包含个人人的签署任务；如同时传入企业唯一标识，则获取的签署任务链接包含企业与个人的签署任务。 预览链接：支持签署人先查看合同原文，后进行登录并完成签署。适用于应用内集成场景。 签署链接：签署人需要登录后查看合同原文并签署。适用用短信发送场景。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoSignflowsUrlApi;

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

    AlipayEcoSignflowsUrlApi apiInstance = new AlipayEcoSignflowsUrlApi(defaultClient);
    String targetAppId = "targetAppId_example"; // String | 目标isv应用ID
    String flowId = "429b1d3038854cabbcdac0a63d7e4c0d"; // String | 流程id，通过 <a href =\"https://opendocs.alipay.com/apis/api_50/alipay.eco.contract.signflows.create\">创建电子合同签署流程</a>(alipay.eco.contract.signflows.create)接口获取。
    String thirdPartyUserId = "2088102924502823"; // String | 创建流程时指定个人唯一标识
    String orgThirdPartyUserId = "913301087458306077"; // String | 创建流程时指定企业唯一标识
    try {
      AlipayEcoSignflowsUrlQueryResponseModel result = apiInstance.query(targetAppId, flowId, thirdPartyUserId, orgThirdPartyUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoSignflowsUrlApi#query");
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
| **flowId** | **String**| 流程id，通过 &lt;a href &#x3D;\&quot;https://opendocs.alipay.com/apis/api_50/alipay.eco.contract.signflows.create\&quot;&gt;创建电子合同签署流程&lt;/a&gt;(alipay.eco.contract.signflows.create)接口获取。 | [optional] |
| **thirdPartyUserId** | **String**| 创建流程时指定个人唯一标识 | [optional] |
| **orgThirdPartyUserId** | **String**| 创建流程时指定企业唯一标识 | [optional] |

### Return type

**AlipayEcoSignflowsUrlQueryResponseModel**

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

