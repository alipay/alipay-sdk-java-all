# AlipayTradeAdvanceApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**consult**](AlipayTradeAdvanceApi.md#consult) | **GET** /v3/alipay/trade/advance/consult | 订单咨询服务 |


<a name="consult"></a>
# **consult**
> AlipayTradeAdvanceConsultResponseModel consult(alipayUserId, consultScene, industryProductCode, subMerchantId, subMerchantType, agreementNo, estimatedOrderAmount, outTradeNo, needUserRiskPrediction, tradeDigest, userOutBindingPhone)

订单咨询服务

商户通过此接口咨询，当前用户是否满足垫资服务条件 或者 针对单笔订单的风险评估进行预咨询服务。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayTradeAdvanceApi;

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

    AlipayTradeAdvanceApi apiInstance = new AlipayTradeAdvanceApi(defaultClient);
    String alipayUserId = "2088302483540171"; // String | 支付宝用户 id，2088开头的16为数字。 除单笔订单风险预评估场景(即consult_scene指定ORDER_RISK_EVALUATION)外，其他场景必选。
    String consultScene = "ORDER_RISK_EVALUATION"; // String | 订单咨询类型，用以选择咨询的服务。不传时默认为垫资咨询，其他的场景需要按照对接的服务传入指定的值。 ORDER_RISK_EVALUATION：表示单笔订单风险预评估。
    String industryProductCode = "CAR_OWNERS_PARKINGPAY"; // String | 行业产品信息，咨询时会从该产品对应的销售方案中获取相关垫资规则配置。
    String subMerchantId = "2088102122458832"; // String | 子商户id
    String subMerchantType = "PARTNER"; // String | 子商户类型
    String agreementNo = "20170322450983769228"; // String | 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ） ，在进行单笔订单风险评估预咨询时必传。
    String estimatedOrderAmount = "9.00"; // String | 预估订单总金额，单位为元，精确到小数点后两位，单笔订单风险预评估时使用，取值范围[0.01,100000000]。
    String outTradeNo = "test20191100000001"; // String | 商户请求时的外部订单号，在花芝场景下非空。
    String needUserRiskPrediction = "true"; // String | 是否需要进行用户风险预测
    String tradeDigest = "{{\"parking_city\":\"太原市\",\"vehicle_number\":\"辽7666666\"}}"; // String | 交易信息摘要，需要进行用户风险预测时可传，用于结合场景的更加精细的预测。具体信息结构服务接入前咨询约定。
    String userOutBindingPhone = "1868888888888"; // String | 用户在外部域账号系统绑定的手机号，需要进行用户风险预测时必传，用于预测用户是否面临被二次放号的场景。使用时需要对请求加密，加密后请求在公网传输时为加密文本。详见：https://opendocs.alipay.com/open/common/104567；https://opendocs.alipay.com/isv/grefvl/getaes
    try {
      AlipayTradeAdvanceConsultResponseModel result = apiInstance.consult(alipayUserId, consultScene, industryProductCode, subMerchantId, subMerchantType, agreementNo, estimatedOrderAmount, outTradeNo, needUserRiskPrediction, tradeDigest, userOutBindingPhone);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayTradeAdvanceApi#consult");
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
| **alipayUserId** | **String**| 支付宝用户 id，2088开头的16为数字。 除单笔订单风险预评估场景(即consult_scene指定ORDER_RISK_EVALUATION)外，其他场景必选。 | [optional] |
| **consultScene** | **String**| 订单咨询类型，用以选择咨询的服务。不传时默认为垫资咨询，其他的场景需要按照对接的服务传入指定的值。 ORDER_RISK_EVALUATION：表示单笔订单风险预评估。 | [optional] |
| **industryProductCode** | **String**| 行业产品信息，咨询时会从该产品对应的销售方案中获取相关垫资规则配置。 | [optional] |
| **subMerchantId** | **String**| 子商户id | [optional] |
| **subMerchantType** | **String**| 子商户类型 | [optional] |
| **agreementNo** | **String**| 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ） ，在进行单笔订单风险评估预咨询时必传。 | [optional] |
| **estimatedOrderAmount** | **String**| 预估订单总金额，单位为元，精确到小数点后两位，单笔订单风险预评估时使用，取值范围[0.01,100000000]。 | [optional] |
| **outTradeNo** | **String**| 商户请求时的外部订单号，在花芝场景下非空。 | [optional] |
| **needUserRiskPrediction** | **String**| 是否需要进行用户风险预测 | [optional] |
| **tradeDigest** | **String**| 交易信息摘要，需要进行用户风险预测时可传，用于结合场景的更加精细的预测。具体信息结构服务接入前咨询约定。 | [optional] |
| **userOutBindingPhone** | **String**| 用户在外部域账号系统绑定的手机号，需要进行用户风险预测时必传，用于预测用户是否面临被二次放号的场景。使用时需要对请求加密，加密后请求在公网传输时为加密文本。详见：https://opendocs.alipay.com/open/common/104567；https://opendocs.alipay.com/isv/grefvl/getaes | [optional] |

### Return type

**AlipayTradeAdvanceConsultResponseModel**

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

