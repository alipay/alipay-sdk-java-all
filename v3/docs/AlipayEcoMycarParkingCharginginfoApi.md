# AlipayEcoMycarParkingCharginginfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sync**](AlipayEcoMycarParkingCharginginfoApi.md#sync) | **POST** /v3/alipay/eco/mycar/parking/charginginfo/sync | 车辆停车计费接口 |


<a name="sync"></a>
# **sync**
> Object sync(alipayEcoMycarParkingCharginginfoSyncModel)

车辆停车计费接口

上传车辆在停车场的计费信息，将停车动作推进到计费状态，上传信息通过该接口提交到支付宝，支付宝返回对应的信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoMycarParkingCharginginfoApi;

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

    AlipayEcoMycarParkingCharginginfoApi apiInstance = new AlipayEcoMycarParkingCharginginfoApi(defaultClient);
    AlipayEcoMycarParkingCharginginfoSyncModel alipayEcoMycarParkingCharginginfoSyncModel = new AlipayEcoMycarParkingCharginginfoSyncModel(); // AlipayEcoMycarParkingCharginginfoSyncModel | 
    try {
      Object result = apiInstance.sync(alipayEcoMycarParkingCharginginfoSyncModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoMycarParkingCharginginfoApi#sync");
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
| **alipayEcoMycarParkingCharginginfoSyncModel** | **AlipayEcoMycarParkingCharginginfoSyncModel**|  | [optional] |

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

