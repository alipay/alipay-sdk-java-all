# AlipayMerchantIndirectAuthorderApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**close**](AlipayMerchantIndirectAuthorderApi.md#close) | **POST** /v3/alipay/merchant/indirect/authorder/close | 商家认证申请单撤销 |
| [**create**](AlipayMerchantIndirectAuthorderApi.md#create) | **POST** /v3/alipay/merchant/indirect/authorder/create | 商家认证申请单提交 |
| [**querystatus**](AlipayMerchantIndirectAuthorderApi.md#querystatus) | **POST** /v3/alipay/merchant/indirect/authorder/querystatus | 查询商家认证申请单状态 |


<a name="close"></a>
# **close**
> Object close(alipayMerchantIndirectAuthorderCloseModel)

商家认证申请单撤销

申请单处于审核中、审核失败、待确认等状态时，申请单可撤销，撤销后可重新调用提交申请单接口上传申请单信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMerchantIndirectAuthorderApi;

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

    AlipayMerchantIndirectAuthorderApi apiInstance = new AlipayMerchantIndirectAuthorderApi(defaultClient);
    AlipayMerchantIndirectAuthorderCloseModel alipayMerchantIndirectAuthorderCloseModel = new AlipayMerchantIndirectAuthorderCloseModel(); // AlipayMerchantIndirectAuthorderCloseModel | 
    try {
      Object result = apiInstance.close(alipayMerchantIndirectAuthorderCloseModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMerchantIndirectAuthorderApi#close");
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
| **alipayMerchantIndirectAuthorderCloseModel** | **AlipayMerchantIndirectAuthorderCloseModel**|  | [optional] |

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
> AlipayMerchantIndirectAuthorderCreateResponseModel create(alipayMerchantIndirectAuthorderCreateModel)

商家认证申请单提交

间连商户认证申请单提交，用于支付宝间连商家认证

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMerchantIndirectAuthorderApi;

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

    AlipayMerchantIndirectAuthorderApi apiInstance = new AlipayMerchantIndirectAuthorderApi(defaultClient);
    AlipayMerchantIndirectAuthorderCreateModel alipayMerchantIndirectAuthorderCreateModel = new AlipayMerchantIndirectAuthorderCreateModel(); // AlipayMerchantIndirectAuthorderCreateModel | 
    try {
      AlipayMerchantIndirectAuthorderCreateResponseModel result = apiInstance.create(alipayMerchantIndirectAuthorderCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMerchantIndirectAuthorderApi#create");
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
| **alipayMerchantIndirectAuthorderCreateModel** | **AlipayMerchantIndirectAuthorderCreateModel**|  | [optional] |

### Return type

**AlipayMerchantIndirectAuthorderCreateResponseModel**

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

<a name="querystatus"></a>
# **querystatus**
> AlipayMerchantIndirectAuthorderQuerystatusResponseModel querystatus(alipayMerchantIndirectAuthorderQuerystatusModel)

查询商家认证申请单状态

查询商家认证申请单状态，以及失败原因

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMerchantIndirectAuthorderApi;

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

    AlipayMerchantIndirectAuthorderApi apiInstance = new AlipayMerchantIndirectAuthorderApi(defaultClient);
    AlipayMerchantIndirectAuthorderQuerystatusModel alipayMerchantIndirectAuthorderQuerystatusModel = new AlipayMerchantIndirectAuthorderQuerystatusModel(); // AlipayMerchantIndirectAuthorderQuerystatusModel | 
    try {
      AlipayMerchantIndirectAuthorderQuerystatusResponseModel result = apiInstance.querystatus(alipayMerchantIndirectAuthorderQuerystatusModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMerchantIndirectAuthorderApi#querystatus");
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
| **alipayMerchantIndirectAuthorderQuerystatusModel** | **AlipayMerchantIndirectAuthorderQuerystatusModel**|  | [optional] |

### Return type

**AlipayMerchantIndirectAuthorderQuerystatusResponseModel**

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

