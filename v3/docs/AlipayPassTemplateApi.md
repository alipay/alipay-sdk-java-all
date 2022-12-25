# AlipayPassTemplateApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**add**](AlipayPassTemplateApi.md#add) | **POST** /v3/alipay/pass/template/add | 卡券模板创建接口 |
| [**update**](AlipayPassTemplateApi.md#update) | **POST** /v3/alipay/pass/template/update | 卡券模板更新接口 |


<a name="add"></a>
# **add**
> AlipayPassTemplateAddResponseModel add(alipayPassTemplateAddModel)

卡券模板创建接口

创建卡券的模板，卡券的样式、内容信息通过该接口提交到支付宝，支付宝会生成模板ID反馈给开发者，用于后续的更新和发布。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayPassTemplateApi;

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

    AlipayPassTemplateApi apiInstance = new AlipayPassTemplateApi(defaultClient);
    AlipayPassTemplateAddModel alipayPassTemplateAddModel = new AlipayPassTemplateAddModel(); // AlipayPassTemplateAddModel | 
    try {
      AlipayPassTemplateAddResponseModel result = apiInstance.add(alipayPassTemplateAddModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayPassTemplateApi#add");
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
| **alipayPassTemplateAddModel** | **AlipayPassTemplateAddModel**|  | [optional] |

### Return type

**AlipayPassTemplateAddResponseModel**

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

<a name="update"></a>
# **update**
> AlipayPassTemplateUpdateResponseModel update(alipayPassTemplateUpdateModel)

卡券模板更新接口

对于已经创建的模板，如果需要修改模板内容，可通过该接口修改，适用于修改模板内容；对于已经发布的模板，如果需要修改内容并同步到用户端，则应使用更新卡券接口。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayPassTemplateApi;

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

    AlipayPassTemplateApi apiInstance = new AlipayPassTemplateApi(defaultClient);
    AlipayPassTemplateUpdateModel alipayPassTemplateUpdateModel = new AlipayPassTemplateUpdateModel(); // AlipayPassTemplateUpdateModel | 
    try {
      AlipayPassTemplateUpdateResponseModel result = apiInstance.update(alipayPassTemplateUpdateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayPassTemplateApi#update");
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
| **alipayPassTemplateUpdateModel** | **AlipayPassTemplateUpdateModel**|  | [optional] |

### Return type

**AlipayPassTemplateUpdateResponseModel**

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

