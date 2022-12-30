# AlipayFundJointaccountBillApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayFundJointaccountBillApi.md#query) | **GET** /v3/alipay/fund/jointaccount/bill/query | 因公付账单查询 |


<a name="query"></a>
# **query**
> AlipayFundJointaccountBillQueryResponseModel query(productCode, bizScene, accountId, pageNum, pageSize, userId, openId, startDate, endDate, agreementNo)

因公付账单查询

因公付账单查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundJointaccountBillApi;

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

    AlipayFundJointaccountBillApi apiInstance = new AlipayFundJointaccountBillApi(defaultClient);
    String productCode = "ENTERPRISE_PAY"; // String | 因公付产品码
    String bizScene = "DEFAULT"; // String | 业务场景
    String accountId = "2088900976746215"; // String | 账户ID
    String pageNum = "1"; // String | 采用分页查询，本参数为空或0默认显示第一页。如果输入的值大于总页数，则支付宝返回最后一页数据
    String pageSize = "1"; // String | 每页大小，不传的情况下默认20条，超过20条默认按20条查询；不足20条则按实际记录数返回
    String userId = "2088900976746215"; // String | 员工ID
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 员工的openId
    String startDate = "yyyy-MM-dd"; // String | 起始日期
    String endDate = "yyyy-MM-dd"; // String | 截止日期
    String agreementNo = "2088900976746215123123"; // String | 授权协议号
    try {
      AlipayFundJointaccountBillQueryResponseModel result = apiInstance.query(productCode, bizScene, accountId, pageNum, pageSize, userId, openId, startDate, endDate, agreementNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundJointaccountBillApi#query");
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
| **productCode** | **String**| 因公付产品码 | [optional] |
| **bizScene** | **String**| 业务场景 | [optional] |
| **accountId** | **String**| 账户ID | [optional] |
| **pageNum** | **String**| 采用分页查询，本参数为空或0默认显示第一页。如果输入的值大于总页数，则支付宝返回最后一页数据 | [optional] |
| **pageSize** | **String**| 每页大小，不传的情况下默认20条，超过20条默认按20条查询；不足20条则按实际记录数返回 | [optional] |
| **userId** | **String**| 员工ID | [optional] |
| **openId** | **String**| 员工的openId | [optional] |
| **startDate** | **String**| 起始日期 | [optional] |
| **endDate** | **String**| 截止日期 | [optional] |
| **agreementNo** | **String**| 授权协议号 | [optional] |

### Return type

**AlipayFundJointaccountBillQueryResponseModel**

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

