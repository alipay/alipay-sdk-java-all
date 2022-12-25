# AlipayFundTransUniApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**transfer**](AlipayFundTransUniApi.md#transfer) | **POST** /v3/alipay/fund/trans/uni/transfer | 单笔转账接口 |


<a name="transfer"></a>
# **transfer**
> AlipayFundTransUniTransferResponseModel transfer(alipayFundTransUniTransferModel)

单笔转账接口

单笔转账接口是基于支付宝的资金处理能力，为了满足支付宝商家的转账需求，针对有部分开发能力的商家，提供通过API接口完成企业自身支付宝账户到支付宝账户的转账功能。 适用于：C2C现金红包的红包领取、B2C现金红包的红包发放、B2C单笔转账到支付宝账户等。&lt;br /&gt; &lt;b&gt;说明：本接口为公用接口，参数说明不针对特定产品。&lt;/b&gt;不同产品入参请参考对应产品文档。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundTransUniApi;

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

    AlipayFundTransUniApi apiInstance = new AlipayFundTransUniApi(defaultClient);
    AlipayFundTransUniTransferModel alipayFundTransUniTransferModel = new AlipayFundTransUniTransferModel(); // AlipayFundTransUniTransferModel | 
    try {
      AlipayFundTransUniTransferResponseModel result = apiInstance.transfer(alipayFundTransUniTransferModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundTransUniApi#transfer");
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
| **alipayFundTransUniTransferModel** | **AlipayFundTransUniTransferModel**|  | [optional] |

### Return type

**AlipayFundTransUniTransferResponseModel**

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

