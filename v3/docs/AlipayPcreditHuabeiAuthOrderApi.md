# AlipayPcreditHuabeiAuthOrderApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayPcreditHuabeiAuthOrderApi.md#query) | **GET** /v3/alipay/pcredit/huabei/auth/order/query | 花呗先享订单查询接口 |
| [**unfreeze**](AlipayPcreditHuabeiAuthOrderApi.md#unfreeze) | **PUT** /v3/alipay/pcredit/huabei/auth/order/unfreeze | 花呗先享解冻或解约接口 |


<a name="query"></a>
# **query**
> AlipayPcreditHuabeiAuthOrderQueryResponseModel query(authOptId, alipayUserId, openId, outRequestNo)

花呗先享订单查询接口

查询花呗先享冻结、解冻订单内容及状态。有3种查询方式。推荐商户优先使用auth_opt_id查询；其次是按照(alipay_user_id,out_request_no)组合方式查询；最后是单独通过out_request_no方式查询。  注意：最后一种方式，仅支持2019年2月15日开始的订单。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayPcreditHuabeiAuthOrderApi;

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

    AlipayPcreditHuabeiAuthOrderApi apiInstance = new AlipayPcreditHuabeiAuthOrderApi(defaultClient);
    String authOptId = "2018081010020817070009689955"; // String | 支付宝侧花呗冻结、解冻操作单据id。在原先的冻结或者解冻接口调用中同步返回给商户，或者通过商户通知返回给商户。按订单号查询时，此字段不可为空。
    String alipayUserId = "2088101117955611"; // String | 买家在支付宝的用户id。通过userid+请求流水号组合查询时，此字段不可为空。
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 买家在支付宝的用户id
    String outRequestNo = "8077735255938032"; // String | 商户原先调用冻结、解冻接口传入的请求流水号。按照流水号查询订单时，此字段不能为空。
    try {
      AlipayPcreditHuabeiAuthOrderQueryResponseModel result = apiInstance.query(authOptId, alipayUserId, openId, outRequestNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayPcreditHuabeiAuthOrderApi#query");
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
| **authOptId** | **String**| 支付宝侧花呗冻结、解冻操作单据id。在原先的冻结或者解冻接口调用中同步返回给商户，或者通过商户通知返回给商户。按订单号查询时，此字段不可为空。 | [optional] |
| **alipayUserId** | **String**| 买家在支付宝的用户id。通过userid+请求流水号组合查询时，此字段不可为空。 | [optional] |
| **openId** | **String**| 买家在支付宝的用户id | [optional] |
| **outRequestNo** | **String**| 商户原先调用冻结、解冻接口传入的请求流水号。按照流水号查询订单时，此字段不能为空。 | [optional] |

### Return type

**AlipayPcreditHuabeiAuthOrderQueryResponseModel**

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

<a name="unfreeze"></a>
# **unfreeze**
> AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel unfreeze(alipayPcreditHuabeiAuthOrderUnfreezeModel)

花呗先享解冻或解约接口

用户已经开通花呗先享协议后，商户通过此接口解冻用户资金池金额，也可以解冻并解约。  如果是解约操作，则要求传入的解冻金额必须等于用户资金池余额。  注意：商户在发起解约前，请务必保证已经结算过用户会员费，一旦解约后，无法发起结算用户会员费操作。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayPcreditHuabeiAuthOrderApi;

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

    AlipayPcreditHuabeiAuthOrderApi apiInstance = new AlipayPcreditHuabeiAuthOrderApi(defaultClient);
    AlipayPcreditHuabeiAuthOrderUnfreezeModel alipayPcreditHuabeiAuthOrderUnfreezeModel = new AlipayPcreditHuabeiAuthOrderUnfreezeModel(); // AlipayPcreditHuabeiAuthOrderUnfreezeModel | 
    try {
      AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel result = apiInstance.unfreeze(alipayPcreditHuabeiAuthOrderUnfreezeModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayPcreditHuabeiAuthOrderApi#unfreeze");
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
| **alipayPcreditHuabeiAuthOrderUnfreezeModel** | **AlipayPcreditHuabeiAuthOrderUnfreezeModel**|  | [optional] |

### Return type

**AlipayPcreditHuabeiAuthOrderUnfreezeResponseModel**

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

