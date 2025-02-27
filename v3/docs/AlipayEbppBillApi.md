# AlipayEbppBillApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**add**](AlipayEbppBillApi.md#add) | **POST** /v3/alipay/ebpp/bill/add | 创建账单 |
| [**get**](AlipayEbppBillApi.md#get) | **POST** /v3/alipay/ebpp/bill/get | 查询账单 |


<a name="add"></a>
# **add**
> AlipayEbppBillAddResponseModel add(authToken, alipayEbppBillAddModel)

创建账单

创建账单

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppBillApi;

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

    AlipayEbppBillApi apiInstance = new AlipayEbppBillApi(defaultClient);
    String authToken = "authToken_example"; // String | 用户授权令牌
    AlipayEbppBillAddModel alipayEbppBillAddModel = new AlipayEbppBillAddModel(); // AlipayEbppBillAddModel | 
    try {
      AlipayEbppBillAddResponseModel result = apiInstance.add(authToken, alipayEbppBillAddModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppBillApi#add");
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
| **authToken** | **String**| 用户授权令牌 | [optional] |
| **alipayEbppBillAddModel** | **AlipayEbppBillAddModel**|  | [optional] |

### Return type

**AlipayEbppBillAddResponseModel**

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

<a name="get"></a>
# **get**
> AlipayEbppBillGetResponseModel get(authToken, alipayEbppBillGetModel)

查询账单

查询账单

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppBillApi;

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

    AlipayEbppBillApi apiInstance = new AlipayEbppBillApi(defaultClient);
    String authToken = "authToken_example"; // String | 用户授权令牌
    AlipayEbppBillGetModel alipayEbppBillGetModel = new AlipayEbppBillGetModel(); // AlipayEbppBillGetModel | 
    try {
      AlipayEbppBillGetResponseModel result = apiInstance.get(authToken, alipayEbppBillGetModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppBillApi#get");
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
| **authToken** | **String**| 用户授权令牌 | [optional] |
| **alipayEbppBillGetModel** | **AlipayEbppBillGetModel**|  | [optional] |

### Return type

**AlipayEbppBillGetResponseModel**

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

