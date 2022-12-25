# AlipayEcoMycarParkingExitinfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sync**](AlipayEcoMycarParkingExitinfoApi.md#sync) | **POST** /v3/alipay/eco/mycar/parking/exitinfo/sync | 车辆驶出接口 |


<a name="sync"></a>
# **sync**
> Object sync(alipayEcoMycarParkingExitinfoSyncModel)

车辆驶出接口

上传车辆驶出信息，上传信息通过该接口提交到支付宝，支付宝返回对应的信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoMycarParkingExitinfoApi;

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

    AlipayEcoMycarParkingExitinfoApi apiInstance = new AlipayEcoMycarParkingExitinfoApi(defaultClient);
    AlipayEcoMycarParkingExitinfoSyncModel alipayEcoMycarParkingExitinfoSyncModel = new AlipayEcoMycarParkingExitinfoSyncModel(); // AlipayEcoMycarParkingExitinfoSyncModel | 
    try {
      Object result = apiInstance.sync(alipayEcoMycarParkingExitinfoSyncModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoMycarParkingExitinfoApi#sync");
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
| **alipayEcoMycarParkingExitinfoSyncModel** | **AlipayEcoMycarParkingExitinfoSyncModel**|  | [optional] |

### Return type

**Object**

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

