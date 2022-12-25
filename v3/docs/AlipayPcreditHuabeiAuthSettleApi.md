# AlipayPcreditHuabeiAuthSettleApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apply**](AlipayPcreditHuabeiAuthSettleApi.md#apply) | **PUT** /v3/alipay/pcredit/huabei/auth/settle/apply | 花芝轻会员结算申请 |


<a name="apply"></a>
# **apply**
> AlipayPcreditHuabeiAuthSettleApplyResponseModel apply(alipayPcreditHuabeiAuthSettleApplyModel)

花芝轻会员结算申请

用户已经开通花芝轻会员协议后，商户通过此接口解冻转支付用户冻结金额。传入金额必须小于等于冻结金额

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayPcreditHuabeiAuthSettleApi;

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

    AlipayPcreditHuabeiAuthSettleApi apiInstance = new AlipayPcreditHuabeiAuthSettleApi(defaultClient);
    AlipayPcreditHuabeiAuthSettleApplyModel alipayPcreditHuabeiAuthSettleApplyModel = new AlipayPcreditHuabeiAuthSettleApplyModel(); // AlipayPcreditHuabeiAuthSettleApplyModel | 
    try {
      AlipayPcreditHuabeiAuthSettleApplyResponseModel result = apiInstance.apply(alipayPcreditHuabeiAuthSettleApplyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayPcreditHuabeiAuthSettleApi#apply");
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
| **alipayPcreditHuabeiAuthSettleApplyModel** | **AlipayPcreditHuabeiAuthSettleApplyModel**|  | [optional] |

### Return type

**AlipayPcreditHuabeiAuthSettleApplyResponseModel**

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

