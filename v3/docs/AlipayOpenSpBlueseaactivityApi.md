# AlipayOpenSpBlueseaactivityApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayOpenSpBlueseaactivityApi.md#create) | **POST** /v3/alipay/open/sp/blueseaactivity/create | 服务商返佣活动报名申请 |
| [**modify**](AlipayOpenSpBlueseaactivityApi.md#modify) | **POST** /v3/alipay/open/sp/blueseaactivity/modify | 服务商返佣活动申请单修改 |
| [**query**](AlipayOpenSpBlueseaactivityApi.md#query) | **GET** /v3/alipay/open/sp/blueseaactivity/query | 服务商返佣活动申请单详情查询 |


<a name="create"></a>
# **create**
> AlipayOpenSpBlueseaactivityCreateResponseModel create(alipayOpenSpBlueseaactivityCreateModel)

服务商返佣活动报名申请

服务商返佣活动报名

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSpBlueseaactivityApi;

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

    AlipayOpenSpBlueseaactivityApi apiInstance = new AlipayOpenSpBlueseaactivityApi(defaultClient);
    AlipayOpenSpBlueseaactivityCreateModel alipayOpenSpBlueseaactivityCreateModel = new AlipayOpenSpBlueseaactivityCreateModel(); // AlipayOpenSpBlueseaactivityCreateModel | 
    try {
      AlipayOpenSpBlueseaactivityCreateResponseModel result = apiInstance.create(alipayOpenSpBlueseaactivityCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSpBlueseaactivityApi#create");
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
| **alipayOpenSpBlueseaactivityCreateModel** | **AlipayOpenSpBlueseaactivityCreateModel**|  | [optional] |

### Return type

**AlipayOpenSpBlueseaactivityCreateResponseModel**

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

<a name="modify"></a>
# **modify**
> Object modify(alipayOpenSpBlueseaactivityModifyModel)

服务商返佣活动申请单修改

服务商返佣活动

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSpBlueseaactivityApi;

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

    AlipayOpenSpBlueseaactivityApi apiInstance = new AlipayOpenSpBlueseaactivityApi(defaultClient);
    AlipayOpenSpBlueseaactivityModifyModel alipayOpenSpBlueseaactivityModifyModel = new AlipayOpenSpBlueseaactivityModifyModel(); // AlipayOpenSpBlueseaactivityModifyModel | 
    try {
      Object result = apiInstance.modify(alipayOpenSpBlueseaactivityModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSpBlueseaactivityApi#modify");
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
| **alipayOpenSpBlueseaactivityModifyModel** | **AlipayOpenSpBlueseaactivityModifyModel**|  | [optional] |

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

<a name="query"></a>
# **query**
> AlipayOpenSpBlueseaactivityQueryResponseModel query(orderId)

服务商返佣活动申请单详情查询

服务商返佣活动

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSpBlueseaactivityApi;

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

    AlipayOpenSpBlueseaactivityApi apiInstance = new AlipayOpenSpBlueseaactivityApi(defaultClient);
    String orderId = "5881"; // String | 申请单 id。通过 <a href=\"https://opendocs.alipay.com/apis/01ebig\">alipay.open.sp.blueseaactivity.create</a>接口获取
    try {
      AlipayOpenSpBlueseaactivityQueryResponseModel result = apiInstance.query(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSpBlueseaactivityApi#query");
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
| **orderId** | **String**| 申请单 id。通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/01ebig\&quot;&gt;alipay.open.sp.blueseaactivity.create&lt;/a&gt;接口获取 | [optional] |

### Return type

**AlipayOpenSpBlueseaactivityQueryResponseModel**

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

