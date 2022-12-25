# AlipayEcoMycarParkingChargeinfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sync**](AlipayEcoMycarParkingChargeinfoApi.md#sync) | **POST** /v3/alipay/eco/mycar/parking/chargeinfo/sync | 停车场价格信息同步 |


<a name="sync"></a>
# **sync**
> AlipayEcoMycarParkingChargeinfoSyncResponseModel sync(alipayEcoMycarParkingChargeinfoSyncModel)

停车场价格信息同步

停车场价格信息同步

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoMycarParkingChargeinfoApi;

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

    AlipayEcoMycarParkingChargeinfoApi apiInstance = new AlipayEcoMycarParkingChargeinfoApi(defaultClient);
    AlipayEcoMycarParkingChargeinfoSyncModel alipayEcoMycarParkingChargeinfoSyncModel = new AlipayEcoMycarParkingChargeinfoSyncModel(); // AlipayEcoMycarParkingChargeinfoSyncModel | 
    try {
      AlipayEcoMycarParkingChargeinfoSyncResponseModel result = apiInstance.sync(alipayEcoMycarParkingChargeinfoSyncModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoMycarParkingChargeinfoApi#sync");
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
| **alipayEcoMycarParkingChargeinfoSyncModel** | **AlipayEcoMycarParkingChargeinfoSyncModel**|  | [optional] |

### Return type

**AlipayEcoMycarParkingChargeinfoSyncResponseModel**

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

