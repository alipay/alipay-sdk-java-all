# AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleApi.md#create) | **POST** /v3/alipay/ebpp/invoice/enterpriseconsume/enterpriseopenrule/create | 新增开票规则 |
| [**modify**](AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleApi.md#modify) | **POST** /v3/alipay/ebpp/invoice/enterpriseconsume/enterpriseopenrule/modify | 修改开票规则 |
| [**query**](AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleApi.md#query) | **GET** /v3/alipay/ebpp/invoice/enterpriseconsume/enterpriseopenrule/query | 查询开票规则 |


<a name="create"></a>
# **create**
> AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateResponseModel create(alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel)

新增开票规则

新增一条开票规则配置

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleApi;

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

    AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleApi apiInstance = new AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleApi(defaultClient);
    AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel = new AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel(); // AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel | 
    try {
      AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateResponseModel result = apiInstance.create(alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleApi#create");
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
| **alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel** | **AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateResponseModel**

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

<a name="modify"></a>
# **modify**
> AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyResponseModel modify(alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel)

修改开票规则

修改开票规则

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleApi;

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

    AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleApi apiInstance = new AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleApi(defaultClient);
    AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel = new AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel(); // AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel | 
    try {
      AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyResponseModel result = apiInstance.modify(alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleApi#modify");
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
| **alipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel** | **AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel**|  | [optional] |

### Return type

**AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyResponseModel**

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
> AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleQueryResponseModel query(enterpriseId, invoiceRuleId, accountId, agreementNo)

查询开票规则

根据开票规则ID查询开票规则详情

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleApi;

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

    AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleApi apiInstance = new AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleApi(defaultClient);
    String enterpriseId = "2088000194958955"; // String | 企业ID
    String invoiceRuleId = "2021032900152710950000000001"; // String | 开票规则ID
    String accountId = "2088000194958956"; // String | 共同账户ID
    String agreementNo = "20215425001112341234"; // String | 授权签约协议号
    try {
      AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleQueryResponseModel result = apiInstance.query(enterpriseId, invoiceRuleId, accountId, agreementNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleApi#query");
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
| **invoiceRuleId** | **String**| 开票规则ID | [optional] |
| **accountId** | **String**| 共同账户ID | [optional] |
| **agreementNo** | **String**| 授权签约协议号 | [optional] |

### Return type

**AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleQueryResponseModel**

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

