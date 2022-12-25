# AliosOpenAutoInfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AliosOpenAutoInfoApi.md#query) | **GET** /v3/alios/open/auto/info/query | 查询阿里车的车辆信息 |


<a name="query"></a>
# **query**
> AliosOpenAutoInfoQueryResponseModel query(authToken, userId, openId, deviceToken)

查询阿里车的车辆信息

用户授权商户可获取用户的车辆信息后商户可通过openapi获取车辆信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AliosOpenAutoInfoApi;

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

    AliosOpenAutoInfoApi apiInstance = new AliosOpenAutoInfoApi(defaultClient);
    String authToken = "authToken_example"; // String | 用户授权令牌
    String userId = "33424562"; // String | 蚂蚁统一会员ID
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 经度
    String deviceToken = "cn-shanghai.e81fe6ffe0214049be4da405b3e78849"; // String | 设备token
    try {
      AliosOpenAutoInfoQueryResponseModel result = apiInstance.query(authToken, userId, openId, deviceToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AliosOpenAutoInfoApi#query");
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
| **authToken** | **String**| 用户授权令牌 | [optional] |
| **userId** | **String**| 蚂蚁统一会员ID | [optional] |
| **openId** | **String**| 经度 | [optional] |
| **deviceToken** | **String**| 设备token | [optional] |

### Return type

**AliosOpenAutoInfoQueryResponseModel**

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

