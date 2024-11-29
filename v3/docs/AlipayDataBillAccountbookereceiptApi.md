# AlipayDataBillAccountbookereceiptApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apply**](AlipayDataBillAccountbookereceiptApi.md#apply) | **POST** /v3/alipay/data/bill/accountbookereceipt/apply | 申请子账本电子回单(incubating) |
| [**query**](AlipayDataBillAccountbookereceiptApi.md#query) | **GET** /v3/alipay/data/bill/accountbookereceipt/query | 查询子账本电子回单状态(incubating) |


<a name="apply"></a>
# **apply**
> AlipayDataBillAccountbookereceiptApplyResponseModel apply(alipayDataBillAccountbookereceiptApplyModel)

申请子账本电子回单(incubating)

申请子账本电子回单（子账本业务定制接口）

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayDataBillAccountbookereceiptApi;

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

    AlipayDataBillAccountbookereceiptApi apiInstance = new AlipayDataBillAccountbookereceiptApi(defaultClient);
    AlipayDataBillAccountbookereceiptApplyModel alipayDataBillAccountbookereceiptApplyModel = new AlipayDataBillAccountbookereceiptApplyModel(); // AlipayDataBillAccountbookereceiptApplyModel | 
    try {
      AlipayDataBillAccountbookereceiptApplyResponseModel result = apiInstance.apply(alipayDataBillAccountbookereceiptApplyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayDataBillAccountbookereceiptApi#apply");
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
| **alipayDataBillAccountbookereceiptApplyModel** | **AlipayDataBillAccountbookereceiptApplyModel**|  | [optional] |

### Return type

**AlipayDataBillAccountbookereceiptApplyResponseModel**

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
> AlipayDataBillAccountbookereceiptQueryResponseModel query(fileId, agreementNo, agreementType)

查询子账本电子回单状态(incubating)

电子签章申请分两个步骤： 1、使用alipay.data.bill.ereceipt.apply创建申请，并获取file_id信息。 2、等待一段时间后，使用file_id查询alipay.data.bill.ereceipt.query申请信息。 单个申请建议每5分钟查询一次状态。汇总回单建议30分钟查询一次

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayDataBillAccountbookereceiptApi;

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

    AlipayDataBillAccountbookereceiptApi apiInstance = new AlipayDataBillAccountbookereceiptApi(defaultClient);
    String fileId = "12345"; // String | 根据申请id查询状态。申请接口可以参考alipay.data.bill.ereceiptagent.apply
    String agreementNo = "20205215001418078112"; // String | 协议号，根据不同业务协议类型，传入对应类型的协议号，用于isv授权检查并获取商户信息。如果业务类型未指定，则使用默认类型对应的协议号。
    String agreementType = "FUND_SAFT_SIGN_WITHHOLDING_P"; // String | 根据不同业务协议类型，传入不同参数。传入协议产品码（personal_product_code，通过协议查询接口、协议签约通知响应参数获取），不填的话默认按照示例值传入
    try {
      AlipayDataBillAccountbookereceiptQueryResponseModel result = apiInstance.query(fileId, agreementNo, agreementType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayDataBillAccountbookereceiptApi#query");
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
| **fileId** | **String**| 根据申请id查询状态。申请接口可以参考alipay.data.bill.ereceiptagent.apply | [optional] |
| **agreementNo** | **String**| 协议号，根据不同业务协议类型，传入对应类型的协议号，用于isv授权检查并获取商户信息。如果业务类型未指定，则使用默认类型对应的协议号。 | [optional] |
| **agreementType** | **String**| 根据不同业务协议类型，传入不同参数。传入协议产品码（personal_product_code，通过协议查询接口、协议签约通知响应参数获取），不填的话默认按照示例值传入 | [optional] |

### Return type

**AlipayDataBillAccountbookereceiptQueryResponseModel**

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

