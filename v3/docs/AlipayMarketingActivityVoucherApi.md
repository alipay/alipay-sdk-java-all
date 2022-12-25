# AlipayMarketingActivityVoucherApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**append**](AlipayMarketingActivityVoucherApi.md#append) | **POST** /v3/alipay/marketing/activity/voucher/append | 追加支付券预算 |
| [**create**](AlipayMarketingActivityVoucherApi.md#create) | **POST** /v3/alipay/marketing/activity/voucher/create | 创建支付券 |
| [**modify**](AlipayMarketingActivityVoucherApi.md#modify) | **POST** /v3/alipay/marketing/activity/voucher/modify | 修改支付券基本信息 |
| [**publish**](AlipayMarketingActivityVoucherApi.md#publish) | **POST** /v3/alipay/marketing/activity/voucher/publish | 激活支付券 |
| [**query**](AlipayMarketingActivityVoucherApi.md#query) | **GET** /v3/alipay/marketing/activity/voucher/query | 查询支付券详情 |
| [**send**](AlipayMarketingActivityVoucherApi.md#send) | **POST** /v3/alipay/marketing/activity/voucher/send | 发放支付券 |
| [**stop**](AlipayMarketingActivityVoucherApi.md#stop) | **POST** /v3/alipay/marketing/activity/voucher/stop | 停止支付券 |


<a name="append"></a>
# **append**
> AlipayMarketingActivityVoucherAppendResponseModel append(alipayMarketingActivityVoucherAppendModel)

追加支付券预算

支付券激活成功后，调用该接口追加支付券预算。追加支付券预算接口同步返回请求受理结果，后续通过alipay.marketing.activity.message.appended消息接口异步发送追加支付券预算成功事件消息。  如果成功消息长时间未送达，请联系相关技术人员。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityVoucherApi;

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

    AlipayMarketingActivityVoucherApi apiInstance = new AlipayMarketingActivityVoucherApi(defaultClient);
    AlipayMarketingActivityVoucherAppendModel alipayMarketingActivityVoucherAppendModel = new AlipayMarketingActivityVoucherAppendModel(); // AlipayMarketingActivityVoucherAppendModel | 
    try {
      AlipayMarketingActivityVoucherAppendResponseModel result = apiInstance.append(alipayMarketingActivityVoucherAppendModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityVoucherApi#append");
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
| **alipayMarketingActivityVoucherAppendModel** | **AlipayMarketingActivityVoucherAppendModel**|  | [optional] |

### Return type

**AlipayMarketingActivityVoucherAppendResponseModel**

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
> AlipayMarketingActivityVoucherCreateResponseModel create(alipayMarketingActivityVoucherCreateModel)

创建支付券

商户通过调用此接口创建支付券，包括预充值&amp;免充值支付券，接口同步返回创建处理结果。创建完成后将获得活动id，可用于各个营销场景的活动投放。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityVoucherApi;

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

    AlipayMarketingActivityVoucherApi apiInstance = new AlipayMarketingActivityVoucherApi(defaultClient);
    AlipayMarketingActivityVoucherCreateModel alipayMarketingActivityVoucherCreateModel = new AlipayMarketingActivityVoucherCreateModel(); // AlipayMarketingActivityVoucherCreateModel | 
    try {
      AlipayMarketingActivityVoucherCreateResponseModel result = apiInstance.create(alipayMarketingActivityVoucherCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityVoucherApi#create");
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
| **alipayMarketingActivityVoucherCreateModel** | **AlipayMarketingActivityVoucherCreateModel**|  | [optional] |

### Return type

**AlipayMarketingActivityVoucherCreateResponseModel**

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

<a name="modify"></a>
# **modify**
> Object modify(alipayMarketingActivityVoucherModifyModel)

修改支付券基本信息

商户可以通过该接口修改支付券基本信息。 接口同步返回修改请求受理结果，后续通过alipay.marketing.activity.message.modified消息接口异步发送修改活动成功事件消息。   特别注意：修改支付券接口返回结果并不代表活动修改成功，必须等待消息回调后才能确保成功。 如果成功消息长时间未送达，请联系相关技术人员。 

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityVoucherApi;

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

    AlipayMarketingActivityVoucherApi apiInstance = new AlipayMarketingActivityVoucherApi(defaultClient);
    AlipayMarketingActivityVoucherModifyModel alipayMarketingActivityVoucherModifyModel = new AlipayMarketingActivityVoucherModifyModel(); // AlipayMarketingActivityVoucherModifyModel | 
    try {
      Object result = apiInstance.modify(alipayMarketingActivityVoucherModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityVoucherApi#modify");
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
| **alipayMarketingActivityVoucherModifyModel** | **AlipayMarketingActivityVoucherModifyModel**|  | [optional] |

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

<a name="publish"></a>
# **publish**
> AlipayMarketingActivityVoucherPublishResponseModel publish(alipayMarketingActivityVoucherPublishModel)

激活支付券

支付券创建成功后，通过调用此接口激活支付券。 激活支付券接口同步返回请求受理结果，后续通过alipay.marketing.activity.message.created消息接口异步发送激活支付券成功事件消息。 如果成功消息长时间未送达，请联系相关技术人员。 

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityVoucherApi;

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

    AlipayMarketingActivityVoucherApi apiInstance = new AlipayMarketingActivityVoucherApi(defaultClient);
    AlipayMarketingActivityVoucherPublishModel alipayMarketingActivityVoucherPublishModel = new AlipayMarketingActivityVoucherPublishModel(); // AlipayMarketingActivityVoucherPublishModel | 
    try {
      AlipayMarketingActivityVoucherPublishResponseModel result = apiInstance.publish(alipayMarketingActivityVoucherPublishModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityVoucherApi#publish");
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
| **alipayMarketingActivityVoucherPublishModel** | **AlipayMarketingActivityVoucherPublishModel**|  | [optional] |

### Return type

**AlipayMarketingActivityVoucherPublishResponseModel**

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
> AlipayMarketingActivityVoucherQueryResponseModel query(activityId, merchantAccessMode)

查询支付券详情

通过此接口可查询支付券活动信息，包括活动的配置信息以及活动概况数据。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityVoucherApi;

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

    AlipayMarketingActivityVoucherApi apiInstance = new AlipayMarketingActivityVoucherApi(defaultClient);
    String activityId = "2016042700826004508401111111"; // String | 活动 id
    String merchantAccessMode = "AGENCY_MODE"; // String | 商户接入模式。
    try {
      AlipayMarketingActivityVoucherQueryResponseModel result = apiInstance.query(activityId, merchantAccessMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityVoucherApi#query");
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
| **activityId** | **String**| 活动 id | [optional] |
| **merchantAccessMode** | **String**| 商户接入模式。 | [optional] |

### Return type

**AlipayMarketingActivityVoucherQueryResponseModel**

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

<a name="send"></a>
# **send**
> AlipayMarketingActivityVoucherSendResponseModel send(alipayMarketingActivityVoucherSendModel)

发放支付券

API完成制券后，可使用发放支付券接口发券。通过调用此接口可发放支付券给指定用户，发券场景可以是小程序、H5、APP等。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityVoucherApi;

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

    AlipayMarketingActivityVoucherApi apiInstance = new AlipayMarketingActivityVoucherApi(defaultClient);
    AlipayMarketingActivityVoucherSendModel alipayMarketingActivityVoucherSendModel = new AlipayMarketingActivityVoucherSendModel(); // AlipayMarketingActivityVoucherSendModel | 
    try {
      AlipayMarketingActivityVoucherSendResponseModel result = apiInstance.send(alipayMarketingActivityVoucherSendModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityVoucherApi#send");
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
| **alipayMarketingActivityVoucherSendModel** | **AlipayMarketingActivityVoucherSendModel**|  | [optional] |

### Return type

**AlipayMarketingActivityVoucherSendResponseModel**

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

<a name="stop"></a>
# **stop**
> Object stop(alipayMarketingActivityVoucherStopModel)

停止支付券

商家调用该接口停止支付券。 停止支付券接口同步返回请求受理结果，后续通过alipay.marketing.activity.message.stopped消息接口异步发送停止活动成功事件。 如果成功消息长时间未送达，请联系相关技术人员。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityVoucherApi;

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

    AlipayMarketingActivityVoucherApi apiInstance = new AlipayMarketingActivityVoucherApi(defaultClient);
    AlipayMarketingActivityVoucherStopModel alipayMarketingActivityVoucherStopModel = new AlipayMarketingActivityVoucherStopModel(); // AlipayMarketingActivityVoucherStopModel | 
    try {
      Object result = apiInstance.stop(alipayMarketingActivityVoucherStopModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityVoucherApi#stop");
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
| **alipayMarketingActivityVoucherStopModel** | **AlipayMarketingActivityVoucherStopModel**|  | [optional] |

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

