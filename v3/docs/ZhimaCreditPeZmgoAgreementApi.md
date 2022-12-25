# ZhimaCreditPeZmgoAgreementApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](ZhimaCreditPeZmgoAgreementApi.md#query) | **GET** /v3/zhima/credit/pe/zmgo/agreement/query | 芝麻Go协议查询接口 |
| [**unsign**](ZhimaCreditPeZmgoAgreementApi.md#unsign) | **POST** /v3/zhima/credit/pe/zmgo/agreement/unsign | 芝麻GO协议解约 |


<a name="query"></a>
# **query**
> ZhimaCreditPeZmgoAgreementQueryResponseModel query(agreementId, alipayUserId, openId)

芝麻Go协议查询接口

用户已经开通芝麻GO后，通过此接口查询协议。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaCreditPeZmgoAgreementApi;

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

    ZhimaCreditPeZmgoAgreementApi apiInstance = new ZhimaCreditPeZmgoAgreementApi(defaultClient);
    String agreementId = "20185513447859192007"; // String | 支付宝系统中用以唯一标识用户签约记录的编号，即花芝轻会员。传入该参数，会忽略其它所有参数。
    String alipayUserId = "2088101117955611"; // String | 买家在支付宝的用户id
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 买家在支付宝的用户id
    try {
      ZhimaCreditPeZmgoAgreementQueryResponseModel result = apiInstance.query(agreementId, alipayUserId, openId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaCreditPeZmgoAgreementApi#query");
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
| **agreementId** | **String**| 支付宝系统中用以唯一标识用户签约记录的编号，即花芝轻会员。传入该参数，会忽略其它所有参数。 | [optional] |
| **alipayUserId** | **String**| 买家在支付宝的用户id | [optional] |
| **openId** | **String**| 买家在支付宝的用户id | [optional] |

### Return type

**ZhimaCreditPeZmgoAgreementQueryResponseModel**

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

<a name="unsign"></a>
# **unsign**
> ZhimaCreditPeZmgoAgreementUnsignResponseModel unsign(zhimaCreditPeZmgoAgreementUnsignModel)

芝麻GO协议解约

芝麻GO协议解约

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaCreditPeZmgoAgreementApi;

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

    ZhimaCreditPeZmgoAgreementApi apiInstance = new ZhimaCreditPeZmgoAgreementApi(defaultClient);
    ZhimaCreditPeZmgoAgreementUnsignModel zhimaCreditPeZmgoAgreementUnsignModel = new ZhimaCreditPeZmgoAgreementUnsignModel(); // ZhimaCreditPeZmgoAgreementUnsignModel | 
    try {
      ZhimaCreditPeZmgoAgreementUnsignResponseModel result = apiInstance.unsign(zhimaCreditPeZmgoAgreementUnsignModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaCreditPeZmgoAgreementApi#unsign");
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
| **zhimaCreditPeZmgoAgreementUnsignModel** | **ZhimaCreditPeZmgoAgreementUnsignModel**|  | [optional] |

### Return type

**ZhimaCreditPeZmgoAgreementUnsignResponseModel**

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

