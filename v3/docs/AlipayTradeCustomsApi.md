# AlipayTradeCustomsApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**declare**](AlipayTradeCustomsApi.md#declare) | **POST** /v3/alipay/trade/customs/declare | 统一收单报关接口 |
| [**query**](AlipayTradeCustomsApi.md#query) | **POST** /v3/alipay/trade/customs/query | 查询报关详细信息 |


<a name="declare"></a>
# **declare**
> AlipayTradeCustomsDeclareResponseModel declare(alipayTradeCustomsDeclareModel)

统一收单报关接口

境外商户的商品进口到国内时需要向海关中心报送支付、物流等信息，由海关审核，如果交易是由支付宝支付的话，需要商户可以调用此报关接口来请求支付宝将其指定交易报送支付单给海关。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeCustomsApi;

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

    AlipayTradeCustomsApi apiInstance = new AlipayTradeCustomsApi(defaultClient);
    AlipayTradeCustomsDeclareModel alipayTradeCustomsDeclareModel = new AlipayTradeCustomsDeclareModel(); // AlipayTradeCustomsDeclareModel | 
    try {
      AlipayTradeCustomsDeclareResponseModel result = apiInstance.declare(alipayTradeCustomsDeclareModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeCustomsApi#declare");
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
| **alipayTradeCustomsDeclareModel** | **AlipayTradeCustomsDeclareModel**|  | [optional] |

### Return type

**AlipayTradeCustomsDeclareResponseModel**

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
> AlipayTradeCustomsQueryResponseModel query()

查询报关详细信息

境外商户的商品进口到国内时需要向海关中心报送支付、物流等信息，由海关审核，如果交易是由支付宝支付的话，需要商户调用支付宝报关接口来请求支付宝将其指定交易报送支付单给海关。商户可以通过该接口主动查询报关状态，了解报关详情以及进度。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeCustomsApi;

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

    AlipayTradeCustomsApi apiInstance = new AlipayTradeCustomsApi(defaultClient);
    try {
      AlipayTradeCustomsQueryResponseModel result = apiInstance.query();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeCustomsApi#query");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**AlipayTradeCustomsQueryResponseModel**

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

