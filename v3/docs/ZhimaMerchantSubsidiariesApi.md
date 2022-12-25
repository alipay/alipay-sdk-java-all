# ZhimaMerchantSubsidiariesApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apply**](ZhimaMerchantSubsidiariesApi.md#apply) | **POST** /v3/zhima/merchant/subsidiaries/apply | 子商户信息添加 |
| [**close**](ZhimaMerchantSubsidiariesApi.md#close) | **POST** /v3/zhima/merchant/subsidiaries/close | 关闭子商户信息工单 |


<a name="apply"></a>
# **apply**
> ZhimaMerchantSubsidiariesApplyResponseModel apply(zhimaMerchantSubsidiariesApplyModel)

子商户信息添加

子商户信息添加

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaMerchantSubsidiariesApi;

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

    ZhimaMerchantSubsidiariesApi apiInstance = new ZhimaMerchantSubsidiariesApi(defaultClient);
    ZhimaMerchantSubsidiariesApplyModel zhimaMerchantSubsidiariesApplyModel = new ZhimaMerchantSubsidiariesApplyModel(); // ZhimaMerchantSubsidiariesApplyModel | 
    try {
      ZhimaMerchantSubsidiariesApplyResponseModel result = apiInstance.apply(zhimaMerchantSubsidiariesApplyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaMerchantSubsidiariesApi#apply");
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
| **zhimaMerchantSubsidiariesApplyModel** | **ZhimaMerchantSubsidiariesApplyModel**|  | [optional] |

### Return type

**ZhimaMerchantSubsidiariesApplyResponseModel**

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
> ZhimaMerchantSubsidiariesCloseResponseModel close(zhimaMerchantSubsidiariesCloseModel)

关闭子商户信息工单

关闭子商户信息工单

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaMerchantSubsidiariesApi;

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

    ZhimaMerchantSubsidiariesApi apiInstance = new ZhimaMerchantSubsidiariesApi(defaultClient);
    ZhimaMerchantSubsidiariesCloseModel zhimaMerchantSubsidiariesCloseModel = new ZhimaMerchantSubsidiariesCloseModel(); // ZhimaMerchantSubsidiariesCloseModel | 
    try {
      ZhimaMerchantSubsidiariesCloseResponseModel result = apiInstance.close(zhimaMerchantSubsidiariesCloseModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaMerchantSubsidiariesApi#close");
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
| **zhimaMerchantSubsidiariesCloseModel** | **ZhimaMerchantSubsidiariesCloseModel**|  | [optional] |

### Return type

**ZhimaMerchantSubsidiariesCloseResponseModel**

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

