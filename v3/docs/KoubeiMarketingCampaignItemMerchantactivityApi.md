# KoubeiMarketingCampaignItemMerchantactivityApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](KoubeiMarketingCampaignItemMerchantactivityApi.md#batchquery) | **POST** /v3/koubei/marketing/campaign/item/merchantactivity/batchquery | 商户查询商品代金券列表 |
| [**close**](KoubeiMarketingCampaignItemMerchantactivityApi.md#close) | **POST** /v3/koubei/marketing/campaign/item/merchantactivity/close | 商户下架代金券 |
| [**create**](KoubeiMarketingCampaignItemMerchantactivityApi.md#create) | **POST** /v3/koubei/marketing/campaign/item/merchantactivity/create | 商户创建商品代金券 |
| [**modify**](KoubeiMarketingCampaignItemMerchantactivityApi.md#modify) | **POST** /v3/koubei/marketing/campaign/item/merchantactivity/modify | 商户修改商品代金券 |
| [**query**](KoubeiMarketingCampaignItemMerchantactivityApi.md#query) | **POST** /v3/koubei/marketing/campaign/item/merchantactivity/query | 商户查询商品代金券详情 |


<a name="batchquery"></a>
# **batchquery**
> KoubeiMarketingCampaignItemMerchantactivityBatchqueryResponseModel batchquery()

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
    try {
      KoubeiMarketingCampaignItemMerchantactivityBatchqueryResponseModel result = apiInstance.batchquery();
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
This endpoint does not need any parameter.

### Return type

**KoubeiMarketingCampaignItemMerchantactivityBatchqueryResponseModel**

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

<a name="close"></a>
# **close**
> Object close()

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
    try {
      Object result = apiInstance.close();
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
This endpoint does not need any parameter.

### Return type

**Object**

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
> KoubeiMarketingCampaignItemMerchantactivityCreateResponseModel create()

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
    try {
      KoubeiMarketingCampaignItemMerchantactivityCreateResponseModel result = apiInstance.create();
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
This endpoint does not need any parameter.

### Return type

**KoubeiMarketingCampaignItemMerchantactivityCreateResponseModel**

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

<a name="modify"></a>
# **modify**
> Object modify()

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
    try {
      Object result = apiInstance.modify();
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
This endpoint does not need any parameter.

### Return type

**Object**

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

<a name="query"></a>
# **query**
> KoubeiMarketingCampaignItemMerchantactivityQueryResponseModel query()

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
    try {
      KoubeiMarketingCampaignItemMerchantactivityQueryResponseModel result = apiInstance.query();
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
This endpoint does not need any parameter.

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

