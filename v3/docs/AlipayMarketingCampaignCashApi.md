# AlipayMarketingCampaignCashApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayMarketingCampaignCashApi.md#create) | **POST** /v3/alipay/marketing/campaign/cash/create | 创建现金活动 |
| [**trigger**](AlipayMarketingCampaignCashApi.md#trigger) | **POST** /v3/alipay/marketing/campaign/cash/trigger | 触发现金红包活动 |


<a name="create"></a>
# **create**
> AlipayMarketingCampaignCashCreateResponseModel create(alipayMarketingCampaignCashCreateModel)

创建现金活动

商户通过开放平台创建商户活动

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingCampaignCashApi;

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

    AlipayMarketingCampaignCashApi apiInstance = new AlipayMarketingCampaignCashApi(defaultClient);
    AlipayMarketingCampaignCashCreateModel alipayMarketingCampaignCashCreateModel = new AlipayMarketingCampaignCashCreateModel(); // AlipayMarketingCampaignCashCreateModel | 
    try {
      AlipayMarketingCampaignCashCreateResponseModel result = apiInstance.create(alipayMarketingCampaignCashCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingCampaignCashApi#create");
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
| **alipayMarketingCampaignCashCreateModel** | **AlipayMarketingCampaignCashCreateModel**|  | [optional] |

### Return type

**AlipayMarketingCampaignCashCreateResponseModel**

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

<a name="trigger"></a>
# **trigger**
> AlipayMarketingCampaignCashTriggerResponseModel trigger(alipayMarketingCampaignCashTriggerModel)

触发现金红包活动

用户通过开放平台参与现金活动

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingCampaignCashApi;

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

    AlipayMarketingCampaignCashApi apiInstance = new AlipayMarketingCampaignCashApi(defaultClient);
    AlipayMarketingCampaignCashTriggerModel alipayMarketingCampaignCashTriggerModel = new AlipayMarketingCampaignCashTriggerModel(); // AlipayMarketingCampaignCashTriggerModel | 
    try {
      AlipayMarketingCampaignCashTriggerResponseModel result = apiInstance.trigger(alipayMarketingCampaignCashTriggerModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingCampaignCashApi#trigger");
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
| **alipayMarketingCampaignCashTriggerModel** | **AlipayMarketingCampaignCashTriggerModel**|  | [optional] |

### Return type

**AlipayMarketingCampaignCashTriggerResponseModel**

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

