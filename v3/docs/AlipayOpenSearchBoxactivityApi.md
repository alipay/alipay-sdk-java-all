# AlipayOpenSearchBoxactivityApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apply**](AlipayOpenSearchBoxactivityApi.md#apply) | **POST** /v3/alipay/open/search/boxactivity/apply | 申请创建搜索直达活动配置 |
| [**query**](AlipayOpenSearchBoxactivityApi.md#query) | **GET** /v3/alipay/open/search/boxactivity/query | 查询搜索直达活动配置详情 |


<a name="apply"></a>
# **apply**
> AlipayOpenSearchBoxactivityApplyResponseModel apply(alipayOpenSearchBoxactivityApplyModel)

申请创建搜索直达活动配置

当搜索直达处于上架状态时，通过该接口来创建banner活动。相关概念和说明详见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/mini/03fjba\&quot;&gt; 搜索直达 &lt;/a&gt;。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSearchBoxactivityApi;

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

    AlipayOpenSearchBoxactivityApi apiInstance = new AlipayOpenSearchBoxactivityApi(defaultClient);
    AlipayOpenSearchBoxactivityApplyModel alipayOpenSearchBoxactivityApplyModel = new AlipayOpenSearchBoxactivityApplyModel(); // AlipayOpenSearchBoxactivityApplyModel | 
    try {
      AlipayOpenSearchBoxactivityApplyResponseModel result = apiInstance.apply(alipayOpenSearchBoxactivityApplyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSearchBoxactivityApi#apply");
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
| **alipayOpenSearchBoxactivityApplyModel** | **AlipayOpenSearchBoxactivityApplyModel**|  | [optional] |

### Return type

**AlipayOpenSearchBoxactivityApplyResponseModel**

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
> AlipayOpenSearchBoxactivityQueryResponseModel query(boxActivityId, merchantId)

查询搜索直达活动配置详情

查询单个搜索直达banner的活动信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSearchBoxactivityApi;

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

    AlipayOpenSearchBoxactivityApi apiInstance = new AlipayOpenSearchBoxactivityApi(defaultClient);
    String boxActivityId = "20211223000000100000"; // String | 搜索直达活动id
    String merchantId = "2088xxxxxxxxxxxx"; // String | 商户id，代运营模式下传入。代运营模式，需要服务商已获得商家\"运营支付宝小程序\"授权。
    try {
      AlipayOpenSearchBoxactivityQueryResponseModel result = apiInstance.query(boxActivityId, merchantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSearchBoxactivityApi#query");
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
| **boxActivityId** | **String**| 搜索直达活动id | [optional] |
| **merchantId** | **String**| 商户id，代运营模式下传入。代运营模式，需要服务商已获得商家\&quot;运营支付宝小程序\&quot;授权。 | [optional] |

### Return type

**AlipayOpenSearchBoxactivityQueryResponseModel**

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

