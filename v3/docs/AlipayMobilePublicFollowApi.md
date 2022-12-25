# AlipayMobilePublicFollowApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**callList**](AlipayMobilePublicFollowApi.md#callList) | **GET** /v3/alipay/mobile/public/follow/list | 获取关注者列表 |


<a name="callList"></a>
# **callList**
> AlipayMobilePublicFollowListResponseModel callList(bizContent)

获取关注者列表

公众号可通过本接口来获取帐号的关注者列表，关注者列表由一串userId组成。一次拉取调用最多拉取10000个关注者的userId，可以通过多次拉取的方式来满足需求。  公众号可通过本接口来获取帐号的关注者列表，关注者列表由一串userId组成。一次拉取调用最多拉取10000个关注者的userId，可以通过多次拉取的方式来满足需求。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMobilePublicFollowApi;

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

    AlipayMobilePublicFollowApi apiInstance = new AlipayMobilePublicFollowApi(defaultClient);
    String bizContent = "{\"nextUserId\":\"2088102123322367\"}"; // String | 当nextUserId为空时,代表查询第一组,如果有值时以当前值为准查询下一组  <a href=\"https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7386797.0.0.eZqycg&treeId=53&articleId=103525&docType=1\">详情请见</a>
    try {
      AlipayMobilePublicFollowListResponseModel result = apiInstance.callList(bizContent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMobilePublicFollowApi#callList");
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
| **bizContent** | **String**| 当nextUserId为空时,代表查询第一组,如果有值时以当前值为准查询下一组  &lt;a href&#x3D;\&quot;https://doc.open.alipay.com/doc2/detail.htm?spm&#x3D;a219a.7386797.0.0.eZqycg&amp;treeId&#x3D;53&amp;articleId&#x3D;103525&amp;docType&#x3D;1\&quot;&gt;详情请见&lt;/a&gt; | [optional] |

### Return type

**AlipayMobilePublicFollowListResponseModel**

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

