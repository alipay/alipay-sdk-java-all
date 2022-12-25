# KoubeiMarketingCampaignItemMerchantactivityApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](KoubeiMarketingCampaignItemMerchantactivityApi.md#batchquery) | **POST** /v3/koubei/marketing/campaign/item/merchantactivity/batchquery | 商户查询商品代金券列表 |
| [**close**](KoubeiMarketingCampaignItemMerchantactivityApi.md#close) | **POST** /v3/koubei/marketing/campaign/item/merchantactivity/close | 商户下架代金券 |
| [**create**](KoubeiMarketingCampaignItemMerchantactivityApi.md#create) | **POST** /v3/koubei/marketing/campaign/item/merchantactivity/create | 商户创建商品代金券 |
| [**modify**](KoubeiMarketingCampaignItemMerchantactivityApi.md#modify) | **POST** /v3/koubei/marketing/campaign/item/merchantactivity/modify | 商户修改商品代金券 |
| [**query**](KoubeiMarketingCampaignItemMerchantactivityApi.md#query) | **GET** /v3/koubei/marketing/campaign/item/merchantactivity/query | 商户查询商品代金券详情 |


<a name="batchquery"></a>
# **batchquery**
> KoubeiMarketingCampaignItemMerchantactivityBatchqueryResponseModel batchquery(koubeiMarketingCampaignItemMerchantactivityBatchqueryModel)

商户查询商品代金券列表

商户查询商品代金券列表

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.KoubeiMarketingCampaignItemMerchantactivityApi;

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

    KoubeiMarketingCampaignItemMerchantactivityApi apiInstance = new KoubeiMarketingCampaignItemMerchantactivityApi(defaultClient);
    KoubeiMarketingCampaignItemMerchantactivityBatchqueryModel koubeiMarketingCampaignItemMerchantactivityBatchqueryModel = new KoubeiMarketingCampaignItemMerchantactivityBatchqueryModel(); // KoubeiMarketingCampaignItemMerchantactivityBatchqueryModel | 
    try {
      KoubeiMarketingCampaignItemMerchantactivityBatchqueryResponseModel result = apiInstance.batchquery(koubeiMarketingCampaignItemMerchantactivityBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KoubeiMarketingCampaignItemMerchantactivityApi#batchquery");
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
| **koubeiMarketingCampaignItemMerchantactivityBatchqueryModel** | **KoubeiMarketingCampaignItemMerchantactivityBatchqueryModel**|  | [optional] |

### Return type

**KoubeiMarketingCampaignItemMerchantactivityBatchqueryResponseModel**

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

<a name="close"></a>
# **close**
> Object close(koubeiMarketingCampaignItemMerchantactivityCloseModel)

商户下架代金券

商户下架代金券

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.KoubeiMarketingCampaignItemMerchantactivityApi;

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

    KoubeiMarketingCampaignItemMerchantactivityApi apiInstance = new KoubeiMarketingCampaignItemMerchantactivityApi(defaultClient);
    KoubeiMarketingCampaignItemMerchantactivityCloseModel koubeiMarketingCampaignItemMerchantactivityCloseModel = new KoubeiMarketingCampaignItemMerchantactivityCloseModel(); // KoubeiMarketingCampaignItemMerchantactivityCloseModel | 
    try {
      Object result = apiInstance.close(koubeiMarketingCampaignItemMerchantactivityCloseModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KoubeiMarketingCampaignItemMerchantactivityApi#close");
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
| **koubeiMarketingCampaignItemMerchantactivityCloseModel** | **KoubeiMarketingCampaignItemMerchantactivityCloseModel**|  | [optional] |

### Return type

**Object**

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

<a name="create"></a>
# **create**
> KoubeiMarketingCampaignItemMerchantactivityCreateResponseModel create(koubeiMarketingCampaignItemMerchantactivityCreateModel)

商户创建商品代金券

商户创建商品代金券

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.KoubeiMarketingCampaignItemMerchantactivityApi;

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

    KoubeiMarketingCampaignItemMerchantactivityApi apiInstance = new KoubeiMarketingCampaignItemMerchantactivityApi(defaultClient);
    KoubeiMarketingCampaignItemMerchantactivityCreateModel koubeiMarketingCampaignItemMerchantactivityCreateModel = new KoubeiMarketingCampaignItemMerchantactivityCreateModel(); // KoubeiMarketingCampaignItemMerchantactivityCreateModel | 
    try {
      KoubeiMarketingCampaignItemMerchantactivityCreateResponseModel result = apiInstance.create(koubeiMarketingCampaignItemMerchantactivityCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KoubeiMarketingCampaignItemMerchantactivityApi#create");
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
| **koubeiMarketingCampaignItemMerchantactivityCreateModel** | **KoubeiMarketingCampaignItemMerchantactivityCreateModel**|  | [optional] |

### Return type

**KoubeiMarketingCampaignItemMerchantactivityCreateResponseModel**

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
> Object modify(koubeiMarketingCampaignItemMerchantactivityModifyModel)

商户修改商品代金券

商户修改商品代金券

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.KoubeiMarketingCampaignItemMerchantactivityApi;

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

    KoubeiMarketingCampaignItemMerchantactivityApi apiInstance = new KoubeiMarketingCampaignItemMerchantactivityApi(defaultClient);
    KoubeiMarketingCampaignItemMerchantactivityModifyModel koubeiMarketingCampaignItemMerchantactivityModifyModel = new KoubeiMarketingCampaignItemMerchantactivityModifyModel(); // KoubeiMarketingCampaignItemMerchantactivityModifyModel | 
    try {
      Object result = apiInstance.modify(koubeiMarketingCampaignItemMerchantactivityModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KoubeiMarketingCampaignItemMerchantactivityApi#modify");
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
| **koubeiMarketingCampaignItemMerchantactivityModifyModel** | **KoubeiMarketingCampaignItemMerchantactivityModifyModel**|  | [optional] |

### Return type

**Object**

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
> KoubeiMarketingCampaignItemMerchantactivityQueryResponseModel query(activityId, externalUniqueId)

商户查询商品代金券详情

商户查询商品代金券详情

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.KoubeiMarketingCampaignItemMerchantactivityApi;

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

    KoubeiMarketingCampaignItemMerchantactivityApi apiInstance = new KoubeiMarketingCampaignItemMerchantactivityApi(defaultClient);
    String activityId = "2018xxxx"; // String | 运营活动id
    String externalUniqueId = "2018xxxx"; // String | 外部id
    try {
      KoubeiMarketingCampaignItemMerchantactivityQueryResponseModel result = apiInstance.query(activityId, externalUniqueId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KoubeiMarketingCampaignItemMerchantactivityApi#query");
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
| **activityId** | **String**| 运营活动id | [optional] |
| **externalUniqueId** | **String**| 外部id | [optional] |

### Return type

**KoubeiMarketingCampaignItemMerchantactivityQueryResponseModel**

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

