# AlipayTradeApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancel**](AlipayTradeApi.md#cancel) | **POST** /v3/alipay/trade/cancel | 统一收单交易撤销接口 |
| [**close**](AlipayTradeApi.md#close) | **POST** /v3/alipay/trade/close | 统一收单交易关闭接口 |
| [**create**](AlipayTradeApi.md#create) | **POST** /v3/alipay/trade/create | 统一收单交易创建接口 |
| [**pay**](AlipayTradeApi.md#pay) | **POST** /v3/alipay/trade/pay | 统一收单交易支付接口 |
| [**precreate**](AlipayTradeApi.md#precreate) | **POST** /v3/alipay/trade/precreate | 统一收单线下交易预创建 |
| [**query**](AlipayTradeApi.md#query) | **GET** /v3/alipay/trade/query | 统一收单交易查询 |
| [**refund**](AlipayTradeApi.md#refund) | **POST** /v3/alipay/trade/refund | 统一收单交易退款接口 |


<a name="cancel"></a>
# **cancel**
> AlipayTradeCancelResponseModel cancel(alipayTradeCancelModel)

统一收单交易撤销接口

支付交易返回失败或支付系统超时，调用该接口撤销交易。如果此订单用户支付失败，支付宝系统会将此订单关闭；如果用户支付成功，支付宝系统会将此订单资金退还给用户。  注意：只有发生支付系统超时或者支付结果未知时可调用撤销，其他正常支付的单如需实现相同功能请调用申请退款API。提交支付交易后调用【查询订单API】，没有明确的支付结果再调用【撤销订单API】。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeApi;

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

    AlipayTradeApi apiInstance = new AlipayTradeApi(defaultClient);
    AlipayTradeCancelModel alipayTradeCancelModel = new AlipayTradeCancelModel(); // AlipayTradeCancelModel | 
    try {
      AlipayTradeCancelResponseModel result = apiInstance.cancel(alipayTradeCancelModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeApi#cancel");
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
| **alipayTradeCancelModel** | **AlipayTradeCancelModel**|  | [optional] |

### Return type

**AlipayTradeCancelResponseModel**

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

<a name="close"></a>
# **close**
> AlipayTradeCloseResponseModel close(alipayTradeCloseModel)

统一收单交易关闭接口

用于交易创建后，用户在一定时间内未进行支付，可调用该接口直接将未付款的交易进行关闭。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeApi;

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

    AlipayTradeApi apiInstance = new AlipayTradeApi(defaultClient);
    AlipayTradeCloseModel alipayTradeCloseModel = new AlipayTradeCloseModel(); // AlipayTradeCloseModel | 
    try {
      AlipayTradeCloseResponseModel result = apiInstance.close(alipayTradeCloseModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeApi#close");
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
| **alipayTradeCloseModel** | **AlipayTradeCloseModel**|  | [optional] |

### Return type

**AlipayTradeCloseResponseModel**

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

<a name="create"></a>
# **create**
> AlipayTradeCreateResponseModel create(alipayTradeCreateModel)

统一收单交易创建接口

商户通过该接口进行交易的创建下单

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeApi;

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

    AlipayTradeApi apiInstance = new AlipayTradeApi(defaultClient);
    AlipayTradeCreateModel alipayTradeCreateModel = new AlipayTradeCreateModel(); // AlipayTradeCreateModel | 
    try {
      AlipayTradeCreateResponseModel result = apiInstance.create(alipayTradeCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeApi#create");
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
| **alipayTradeCreateModel** | **AlipayTradeCreateModel**|  | [optional] |

### Return type

**AlipayTradeCreateResponseModel**

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

<a name="pay"></a>
# **pay**
> AlipayTradePayResponseModel pay(alipayTradePayModel)

统一收单交易支付接口

收银员使用扫码设备读取用户手机支付宝“付款码”获取设备（如扫码枪）读取用户手机支付宝的付款码信息后，将二维码或条码信息通过本接口上送至支付宝发起支付。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeApi;

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

    AlipayTradeApi apiInstance = new AlipayTradeApi(defaultClient);
    AlipayTradePayModel alipayTradePayModel = new AlipayTradePayModel(); // AlipayTradePayModel | 
    try {
      AlipayTradePayResponseModel result = apiInstance.pay(alipayTradePayModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeApi#pay");
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
| **alipayTradePayModel** | **AlipayTradePayModel**|  | [optional] |

### Return type

**AlipayTradePayResponseModel**

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

<a name="precreate"></a>
# **precreate**
> AlipayTradePrecreateResponseModel precreate(alipayTradePrecreateModel)

统一收单线下交易预创建

收银员通过收银台或商户后台调用支付宝接口，生成二维码后，展示给用户，由用户扫描二维码完成订单支付。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeApi;

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

    AlipayTradeApi apiInstance = new AlipayTradeApi(defaultClient);
    AlipayTradePrecreateModel alipayTradePrecreateModel = new AlipayTradePrecreateModel(); // AlipayTradePrecreateModel | 
    try {
      AlipayTradePrecreateResponseModel result = apiInstance.precreate(alipayTradePrecreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeApi#precreate");
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
| **alipayTradePrecreateModel** | **AlipayTradePrecreateModel**|  | [optional] |

### Return type

**AlipayTradePrecreateResponseModel**

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
> AlipayTradeQueryResponseModel query(outTradeNo, tradeNo, orgPid, queryOptions)

统一收单交易查询

该接口提供所有支付宝支付订单的查询，商户可以通过该接口主动查询订单状态，完成下一步的业务逻辑。  需要调用查询接口的情况：  当商户后台、网络、服务器等出现异常，商户系统最终未接收到支付通知；  调用支付接口后，返回系统错误或未知交易状态情况；  调用alipay.trade.pay，返回INPROCESS的状态；  调用alipay.trade.cancel之前，需确认支付状态；

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeApi;

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

    AlipayTradeApi apiInstance = new AlipayTradeApi(defaultClient);
    String outTradeNo = "20150320010101001"; // String | 订单支付时传入的商户订单号,和支付宝交易号不能同时为空。  trade_no,out_trade_no如果同时存在优先取trade_no
    String tradeNo = "2014112611001004680 073956707"; // String | 支付宝交易号，和商户订单号不能同时为空
    String orgPid = "2088101117952222"; // String | 银行间联模式下有用，其它场景请不要使用；  双联通过该参数指定需要查询的交易所属收单机构的pid;
    List<String> queryOptions = Arrays.asList(); // List<String> | 查询选项，商户传入该参数可定制本接口同步响应额外返回的信息字段，数组格式。支持枚举如下：trade_settle_info：返回的交易结算信息，包含分账、补差等信息； fund_bill_list：交易支付使用的资金渠道； voucher_detail_list：交易支付时使用的所有优惠券信息； discount_goods_detail：交易支付所使用的单品券优惠的商品优惠信息； mdiscount_amount：商家优惠金额；
    try {
      AlipayTradeQueryResponseModel result = apiInstance.query(outTradeNo, tradeNo, orgPid, queryOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeApi#query");
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
| **outTradeNo** | **String**| 订单支付时传入的商户订单号,和支付宝交易号不能同时为空。  trade_no,out_trade_no如果同时存在优先取trade_no | [optional] |
| **tradeNo** | **String**| 支付宝交易号，和商户订单号不能同时为空 | [optional] |
| **orgPid** | **String**| 银行间联模式下有用，其它场景请不要使用；  双联通过该参数指定需要查询的交易所属收单机构的pid; | [optional] |
| **queryOptions** | **List&lt;String&gt;**| 查询选项，商户传入该参数可定制本接口同步响应额外返回的信息字段，数组格式。支持枚举如下：trade_settle_info：返回的交易结算信息，包含分账、补差等信息； fund_bill_list：交易支付使用的资金渠道； voucher_detail_list：交易支付时使用的所有优惠券信息； discount_goods_detail：交易支付所使用的单品券优惠的商品优惠信息； mdiscount_amount：商家优惠金额； | [optional] |

### Return type

**AlipayTradeQueryResponseModel**

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

<a name="refund"></a>
# **refund**
> AlipayTradeRefundResponseModel refund(alipayTradeRefundModel)

统一收单交易退款接口

当交易发生之后一段时间内，由于买家或者卖家的原因需要退款时，卖家可以通过退款接口将支付款退还给买家，支付宝将在收到退款请求并且验证成功之后，按照退款规则将支付款按原路退到买家帐号上。 交易超过约定时间（签约时设置的可退款时间）的订单无法进行退款。  支付宝退款支持单笔交易分多次退款，多次退款需要提交原支付订单的订单号和设置不同的退款请求号。一笔退款失败后重新提交，要保证重试时退款请求号不能变更，防止该笔交易重复退款。  同一笔交易累计提交的退款金额不能超过原始交易总金额。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeApi;

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

    AlipayTradeApi apiInstance = new AlipayTradeApi(defaultClient);
    AlipayTradeRefundModel alipayTradeRefundModel = new AlipayTradeRefundModel(); // AlipayTradeRefundModel | 
    try {
      AlipayTradeRefundResponseModel result = apiInstance.refund(alipayTradeRefundModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeApi#refund");
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
| **alipayTradeRefundModel** | **AlipayTradeRefundModel**|  | [optional] |

### Return type

**AlipayTradeRefundResponseModel**

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

