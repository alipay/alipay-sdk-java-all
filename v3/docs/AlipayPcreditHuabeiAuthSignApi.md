# AlipayPcreditHuabeiAuthSignApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apply**](AlipayPcreditHuabeiAuthSignApi.md#apply) | **PUT** /v3/alipay/pcredit/huabei/auth/sign/apply | 花芝轻会员页面签约接口 |


<a name="apply"></a>
# **apply**
> Object apply(alipayPcreditHuabeiAuthSignApplyModel)

花芝轻会员页面签约接口

支持用户从外部APP跳转到支付宝钱包内部的小程序内，完成花芝轻会员产品签约

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayPcreditHuabeiAuthSignApi;

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

    AlipayPcreditHuabeiAuthSignApi apiInstance = new AlipayPcreditHuabeiAuthSignApi(defaultClient);
    AlipayPcreditHuabeiAuthSignApplyModel alipayPcreditHuabeiAuthSignApplyModel = new AlipayPcreditHuabeiAuthSignApplyModel(); // AlipayPcreditHuabeiAuthSignApplyModel | 
    try {
      Object result = apiInstance.apply(alipayPcreditHuabeiAuthSignApplyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayPcreditHuabeiAuthSignApi#apply");
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
| **alipayPcreditHuabeiAuthSignApplyModel** | **AlipayPcreditHuabeiAuthSignApplyModel**|  | [optional] |

### Return type

**Object**

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

