# AlipayTradeOrderApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pay**](AlipayTradeOrderApi.md#pay) | **POST** /v3/alipay/trade/order/pay | 统一收单交易订单支付接口 |
| [**settle**](AlipayTradeOrderApi.md#settle) | **POST** /v3/alipay/trade/order/settle | 统一收单交易结算接口 |


<a name="pay"></a>
# **pay**
> AlipayTradeOrderPayResponseModel pay(alipayTradeOrderPayModel)

统一收单交易订单支付接口

商户用已创建的交易进行支付（需要使用该接口请联系接口owner）

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeOrderApi;

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

    AlipayTradeOrderApi apiInstance = new AlipayTradeOrderApi(defaultClient);
    AlipayTradeOrderPayModel alipayTradeOrderPayModel = new AlipayTradeOrderPayModel(); // AlipayTradeOrderPayModel | 
    try {
      AlipayTradeOrderPayResponseModel result = apiInstance.pay(alipayTradeOrderPayModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeOrderApi#pay");
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
| **alipayTradeOrderPayModel** | **AlipayTradeOrderPayModel**|  | [optional] |

### Return type

**AlipayTradeOrderPayResponseModel**

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

<a name="settle"></a>
# **settle**
> AlipayTradeOrderSettleResponseModel settle(alipayTradeOrderSettleModel)

统一收单交易结算接口

用于在卖家交易成功之后，基于交易订单，进行卖家与第三方（如供应商或平台商）的资金再分配。一般用于第三方从卖家抽佣场景。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeOrderApi;

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

    AlipayTradeOrderApi apiInstance = new AlipayTradeOrderApi(defaultClient);
    AlipayTradeOrderSettleModel alipayTradeOrderSettleModel = new AlipayTradeOrderSettleModel(); // AlipayTradeOrderSettleModel | 
    try {
      AlipayTradeOrderSettleResponseModel result = apiInstance.settle(alipayTradeOrderSettleModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeOrderApi#settle");
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
| **alipayTradeOrderSettleModel** | **AlipayTradeOrderSettleModel**|  | [optional] |

### Return type

**AlipayTradeOrderSettleResponseModel**

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

