# AlipayPcreditHuabeiAuthAgreementApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**close**](AlipayPcreditHuabeiAuthAgreementApi.md#close) | **PUT** /v3/alipay/pcredit/huabei/auth/agreement/close | 花芝协议关闭接口 |
| [**query**](AlipayPcreditHuabeiAuthAgreementApi.md#query) | **GET** /v3/alipay/pcredit/huabei/auth/agreement/query | 花芝轻会员协议查询接口 |


<a name="close"></a>
# **close**
> AlipayPcreditHuabeiAuthAgreementCloseResponseModel close(alipayPcreditHuabeiAuthAgreementCloseModel)

花芝协议关闭接口

用户已经开通花芝先享后，商户可通过此接口提前关闭协议。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayPcreditHuabeiAuthAgreementApi;

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

    AlipayPcreditHuabeiAuthAgreementApi apiInstance = new AlipayPcreditHuabeiAuthAgreementApi(defaultClient);
    AlipayPcreditHuabeiAuthAgreementCloseModel alipayPcreditHuabeiAuthAgreementCloseModel = new AlipayPcreditHuabeiAuthAgreementCloseModel(); // AlipayPcreditHuabeiAuthAgreementCloseModel | 
    try {
      AlipayPcreditHuabeiAuthAgreementCloseResponseModel result = apiInstance.close(alipayPcreditHuabeiAuthAgreementCloseModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayPcreditHuabeiAuthAgreementApi#close");
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
| **alipayPcreditHuabeiAuthAgreementCloseModel** | **AlipayPcreditHuabeiAuthAgreementCloseModel**|  | [optional] |

### Return type

**AlipayPcreditHuabeiAuthAgreementCloseResponseModel**

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

<a name="query"></a>
# **query**
> AlipayPcreditHuabeiAuthAgreementQueryResponseModel query(agreementNo, alipayUserId, openId, outSignNo, authScene)

花芝轻会员协议查询接口

花芝轻会员协议查询，返回协议的状态。如果协议处于签约状态，同时返回最新的资金池余额。 有两种方式查询。优先使用agreement_no查询；其次是使用(out_sign_no, auth_scene)查询。 如果商户不能保证out_sign_no的唯一性，慎用(out_sign_no, auth_scene)的查询方式，它优先返回仍处于签约状态的协议。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayPcreditHuabeiAuthAgreementApi;

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

    AlipayPcreditHuabeiAuthAgreementApi apiInstance = new AlipayPcreditHuabeiAuthAgreementApi(defaultClient);
    String agreementNo = "20185513447859192007"; // String | 支付宝系统中用以唯一标识用户签约记录的编号，即花芝轻会员。传入该参数，会忽略其它所有参数。
    String alipayUserId = "2088101117955611"; // String | 买家在支付宝的用户id
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 买家在支付宝的用户id
    String outSignNo = "2018053100073208416400000002"; // String | 外部签约号，由商户提供，花芝轻会员协议中标识用户的唯一签约号（确保在商户系统中唯一）。
    String authScene = "EXTERNAL_PCARD"; // String | 花芝轻会员签约场景，商户和支付宝签约时确定。该值需要与系统/页面签约接口调用时传入的值保持一致。
    try {
      AlipayPcreditHuabeiAuthAgreementQueryResponseModel result = apiInstance.query(agreementNo, alipayUserId, openId, outSignNo, authScene);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayPcreditHuabeiAuthAgreementApi#query");
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
| **agreementNo** | **String**| 支付宝系统中用以唯一标识用户签约记录的编号，即花芝轻会员。传入该参数，会忽略其它所有参数。 | [optional] |
| **alipayUserId** | **String**| 买家在支付宝的用户id | [optional] |
| **openId** | **String**| 买家在支付宝的用户id | [optional] |
| **outSignNo** | **String**| 外部签约号，由商户提供，花芝轻会员协议中标识用户的唯一签约号（确保在商户系统中唯一）。 | [optional] |
| **authScene** | **String**| 花芝轻会员签约场景，商户和支付宝签约时确定。该值需要与系统/页面签约接口调用时传入的值保持一致。 | [optional] |

### Return type

**AlipayPcreditHuabeiAuthAgreementQueryResponseModel**

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

