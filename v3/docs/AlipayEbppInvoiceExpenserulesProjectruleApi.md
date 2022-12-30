# AlipayEbppInvoiceExpenserulesProjectruleApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayEbppInvoiceExpenserulesProjectruleApi.md#create) | **POST** /v3/alipay/ebpp/invoice/expenserules/projectrule/create | 创建项目费控规则 |
| [**query**](AlipayEbppInvoiceExpenserulesProjectruleApi.md#query) | **GET** /v3/alipay/ebpp/invoice/expenserules/projectrule/query | 查询项目费控规则 |


<a name="create"></a>
# **create**
> AlipayEbppInvoiceExpenserulesProjectruleCreateResponseModel create(alipayEbppInvoiceExpenserulesProjectruleCreateModel)

创建项目费控规则

创建项目费控规则

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceExpenserulesProjectruleApi;

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

    AlipayEbppInvoiceExpenserulesProjectruleApi apiInstance = new AlipayEbppInvoiceExpenserulesProjectruleApi(defaultClient);
    AlipayEbppInvoiceExpenserulesProjectruleCreateModel alipayEbppInvoiceExpenserulesProjectruleCreateModel = new AlipayEbppInvoiceExpenserulesProjectruleCreateModel(); // AlipayEbppInvoiceExpenserulesProjectruleCreateModel | 
    try {
      AlipayEbppInvoiceExpenserulesProjectruleCreateResponseModel result = apiInstance.create(alipayEbppInvoiceExpenserulesProjectruleCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceExpenserulesProjectruleApi#create");
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
| **alipayEbppInvoiceExpenserulesProjectruleCreateModel** | **AlipayEbppInvoiceExpenserulesProjectruleCreateModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceExpenserulesProjectruleCreateResponseModel**

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
> AlipayEbppInvoiceExpenserulesProjectruleQueryResponseModel query(accountId, agreementNo, projectId, employeeId, employeeOpenId, pageNum, pageSize)

查询项目费控规则

查询项目费控规则

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceExpenserulesProjectruleApi;

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

    AlipayEbppInvoiceExpenserulesProjectruleApi apiInstance = new AlipayEbppInvoiceExpenserulesProjectruleApi(defaultClient);
    String accountId = "2088000194958956"; // String | 共同账号ID
    String agreementNo = "20215425001112341234"; // String | 授权签约协议号
    String projectId = "2021063000152700000000000000"; // String | 项目id（可空）
    String employeeId = "2088123412341234"; // String | 员工UID（可空）
    String employeeOpenId = "abcdxxxx"; // String | 切换open_id后请使用：员工open_id（可空）
    Integer pageNum = 1; // Integer | 页数
    Integer pageSize = 20; // Integer | 页大小
    try {
      AlipayEbppInvoiceExpenserulesProjectruleQueryResponseModel result = apiInstance.query(accountId, agreementNo, projectId, employeeId, employeeOpenId, pageNum, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceExpenserulesProjectruleApi#query");
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
| **accountId** | **String**| 共同账号ID | [optional] |
| **agreementNo** | **String**| 授权签约协议号 | [optional] |
| **projectId** | **String**| 项目id（可空） | [optional] |
| **employeeId** | **String**| 员工UID（可空） | [optional] |
| **employeeOpenId** | **String**| 切换open_id后请使用：员工open_id（可空） | [optional] |
| **pageNum** | **Integer**| 页数 | [optional] |
| **pageSize** | **Integer**| 页大小 | [optional] |

### Return type

**AlipayEbppInvoiceExpenserulesProjectruleQueryResponseModel**

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

