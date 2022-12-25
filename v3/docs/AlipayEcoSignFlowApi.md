# AlipayEcoSignFlowApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancel**](AlipayEcoSignFlowApi.md#cancel) | **POST** /v3/alipay/eco/sign/flow/cancel | 签署流程撤销（E签宝） |
| [**create**](AlipayEcoSignFlowApi.md#create) | **POST** /v3/alipay/eco/sign/flow/create | 创建流程（E签宝） |
| [**finish**](AlipayEcoSignFlowApi.md#finish) | **POST** /v3/alipay/eco/sign/flow/finish | 签署流程归档 |
| [**query**](AlipayEcoSignFlowApi.md#query) | **GET** /v3/alipay/eco/sign/flow/query | 签署流程查询（E签宝） |


<a name="cancel"></a>
# **cancel**
> Object cancel(targetAppId, alipayEcoSignFlowCancelModel)

签署流程撤销（E签宝）

签署流程撤销（E签宝）

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoSignFlowApi;

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

    AlipayEcoSignFlowApi apiInstance = new AlipayEcoSignFlowApi(defaultClient);
    String targetAppId = "targetAppId_example"; // String | 目标isv应用ID
    AlipayEcoSignFlowCancelModel alipayEcoSignFlowCancelModel = new AlipayEcoSignFlowCancelModel(); // AlipayEcoSignFlowCancelModel | 
    try {
      Object result = apiInstance.cancel(targetAppId, alipayEcoSignFlowCancelModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoSignFlowApi#cancel");
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
| **targetAppId** | **String**| 目标isv应用ID | [optional] |
| **alipayEcoSignFlowCancelModel** | **AlipayEcoSignFlowCancelModel**|  | [optional] |

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

<a name="create"></a>
# **create**
> AlipayEcoSignFlowCreateResponseModel create(targetAppId, alipayEcoSignFlowCreateModel)

创建流程（E签宝）

创建流程（E签宝）。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoSignFlowApi;

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

    AlipayEcoSignFlowApi apiInstance = new AlipayEcoSignFlowApi(defaultClient);
    String targetAppId = "targetAppId_example"; // String | 目标isv应用ID
    AlipayEcoSignFlowCreateModel alipayEcoSignFlowCreateModel = new AlipayEcoSignFlowCreateModel(); // AlipayEcoSignFlowCreateModel | 
    try {
      AlipayEcoSignFlowCreateResponseModel result = apiInstance.create(targetAppId, alipayEcoSignFlowCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoSignFlowApi#create");
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
| **targetAppId** | **String**| 目标isv应用ID | [optional] |
| **alipayEcoSignFlowCreateModel** | **AlipayEcoSignFlowCreateModel**|  | [optional] |

### Return type

**AlipayEcoSignFlowCreateResponseModel**

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

<a name="finish"></a>
# **finish**
> Object finish(targetAppId, alipayEcoSignFlowFinishModel)

签署流程归档

手动归档签署流程，归档后所有资源不可修改，归档前签署流程中的所有签署人必须都签署完成。如果创建流程时，设置了自动归档，则无需调用本接口，签署完成后系统会自动调用。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoSignFlowApi;

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

    AlipayEcoSignFlowApi apiInstance = new AlipayEcoSignFlowApi(defaultClient);
    String targetAppId = "targetAppId_example"; // String | 目标isv应用ID
    AlipayEcoSignFlowFinishModel alipayEcoSignFlowFinishModel = new AlipayEcoSignFlowFinishModel(); // AlipayEcoSignFlowFinishModel | 
    try {
      Object result = apiInstance.finish(targetAppId, alipayEcoSignFlowFinishModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoSignFlowApi#finish");
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
| **targetAppId** | **String**| 目标isv应用ID | [optional] |
| **alipayEcoSignFlowFinishModel** | **AlipayEcoSignFlowFinishModel**|  | [optional] |

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
> AlipayEcoSignFlowQueryResponseModel query(targetAppId, flowId)

签署流程查询（E签宝）

签署流程查询（E签宝）。可通过此接口查询流程、签署人的签署状态。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoSignFlowApi;

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

    AlipayEcoSignFlowApi apiInstance = new AlipayEcoSignFlowApi(defaultClient);
    String targetAppId = "targetAppId_example"; // String | 目标isv应用ID
    String flowId = "429b1d3038854cabbcdac0a63d7e4c0d"; // String | 流程id，通过 <a href =\"https://opendocs.alipay.com/apis/api_50/alipay.eco.contract.signflows.create\">创建电子合同签署流程</a>(alipay.eco.contract.signflows.create)接口获取。
    try {
      AlipayEcoSignFlowQueryResponseModel result = apiInstance.query(targetAppId, flowId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoSignFlowApi#query");
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
| **targetAppId** | **String**| 目标isv应用ID | [optional] |
| **flowId** | **String**| 流程id，通过 &lt;a href &#x3D;\&quot;https://opendocs.alipay.com/apis/api_50/alipay.eco.contract.signflows.create\&quot;&gt;创建电子合同签署流程&lt;/a&gt;(alipay.eco.contract.signflows.create)接口获取。 | [optional] |

### Return type

**AlipayEcoSignFlowQueryResponseModel**

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

