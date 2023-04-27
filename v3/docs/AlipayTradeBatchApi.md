# AlipayTradeBatchApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**settle**](AlipayTradeBatchApi.md#settle) | **POST** /v3/alipay/trade/batch/settle | 批量结算 |
| [**transfer**](AlipayTradeBatchApi.md#transfer) | **POST** /v3/alipay/trade/batch/transfer | 请款分账 |


<a name="settle"></a>
# **settle**
> AlipayTradeBatchSettleResponseModel settle(alipayTradeBatchSettleModel)

批量结算

买家付款成功之后，资金进入二级商户待结算户，支付宝等待平台的结算指令进行结算。平台可根据平台规则，发起批量结算请求，将资金结算到二级商户的结算账号。请款金额只要不超过待结算的总余额即可。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeBatchApi;

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

    AlipayTradeBatchApi apiInstance = new AlipayTradeBatchApi(defaultClient);
    AlipayTradeBatchSettleModel alipayTradeBatchSettleModel = new AlipayTradeBatchSettleModel(); // AlipayTradeBatchSettleModel | 
    try {
      AlipayTradeBatchSettleResponseModel result = apiInstance.settle(alipayTradeBatchSettleModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeBatchApi#settle");
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
| **alipayTradeBatchSettleModel** | **AlipayTradeBatchSettleModel**|  | [optional] |

### Return type

**AlipayTradeBatchSettleResponseModel**

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

<a name="transfer"></a>
# **transfer**
> AlipayTradeBatchTransferResponseModel transfer(alipayTradeBatchTransferModel)

请款分账

在红星美凯龙场景下，请款到不同主体的银行卡/账户中

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeBatchApi;

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

    AlipayTradeBatchApi apiInstance = new AlipayTradeBatchApi(defaultClient);
    AlipayTradeBatchTransferModel alipayTradeBatchTransferModel = new AlipayTradeBatchTransferModel(); // AlipayTradeBatchTransferModel | 
    try {
      AlipayTradeBatchTransferResponseModel result = apiInstance.transfer(alipayTradeBatchTransferModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeBatchApi#transfer");
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
| **alipayTradeBatchTransferModel** | **AlipayTradeBatchTransferModel**|  | [optional] |

### Return type

**AlipayTradeBatchTransferResponseModel**

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

