# AlipayCommerceTransportChargerChargerbindinfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sync**](AlipayCommerceTransportChargerChargerbindinfoApi.md#sync) | **POST** /v3/alipay/commerce/transport/charger/chargerbindinfo/sync | 充电运营商同步用户绑定充电桩信息接口 |


<a name="sync"></a>
# **sync**
> AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel sync(authToken, alipayCommerceTransportChargerChargerbindinfoSyncModel)

充电运营商同步用户绑定充电桩信息接口

设备运营商通过该接口同步自己阵地中用户绑定充电桩的信息，包含绑定信息，解绑信息，设备状态等等设备信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceTransportChargerChargerbindinfoApi;

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

    AlipayCommerceTransportChargerChargerbindinfoApi apiInstance = new AlipayCommerceTransportChargerChargerbindinfoApi(defaultClient);
    String authToken = "authToken_example"; // String | 用户授权令牌
    AlipayCommerceTransportChargerChargerbindinfoSyncModel alipayCommerceTransportChargerChargerbindinfoSyncModel = new AlipayCommerceTransportChargerChargerbindinfoSyncModel(); // AlipayCommerceTransportChargerChargerbindinfoSyncModel | 
    try {
      AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel result = apiInstance.sync(authToken, alipayCommerceTransportChargerChargerbindinfoSyncModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceTransportChargerChargerbindinfoApi#sync");
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
| **alipayCommerceTransportChargerChargerbindinfoSyncModel** | **AlipayCommerceTransportChargerChargerbindinfoSyncModel**|  | [optional] |

### Return type

**AlipayCommerceTransportChargerChargerbindinfoSyncResponseModel**

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

