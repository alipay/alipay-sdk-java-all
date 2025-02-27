# AlipayMarketingRecruitEnrollApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**close**](AlipayMarketingRecruitEnrollApi.md#close) | **POST** /v3/alipay/marketing/recruit/enroll/close | 下线报名 |
| [**create**](AlipayMarketingRecruitEnrollApi.md#create) | **POST** /v3/alipay/marketing/recruit/enroll/create | 招商报名提交 |
| [**query**](AlipayMarketingRecruitEnrollApi.md#query) | **POST** /v3/alipay/marketing/recruit/enroll/{qi} | 报名详情查询 |


<a name="close"></a>
# **close**
> Object close(alipayMarketingRecruitEnrollCloseModel)

下线报名

下线报名

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingRecruitEnrollApi;

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

    AlipayMarketingRecruitEnrollApi apiInstance = new AlipayMarketingRecruitEnrollApi(defaultClient);
    AlipayMarketingRecruitEnrollCloseModel alipayMarketingRecruitEnrollCloseModel = new AlipayMarketingRecruitEnrollCloseModel(); // AlipayMarketingRecruitEnrollCloseModel | 
    try {
      Object result = apiInstance.close(alipayMarketingRecruitEnrollCloseModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingRecruitEnrollApi#close");
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
| **alipayMarketingRecruitEnrollCloseModel** | **AlipayMarketingRecruitEnrollCloseModel**|  | [optional] |

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
> AlipayMarketingRecruitEnrollCreateResponseModel create(alipayMarketingRecruitEnrollCreateModel)

招商报名提交

创建报名后立即提交，审核通过后会以消息的形式通知调用方（需要接入消息接口alipay.marketing.enroll.status.changed）。在消息通知前可以尝试调用“报名详情查询接口（alipay.marketing.enroll.detail.query）”了解报名状态。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingRecruitEnrollApi;

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

    AlipayMarketingRecruitEnrollApi apiInstance = new AlipayMarketingRecruitEnrollApi(defaultClient);
    AlipayMarketingRecruitEnrollCreateModel alipayMarketingRecruitEnrollCreateModel = new AlipayMarketingRecruitEnrollCreateModel(); // AlipayMarketingRecruitEnrollCreateModel | 
    try {
      AlipayMarketingRecruitEnrollCreateResponseModel result = apiInstance.create(alipayMarketingRecruitEnrollCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingRecruitEnrollApi#create");
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
| **alipayMarketingRecruitEnrollCreateModel** | **AlipayMarketingRecruitEnrollCreateModel**|  | [optional] |

### Return type

**AlipayMarketingRecruitEnrollCreateResponseModel**

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

<a name="query"></a>
# **query**
> AlipayMarketingRecruitEnrollQueryResponseModel query(qi, ass, alipayMarketingRecruitEnrollQueryModel)

报名详情查询

报名详情查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingRecruitEnrollApi;

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

    AlipayMarketingRecruitEnrollApi apiInstance = new AlipayMarketingRecruitEnrollApi(defaultClient);
    String qi = "1"; // String | 111
    String ass = "1"; // String | 1
    AlipayMarketingRecruitEnrollQueryModel alipayMarketingRecruitEnrollQueryModel = new AlipayMarketingRecruitEnrollQueryModel(); // AlipayMarketingRecruitEnrollQueryModel | 
    try {
      AlipayMarketingRecruitEnrollQueryResponseModel result = apiInstance.query(qi, ass, alipayMarketingRecruitEnrollQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingRecruitEnrollApi#query");
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
| **qi** | **String**| 111 | |
| **ass** | **String**| 1 | [optional] |
| **alipayMarketingRecruitEnrollQueryModel** | **AlipayMarketingRecruitEnrollQueryModel**|  | [optional] |

### Return type

**AlipayMarketingRecruitEnrollQueryResponseModel**

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

