# AlipayFundEnterprisepayApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sign**](AlipayFundEnterprisepayApi.md#sign) | **POST** /v3/alipay/fund/enterprisepay/sign | 因公付企业签约 |
| [**unsign**](AlipayFundEnterprisepayApi.md#unsign) | **POST** /v3/alipay/fund/enterprisepay/unsign | 因公付企业解约 |


<a name="sign"></a>
# **sign**
> AlipayFundEnterprisepaySignResponseModel sign(alipayFundEnterprisepaySignModel)

因公付企业签约

用于获取因公付企业签约链接

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundEnterprisepayApi;

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

    AlipayFundEnterprisepayApi apiInstance = new AlipayFundEnterprisepayApi(defaultClient);
    AlipayFundEnterprisepaySignModel alipayFundEnterprisepaySignModel = new AlipayFundEnterprisepaySignModel(); // AlipayFundEnterprisepaySignModel | 
    try {
      AlipayFundEnterprisepaySignResponseModel result = apiInstance.sign(alipayFundEnterprisepaySignModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundEnterprisepayApi#sign");
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
| **alipayFundEnterprisepaySignModel** | **AlipayFundEnterprisepaySignModel**|  | [optional] |

### Return type

**AlipayFundEnterprisepaySignResponseModel**

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

<a name="unsign"></a>
# **unsign**
> AlipayFundEnterprisepayUnsignResponseModel unsign(alipayFundEnterprisepayUnsignModel)

因公付企业解约

用于因公付企业解约时获取解约链接

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundEnterprisepayApi;

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

    AlipayFundEnterprisepayApi apiInstance = new AlipayFundEnterprisepayApi(defaultClient);
    AlipayFundEnterprisepayUnsignModel alipayFundEnterprisepayUnsignModel = new AlipayFundEnterprisepayUnsignModel(); // AlipayFundEnterprisepayUnsignModel | 
    try {
      AlipayFundEnterprisepayUnsignResponseModel result = apiInstance.unsign(alipayFundEnterprisepayUnsignModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundEnterprisepayApi#unsign");
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
| **alipayFundEnterprisepayUnsignModel** | **AlipayFundEnterprisepayUnsignModel**|  | [optional] |

### Return type

**AlipayFundEnterprisepayUnsignResponseModel**

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

