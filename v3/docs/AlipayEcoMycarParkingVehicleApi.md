# AlipayEcoMycarParkingVehicleApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayEcoMycarParkingVehicleApi.md#query) | **POST** /v3/alipay/eco/mycar/parking/vehicle/query | 车牌查询接口 |


<a name="query"></a>
# **query**
> AlipayEcoMycarParkingVehicleQueryResponseModel query(authToken)

车牌查询接口

商户通过接口调用，获取用户车牌信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoMycarParkingVehicleApi;

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

    AlipayEcoMycarParkingVehicleApi apiInstance = new AlipayEcoMycarParkingVehicleApi(defaultClient);
    String authToken = "authToken_example"; // String | 用户授权令牌
    try {
      AlipayEcoMycarParkingVehicleQueryResponseModel result = apiInstance.query(authToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoMycarParkingVehicleApi#query");
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
| **authToken** | **String**| 用户授权令牌 | [optional] |

### Return type

**AlipayEcoMycarParkingVehicleQueryResponseModel**

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

