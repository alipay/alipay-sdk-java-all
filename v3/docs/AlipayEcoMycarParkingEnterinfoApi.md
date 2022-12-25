# AlipayEcoMycarParkingEnterinfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sync**](AlipayEcoMycarParkingEnterinfoApi.md#sync) | **POST** /v3/alipay/eco/mycar/parking/enterinfo/sync | 车辆驶入接口 |


<a name="sync"></a>
# **sync**
> AlipayEcoMycarParkingEnterinfoSyncResponseModel sync(alipayEcoMycarParkingEnterinfoSyncModel)

车辆驶入接口

上传车辆驶入信息，上传信息通过该接口提交到支付宝，支付宝返回对应的信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoMycarParkingEnterinfoApi;

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

    AlipayEcoMycarParkingEnterinfoApi apiInstance = new AlipayEcoMycarParkingEnterinfoApi(defaultClient);
    AlipayEcoMycarParkingEnterinfoSyncModel alipayEcoMycarParkingEnterinfoSyncModel = new AlipayEcoMycarParkingEnterinfoSyncModel(); // AlipayEcoMycarParkingEnterinfoSyncModel | 
    try {
      AlipayEcoMycarParkingEnterinfoSyncResponseModel result = apiInstance.sync(alipayEcoMycarParkingEnterinfoSyncModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoMycarParkingEnterinfoApi#sync");
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
| **alipayEcoMycarParkingEnterinfoSyncModel** | **AlipayEcoMycarParkingEnterinfoSyncModel**|  | [optional] |

### Return type

**AlipayEcoMycarParkingEnterinfoSyncResponseModel**

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

