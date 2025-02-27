# AlipayCommerceOperationActivityMerchantApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modify**](AlipayCommerceOperationActivityMerchantApi.md#modify) | **POST** /v3/alipay/commerce/operation/activity/merchant/modify | 商户签约信息修改 |
| [**sign**](AlipayCommerceOperationActivityMerchantApi.md#sign) | **POST** /v3/alipay/commerce/operation/activity/merchant/sign | 商户签约活动 |
| [**unsign**](AlipayCommerceOperationActivityMerchantApi.md#unsign) | **POST** /v3/alipay/commerce/operation/activity/merchant/unsign | 活动商户解约 |


<a name="modify"></a>
# **modify**
> AlipayCommerceOperationActivityMerchantModifyResponseModel modify(alipayCommerceOperationActivityMerchantModifyModel)

商户签约信息修改

商户签约信息修改

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceOperationActivityMerchantApi;

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

    AlipayCommerceOperationActivityMerchantApi apiInstance = new AlipayCommerceOperationActivityMerchantApi(defaultClient);
    AlipayCommerceOperationActivityMerchantModifyModel alipayCommerceOperationActivityMerchantModifyModel = new AlipayCommerceOperationActivityMerchantModifyModel(); // AlipayCommerceOperationActivityMerchantModifyModel | 
    try {
      AlipayCommerceOperationActivityMerchantModifyResponseModel result = apiInstance.modify(alipayCommerceOperationActivityMerchantModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceOperationActivityMerchantApi#modify");
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
| **alipayCommerceOperationActivityMerchantModifyModel** | **AlipayCommerceOperationActivityMerchantModifyModel**|  | [optional] |

### Return type

**AlipayCommerceOperationActivityMerchantModifyResponseModel**

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

<a name="sign"></a>
# **sign**
> Object sign(alipayCommerceOperationActivityMerchantSignModel)

商户签约活动

商户签约活动

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceOperationActivityMerchantApi;

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

    AlipayCommerceOperationActivityMerchantApi apiInstance = new AlipayCommerceOperationActivityMerchantApi(defaultClient);
    AlipayCommerceOperationActivityMerchantSignModel alipayCommerceOperationActivityMerchantSignModel = new AlipayCommerceOperationActivityMerchantSignModel(); // AlipayCommerceOperationActivityMerchantSignModel | 
    try {
      Object result = apiInstance.sign(alipayCommerceOperationActivityMerchantSignModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceOperationActivityMerchantApi#sign");
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
| **alipayCommerceOperationActivityMerchantSignModel** | **AlipayCommerceOperationActivityMerchantSignModel**|  | [optional] |

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
> AlipayCommerceOperationActivityMerchantUnsignResponseModel unsign()

活动商户解约

用户银行商户模式商户解约活动使用

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceOperationActivityMerchantApi;

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

    AlipayCommerceOperationActivityMerchantApi apiInstance = new AlipayCommerceOperationActivityMerchantApi(defaultClient);
    try {
      AlipayCommerceOperationActivityMerchantUnsignResponseModel result = apiInstance.unsign();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceOperationActivityMerchantApi#unsign");
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

**AlipayCommerceOperationActivityMerchantUnsignResponseModel**

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

