# AlipayEcoMycarParkingParkinglotinfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayEcoMycarParkingParkinglotinfoApi.md#create) | **POST** /v3/alipay/eco/mycar/parking/parkinglotinfo/create | 录入停车场信息 |
| [**query**](AlipayEcoMycarParkingParkinglotinfoApi.md#query) | **GET** /v3/alipay/eco/mycar/parking/parkinglotinfo/query | 停车场信息查询 |
| [**update**](AlipayEcoMycarParkingParkinglotinfoApi.md#update) | **POST** /v3/alipay/eco/mycar/parking/parkinglotinfo/update | 修改停车场信息 |


<a name="create"></a>
# **create**
> AlipayEcoMycarParkingParkinglotinfoCreateResponseModel create(alipayEcoMycarParkingParkinglotinfoCreateModel)

录入停车场信息

录入停车场信息，内容信息通过该接口提交到支付宝，支付宝会生成支付宝这边停车场ID反馈给开发者，用户后续更新和上送车辆信息。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoMycarParkingParkinglotinfoApi;

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

    AlipayEcoMycarParkingParkinglotinfoApi apiInstance = new AlipayEcoMycarParkingParkinglotinfoApi(defaultClient);
    AlipayEcoMycarParkingParkinglotinfoCreateModel alipayEcoMycarParkingParkinglotinfoCreateModel = new AlipayEcoMycarParkingParkinglotinfoCreateModel(); // AlipayEcoMycarParkingParkinglotinfoCreateModel | 
    try {
      AlipayEcoMycarParkingParkinglotinfoCreateResponseModel result = apiInstance.create(alipayEcoMycarParkingParkinglotinfoCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoMycarParkingParkinglotinfoApi#create");
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
| **alipayEcoMycarParkingParkinglotinfoCreateModel** | **AlipayEcoMycarParkingParkinglotinfoCreateModel**|  | [optional] |

### Return type

**AlipayEcoMycarParkingParkinglotinfoCreateResponseModel**

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

<a name="query"></a>
# **query**
> AlipayEcoMycarParkingParkinglotinfoQueryResponseModel query(parkingId, outParkingId)

停车场信息查询

停车场信息查询，通过停车场id或者ISV停车场ID查询停车场信息。只能查询正在调用接口商户自己创建的停车场，限制在归属PID层面上。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoMycarParkingParkinglotinfoApi;

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

    AlipayEcoMycarParkingParkinglotinfoApi apiInstance = new AlipayEcoMycarParkingParkinglotinfoApi(defaultClient);
    String parkingId = "PI1535687028031821446"; // String | 支付宝停车平台ID，由支付宝定义的该停车场标识，同一个ISV或商户范围内唯一。通过 <a href=\"https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create\">alipay.eco.mycar.parking.parkinglotinfo.create</a>(录入停车场信息)接口获取。 注意：parking_id和out_parking_id不能同时为空。
    String outParkingId = "10000110001"; // String | ISV停车场ID，由ISV定义的停车场标识，同一个ISV或商户范围内唯一。需与 <a href=\"https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create\">alipay.eco.mycar.parking.parkinglotinfo.create</a>(录入停车场信息)接口传入值一致。 注意：parking_id和out_parking_id不能同时为空。
    try {
      AlipayEcoMycarParkingParkinglotinfoQueryResponseModel result = apiInstance.query(parkingId, outParkingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoMycarParkingParkinglotinfoApi#query");
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
| **parkingId** | **String**| 支付宝停车平台ID，由支付宝定义的该停车场标识，同一个ISV或商户范围内唯一。通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create\&quot;&gt;alipay.eco.mycar.parking.parkinglotinfo.create&lt;/a&gt;(录入停车场信息)接口获取。 注意：parking_id和out_parking_id不能同时为空。 | [optional] |
| **outParkingId** | **String**| ISV停车场ID，由ISV定义的停车场标识，同一个ISV或商户范围内唯一。需与 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create\&quot;&gt;alipay.eco.mycar.parking.parkinglotinfo.create&lt;/a&gt;(录入停车场信息)接口传入值一致。 注意：parking_id和out_parking_id不能同时为空。 | [optional] |

### Return type

**AlipayEcoMycarParkingParkinglotinfoQueryResponseModel**

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

<a name="update"></a>
# **update**
> AlipayEcoMycarParkingParkinglotinfoUpdateResponseModel update(alipayEcoMycarParkingParkinglotinfoUpdateModel)

修改停车场信息

录入停车场信息，内容信息通过该接口提交到支付宝，支付宝会生成支付宝这边停车场ID反馈给开发者，用于后续更新和上送车辆信息，停车场名称不允许修改。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoMycarParkingParkinglotinfoApi;

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

    AlipayEcoMycarParkingParkinglotinfoApi apiInstance = new AlipayEcoMycarParkingParkinglotinfoApi(defaultClient);
    AlipayEcoMycarParkingParkinglotinfoUpdateModel alipayEcoMycarParkingParkinglotinfoUpdateModel = new AlipayEcoMycarParkingParkinglotinfoUpdateModel(); // AlipayEcoMycarParkingParkinglotinfoUpdateModel | 
    try {
      AlipayEcoMycarParkingParkinglotinfoUpdateResponseModel result = apiInstance.update(alipayEcoMycarParkingParkinglotinfoUpdateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoMycarParkingParkinglotinfoApi#update");
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
| **alipayEcoMycarParkingParkinglotinfoUpdateModel** | **AlipayEcoMycarParkingParkinglotinfoUpdateModel**|  | [optional] |

### Return type

**AlipayEcoMycarParkingParkinglotinfoUpdateResponseModel**

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

