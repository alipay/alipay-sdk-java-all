# AlipayEcoEduKtSchoolinfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modify**](AlipayEcoEduKtSchoolinfoApi.md#modify) | **POST** /v3/alipay/eco/edu/kt/schoolinfo/modify | 教育缴费学校信息录入接口 |


<a name="modify"></a>
# **modify**
> AlipayEcoEduKtSchoolinfoModifyResponseModel modify(alipayEcoEduKtSchoolinfoModifyModel)

教育缴费学校信息录入接口

ISV与支付宝签约后，通过此接口同步学校信息到中小学教育平台。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoEduKtSchoolinfoApi;

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

    AlipayEcoEduKtSchoolinfoApi apiInstance = new AlipayEcoEduKtSchoolinfoApi(defaultClient);
    AlipayEcoEduKtSchoolinfoModifyModel alipayEcoEduKtSchoolinfoModifyModel = new AlipayEcoEduKtSchoolinfoModifyModel(); // AlipayEcoEduKtSchoolinfoModifyModel | 
    try {
      AlipayEcoEduKtSchoolinfoModifyResponseModel result = apiInstance.modify(alipayEcoEduKtSchoolinfoModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoEduKtSchoolinfoApi#modify");
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
| **alipayEcoEduKtSchoolinfoModifyModel** | **AlipayEcoEduKtSchoolinfoModifyModel**|  | [optional] |

### Return type

**AlipayEcoEduKtSchoolinfoModifyResponseModel**

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

