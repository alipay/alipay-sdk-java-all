# ZhimaCreditPayafteruseCreditagreementApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](ZhimaCreditPayafteruseCreditagreementApi.md#query) | **GET** /v3/zhima/credit/payafteruse/creditagreement/query | 查询服务开通/授权信息 |
| [**transfer**](ZhimaCreditPayafteruseCreditagreementApi.md#transfer) | **POST** /v3/zhima/credit/payafteruse/creditagreement/transfer | 芝麻信用服务授权 |


<a name="query"></a>
# **query**
> ZhimaCreditPayafteruseCreditagreementQueryResponseModel query(outAgreementNo, creditAgreementId)

查询服务开通/授权信息

使用商户外部协议号或开通/授权协议号，查询服务开通/授权信息。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaCreditPayafteruseCreditagreementApi;

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

    ZhimaCreditPayafteruseCreditagreementApi apiInstance = new ZhimaCreditPayafteruseCreditagreementApi(defaultClient);
    String outAgreementNo = "2014070700166653"; // String | 商户外部协议号
    String creditAgreementId = "ZMOP2020050722001440"; // String | 芝麻开通/授权协议号，out_agreement_no与credit_agreement_id必填一个，推荐使用credit_agreement_id。
    try {
      ZhimaCreditPayafteruseCreditagreementQueryResponseModel result = apiInstance.query(outAgreementNo, creditAgreementId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaCreditPayafteruseCreditagreementApi#query");
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
| **outAgreementNo** | **String**| 商户外部协议号 | [optional] |
| **creditAgreementId** | **String**| 芝麻开通/授权协议号，out_agreement_no与credit_agreement_id必填一个，推荐使用credit_agreement_id。 | [optional] |

### Return type

**ZhimaCreditPayafteruseCreditagreementQueryResponseModel**

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

<a name="transfer"></a>
# **transfer**
> ZhimaCreditPayafteruseCreditagreementTransferResponseModel transfer(zhimaCreditPayafteruseCreditagreementTransferModel)

芝麻信用服务授权

其他产品功能（例如信用代扣），通过该接口，可以转换为芝麻产品（芝麻先享产品，芝麻风险评估产品），完成信用服务授权

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaCreditPayafteruseCreditagreementApi;

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

    ZhimaCreditPayafteruseCreditagreementApi apiInstance = new ZhimaCreditPayafteruseCreditagreementApi(defaultClient);
    ZhimaCreditPayafteruseCreditagreementTransferModel zhimaCreditPayafteruseCreditagreementTransferModel = new ZhimaCreditPayafteruseCreditagreementTransferModel(); // ZhimaCreditPayafteruseCreditagreementTransferModel | 
    try {
      ZhimaCreditPayafteruseCreditagreementTransferResponseModel result = apiInstance.transfer(zhimaCreditPayafteruseCreditagreementTransferModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaCreditPayafteruseCreditagreementApi#transfer");
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
| **zhimaCreditPayafteruseCreditagreementTransferModel** | **ZhimaCreditPayafteruseCreditagreementTransferModel**|  | [optional] |

### Return type

**ZhimaCreditPayafteruseCreditagreementTransferResponseModel**

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

