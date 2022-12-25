# AlipayOfflineMarketShopApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayOfflineMarketShopApi.md#batchquery) | **POST** /v3/alipay/offline/market/shop/batchquery | 查询商户的门店编号列表 |
| [**create**](AlipayOfflineMarketShopApi.md#create) | **POST** /v3/alipay/offline/market/shop/create | 创建门店信息 |
| [**modify**](AlipayOfflineMarketShopApi.md#modify) | **POST** /v3/alipay/offline/market/shop/modify | 修改门店信息 |
| [**querydetail**](AlipayOfflineMarketShopApi.md#querydetail) | **GET** /v3/alipay/offline/market/shop/querydetail | 查询单个门店信息接口 |


<a name="batchquery"></a>
# **batchquery**
> AlipayOfflineMarketShopBatchqueryResponseModel batchquery(alipayOfflineMarketShopBatchqueryModel)

查询商户的门店编号列表

系统商通过该接口可以查询对应APPID下所有的门店编号（支付宝口碑门店编号）

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOfflineMarketShopApi;

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

    AlipayOfflineMarketShopApi apiInstance = new AlipayOfflineMarketShopApi(defaultClient);
    AlipayOfflineMarketShopBatchqueryModel alipayOfflineMarketShopBatchqueryModel = new AlipayOfflineMarketShopBatchqueryModel(); // AlipayOfflineMarketShopBatchqueryModel | 
    try {
      AlipayOfflineMarketShopBatchqueryResponseModel result = apiInstance.batchquery(alipayOfflineMarketShopBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOfflineMarketShopApi#batchquery");
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
| **alipayOfflineMarketShopBatchqueryModel** | **AlipayOfflineMarketShopBatchqueryModel**|  | [optional] |

### Return type

**AlipayOfflineMarketShopBatchqueryResponseModel**

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
> AlipayOfflineMarketShopCreateResponseModel create(alipayOfflineMarketShopCreateModel)

创建门店信息

系统商需要通过该接口在口碑平台帮助商户创建门店信息。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOfflineMarketShopApi;

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

    AlipayOfflineMarketShopApi apiInstance = new AlipayOfflineMarketShopApi(defaultClient);
    AlipayOfflineMarketShopCreateModel alipayOfflineMarketShopCreateModel = new AlipayOfflineMarketShopCreateModel(); // AlipayOfflineMarketShopCreateModel | 
    try {
      AlipayOfflineMarketShopCreateResponseModel result = apiInstance.create(alipayOfflineMarketShopCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOfflineMarketShopApi#create");
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
| **alipayOfflineMarketShopCreateModel** | **AlipayOfflineMarketShopCreateModel**|  | [optional] |

### Return type

**AlipayOfflineMarketShopCreateResponseModel**

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
> AlipayOfflineMarketShopModifyResponseModel modify(alipayOfflineMarketShopModifyModel)

修改门店信息

系统商需要通过该接口在口碑平台帮助商户修改门店信息，所有的选项都为非必填项，需要修改什么信息就传入什么参数，不传入的参数，则保持不变。修改门店名、品牌名、品牌logo、首图、门店图片、营业执照、营业执照编号、营业执照名称、经营许可证、经营许可证有效期、门店授权函、是否在其它平台开店、在其它平台开店照片，会重新触发风控审核，修改其他字段不会触发风控审核。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOfflineMarketShopApi;

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

    AlipayOfflineMarketShopApi apiInstance = new AlipayOfflineMarketShopApi(defaultClient);
    AlipayOfflineMarketShopModifyModel alipayOfflineMarketShopModifyModel = new AlipayOfflineMarketShopModifyModel(); // AlipayOfflineMarketShopModifyModel | 
    try {
      AlipayOfflineMarketShopModifyResponseModel result = apiInstance.modify(alipayOfflineMarketShopModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOfflineMarketShopApi#modify");
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
| **alipayOfflineMarketShopModifyModel** | **AlipayOfflineMarketShopModifyModel**|  | [optional] |

### Return type

**AlipayOfflineMarketShopModifyResponseModel**

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

<a name="querydetail"></a>
# **querydetail**
> AlipayOfflineMarketShopQuerydetailResponseModel querydetail(shopId, opRole)

查询单个门店信息接口

系统商通过该接口可以查询单个门店的详细信息，包括门店基础信息，门店状态等信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOfflineMarketShopApi;

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

    AlipayOfflineMarketShopApi apiInstance = new AlipayOfflineMarketShopApi(defaultClient);
    String shopId = "2015052100077000000000120773"; // String | 支付宝门店ID
    String opRole = "MERCHANT或PROVIDER"; // String | 服务商及商户调用情况下务必传递。操作人角色，默认商户操作:MERCHANT；服务商操作：PROVIDER；ISV: 不需要填写
    try {
      AlipayOfflineMarketShopQuerydetailResponseModel result = apiInstance.querydetail(shopId, opRole);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOfflineMarketShopApi#querydetail");
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
| **shopId** | **String**| 支付宝门店ID | [optional] |
| **opRole** | **String**| 服务商及商户调用情况下务必传递。操作人角色，默认商户操作:MERCHANT；服务商操作：PROVIDER；ISV: 不需要填写 | [optional] |

### Return type

**AlipayOfflineMarketShopQuerydetailResponseModel**

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

