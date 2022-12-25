# AlipayMerchantIotDeviceApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bind**](AlipayMerchantIotDeviceApi.md#bind) | **POST** /v3/alipay/merchant/iot/device/bind | IoT设备绑定门店 |
| [**query**](AlipayMerchantIotDeviceApi.md#query) | **GET** /v3/alipay/merchant/iot/device/query | IoT设备绑定关系查询 |
| [**verify**](AlipayMerchantIotDeviceApi.md#verify) | **POST** /v3/alipay/merchant/iot/device/verify | IoT设备绑定校验 |


<a name="bind"></a>
# **bind**
> Object bind(alipayMerchantIotDeviceBindModel)

IoT设备绑定门店

同步IoT设备、商户和门店的绑定关系

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMerchantIotDeviceApi;

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

    AlipayMerchantIotDeviceApi apiInstance = new AlipayMerchantIotDeviceApi(defaultClient);
    AlipayMerchantIotDeviceBindModel alipayMerchantIotDeviceBindModel = new AlipayMerchantIotDeviceBindModel(); // AlipayMerchantIotDeviceBindModel | 
    try {
      Object result = apiInstance.bind(alipayMerchantIotDeviceBindModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMerchantIotDeviceApi#bind");
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
| **alipayMerchantIotDeviceBindModel** | **AlipayMerchantIotDeviceBindModel**|  | [optional] |

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

<a name="query"></a>
# **query**
> AlipayMerchantIotDeviceQueryResponseModel query(deviceIdType, bizTid, supplierId, deviceSn)

IoT设备绑定关系查询

通过设备唯一标识查询设备绑定关系

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMerchantIotDeviceApi;

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

    AlipayMerchantIotDeviceApi apiInstance = new AlipayMerchantIotDeviceApi(defaultClient);
    String deviceIdType = "SN"; // String | 可选方式 [ID,SN]。ID-使用biztid作为设备唯一识别标识；SN-使用supplier_id、device_sn联合作为设备唯一识别标识。由于不同机型的supplier_id不同，推荐使用 ID 。
    String bizTid = "01017gV1CZ1XxASNbqkTJqchletNyVXtsKy1PAs4FKZ6tjRMqyMG2Zk"; // String | 设备 ID ，device_id_type 为 ID 时填写。
    String supplierId = "201812271300540049"; // String | 设备供应商ID ，device_id_type 为 SN 时填写。需注意不同机型的供应商ID可能不同。
    String deviceSn = "QCF420190316000107"; // String | 设备序列号 ，device_id_type 为 SN 时填写。需配合supplier_id使用。
    try {
      AlipayMerchantIotDeviceQueryResponseModel result = apiInstance.query(deviceIdType, bizTid, supplierId, deviceSn);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMerchantIotDeviceApi#query");
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
| **deviceIdType** | **String**| 可选方式 [ID,SN]。ID-使用biztid作为设备唯一识别标识；SN-使用supplier_id、device_sn联合作为设备唯一识别标识。由于不同机型的supplier_id不同，推荐使用 ID 。 | [optional] |
| **bizTid** | **String**| 设备 ID ，device_id_type 为 ID 时填写。 | [optional] |
| **supplierId** | **String**| 设备供应商ID ，device_id_type 为 SN 时填写。需注意不同机型的供应商ID可能不同。 | [optional] |
| **deviceSn** | **String**| 设备序列号 ，device_id_type 为 SN 时填写。需配合supplier_id使用。 | [optional] |

### Return type

**AlipayMerchantIotDeviceQueryResponseModel**

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

<a name="verify"></a>
# **verify**
> Object verify(alipayMerchantIotDeviceVerifyModel)

IoT设备绑定校验

校验IoT设备和商户收单账号的对应关系

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMerchantIotDeviceApi;

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

    AlipayMerchantIotDeviceApi apiInstance = new AlipayMerchantIotDeviceApi(defaultClient);
    AlipayMerchantIotDeviceVerifyModel alipayMerchantIotDeviceVerifyModel = new AlipayMerchantIotDeviceVerifyModel(); // AlipayMerchantIotDeviceVerifyModel | 
    try {
      Object result = apiInstance.verify(alipayMerchantIotDeviceVerifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMerchantIotDeviceApi#verify");
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
| **alipayMerchantIotDeviceVerifyModel** | **AlipayMerchantIotDeviceVerifyModel**|  | [optional] |

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

