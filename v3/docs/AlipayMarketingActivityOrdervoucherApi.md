# AlipayMarketingActivityOrdervoucherApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**append**](AlipayMarketingActivityOrdervoucherApi.md#append) | **PATCH** /v3/alipay/marketing/ordervoucher/activity/{activity_id}/append | 修改商家券活动发券数量上限 |
| [**associate**](AlipayMarketingActivityOrdervoucherApi.md#associate) | **POST** /v3/alipay/marketing/activity/ordervoucher/associate | 关联订单信息 |
| [**codecount**](AlipayMarketingActivityOrdervoucherApi.md#codecount) | **GET** /v3/alipay/marketing/ordervoucher/activity/{activity_id}/voucher/codecount | 统计商家券券码数量 |
| [**codedeposit**](AlipayMarketingActivityOrdervoucherApi.md#codedeposit) | **POST** /v3/alipay/marketing/ordervoucher/activity/{activity_id}/voucher/codedeposit | 同步商家券券码 |
| [**create**](AlipayMarketingActivityOrdervoucherApi.md#create) | **POST** /v3/alipay/marketing/ordervoucher/activity | 创建商家券活动 |
| [**disassociate**](AlipayMarketingActivityOrdervoucherApi.md#disassociate) | **POST** /v3/alipay/marketing/activity/ordervoucher/disassociate | 取消关联订单信息 |
| [**modify**](AlipayMarketingActivityOrdervoucherApi.md#modify) | **PATCH** /v3/alipay/marketing/ordervoucher/activity/{activity_id} | 修改商家券活动基本信息 |
| [**query**](AlipayMarketingActivityOrdervoucherApi.md#query) | **GET** /v3/alipay/marketing/activity/ordervoucher/query | 查询商家券活动 |
| [**refund**](AlipayMarketingActivityOrdervoucherApi.md#refund) | **POST** /v3/alipay/marketing/ordervoucher/activity/{activity_id}/voucher/{voucher_code}/refund | 取消券核销状态 |
| [**stop**](AlipayMarketingActivityOrdervoucherApi.md#stop) | **PATCH** /v3/alipay/marketing/ordervoucher/activity/{activity_id}/stop | 停止商家券活动 |
| [**use**](AlipayMarketingActivityOrdervoucherApi.md#use) | **POST** /v3/alipay/marketing/ordervoucher/activity/{activity_id}/voucher/{voucher_code}/use | 同步券核销状态 |


<a name="append"></a>
# **append**
> Object append(activityId, alipayMarketingActivityOrdervoucherAppendModel)

修改商家券活动发券数量上限

商家调用该接口修改商家券活动预算上限，以此来追加商家券活动预算。 修改商家券活动预算上限同步返回追加请求受理结果，后续通过alipay.marketing.activity.message.appended消息接口异步发送发券数量上限修改成功事件消息。 code_mode&#x3D;MERCHANT_UPLOAD场景下，必须先导入券码后，方可追加商家券预算。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityOrdervoucherApi;

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

    AlipayMarketingActivityOrdervoucherApi apiInstance = new AlipayMarketingActivityOrdervoucherApi(defaultClient);
    String activityId = "2016042700826004508401111111"; // String | 活动id
    AlipayMarketingActivityOrdervoucherAppendModel alipayMarketingActivityOrdervoucherAppendModel = new AlipayMarketingActivityOrdervoucherAppendModel(); // AlipayMarketingActivityOrdervoucherAppendModel | 
    try {
      Object result = apiInstance.append(activityId, alipayMarketingActivityOrdervoucherAppendModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityOrdervoucherApi#append");
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
| **activityId** | **String**| 活动id | |
| **alipayMarketingActivityOrdervoucherAppendModel** | **AlipayMarketingActivityOrdervoucherAppendModel**|  | [optional] |

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

<a name="associate"></a>
# **associate**
> AlipayMarketingActivityOrdervoucherAssociateResponseModel associate(alipayMarketingActivityOrdervoucherAssociateModel)

关联订单信息

将已发放的商家券券码与订单信息关联，用于后续参与返佣激励等操作的统计。 

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityOrdervoucherApi;

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

    AlipayMarketingActivityOrdervoucherApi apiInstance = new AlipayMarketingActivityOrdervoucherApi(defaultClient);
    AlipayMarketingActivityOrdervoucherAssociateModel alipayMarketingActivityOrdervoucherAssociateModel = new AlipayMarketingActivityOrdervoucherAssociateModel(); // AlipayMarketingActivityOrdervoucherAssociateModel | 
    try {
      AlipayMarketingActivityOrdervoucherAssociateResponseModel result = apiInstance.associate(alipayMarketingActivityOrdervoucherAssociateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityOrdervoucherApi#associate");
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
| **alipayMarketingActivityOrdervoucherAssociateModel** | **AlipayMarketingActivityOrdervoucherAssociateModel**|  | [optional] |

### Return type

**AlipayMarketingActivityOrdervoucherAssociateResponseModel**

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

<a name="codecount"></a>
# **codecount**
> AlipayMarketingActivityOrdervoucherCodecountResponseModel codecount(activityId, merchantAccessMode)

统计商家券券码数量

商家调用该接口查询活动中的有效券码个数。接口同步返回查询结果。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityOrdervoucherApi;

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

    AlipayMarketingActivityOrdervoucherApi apiInstance = new AlipayMarketingActivityOrdervoucherApi(defaultClient);
    String activityId = "2016042700826004508401111111"; // String | 活动id
    String merchantAccessMode = "AGENCY_MODE"; // String | 商户接入模式
    try {
      AlipayMarketingActivityOrdervoucherCodecountResponseModel result = apiInstance.codecount(activityId, merchantAccessMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityOrdervoucherApi#codecount");
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
| **activityId** | **String**| 活动id | |
| **merchantAccessMode** | **String**| 商户接入模式 | [optional] |

### Return type

**AlipayMarketingActivityOrdervoucherCodecountResponseModel**

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

<a name="codedeposit"></a>
# **codedeposit**
> AlipayMarketingActivityOrdervoucherCodedepositResponseModel codedeposit(activityId, alipayMarketingActivityOrdervoucherCodedepositModel)

同步商家券券码

商家调用该接口同步导入商家券券码，接口同步返回导入结果。请在接收alipay.marketing.activity.message.created消息后，再进行调用。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityOrdervoucherApi;

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

    AlipayMarketingActivityOrdervoucherApi apiInstance = new AlipayMarketingActivityOrdervoucherApi(defaultClient);
    String activityId = "2016042700826004508401111111"; // String | 活动id
    AlipayMarketingActivityOrdervoucherCodedepositModel alipayMarketingActivityOrdervoucherCodedepositModel = new AlipayMarketingActivityOrdervoucherCodedepositModel(); // AlipayMarketingActivityOrdervoucherCodedepositModel | 
    try {
      AlipayMarketingActivityOrdervoucherCodedepositResponseModel result = apiInstance.codedeposit(activityId, alipayMarketingActivityOrdervoucherCodedepositModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityOrdervoucherApi#codedeposit");
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
| **activityId** | **String**| 活动id | |
| **alipayMarketingActivityOrdervoucherCodedepositModel** | **AlipayMarketingActivityOrdervoucherCodedepositModel**|  | [optional] |

### Return type

**AlipayMarketingActivityOrdervoucherCodedepositResponseModel**

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
> AlipayMarketingActivityOrdervoucherCreateResponseModel create(alipayMarketingActivityOrdervoucherCreateModel)

创建商家券活动

商家调用该接口创建商家券活动。 创建商家券活动接口同步返回创建请求受理结果，后续通过alipay.marketing.activity.message.created消息接口异步发送活动创建成功事件消息。  如果在code_mode&#x3D;MERCHANT_UPLOAD的模式下，创建商家券活动后，还需要进行券码导入操作，以及预算追加操作，然后商家券才能进行发放。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityOrdervoucherApi;

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

    AlipayMarketingActivityOrdervoucherApi apiInstance = new AlipayMarketingActivityOrdervoucherApi(defaultClient);
    AlipayMarketingActivityOrdervoucherCreateModel alipayMarketingActivityOrdervoucherCreateModel = new AlipayMarketingActivityOrdervoucherCreateModel(); // AlipayMarketingActivityOrdervoucherCreateModel | 
    try {
      AlipayMarketingActivityOrdervoucherCreateResponseModel result = apiInstance.create(alipayMarketingActivityOrdervoucherCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityOrdervoucherApi#create");
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
| **alipayMarketingActivityOrdervoucherCreateModel** | **AlipayMarketingActivityOrdervoucherCreateModel**|  | [optional] |

### Return type

**AlipayMarketingActivityOrdervoucherCreateResponseModel**

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

<a name="disassociate"></a>
# **disassociate**
> AlipayMarketingActivityOrdervoucherDisassociateResponseModel disassociate(alipayMarketingActivityOrdervoucherDisassociateModel)

取消关联订单信息

取消商家券与订单信息的关联关系.

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityOrdervoucherApi;

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

    AlipayMarketingActivityOrdervoucherApi apiInstance = new AlipayMarketingActivityOrdervoucherApi(defaultClient);
    AlipayMarketingActivityOrdervoucherDisassociateModel alipayMarketingActivityOrdervoucherDisassociateModel = new AlipayMarketingActivityOrdervoucherDisassociateModel(); // AlipayMarketingActivityOrdervoucherDisassociateModel | 
    try {
      AlipayMarketingActivityOrdervoucherDisassociateResponseModel result = apiInstance.disassociate(alipayMarketingActivityOrdervoucherDisassociateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityOrdervoucherApi#disassociate");
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
| **alipayMarketingActivityOrdervoucherDisassociateModel** | **AlipayMarketingActivityOrdervoucherDisassociateModel**|  | [optional] |

### Return type

**AlipayMarketingActivityOrdervoucherDisassociateResponseModel**

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
> AlipayMarketingActivityOrdervoucherModifyResponseModel modify(activityId, alipayMarketingActivityOrdervoucherModifyModel)

修改商家券活动基本信息

商家调用该接口修改商家券活动基本信息。 修改商家券活动基本信息接口同步返回修改请求受理结果，后续通过alipay.marketing.activity.message.modified消息接口异步发送修改活动成功事件消息。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityOrdervoucherApi;

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

    AlipayMarketingActivityOrdervoucherApi apiInstance = new AlipayMarketingActivityOrdervoucherApi(defaultClient);
    String activityId = "2016042700826004508401111111"; // String | 活动id1
    AlipayMarketingActivityOrdervoucherModifyModel alipayMarketingActivityOrdervoucherModifyModel = new AlipayMarketingActivityOrdervoucherModifyModel(); // AlipayMarketingActivityOrdervoucherModifyModel | 
    try {
      AlipayMarketingActivityOrdervoucherModifyResponseModel result = apiInstance.modify(activityId, alipayMarketingActivityOrdervoucherModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityOrdervoucherApi#modify");
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
| **activityId** | **String**| 活动id1 | |
| **alipayMarketingActivityOrdervoucherModifyModel** | **AlipayMarketingActivityOrdervoucherModifyModel**|  | [optional] |

### Return type

**AlipayMarketingActivityOrdervoucherModifyResponseModel**

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
> AlipayMarketingActivityOrdervoucherQueryResponseModel query(activityId, merchantAccessMode)

查询商家券活动

商户通过该接口查询商家券活动详情。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityOrdervoucherApi;

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

    AlipayMarketingActivityOrdervoucherApi apiInstance = new AlipayMarketingActivityOrdervoucherApi(defaultClient);
    String activityId = "2016042700826004508401111111"; // String | 活动id
    String merchantAccessMode = "AGENCY_MODE"; // String | 商户接入模式
    try {
      AlipayMarketingActivityOrdervoucherQueryResponseModel result = apiInstance.query(activityId, merchantAccessMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityOrdervoucherApi#query");
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
| **activityId** | **String**| 活动id | [optional] |
| **merchantAccessMode** | **String**| 商户接入模式 | [optional] |

### Return type

**AlipayMarketingActivityOrdervoucherQueryResponseModel**

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

<a name="refund"></a>
# **refund**
> AlipayMarketingActivityOrdervoucherRefundResponseModel refund(activityId, voucherCode, alipayMarketingActivityOrdervoucherRefundModel)

取消券核销状态

商户调用该接口进行优惠券退券处理。接口同步返回结果。 如果优惠券过期后，发起退券操作，该接口返回成功，优惠券退回后仍不可用。 如果优惠券在支付宝卡包已删除，发起退券操作，该接口返回成功，优惠券在支付宝卡包仍然是删除状态。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityOrdervoucherApi;

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

    AlipayMarketingActivityOrdervoucherApi apiInstance = new AlipayMarketingActivityOrdervoucherApi(defaultClient);
    String activityId = "2016042700826004508401111111"; // String | 活动id
    String voucherCode = "ABE44"; // String | 已核销待退券的券码
    AlipayMarketingActivityOrdervoucherRefundModel alipayMarketingActivityOrdervoucherRefundModel = new AlipayMarketingActivityOrdervoucherRefundModel(); // AlipayMarketingActivityOrdervoucherRefundModel | 
    try {
      AlipayMarketingActivityOrdervoucherRefundResponseModel result = apiInstance.refund(activityId, voucherCode, alipayMarketingActivityOrdervoucherRefundModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityOrdervoucherApi#refund");
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
| **activityId** | **String**| 活动id | |
| **voucherCode** | **String**| 已核销待退券的券码 | |
| **alipayMarketingActivityOrdervoucherRefundModel** | **AlipayMarketingActivityOrdervoucherRefundModel**|  | [optional] |

### Return type

**AlipayMarketingActivityOrdervoucherRefundResponseModel**

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
> Object stop(activityId, alipayMarketingActivityOrdervoucherStopModel)

停止商家券活动

商家调用该接口停止优惠券。 停止优惠券接口同步返回停止请求受理结果，后续通过alipay.marketing.activity.message.stopped消息接口异步发送停止活动成功事件。 如果成功消息长时间未送达，请联系相关技术人员。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityOrdervoucherApi;

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

    AlipayMarketingActivityOrdervoucherApi apiInstance = new AlipayMarketingActivityOrdervoucherApi(defaultClient);
    String activityId = "2016042700826004508401111111"; // String | 活动id
    AlipayMarketingActivityOrdervoucherStopModel alipayMarketingActivityOrdervoucherStopModel = new AlipayMarketingActivityOrdervoucherStopModel(); // AlipayMarketingActivityOrdervoucherStopModel | 
    try {
      Object result = apiInstance.stop(activityId, alipayMarketingActivityOrdervoucherStopModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityOrdervoucherApi#stop");
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
| **activityId** | **String**| 活动id | |
| **alipayMarketingActivityOrdervoucherStopModel** | **AlipayMarketingActivityOrdervoucherStopModel**|  | [optional] |

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

<a name="use"></a>
# **use**
> AlipayMarketingActivityOrdervoucherUseResponseModel use(activityId, voucherCode, alipayMarketingActivityOrdervoucherUseModel)

同步券核销状态

商户调用该接口，通过券码进行优惠券核销，接口同步返回核销结果。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingActivityOrdervoucherApi;

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

    AlipayMarketingActivityOrdervoucherApi apiInstance = new AlipayMarketingActivityOrdervoucherApi(defaultClient);
    String activityId = "2016042700826004508401111111"; // String | 活动id
    String voucherCode = "ABE44"; // String | 待核销的券码。
    AlipayMarketingActivityOrdervoucherUseModel alipayMarketingActivityOrdervoucherUseModel = new AlipayMarketingActivityOrdervoucherUseModel(); // AlipayMarketingActivityOrdervoucherUseModel | 
    try {
      AlipayMarketingActivityOrdervoucherUseResponseModel result = apiInstance.use(activityId, voucherCode, alipayMarketingActivityOrdervoucherUseModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingActivityOrdervoucherApi#use");
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
| **activityId** | **String**| 活动id | |
| **voucherCode** | **String**| 待核销的券码。 | |
| **alipayMarketingActivityOrdervoucherUseModel** | **AlipayMarketingActivityOrdervoucherUseModel**|  | [optional] |

### Return type

**AlipayMarketingActivityOrdervoucherUseResponseModel**

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

