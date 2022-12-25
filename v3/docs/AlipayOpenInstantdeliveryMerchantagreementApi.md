# AlipayOpenInstantdeliveryMerchantagreementApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenInstantdeliveryMerchantagreementApi.md#query) | **GET** /v3/alipay/open/instantdelivery/merchantagreement/query | 协议签署查询api |
| [**sign**](AlipayOpenInstantdeliveryMerchantagreementApi.md#sign) | **POST** /v3/alipay/open/instantdelivery/merchantagreement/sign | 即时配送中商家代扣协议签署 |


<a name="query"></a>
# **query**
> AlipayOpenInstantdeliveryMerchantagreementQueryResponseModel query()

协议签署查询api

协议签署查询api, 提供isv查询商户物流代扣协议签署情况

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenInstantdeliveryMerchantagreementApi;

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

    AlipayOpenInstantdeliveryMerchantagreementApi apiInstance = new AlipayOpenInstantdeliveryMerchantagreementApi(defaultClient);
    try {
      AlipayOpenInstantdeliveryMerchantagreementQueryResponseModel result = apiInstance.query();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenInstantdeliveryMerchantagreementApi#query");
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

**AlipayOpenInstantdeliveryMerchantagreementQueryResponseModel**

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

<a name="sign"></a>
# **sign**
> AlipayOpenInstantdeliveryMerchantagreementSignResponseModel sign(alipayOpenInstantdeliveryMerchantagreementSignModel)

即时配送中商家代扣协议签署

即时配送中商家代扣协议签署

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenInstantdeliveryMerchantagreementApi;

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

    AlipayOpenInstantdeliveryMerchantagreementApi apiInstance = new AlipayOpenInstantdeliveryMerchantagreementApi(defaultClient);
    AlipayOpenInstantdeliveryMerchantagreementSignModel alipayOpenInstantdeliveryMerchantagreementSignModel = new AlipayOpenInstantdeliveryMerchantagreementSignModel(); // AlipayOpenInstantdeliveryMerchantagreementSignModel | 
    try {
      AlipayOpenInstantdeliveryMerchantagreementSignResponseModel result = apiInstance.sign(alipayOpenInstantdeliveryMerchantagreementSignModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenInstantdeliveryMerchantagreementApi#sign");
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
| **alipayOpenInstantdeliveryMerchantagreementSignModel** | **AlipayOpenInstantdeliveryMerchantagreementSignModel**|  | [optional] |

### Return type

**AlipayOpenInstantdeliveryMerchantagreementSignResponseModel**

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

