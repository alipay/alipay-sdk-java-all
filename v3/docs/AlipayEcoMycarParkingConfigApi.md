# AlipayEcoMycarParkingConfigApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayEcoMycarParkingConfigApi.md#query) | **GET** /v3/alipay/eco/mycar/parking/config/query | ISV系统配置查询接口 |
| [**set**](AlipayEcoMycarParkingConfigApi.md#set) | **POST** /v3/alipay/eco/mycar/parking/config/set | 停车ISV系统配置接口 |


<a name="query"></a>
# **query**
> AlipayEcoMycarParkingConfigQueryResponseModel query(interfaceName, interfaceType)

ISV系统配置查询接口

ISV通过该接口，查询ISV已注册到车主平台停车业务系统配置信息。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoMycarParkingConfigApi;

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

    AlipayEcoMycarParkingConfigApi apiInstance = new AlipayEcoMycarParkingConfigApi(defaultClient);
    String interfaceName = "alipay.eco.mycar.parking.userpage.query"; // String | 接口名称。H5传入参数固定值：alipay.eco.mycar.parking.userpage.query； 小程序传入参数固定值：alipay.eco.mycar.parking.isv.homepage； 协议状态变更通知传入参数固定值： alipay.eco.mycar.parking.agreement.notify。
    String interfaceType = "interface_page"; // String | 接口类型。H5、小程序传入参数固定值：interface_page； 通知接口传入参数固定值：interface_service。
    try {
      AlipayEcoMycarParkingConfigQueryResponseModel result = apiInstance.query(interfaceName, interfaceType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoMycarParkingConfigApi#query");
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
| **interfaceName** | **String**| 接口名称。H5传入参数固定值：alipay.eco.mycar.parking.userpage.query； 小程序传入参数固定值：alipay.eco.mycar.parking.isv.homepage； 协议状态变更通知传入参数固定值： alipay.eco.mycar.parking.agreement.notify。 | [optional] |
| **interfaceType** | **String**| 接口类型。H5、小程序传入参数固定值：interface_page； 通知接口传入参数固定值：interface_service。 | [optional] |

### Return type

**AlipayEcoMycarParkingConfigQueryResponseModel**

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

<a name="set"></a>
# **set**
> Object set(alipayEcoMycarParkingConfigSetModel)

停车ISV系统配置接口

ISV通过该接口，配置车主平台各业务所需要的ISV的系统配置信息。如果接口配置存在则覆盖原有的接口信息。通过该接口设置的配置信息是立刻生效的，在调用该接口修改配置信息时请先评估对线上业务的影响，并做好处理方案。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoMycarParkingConfigApi;

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

    AlipayEcoMycarParkingConfigApi apiInstance = new AlipayEcoMycarParkingConfigApi(defaultClient);
    AlipayEcoMycarParkingConfigSetModel alipayEcoMycarParkingConfigSetModel = new AlipayEcoMycarParkingConfigSetModel(); // AlipayEcoMycarParkingConfigSetModel | 
    try {
      Object result = apiInstance.set(alipayEcoMycarParkingConfigSetModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoMycarParkingConfigApi#set");
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
| **alipayEcoMycarParkingConfigSetModel** | **AlipayEcoMycarParkingConfigSetModel**|  | [optional] |

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

