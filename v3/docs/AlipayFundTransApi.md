# AlipayFundTransApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pay**](AlipayFundTransApi.md#pay) | **POST** /v3/alipay/fund/trans/pay | 资金支付接口 |
| [**refund**](AlipayFundTransApi.md#refund) | **POST** /v3/alipay/fund/trans/refund | 资金退回接口 |


<a name="pay"></a>
# **pay**
> AlipayFundTransPayResponseModel pay(alipayFundTransPayModel)

资金支付接口

付款方通过协议、二维码、声波、人脸等方式，通过本接口提交给支付宝直接完成支付。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundTransApi;

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

    AlipayFundTransApi apiInstance = new AlipayFundTransApi(defaultClient);
    AlipayFundTransPayModel alipayFundTransPayModel = new AlipayFundTransPayModel(); // AlipayFundTransPayModel | 
    try {
      AlipayFundTransPayResponseModel result = apiInstance.pay(alipayFundTransPayModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundTransApi#pay");
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
| **alipayFundTransPayModel** | **AlipayFundTransPayModel**|  | [optional] |

### Return type

**AlipayFundTransPayResponseModel**

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

<a name="refund"></a>
# **refund**
> AlipayFundTransRefundResponseModel refund(alipayFundTransRefundModel)

资金退回接口

当资金支付一段时间后，由于收款方一直没有收钱（比如抢红包），可以通过退款接口将资金退换给付款方。支付宝将会按照退款规则将支付款按原路退到付款方帐号上。   交易超过约定时间（签约时设置的可退款时间）的订单无法进行退款。支付宝退款支持单笔交易分多次退回，多次退款需要提交原支付订单的商户订单号和设置不同的退款单号。一笔退款失败后重新提交，要采用原来的退款单号。总退款金额不能超过（用户实际支付金额-已领红包）的金额。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundTransApi;

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

    AlipayFundTransApi apiInstance = new AlipayFundTransApi(defaultClient);
    AlipayFundTransRefundModel alipayFundTransRefundModel = new AlipayFundTransRefundModel(); // AlipayFundTransRefundModel | 
    try {
      AlipayFundTransRefundResponseModel result = apiInstance.refund(alipayFundTransRefundModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundTransApi#refund");
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
| **alipayFundTransRefundModel** | **AlipayFundTransRefundModel**|  | [optional] |

### Return type

**AlipayFundTransRefundResponseModel**

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

