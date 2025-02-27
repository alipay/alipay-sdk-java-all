# AlipayMobilePublicMenuApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**add**](AlipayMobilePublicMenuApi.md#add) | **POST** /v3/alipay/mobile/public/menu/add | 创建菜单 |
| [**get**](AlipayMobilePublicMenuApi.md#get) | **POST** /v3/alipay/mobile/public/menu/get | 查询菜单 |
| [**update**](AlipayMobilePublicMenuApi.md#update) | **POST** /v3/alipay/mobile/public/menu/update | 更新菜单 |


<a name="add"></a>
# **add**
> AlipayMobilePublicMenuAddResponseModel add(alipayMobilePublicMenuAddModel)

创建菜单

通过POST一个特定的结构体，实现支付宝钱包客户端的服务窗创建自定义菜单。本接口只可以调用一次，菜单已存在无需再次创建，今后只需要调用更新接口。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMobilePublicMenuApi;

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

    AlipayMobilePublicMenuApi apiInstance = new AlipayMobilePublicMenuApi(defaultClient);
    AlipayMobilePublicMenuAddModel alipayMobilePublicMenuAddModel = new AlipayMobilePublicMenuAddModel(); // AlipayMobilePublicMenuAddModel | 
    try {
      AlipayMobilePublicMenuAddResponseModel result = apiInstance.add(alipayMobilePublicMenuAddModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMobilePublicMenuApi#add");
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
| **alipayMobilePublicMenuAddModel** | **AlipayMobilePublicMenuAddModel**|  | [optional] |

### Return type

**AlipayMobilePublicMenuAddResponseModel**

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
> AlipayMobilePublicMenuGetResponseModel get()

查询菜单

查询当前使用的自定义菜单

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMobilePublicMenuApi;

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

    AlipayMobilePublicMenuApi apiInstance = new AlipayMobilePublicMenuApi(defaultClient);
    try {
      AlipayMobilePublicMenuGetResponseModel result = apiInstance.get();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMobilePublicMenuApi#get");
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

**AlipayMobilePublicMenuGetResponseModel**

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

<a name="update"></a>
# **update**
> AlipayMobilePublicMenuUpdateResponseModel update(alipayMobilePublicMenuUpdateModel)

更新菜单

通过POST一个特定结构体，实现支付宝钱包客户端的公众账号更新自定义菜单。每一次的更新是针对全部自定义菜单的更新。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMobilePublicMenuApi;

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

    AlipayMobilePublicMenuApi apiInstance = new AlipayMobilePublicMenuApi(defaultClient);
    AlipayMobilePublicMenuUpdateModel alipayMobilePublicMenuUpdateModel = new AlipayMobilePublicMenuUpdateModel(); // AlipayMobilePublicMenuUpdateModel | 
    try {
      AlipayMobilePublicMenuUpdateResponseModel result = apiInstance.update(alipayMobilePublicMenuUpdateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMobilePublicMenuApi#update");
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
| **alipayMobilePublicMenuUpdateModel** | **AlipayMobilePublicMenuUpdateModel**|  | [optional] |

### Return type

**AlipayMobilePublicMenuUpdateResponseModel**

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

