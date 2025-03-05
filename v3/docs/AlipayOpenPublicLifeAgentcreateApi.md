# AlipayOpenPublicLifeAgentcreateApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenPublicLifeAgentcreateApi.md#query) | **GET** /v3/alipay/open/public/life/agentcreate/query | isv代创建生活号申请状态查询接口 |


<a name="query"></a>
# **query**
> AlipayOpenPublicLifeAgentcreateQueryResponseModel query(outBizNo)

isv代创建生活号申请状态查询接口

isv可调用此接口查询代商户创建的生活号审核状态

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicLifeAgentcreateApi;

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

    AlipayOpenPublicLifeAgentcreateApi apiInstance = new AlipayOpenPublicLifeAgentcreateApi(defaultClient);
    String outBizNo = "2016070788301823878"; // String | 由开发者创建的外部入驻申请单据号，需与<a href=\"https://opendocs.alipay.com/apis/api_6/alipay.open.public.life.agent.create\">alipay.open.public.life.agent.create</a>(isv代创建生活号接口)的out_biz_no一致。
    try {
      AlipayOpenPublicLifeAgentcreateQueryResponseModel result = apiInstance.query(outBizNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicLifeAgentcreateApi#query");
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
| **outBizNo** | **String**| 由开发者创建的外部入驻申请单据号，需与&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_6/alipay.open.public.life.agent.create\&quot;&gt;alipay.open.public.life.agent.create&lt;/a&gt;(isv代创建生活号接口)的out_biz_no一致。 | [optional] |

### Return type

**AlipayOpenPublicLifeAgentcreateQueryResponseModel**

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

