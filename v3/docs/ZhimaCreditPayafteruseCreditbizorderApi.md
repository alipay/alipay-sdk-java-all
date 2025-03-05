# ZhimaCreditPayafteruseCreditbizorderApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**finish**](ZhimaCreditPayafteruseCreditbizorderApi.md#finish) | **POST** /v3/zhima/credit/payafteruse/creditbizorder/finish | 结束信用服务订单 |
| [**order**](ZhimaCreditPayafteruseCreditbizorderApi.md#order) | **POST** /v3/zhima/credit/payafteruse/creditbizorder/order | 芝麻信用服务下单（免用户确认场景） |
| [**query**](ZhimaCreditPayafteruseCreditbizorderApi.md#query) | **GET** /v3/zhima/credit/payafteruse/creditbizorder/query | 信用服务订单查询 |


<a name="finish"></a>
# **finish**
> ZhimaCreditPayafteruseCreditbizorderFinishResponseModel finish(zhimaCreditPayafteruseCreditbizorderFinishModel)

结束信用服务订单

结束信用服务订单

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaCreditPayafteruseCreditbizorderApi;

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

    ZhimaCreditPayafteruseCreditbizorderApi apiInstance = new ZhimaCreditPayafteruseCreditbizorderApi(defaultClient);
    ZhimaCreditPayafteruseCreditbizorderFinishModel zhimaCreditPayafteruseCreditbizorderFinishModel = new ZhimaCreditPayafteruseCreditbizorderFinishModel(); // ZhimaCreditPayafteruseCreditbizorderFinishModel | 
    try {
      ZhimaCreditPayafteruseCreditbizorderFinishResponseModel result = apiInstance.finish(zhimaCreditPayafteruseCreditbizorderFinishModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaCreditPayafteruseCreditbizorderApi#finish");
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
| **zhimaCreditPayafteruseCreditbizorderFinishModel** | **ZhimaCreditPayafteruseCreditbizorderFinishModel**|  | [optional] |

### Return type

**ZhimaCreditPayafteruseCreditbizorderFinishResponseModel**

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

<a name="order"></a>
# **order**
> ZhimaCreditPayafteruseCreditbizorderOrderResponseModel order(zhimaCreditPayafteruseCreditbizorderOrderModel)

芝麻信用服务下单（免用户确认场景）

芝麻信用产品免密下单，不需要唤起支付宝APP，通过服务端调用完成下单。 涉及芝麻信用服务产品、芝麻风险评估产品

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaCreditPayafteruseCreditbizorderApi;

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

    ZhimaCreditPayafteruseCreditbizorderApi apiInstance = new ZhimaCreditPayafteruseCreditbizorderApi(defaultClient);
    ZhimaCreditPayafteruseCreditbizorderOrderModel zhimaCreditPayafteruseCreditbizorderOrderModel = new ZhimaCreditPayafteruseCreditbizorderOrderModel(); // ZhimaCreditPayafteruseCreditbizorderOrderModel | 
    try {
      ZhimaCreditPayafteruseCreditbizorderOrderResponseModel result = apiInstance.order(zhimaCreditPayafteruseCreditbizorderOrderModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaCreditPayafteruseCreditbizorderApi#order");
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
| **zhimaCreditPayafteruseCreditbizorderOrderModel** | **ZhimaCreditPayafteruseCreditbizorderOrderModel**|  | [optional] |

### Return type

**ZhimaCreditPayafteruseCreditbizorderOrderResponseModel**

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
> ZhimaCreditPayafteruseCreditbizorderQueryResponseModel query(creditBizOrderId, outOrderNo)

信用服务订单查询

信用服务订单查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaCreditPayafteruseCreditbizorderApi;

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

    ZhimaCreditPayafteruseCreditbizorderApi apiInstance = new ZhimaCreditPayafteruseCreditbizorderApi(defaultClient);
    String creditBizOrderId = "ZMCB20201021200102012"; // String | 信用服务订单号，out_order_no与credit_biz_order_id至少传一个
    String outOrderNo = "20202010212001384"; // String | 商户外部单号，out_order_no与credit_biz_order_id至少传一个
    try {
      ZhimaCreditPayafteruseCreditbizorderQueryResponseModel result = apiInstance.query(creditBizOrderId, outOrderNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaCreditPayafteruseCreditbizorderApi#query");
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
| **creditBizOrderId** | **String**| 信用服务订单号，out_order_no与credit_biz_order_id至少传一个 | [optional] |
| **outOrderNo** | **String**| 商户外部单号，out_order_no与credit_biz_order_id至少传一个 | [optional] |

### Return type

**ZhimaCreditPayafteruseCreditbizorderQueryResponseModel**

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

