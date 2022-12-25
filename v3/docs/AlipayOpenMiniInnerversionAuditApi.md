# AlipayOpenMiniInnerversionAuditApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancel**](AlipayOpenMiniInnerversionAuditApi.md#cancel) | **POST** /v3/alipay/open/mini/innerversion/audit/cancel | 内部链路撤销审核 |
| [**submit**](AlipayOpenMiniInnerversionAuditApi.md#submit) | **POST** /v3/alipay/open/mini/innerversion/audit/submit | 小程序版本提交审核 |


<a name="cancel"></a>
# **cancel**
> Object cancel(alipayOpenMiniInnerversionAuditCancelModel)

内部链路撤销审核

小程序提供一套针对一二方场景的开发者提供一套统一的内部能力开放体系，定向输出赋能

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerversionAuditApi;

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

    AlipayOpenMiniInnerversionAuditApi apiInstance = new AlipayOpenMiniInnerversionAuditApi(defaultClient);
    AlipayOpenMiniInnerversionAuditCancelModel alipayOpenMiniInnerversionAuditCancelModel = new AlipayOpenMiniInnerversionAuditCancelModel(); // AlipayOpenMiniInnerversionAuditCancelModel | 
    try {
      Object result = apiInstance.cancel(alipayOpenMiniInnerversionAuditCancelModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerversionAuditApi#cancel");
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
| **alipayOpenMiniInnerversionAuditCancelModel** | **AlipayOpenMiniInnerversionAuditCancelModel**|  | [optional] |

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

<a name="submit"></a>
# **submit**
> Object submit(alipayOpenMiniInnerversionAuditSubmitModel)

小程序版本提交审核

小程序版本提交审核，审核申请完结后会通过From蚂蚁消息通知到开发者。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniInnerversionAuditApi;

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

    AlipayOpenMiniInnerversionAuditApi apiInstance = new AlipayOpenMiniInnerversionAuditApi(defaultClient);
    AlipayOpenMiniInnerversionAuditSubmitModel alipayOpenMiniInnerversionAuditSubmitModel = new AlipayOpenMiniInnerversionAuditSubmitModel(); // AlipayOpenMiniInnerversionAuditSubmitModel | 
    try {
      Object result = apiInstance.submit(alipayOpenMiniInnerversionAuditSubmitModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniInnerversionAuditApi#submit");
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
| **alipayOpenMiniInnerversionAuditSubmitModel** | **AlipayOpenMiniInnerversionAuditSubmitModel**|  | [optional] |

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

