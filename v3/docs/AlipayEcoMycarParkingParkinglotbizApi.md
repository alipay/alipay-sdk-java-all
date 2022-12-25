# AlipayEcoMycarParkingParkinglotbizApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**transfer**](AlipayEcoMycarParkingParkinglotbizApi.md#transfer) | **POST** /v3/alipay/eco/mycar/parking/parkinglotbiz/transfer | 车场业务归属配置 |


<a name="transfer"></a>
# **transfer**
> Object transfer(alipayEcoMycarParkingParkinglotbizTransferModel)

车场业务归属配置

解决车场多isv接管问题，可以通过归属灵活控制权限。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoMycarParkingParkinglotbizApi;

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

    AlipayEcoMycarParkingParkinglotbizApi apiInstance = new AlipayEcoMycarParkingParkinglotbizApi(defaultClient);
    AlipayEcoMycarParkingParkinglotbizTransferModel alipayEcoMycarParkingParkinglotbizTransferModel = new AlipayEcoMycarParkingParkinglotbizTransferModel(); // AlipayEcoMycarParkingParkinglotbizTransferModel | 
    try {
      Object result = apiInstance.transfer(alipayEcoMycarParkingParkinglotbizTransferModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoMycarParkingParkinglotbizApi#transfer");
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
| **alipayEcoMycarParkingParkinglotbizTransferModel** | **AlipayEcoMycarParkingParkinglotbizTransferModel**|  | [optional] |

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

