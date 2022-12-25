# AlipayDataBillEreceiptApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apply**](AlipayDataBillEreceiptApi.md#apply) | **POST** /v3/alipay/data/bill/ereceipt/apply | 申请电子回单(incubating) |
| [**query**](AlipayDataBillEreceiptApi.md#query) | **GET** /v3/alipay/data/bill/ereceipt/query | 查询电子回单状态(incubating) |


<a name="apply"></a>
# **apply**
> AlipayDataBillEreceiptApplyResponseModel apply(alipayDataBillEreceiptApplyModel)

申请电子回单(incubating)

支持商家下载多种类型支付宝资金凭证。包括：余额收支证明、余额收支流水证明、转入转出收支证明、收支汇总证明（日汇总）以及收支汇总证明（月汇总）。  账单凭证申请分两个步骤：  1、使用alipay.data.bill.ereceipt.apply创建申请，并获取file_id信息。  2、使用file_id查询alipay.data.bill.ereceipt.query获取回单信息，回单生成完毕将会返回对应的下载链接，下载链接时效为30秒，过期将无法下载，需重新调用alipay.data.bill.ereceipt.query获取新的下载链接。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayDataBillEreceiptApi;

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

    AlipayDataBillEreceiptApi apiInstance = new AlipayDataBillEreceiptApi(defaultClient);
    AlipayDataBillEreceiptApplyModel alipayDataBillEreceiptApplyModel = new AlipayDataBillEreceiptApplyModel(); // AlipayDataBillEreceiptApplyModel | 
    try {
      AlipayDataBillEreceiptApplyResponseModel result = apiInstance.apply(alipayDataBillEreceiptApplyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayDataBillEreceiptApi#apply");
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
| **alipayDataBillEreceiptApplyModel** | **AlipayDataBillEreceiptApplyModel**|  | [optional] |

### Return type

**AlipayDataBillEreceiptApplyResponseModel**

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
> AlipayDataBillEreceiptQueryResponseModel query(fileId)

查询电子回单状态(incubating)

电子签章申请分两个步骤：  1、使用alipay.data.bill.ereceipt.apply创建申请，并获取file_id信息。 2、等待一段时间后，使用file_id查询alipay.data.bill.ereceipt.query申请信息。  单个申请建议每5分钟查询一次状态。批量回单建议20分钟查询一次。汇总回单建议30分钟查询一次

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayDataBillEreceiptApi;

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

    AlipayDataBillEreceiptApi apiInstance = new AlipayDataBillEreceiptApi(defaultClient);
    String fileId = "12345"; // String | 根据申请id查询状态。通过 <a href=\"https://opendocs.alipay.com/apis/api_15/alipay.data.bill.ereceipt.apply\">alipay.data.bill.ereceipt.apply(申请电子回单(incubating))</a> 接口同步响应获取。
    try {
      AlipayDataBillEreceiptQueryResponseModel result = apiInstance.query(fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayDataBillEreceiptApi#query");
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
| **fileId** | **String**| 根据申请id查询状态。通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_15/alipay.data.bill.ereceipt.apply\&quot;&gt;alipay.data.bill.ereceipt.apply(申请电子回单(incubating))&lt;/a&gt; 接口同步响应获取。 | [optional] |

### Return type

**AlipayDataBillEreceiptQueryResponseModel**

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

