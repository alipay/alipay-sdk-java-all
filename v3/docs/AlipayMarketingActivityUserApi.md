# AlipayMarketingActivityUserApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchqueryvoucher**](AlipayMarketingActivityUserApi.md#batchqueryvoucher) | **GET** /v3/alipay/marketing/activity/ordervoucher/user/batchqueryvoucher | 条件查询用户券 |
| [**queryvoucher**](AlipayMarketingActivityUserApi.md#queryvoucher) | **GET** /v3/alipay/marketing/activity/ordervoucher/user/voucher | 查询用户券详情 |


<a name="batchqueryvoucher"></a>
# **batchqueryvoucher**
> AlipayMarketingActivityUserBatchqueryvoucherResponseModel batchqueryvoucher(authToken, userId, openId, activityId, belongMerchantId, senderMerchantId, voucherStatus, pageNum, merchantAccessMode, pageSize)

条件查询用户券

可通过该接口查询用户在某商户可用的全部券，可用于商户的小程序/H5中，用户\&quot;我的优惠券\&quot;或\&quot;提交订单页\&quot;展示优惠信息。只能查询商户配的券，无法查询平台优惠券。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityUserApi;

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

    AlipayMarketingActivityUserApi apiInstance = new AlipayMarketingActivityUserApi(defaultClient);
    String authToken = "authToken_example"; // String | 用户授权令牌
    String userId = "2088512417841101"; // String | 支付宝用户 id
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 支付宝用户openId
    String activityId = "2016042700826004508401111111"; // String | 活动 id
    String belongMerchantId = "2088202967380463"; // String | 券归属商户
    String senderMerchantId = "2088102161342862"; // String | 券发放商户
    String voucherStatus = "SENDED"; // String | 券状态，其中已过期状态可查询6个月内的数据
    Integer pageNum = 1; // Integer | 分页查询页码
    String merchantAccessMode = "AGENCY_MODE"; // String | 商户接入模式
    Integer pageSize = 20; // Integer | 分页查询单页数据条数
    try {
      AlipayMarketingActivityUserBatchqueryvoucherResponseModel result = apiInstance.batchqueryvoucher(authToken, userId, openId, activityId, belongMerchantId, senderMerchantId, voucherStatus, pageNum, merchantAccessMode, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityUserApi#batchqueryvoucher");
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
| **authToken** | **String**| 用户授权令牌 | [optional] |
| **userId** | **String**| 支付宝用户 id | [optional] |
| **openId** | **String**| 支付宝用户openId | [optional] |
| **activityId** | **String**| 活动 id | [optional] |
| **belongMerchantId** | **String**| 券归属商户 | [optional] |
| **senderMerchantId** | **String**| 券发放商户 | [optional] |
| **voucherStatus** | **String**| 券状态，其中已过期状态可查询6个月内的数据 | [optional] |
| **pageNum** | **Integer**| 分页查询页码 | [optional] |
| **merchantAccessMode** | **String**| 商户接入模式 | [optional] |
| **pageSize** | **Integer**| 分页查询单页数据条数 | [optional] |

### Return type

**AlipayMarketingActivityUserBatchqueryvoucherResponseModel**

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

<a name="queryvoucher"></a>
# **queryvoucher**
> AlipayMarketingActivityUserQueryvoucherResponseModel queryvoucher(merchantId, userId, openId, activityId, voucherId, voucherCode, merchantAccessMode)

查询用户券详情

通过此接口可以查询用户券信息，包括用户券的基础信息、状态。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityUserApi;

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

    AlipayMarketingActivityUserApi apiInstance = new AlipayMarketingActivityUserApi(defaultClient);
    String merchantId = "2088202967380463"; // String | 商户 PID，默认为当前接口调用商户。
    String userId = "2088512417841101"; // String | 支付宝用户id
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 支付宝用户openId
    String activityId = "2016042700826004508401111111"; // String | 活动 id。
    String voucherId = "2021072900073002214009F8QHR3"; // String | 用户券 id。支付宝为用户优惠券唯一分配的 id。
    String voucherCode = "ABE44"; // String | 用户领取的商家券券码。
    String merchantAccessMode = "AGENCY_MODE"; // String | 商户接入模式。
    try {
      AlipayMarketingActivityUserQueryvoucherResponseModel result = apiInstance.queryvoucher(merchantId, userId, openId, activityId, voucherId, voucherCode, merchantAccessMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityUserApi#queryvoucher");
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
| **merchantId** | **String**| 商户 PID，默认为当前接口调用商户。 | [optional] |
| **userId** | **String**| 支付宝用户id | [optional] |
| **openId** | **String**| 支付宝用户openId | [optional] |
| **activityId** | **String**| 活动 id。 | [optional] |
| **voucherId** | **String**| 用户券 id。支付宝为用户优惠券唯一分配的 id。 | [optional] |
| **voucherCode** | **String**| 用户领取的商家券券码。 | [optional] |
| **merchantAccessMode** | **String**| 商户接入模式。 | [optional] |

### Return type

**AlipayMarketingActivityUserQueryvoucherResponseModel**

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

