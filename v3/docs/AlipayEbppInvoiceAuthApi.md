# AlipayEbppInvoiceAuthApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sign**](AlipayEbppInvoiceAuthApi.md#sign) | **POST** /v3/alipay/ebpp/invoice/auth/sign | 发票授权关系签约 |
| [**unsign**](AlipayEbppInvoiceAuthApi.md#unsign) | **POST** /v3/alipay/ebpp/invoice/auth/unsign | 发票授权关系解约 |


<a name="sign"></a>
# **sign**
> Object sign(alipayEbppInvoiceAuthSignModel)

发票授权关系签约

用户在ISV端签约了发票相关的授权关系之后，ISV使用该接口将授权关系同步到发票管家。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceAuthApi;

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

    AlipayEbppInvoiceAuthApi apiInstance = new AlipayEbppInvoiceAuthApi(defaultClient);
    AlipayEbppInvoiceAuthSignModel alipayEbppInvoiceAuthSignModel = new AlipayEbppInvoiceAuthSignModel(); // AlipayEbppInvoiceAuthSignModel | 
    try {
      Object result = apiInstance.sign(alipayEbppInvoiceAuthSignModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceAuthApi#sign");
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
| **alipayEbppInvoiceAuthSignModel** | **AlipayEbppInvoiceAuthSignModel**|  | [optional] |

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

<a name="unsign"></a>
# **unsign**
> Object unsign(alipayEbppInvoiceAuthUnsignModel)

发票授权关系解约

用户在ISV端解约了发票相关的授权关系之后，ISV使用该接口将授权关系在发票管家端解约。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceAuthApi;

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

    AlipayEbppInvoiceAuthApi apiInstance = new AlipayEbppInvoiceAuthApi(defaultClient);
    AlipayEbppInvoiceAuthUnsignModel alipayEbppInvoiceAuthUnsignModel = new AlipayEbppInvoiceAuthUnsignModel(); // AlipayEbppInvoiceAuthUnsignModel | 
    try {
      Object result = apiInstance.unsign(alipayEbppInvoiceAuthUnsignModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceAuthApi#unsign");
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
| **alipayEbppInvoiceAuthUnsignModel** | **AlipayEbppInvoiceAuthUnsignModel**|  | [optional] |

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

