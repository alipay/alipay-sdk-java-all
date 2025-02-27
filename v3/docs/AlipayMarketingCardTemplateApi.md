# AlipayMarketingCardTemplateApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayMarketingCardTemplateApi.md#batchquery) | **POST** /v3/alipay/marketing/card/template/batchquery | 会员卡模板批量查询 |
| [**create**](AlipayMarketingCardTemplateApi.md#create) | **POST** /v3/alipay/marketing/card/template/create | 会员卡模板创建 |
| [**modify**](AlipayMarketingCardTemplateApi.md#modify) | **POST** /v3/alipay/marketing/card/template/modify | 会员卡模板修改 |
| [**query**](AlipayMarketingCardTemplateApi.md#query) | **GET** /v3/alipay/marketing/card/template/query | 会员卡模板查询接口 |


<a name="batchquery"></a>
# **batchquery**
> AlipayMarketingCardTemplateBatchqueryResponseModel batchquery()

会员卡模板批量查询

会员卡模板批量查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingCardTemplateApi;

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

    AlipayMarketingCardTemplateApi apiInstance = new AlipayMarketingCardTemplateApi(defaultClient);
    try {
      AlipayMarketingCardTemplateBatchqueryResponseModel result = apiInstance.batchquery();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingCardTemplateApi#batchquery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**AlipayMarketingCardTemplateBatchqueryResponseModel**

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

<a name="create"></a>
# **create**
> AlipayMarketingCardTemplateCreateResponseModel create(alipayMarketingCardTemplateCreateModel)

会员卡模板创建

会员卡模板创建

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingCardTemplateApi;

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

    AlipayMarketingCardTemplateApi apiInstance = new AlipayMarketingCardTemplateApi(defaultClient);
    AlipayMarketingCardTemplateCreateModel alipayMarketingCardTemplateCreateModel = new AlipayMarketingCardTemplateCreateModel(); // AlipayMarketingCardTemplateCreateModel | 
    try {
      AlipayMarketingCardTemplateCreateResponseModel result = apiInstance.create(alipayMarketingCardTemplateCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingCardTemplateApi#create");
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
| **alipayMarketingCardTemplateCreateModel** | **AlipayMarketingCardTemplateCreateModel**|  | [optional] |

### Return type

**AlipayMarketingCardTemplateCreateResponseModel**

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
> AlipayMarketingCardTemplateModifyResponseModel modify(alipayMarketingCardTemplateModifyModel)

会员卡模板修改

会员卡模板修改

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingCardTemplateApi;

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

    AlipayMarketingCardTemplateApi apiInstance = new AlipayMarketingCardTemplateApi(defaultClient);
    AlipayMarketingCardTemplateModifyModel alipayMarketingCardTemplateModifyModel = new AlipayMarketingCardTemplateModifyModel(); // AlipayMarketingCardTemplateModifyModel | 
    try {
      AlipayMarketingCardTemplateModifyResponseModel result = apiInstance.modify(alipayMarketingCardTemplateModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingCardTemplateApi#modify");
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
| **alipayMarketingCardTemplateModifyModel** | **AlipayMarketingCardTemplateModifyModel**|  | [optional] |

### Return type

**AlipayMarketingCardTemplateModifyResponseModel**

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
> AlipayMarketingCardTemplateQueryResponseModel query(templateId)

会员卡模板查询接口

会员卡模板查询接口

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingCardTemplateApi;

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

    AlipayMarketingCardTemplateApi apiInstance = new AlipayMarketingCardTemplateApi(defaultClient);
    String templateId = "20160718000000001"; // String | 会员卡模板id。调用alipay.marketing.card.template.create（会员卡模板创建接口）创建模板后同步返回。
    try {
      AlipayMarketingCardTemplateQueryResponseModel result = apiInstance.query(templateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingCardTemplateApi#query");
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
| **templateId** | **String**| 会员卡模板id。调用alipay.marketing.card.template.create（会员卡模板创建接口）创建模板后同步返回。 | [optional] |

### Return type

**AlipayMarketingCardTemplateQueryResponseModel**

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

