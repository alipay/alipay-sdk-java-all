# AlipayEcoMycarParkingSpaceinfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sync**](AlipayEcoMycarParkingSpaceinfoApi.md#sync) | **POST** /v3/alipay/eco/mycar/parking/spaceinfo/sync | 停车场车位信息同步 |


<a name="sync"></a>
# **sync**
> AlipayEcoMycarParkingSpaceinfoSyncResponseModel sync(alipayEcoMycarParkingSpaceinfoSyncModel)

停车场车位信息同步

停车场位置信息同步

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoMycarParkingSpaceinfoApi;

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

    AlipayEcoMycarParkingSpaceinfoApi apiInstance = new AlipayEcoMycarParkingSpaceinfoApi(defaultClient);
    AlipayEcoMycarParkingSpaceinfoSyncModel alipayEcoMycarParkingSpaceinfoSyncModel = new AlipayEcoMycarParkingSpaceinfoSyncModel(); // AlipayEcoMycarParkingSpaceinfoSyncModel | 
    try {
      AlipayEcoMycarParkingSpaceinfoSyncResponseModel result = apiInstance.sync(alipayEcoMycarParkingSpaceinfoSyncModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoMycarParkingSpaceinfoApi#sync");
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
| **alipayEcoMycarParkingSpaceinfoSyncModel** | **AlipayEcoMycarParkingSpaceinfoSyncModel**|  | [optional] |

### Return type

**AlipayEcoMycarParkingSpaceinfoSyncResponseModel**

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

