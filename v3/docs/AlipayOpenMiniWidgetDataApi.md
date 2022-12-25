# AlipayOpenMiniWidgetDataApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sync**](AlipayOpenMiniWidgetDataApi.md#sync) | **POST** /v3/alipay/open/mini/widget/data/sync | 小程序橱窗数据同步 |


<a name="sync"></a>
# **sync**
> AlipayOpenMiniWidgetDataSyncResponseModel sync(alipayOpenMiniWidgetDataSyncModel)

小程序橱窗数据同步

面向商品售卖类的小程序橱窗，提供的橱窗内展示数据同步能力，同步后会进行文本和图片信息审核，审核完成后通知结果通过openmq消息通知

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniWidgetDataApi;

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

    AlipayOpenMiniWidgetDataApi apiInstance = new AlipayOpenMiniWidgetDataApi(defaultClient);
    AlipayOpenMiniWidgetDataSyncModel alipayOpenMiniWidgetDataSyncModel = new AlipayOpenMiniWidgetDataSyncModel(); // AlipayOpenMiniWidgetDataSyncModel | 
    try {
      AlipayOpenMiniWidgetDataSyncResponseModel result = apiInstance.sync(alipayOpenMiniWidgetDataSyncModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniWidgetDataApi#sync");
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
| **alipayOpenMiniWidgetDataSyncModel** | **AlipayOpenMiniWidgetDataSyncModel**|  | [optional] |

### Return type

**AlipayOpenMiniWidgetDataSyncResponseModel**

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

