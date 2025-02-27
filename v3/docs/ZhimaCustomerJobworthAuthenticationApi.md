# ZhimaCustomerJobworthAuthenticationApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](ZhimaCustomerJobworthAuthenticationApi.md#query) | **GET** /v3/zhima/customer/jobworth/authentication | 职得身份认证查询接口 |


<a name="query"></a>
# **query**
> ZhimaCustomerJobworthAuthenticationQueryResponseModel query(connKey, onceToken, queryType, identityType, serviceId, userId, openId, certNo, certType)

职得身份认证查询接口

根据一次性token查询用户身份认证结果

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaCustomerJobworthAuthenticationApi;

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

    ZhimaCustomerJobworthAuthenticationApi apiInstance = new ZhimaCustomerJobworthAuthenticationApi(defaultClient);
    String connKey = "uuid"; // String | 调用第一步创建接口的out_agreement_no，由外部传入
    String onceToken = "uuid"; // String | 查询身份认证结果的凭证，在认证结果到达终态后只允许查询成功一次，若需要再次查询，则需要调用第一个接口再拉起受理台
    String queryType = "exact\\dim"; // String | exact:精确查询,dim:模糊查询
    String identityType = "01，02，03"; // String | 01:医生，02:教师，具体参考文档
    String serviceId = "2019120400000000000004450100"; // String | 信用服务id，商家接入产品功能包时有运营同学分配
    String userId = "20881029102921"; // String | 蚂蚁统一会员ID 和身份证任选一个传入
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 蚂蚁统一会员ID 和身份证任选一个传入
    String certNo = "420192931233123123"; // String | 证件号
    String certType = "0"; // String | \"身份证 : 0\"，\"护照: 1\"，\"台湾往来通行证：4\",\"港澳往来通行证：3\", \"回乡证: 2\"；\"港澳证件：5\"
    try {
      ZhimaCustomerJobworthAuthenticationQueryResponseModel result = apiInstance.query(connKey, onceToken, queryType, identityType, serviceId, userId, openId, certNo, certType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaCustomerJobworthAuthenticationApi#query");
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
| **connKey** | **String**| 调用第一步创建接口的out_agreement_no，由外部传入 | [optional] |
| **onceToken** | **String**| 查询身份认证结果的凭证，在认证结果到达终态后只允许查询成功一次，若需要再次查询，则需要调用第一个接口再拉起受理台 | [optional] |
| **queryType** | **String**| exact:精确查询,dim:模糊查询 | [optional] |
| **identityType** | **String**| 01:医生，02:教师，具体参考文档 | [optional] |
| **serviceId** | **String**| 信用服务id，商家接入产品功能包时有运营同学分配 | [optional] |
| **userId** | **String**| 蚂蚁统一会员ID 和身份证任选一个传入 | [optional] |
| **openId** | **String**| 蚂蚁统一会员ID 和身份证任选一个传入 | [optional] |
| **certNo** | **String**| 证件号 | [optional] |
| **certType** | **String**| \&quot;身份证 : 0\&quot;，\&quot;护照: 1\&quot;，\&quot;台湾往来通行证：4\&quot;,\&quot;港澳往来通行证：3\&quot;, \&quot;回乡证: 2\&quot;；\&quot;港澳证件：5\&quot; | [optional] |

### Return type

**ZhimaCustomerJobworthAuthenticationQueryResponseModel**

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

