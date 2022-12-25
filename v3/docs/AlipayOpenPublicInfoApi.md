# AlipayOpenPublicInfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modify**](AlipayOpenPublicInfoApi.md#modify) | **POST** /v3/alipay/open/public/info/modify | 生活号基础信息修改接口 |
| [**query**](AlipayOpenPublicInfoApi.md#query) | **GET** /v3/alipay/open/public/info/query | 生活号基础信息查询接口 |


<a name="modify"></a>
# **modify**
> AlipayOpenPublicInfoModifyResponseModel modify(alipayOpenPublicInfoModifyModel)

生活号基础信息修改接口

提供生活号基础信息修改，同时适用于口碑商户签约当面付2.0默认创建的服务窗，需上传相关资质材料。修改名称、头像、简介会触发风控审核，审核通过后修改生效，支持isv调用

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicInfoApi;

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

    AlipayOpenPublicInfoApi apiInstance = new AlipayOpenPublicInfoApi(defaultClient);
    AlipayOpenPublicInfoModifyModel alipayOpenPublicInfoModifyModel = new AlipayOpenPublicInfoModifyModel(); // AlipayOpenPublicInfoModifyModel | 
    try {
      AlipayOpenPublicInfoModifyResponseModel result = apiInstance.modify(alipayOpenPublicInfoModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicInfoApi#modify");
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
| **alipayOpenPublicInfoModifyModel** | **AlipayOpenPublicInfoModifyModel**|  | [optional] |

### Return type

**AlipayOpenPublicInfoModifyResponseModel**

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
> AlipayOpenPublicInfoQueryResponseModel query()

生活号基础信息查询接口

提供名称、头像、简介、欢迎语、上下架、审核信息查询，支持isv调用

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenPublicInfoApi;

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

    AlipayOpenPublicInfoApi apiInstance = new AlipayOpenPublicInfoApi(defaultClient);
    try {
      AlipayOpenPublicInfoQueryResponseModel result = apiInstance.query();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenPublicInfoApi#query");
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

**AlipayOpenPublicInfoQueryResponseModel**

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

