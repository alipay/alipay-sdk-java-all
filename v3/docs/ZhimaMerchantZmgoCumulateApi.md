# ZhimaMerchantZmgoCumulateApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](ZhimaMerchantZmgoCumulateApi.md#query) | **POST** /v3/zhima/merchant/zmgo/cumulate/query | 商家芝麻GO累计数据查询接口 |
| [**sync**](ZhimaMerchantZmgoCumulateApi.md#sync) | **POST** /v3/zhima/merchant/zmgo/cumulate/sync | 商家芝麻GO累计数据回传接口 |


<a name="query"></a>
# **query**
> ZhimaMerchantZmgoCumulateQueryResponseModel query(zhimaMerchantZmgoCumulateQueryModel)

商家芝麻GO累计数据查询接口

芝麻GO数据累计查询接口，包含汇总和明细信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaMerchantZmgoCumulateApi;

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

    ZhimaMerchantZmgoCumulateApi apiInstance = new ZhimaMerchantZmgoCumulateApi(defaultClient);
    ZhimaMerchantZmgoCumulateQueryModel zhimaMerchantZmgoCumulateQueryModel = new ZhimaMerchantZmgoCumulateQueryModel(); // ZhimaMerchantZmgoCumulateQueryModel | 
    try {
      ZhimaMerchantZmgoCumulateQueryResponseModel result = apiInstance.query(zhimaMerchantZmgoCumulateQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaMerchantZmgoCumulateApi#query");
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
| **zhimaMerchantZmgoCumulateQueryModel** | **ZhimaMerchantZmgoCumulateQueryModel**|  | [optional] |

### Return type

**ZhimaMerchantZmgoCumulateQueryResponseModel**

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

<a name="sync"></a>
# **sync**
> ZhimaMerchantZmgoCumulateSyncResponseModel sync(zhimaMerchantZmgoCumulateSyncModel)

商家芝麻GO累计数据回传接口

外部商家接入芝麻GO场景下，回传用户行为履约数据给芝麻。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaMerchantZmgoCumulateApi;

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

    ZhimaMerchantZmgoCumulateApi apiInstance = new ZhimaMerchantZmgoCumulateApi(defaultClient);
    ZhimaMerchantZmgoCumulateSyncModel zhimaMerchantZmgoCumulateSyncModel = new ZhimaMerchantZmgoCumulateSyncModel(); // ZhimaMerchantZmgoCumulateSyncModel | 
    try {
      ZhimaMerchantZmgoCumulateSyncResponseModel result = apiInstance.sync(zhimaMerchantZmgoCumulateSyncModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaMerchantZmgoCumulateApi#sync");
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
| **zhimaMerchantZmgoCumulateSyncModel** | **ZhimaMerchantZmgoCumulateSyncModel**|  | [optional] |

### Return type

**ZhimaMerchantZmgoCumulateSyncResponseModel**

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

