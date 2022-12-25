# ZhimaCreditPeZmgoCumulationApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sync**](ZhimaCreditPeZmgoCumulationApi.md#sync) | **POST** /v3/zhima/credit/pe/zmgo/cumulation/sync | 芝麻go用户数据回传 |


<a name="sync"></a>
# **sync**
> ZhimaCreditPeZmgoCumulationSyncResponseModel sync(zhimaCreditPeZmgoCumulationSyncModel)

芝麻go用户数据回传

芝麻go商户通过此api接口，将用户行为数据回传到芝麻侧，数据包括：交易型数据（订单信息、优惠信息）和非交易型数据（用户完成任务次数）。芝麻侧将回传的数据在C端向用户展示，并且在结算时对结算金额进行校验（可选）。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaCreditPeZmgoCumulationApi;

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

    ZhimaCreditPeZmgoCumulationApi apiInstance = new ZhimaCreditPeZmgoCumulationApi(defaultClient);
    ZhimaCreditPeZmgoCumulationSyncModel zhimaCreditPeZmgoCumulationSyncModel = new ZhimaCreditPeZmgoCumulationSyncModel(); // ZhimaCreditPeZmgoCumulationSyncModel | 
    try {
      ZhimaCreditPeZmgoCumulationSyncResponseModel result = apiInstance.sync(zhimaCreditPeZmgoCumulationSyncModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaCreditPeZmgoCumulationApi#sync");
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
| **zhimaCreditPeZmgoCumulationSyncModel** | **ZhimaCreditPeZmgoCumulationSyncModel**|  | [optional] |

### Return type

**ZhimaCreditPeZmgoCumulationSyncResponseModel**

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

