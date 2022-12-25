# ZhimaCreditPeZmgoSettleApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apply**](ZhimaCreditPeZmgoSettleApi.md#apply) | **POST** /v3/zhima/credit/pe/zmgo/settle/apply | 芝麻GO结算申请 |
| [**refund**](ZhimaCreditPeZmgoSettleApi.md#refund) | **POST** /v3/zhima/credit/pe/zmgo/settle/refund | 芝麻GO结算退款接口 |
| [**unfreeze**](ZhimaCreditPeZmgoSettleApi.md#unfreeze) | **PUT** /v3/zhima/credit/pe/zmgo/settle/unfreeze | 芝麻GO解冻接口 |


<a name="apply"></a>
# **apply**
> ZhimaCreditPeZmgoSettleApplyResponseModel apply(zhimaCreditPeZmgoSettleApplyModel)

芝麻GO结算申请

用户已经开通芝麻GO后，商户通过此接口解冻转支付用户冻结金额。传入金额必须小于等于冻结金额

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaCreditPeZmgoSettleApi;

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

    ZhimaCreditPeZmgoSettleApi apiInstance = new ZhimaCreditPeZmgoSettleApi(defaultClient);
    ZhimaCreditPeZmgoSettleApplyModel zhimaCreditPeZmgoSettleApplyModel = new ZhimaCreditPeZmgoSettleApplyModel(); // ZhimaCreditPeZmgoSettleApplyModel | 
    try {
      ZhimaCreditPeZmgoSettleApplyResponseModel result = apiInstance.apply(zhimaCreditPeZmgoSettleApplyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaCreditPeZmgoSettleApi#apply");
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
| **zhimaCreditPeZmgoSettleApplyModel** | **ZhimaCreditPeZmgoSettleApplyModel**|  | [optional] |

### Return type

**ZhimaCreditPeZmgoSettleApplyResponseModel**

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
> ZhimaCreditPeZmgoSettleRefundResponseModel refund(zhimaCreditPeZmgoSettleRefundModel)

芝麻GO结算退款接口

芝麻GO结算金额逆向退款接口: 对zhima.credit.pe.zmgo.settle.apply(芝麻GO结算申请接口) 产生的结算交易发起退款操作

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaCreditPeZmgoSettleApi;

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

    ZhimaCreditPeZmgoSettleApi apiInstance = new ZhimaCreditPeZmgoSettleApi(defaultClient);
    ZhimaCreditPeZmgoSettleRefundModel zhimaCreditPeZmgoSettleRefundModel = new ZhimaCreditPeZmgoSettleRefundModel(); // ZhimaCreditPeZmgoSettleRefundModel | 
    try {
      ZhimaCreditPeZmgoSettleRefundResponseModel result = apiInstance.refund(zhimaCreditPeZmgoSettleRefundModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaCreditPeZmgoSettleApi#refund");
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
| **zhimaCreditPeZmgoSettleRefundModel** | **ZhimaCreditPeZmgoSettleRefundModel**|  | [optional] |

### Return type

**ZhimaCreditPeZmgoSettleRefundResponseModel**

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
> ZhimaCreditPeZmgoSettleUnfreezeResponseModel unfreeze(zhimaCreditPeZmgoSettleUnfreezeModel)

芝麻GO解冻接口

用户已经开通芝麻GO后，商户通过此接口解冻转支付用户冻结金额。传入金额必须小于等于冻结金额

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaCreditPeZmgoSettleApi;

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

    ZhimaCreditPeZmgoSettleApi apiInstance = new ZhimaCreditPeZmgoSettleApi(defaultClient);
    ZhimaCreditPeZmgoSettleUnfreezeModel zhimaCreditPeZmgoSettleUnfreezeModel = new ZhimaCreditPeZmgoSettleUnfreezeModel(); // ZhimaCreditPeZmgoSettleUnfreezeModel | 
    try {
      ZhimaCreditPeZmgoSettleUnfreezeResponseModel result = apiInstance.unfreeze(zhimaCreditPeZmgoSettleUnfreezeModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaCreditPeZmgoSettleApi#unfreeze");
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
| **zhimaCreditPeZmgoSettleUnfreezeModel** | **ZhimaCreditPeZmgoSettleUnfreezeModel**|  | [optional] |

### Return type

**ZhimaCreditPeZmgoSettleUnfreezeResponseModel**

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

