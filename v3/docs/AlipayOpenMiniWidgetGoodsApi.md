# AlipayOpenMiniWidgetGoodsApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modify**](AlipayOpenMiniWidgetGoodsApi.md#modify) | **PATCH** /v3/alipay/open/mini/widget/goods/modify | 小部件商品修改 |
| [**query**](AlipayOpenMiniWidgetGoodsApi.md#query) | **GET** /v3/alipay/open/mini/widget/goods/query | 小部件商品查询 |
| [**upload**](AlipayOpenMiniWidgetGoodsApi.md#upload) | **POST** /v3/alipay/open/mini/widget/goods/upload | 小部件商品上传 |


<a name="modify"></a>
# **modify**
> AlipayOpenMiniWidgetGoodsModifyResponseModel modify(alipayOpenMiniWidgetGoodsModifyModel)

小部件商品修改

面向商品售卖类的小部件，提供的商品信息修改能力，修改后会进行文本和图片信息审核，审核完成后通知结果通过openmq消息通知

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniWidgetGoodsApi;

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

    AlipayOpenMiniWidgetGoodsApi apiInstance = new AlipayOpenMiniWidgetGoodsApi(defaultClient);
    AlipayOpenMiniWidgetGoodsModifyModel alipayOpenMiniWidgetGoodsModifyModel = new AlipayOpenMiniWidgetGoodsModifyModel(); // AlipayOpenMiniWidgetGoodsModifyModel | 
    try {
      AlipayOpenMiniWidgetGoodsModifyResponseModel result = apiInstance.modify(alipayOpenMiniWidgetGoodsModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniWidgetGoodsApi#modify");
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
| **alipayOpenMiniWidgetGoodsModifyModel** | **AlipayOpenMiniWidgetGoodsModifyModel**|  | [optional] |

### Return type

**AlipayOpenMiniWidgetGoodsModifyResponseModel**

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
> AlipayOpenMiniWidgetGoodsQueryResponseModel query(miniAppId, pid, goodsId, pageNum, pageSize)

小部件商品查询

面向商品售卖类的小部件，提供商品信息查询能力，返回审核通过的商品信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniWidgetGoodsApi;

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

    AlipayOpenMiniWidgetGoodsApi apiInstance = new AlipayOpenMiniWidgetGoodsApi(defaultClient);
    String miniAppId = "2017072607907880"; // String | 根据承接品的商家小程序ID查询
    String pid = "2088xxxxxxxxx"; // String | 根据承接该品的小程序背后的商家查询
    String goodsId = "8948968498"; // String | 根据商品的唯一标识查询
    Integer pageNum = 1; // Integer | 查询第几页，最小值为1
    Integer pageSize = 10; // Integer | 查询页面数量，最大值为50
    try {
      AlipayOpenMiniWidgetGoodsQueryResponseModel result = apiInstance.query(miniAppId, pid, goodsId, pageNum, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniWidgetGoodsApi#query");
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
| **miniAppId** | **String**| 根据承接品的商家小程序ID查询 | [optional] |
| **pid** | **String**| 根据承接该品的小程序背后的商家查询 | [optional] |
| **goodsId** | **String**| 根据商品的唯一标识查询 | [optional] |
| **pageNum** | **Integer**| 查询第几页，最小值为1 | [optional] |
| **pageSize** | **Integer**| 查询页面数量，最大值为50 | [optional] |

### Return type

**AlipayOpenMiniWidgetGoodsQueryResponseModel**

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

<a name="upload"></a>
# **upload**
> AlipayOpenMiniWidgetGoodsUploadResponseModel upload(alipayOpenMiniWidgetGoodsUploadModel)

小部件商品上传

面向商品售卖类的小部件，提供的商品信息上传能力，上传后会进行文本和图片信息审核，审核完成后通知结果通过openmq消息通知

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniWidgetGoodsApi;

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

    AlipayOpenMiniWidgetGoodsApi apiInstance = new AlipayOpenMiniWidgetGoodsApi(defaultClient);
    AlipayOpenMiniWidgetGoodsUploadModel alipayOpenMiniWidgetGoodsUploadModel = new AlipayOpenMiniWidgetGoodsUploadModel(); // AlipayOpenMiniWidgetGoodsUploadModel | 
    try {
      AlipayOpenMiniWidgetGoodsUploadResponseModel result = apiInstance.upload(alipayOpenMiniWidgetGoodsUploadModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniWidgetGoodsApi#upload");
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
| **alipayOpenMiniWidgetGoodsUploadModel** | **AlipayOpenMiniWidgetGoodsUploadModel**|  | [optional] |

### Return type

**AlipayOpenMiniWidgetGoodsUploadResponseModel**

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

