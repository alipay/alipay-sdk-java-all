# AlipayOpenInviteOrderApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenInviteOrderApi.md#query) | **GET** /v3/alipay/open/invite/order/query | 查询签约申请单状态 |


<a name="query"></a>
# **query**
> AlipayOpenInviteOrderQueryResponseModel query(isvBizId, alipayLogonId)

查询签约申请单状态

创建签约授权流程后，查询对应产品签约申请单的状态

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenInviteOrderApi;

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

    AlipayOpenInviteOrderApi apiInstance = new AlipayOpenInviteOrderApi(defaultClient);
    String isvBizId = "2017110616474516400082883"; // String | isv业务系统单据编号
    String alipayLogonId = "fykevbdz6766@alitest.com"; // String | 商家的支付宝账号，如果调用alipay.open.invite.order.create接口时有传入支付宝账号，则这里查询签约状态时必须要传
    try {
      AlipayOpenInviteOrderQueryResponseModel result = apiInstance.query(isvBizId, alipayLogonId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenInviteOrderApi#query");
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
| **isvBizId** | **String**| isv业务系统单据编号 | [optional] |
| **alipayLogonId** | **String**| 商家的支付宝账号，如果调用alipay.open.invite.order.create接口时有传入支付宝账号，则这里查询签约状态时必须要传 | [optional] |

### Return type

**AlipayOpenInviteOrderQueryResponseModel**

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

