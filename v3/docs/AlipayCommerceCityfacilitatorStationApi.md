# AlipayCommerceCityfacilitatorStationApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayCommerceCityfacilitatorStationApi.md#query) | **GET** /v3/alipay/commerce/cityfacilitator/station/query | 地铁购票站点数据查询 |


<a name="query"></a>
# **query**
> AlipayCommerceCityfacilitatorStationQueryResponseModel query(cityCode)

地铁购票站点数据查询

商户App获取地铁购票开放购票的站点和禁止到达的站点

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceCityfacilitatorStationApi;

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

    AlipayCommerceCityfacilitatorStationApi apiInstance = new AlipayCommerceCityfacilitatorStationApi(defaultClient);
    String cityCode = "440300"; // String | 城市编码请参考查询 <a href=\"http://www.mca.gov.cn/article/sj/xzqh/\">中华人民共和国行政区划代码</a>。 已支持城市：广州 440100，深圳 440300，杭州330100。
    try {
      AlipayCommerceCityfacilitatorStationQueryResponseModel result = apiInstance.query(cityCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceCityfacilitatorStationApi#query");
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
| **cityCode** | **String**| 城市编码请参考查询 &lt;a href&#x3D;\&quot;http://www.mca.gov.cn/article/sj/xzqh/\&quot;&gt;中华人民共和国行政区划代码&lt;/a&gt;。 已支持城市：广州 440100，深圳 440300，杭州330100。 | [optional] |

### Return type

**AlipayCommerceCityfacilitatorStationQueryResponseModel**

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

