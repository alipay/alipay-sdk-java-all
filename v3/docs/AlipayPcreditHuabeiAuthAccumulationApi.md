# AlipayPcreditHuabeiAuthAccumulationApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayPcreditHuabeiAuthAccumulationApi.md#query) | **GET** /v3/alipay/pcredit/huabei/auth/accumulation/query | 花芝轻会员周期累计数据查询 |


<a name="query"></a>
# **query**
> AlipayPcreditHuabeiAuthAccumulationQueryResponseModel query(agreementNo, period, alipayUserId, openId)

花芝轻会员周期累计数据查询

根据协议与对应的周期查询支付宝累计数据。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayPcreditHuabeiAuthAccumulationApi;

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

    AlipayPcreditHuabeiAuthAccumulationApi apiInstance = new AlipayPcreditHuabeiAuthAccumulationApi(defaultClient);
    String agreementNo = "20170502000610755993"; // String | 支付宝系统中用以唯一标识用户签约记录的编号。
    String period = "20181223235059-20181230235010"; // String | 协议结算周期，使用支付宝端回传的周期信息。
    String alipayUserId = "2088101117955611"; // String | 买家在支付宝的用户id
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 买家在支付宝的用户id
    try {
      AlipayPcreditHuabeiAuthAccumulationQueryResponseModel result = apiInstance.query(agreementNo, period, alipayUserId, openId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayPcreditHuabeiAuthAccumulationApi#query");
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
| **agreementNo** | **String**| 支付宝系统中用以唯一标识用户签约记录的编号。 | [optional] |
| **period** | **String**| 协议结算周期，使用支付宝端回传的周期信息。 | [optional] |
| **alipayUserId** | **String**| 买家在支付宝的用户id | [optional] |
| **openId** | **String**| 买家在支付宝的用户id | [optional] |

### Return type

**AlipayPcreditHuabeiAuthAccumulationQueryResponseModel**

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

