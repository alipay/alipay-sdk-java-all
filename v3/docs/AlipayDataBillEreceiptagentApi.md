# AlipayDataBillEreceiptagentApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apply**](AlipayDataBillEreceiptagentApi.md#apply) | **POST** /v3/alipay/data/bill/ereceiptagent/apply | ISV代理商户申请电子回单 |


<a name="apply"></a>
# **apply**
> AlipayDataBillEreceiptagentApplyResponseModel apply(alipayDataBillEreceiptagentApplyModel)

ISV代理商户申请电子回单

ISV代理商户，申请商户的资金业务回单。  电子签章申请分两个步骤： 1、使用alipay.data.bill.ereceiptagent.apply创建申请，并获取file_id信息。 2、等待一段时间后，使用file_id查询alipay.data.bill.ereceipt.query申请信息。单个申请建议每5分钟查询一次状态，汇总（日/月）回单建议20分钟查询一次。月初回单生成较慢，请耐心等待（汇总回单在月初申请需要等待几个小时） 注：申请成功，并不代表明细查询的流水一定存在。如果流水不存在，在查询时将会提示。 

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayDataBillEreceiptagentApi;

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

    AlipayDataBillEreceiptagentApi apiInstance = new AlipayDataBillEreceiptagentApi(defaultClient);
    AlipayDataBillEreceiptagentApplyModel alipayDataBillEreceiptagentApplyModel = new AlipayDataBillEreceiptagentApplyModel(); // AlipayDataBillEreceiptagentApplyModel | 
    try {
      AlipayDataBillEreceiptagentApplyResponseModel result = apiInstance.apply(alipayDataBillEreceiptagentApplyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayDataBillEreceiptagentApi#apply");
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
| **alipayDataBillEreceiptagentApplyModel** | **AlipayDataBillEreceiptagentApplyModel**|  | [optional] |

### Return type

**AlipayDataBillEreceiptagentApplyResponseModel**

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

