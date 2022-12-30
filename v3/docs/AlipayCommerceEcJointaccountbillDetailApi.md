# AlipayCommerceEcJointaccountbillDetailApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayCommerceEcJointaccountbillDetailApi.md#batchquery) | **GET** /v3/alipay/commerce/ec/jointaccountbill/detail/batchquery | 企业账单批量分页查询 |


<a name="batchquery"></a>
# **batchquery**
> AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel batchquery(enterpriseId, bizScene, userId, openId, pageNum, pageSize, startDate, endDate)

企业账单批量分页查询

分页查询企业账单

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcJointaccountbillDetailApi;

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

    AlipayCommerceEcJointaccountbillDetailApi apiInstance = new AlipayCommerceEcJointaccountbillDetailApi(defaultClient);
    String enterpriseId = "2088123456789000"; // String | 企业ID
    String bizScene = "ISV_DEFAULT"; // String | 业务场景。不传默认为ISV_DEFAULT
    String userId = "2088123456789000"; // String | 员工支付宝UID
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 员工支付宝UID
    String pageNum = "1"; // String | 页数。本参数为空或小于1默认显示第一页；如果输入的值大于总页数，则返回最后一页数据。
    String pageSize = "20"; // String | 每页大小。本参数为空或小于1默认20条；超过20条默认按20条查询；不足20条则按实际记录数返回。
    String startDate = "yyyy-MM-dd HH:mm:ss"; // String | 起始日期。支持yyyy-MM-dd和yyyy-MM-dd HH:mm:ss两种格式
    String endDate = "yyyy-MM-dd HH:mm:ss"; // String | 截止日期。支持yyyy-MM-dd和yyyy-MM-dd HH:mm:ss两种格式
    try {
      AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel result = apiInstance.batchquery(enterpriseId, bizScene, userId, openId, pageNum, pageSize, startDate, endDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcJointaccountbillDetailApi#batchquery");
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
| **enterpriseId** | **String**| 企业ID | [optional] |
| **bizScene** | **String**| 业务场景。不传默认为ISV_DEFAULT | [optional] |
| **userId** | **String**| 员工支付宝UID | [optional] |
| **openId** | **String**| 员工支付宝UID | [optional] |
| **pageNum** | **String**| 页数。本参数为空或小于1默认显示第一页；如果输入的值大于总页数，则返回最后一页数据。 | [optional] |
| **pageSize** | **String**| 每页大小。本参数为空或小于1默认20条；超过20条默认按20条查询；不足20条则按实际记录数返回。 | [optional] |
| **startDate** | **String**| 起始日期。支持yyyy-MM-dd和yyyy-MM-dd HH:mm:ss两种格式 | [optional] |
| **endDate** | **String**| 截止日期。支持yyyy-MM-dd和yyyy-MM-dd HH:mm:ss两种格式 | [optional] |

### Return type

**AlipayCommerceEcJointaccountbillDetailBatchqueryResponseModel**

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

