# AlipayFundAuthOrderApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**freeze**](AlipayFundAuthOrderApi.md#freeze) | **POST** /v3/alipay/fund/auth/order/freeze | 资金授权冻结接口 |
| [**unfreeze**](AlipayFundAuthOrderApi.md#unfreeze) | **POST** /v3/alipay/fund/auth/order/unfreeze | 资金授权解冻接口 |


<a name="freeze"></a>
# **freeze**
> AlipayFundAuthOrderFreezeResponseModel freeze(alipayFundAuthOrderFreezeModel)

资金授权冻结接口

收银员使用扫码设备读取用户支付宝钱包“付款码”后，将条码信息和订单信息通过本接口上送至支付宝发起资金冻结。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundAuthOrderApi;

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

    AlipayFundAuthOrderApi apiInstance = new AlipayFundAuthOrderApi(defaultClient);
    AlipayFundAuthOrderFreezeModel alipayFundAuthOrderFreezeModel = new AlipayFundAuthOrderFreezeModel(); // AlipayFundAuthOrderFreezeModel | 
    try {
      AlipayFundAuthOrderFreezeResponseModel result = apiInstance.freeze(alipayFundAuthOrderFreezeModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundAuthOrderApi#freeze");
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
| **alipayFundAuthOrderFreezeModel** | **AlipayFundAuthOrderFreezeModel**|  | [optional] |

### Return type

**AlipayFundAuthOrderFreezeResponseModel**

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

<a name="unfreeze"></a>
# **unfreeze**
> AlipayFundAuthOrderUnfreezeResponseModel unfreeze(alipayFundAuthOrderUnfreezeModel)

资金授权解冻接口

当资金授权发生之后一段时间内，由于买家或者商家等其他原因需要要解冻资金，商家可通过资金授权解冻接口将授权资金进行解冻，支付宝将在收到解冻请求并验证成功后，按解冻规则将冻结资金按原路进行解冻

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundAuthOrderApi;

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

    AlipayFundAuthOrderApi apiInstance = new AlipayFundAuthOrderApi(defaultClient);
    AlipayFundAuthOrderUnfreezeModel alipayFundAuthOrderUnfreezeModel = new AlipayFundAuthOrderUnfreezeModel(); // AlipayFundAuthOrderUnfreezeModel | 
    try {
      AlipayFundAuthOrderUnfreezeResponseModel result = apiInstance.unfreeze(alipayFundAuthOrderUnfreezeModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundAuthOrderApi#unfreeze");
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
| **alipayFundAuthOrderUnfreezeModel** | **AlipayFundAuthOrderUnfreezeModel**|  | [optional] |

### Return type

**AlipayFundAuthOrderUnfreezeResponseModel**

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

