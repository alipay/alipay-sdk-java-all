# AlipayEbppPdeductSignApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**add**](AlipayEbppPdeductSignApi.md#add) | **POST** /v3/alipay/ebpp/pdeduct/sign/add | 缴费直连代扣签约 |
| [**cancel**](AlipayEbppPdeductSignApi.md#cancel) | **POST** /v3/alipay/ebpp/pdeduct/sign/cancel | 缴费直连代扣取消签约 |
| [**query**](AlipayEbppPdeductSignApi.md#query) | **GET** /v3/alipay/ebpp/pdeduct/sign/query | 直连代扣协议查询接口 |
| [**validate**](AlipayEbppPdeductSignApi.md#validate) | **POST** /v3/alipay/ebpp/pdeduct/sign/validate | 缴费直连代扣签约前置校验 |


<a name="add"></a>
# **add**
> AlipayEbppPdeductSignAddResponseModel add(alipayEbppPdeductSignAddModel)

缴费直连代扣签约

缴费直连代扣签约

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppPdeductSignApi;

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

    AlipayEbppPdeductSignApi apiInstance = new AlipayEbppPdeductSignApi(defaultClient);
    AlipayEbppPdeductSignAddModel alipayEbppPdeductSignAddModel = new AlipayEbppPdeductSignAddModel(); // AlipayEbppPdeductSignAddModel | 
    try {
      AlipayEbppPdeductSignAddResponseModel result = apiInstance.add(alipayEbppPdeductSignAddModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppPdeductSignApi#add");
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
| **alipayEbppPdeductSignAddModel** | **AlipayEbppPdeductSignAddModel**|  | [optional] |

### Return type

**AlipayEbppPdeductSignAddResponseModel**

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

<a name="cancel"></a>
# **cancel**
> AlipayEbppPdeductSignCancelResponseModel cancel(alipayEbppPdeductSignCancelModel)

缴费直连代扣取消签约

缴费直连代扣，用户取消签约接口

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppPdeductSignApi;

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

    AlipayEbppPdeductSignApi apiInstance = new AlipayEbppPdeductSignApi(defaultClient);
    AlipayEbppPdeductSignCancelModel alipayEbppPdeductSignCancelModel = new AlipayEbppPdeductSignCancelModel(); // AlipayEbppPdeductSignCancelModel | 
    try {
      AlipayEbppPdeductSignCancelResponseModel result = apiInstance.cancel(alipayEbppPdeductSignCancelModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppPdeductSignApi#cancel");
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
| **alipayEbppPdeductSignCancelModel** | **AlipayEbppPdeductSignCancelModel**|  | [optional] |

### Return type

**AlipayEbppPdeductSignCancelResponseModel**

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
> AlipayEbppPdeductSignQueryResponseModel query(userId, openId, agreementId, bizType, subBizType, chargeInst, billKey)

直连代扣协议查询接口

提供给朗新查询代扣协议状态的接口，用于进行双边对账，解决单边协议问题

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppPdeductSignApi;

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

    AlipayEbppPdeductSignApi apiInstance = new AlipayEbppPdeductSignApi(defaultClient);
    String userId = "2088302186230962"; // String | 用户ID
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 用户UserId在应用AppId下的唯一用户标识
    String agreementId = "1234557890"; // String | 支付宝代扣协议Id。若协议id不传递，则需要保证业务类型、子业务类型、出账机构、户号必传
    String bizType = "JF"; // String | 业务类型。  JF：缴水、电、燃气、固话宽带、有线电视、交通罚款费用  WUYE：缴物业费  HK：信用卡还款  TX：手机充值
    String subBizType = "ELECTRIC"; // String | 业务子类型。  WATER：缴水费  ELECTRIC：缴电费  GAS：缴燃气费  COMMUN：缴固话宽带  CATV：缴有线电视费  TRAFFIC：缴交通罚款  WUYE：缴物业费  HK：信用卡还款  CZ：手机充值
    String chargeInst = "CQCENTERELECTRIC"; // String | 支付宝缴费系统中的出账机构ID
    String billKey = "02659981"; // String | 户号，机构针对于每户的水、电都会有唯一的标识户号
    try {
      AlipayEbppPdeductSignQueryResponseModel result = apiInstance.query(userId, openId, agreementId, bizType, subBizType, chargeInst, billKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppPdeductSignApi#query");
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
| **userId** | **String**| 用户ID | [optional] |
| **openId** | **String**| 用户UserId在应用AppId下的唯一用户标识 | [optional] |
| **agreementId** | **String**| 支付宝代扣协议Id。若协议id不传递，则需要保证业务类型、子业务类型、出账机构、户号必传 | [optional] |
| **bizType** | **String**| 业务类型。  JF：缴水、电、燃气、固话宽带、有线电视、交通罚款费用  WUYE：缴物业费  HK：信用卡还款  TX：手机充值 | [optional] |
| **subBizType** | **String**| 业务子类型。  WATER：缴水费  ELECTRIC：缴电费  GAS：缴燃气费  COMMUN：缴固话宽带  CATV：缴有线电视费  TRAFFIC：缴交通罚款  WUYE：缴物业费  HK：信用卡还款  CZ：手机充值 | [optional] |
| **chargeInst** | **String**| 支付宝缴费系统中的出账机构ID | [optional] |
| **billKey** | **String**| 户号，机构针对于每户的水、电都会有唯一的标识户号 | [optional] |

### Return type

**AlipayEbppPdeductSignQueryResponseModel**

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

<a name="validate"></a>
# **validate**
> Object validate(alipayEbppPdeductSignValidateModel)

缴费直连代扣签约前置校验

服务窗代扣签约的前置校验接口，签约前，可以先调用该接口进行校验是否可以签约

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppPdeductSignApi;

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

    AlipayEbppPdeductSignApi apiInstance = new AlipayEbppPdeductSignApi(defaultClient);
    AlipayEbppPdeductSignValidateModel alipayEbppPdeductSignValidateModel = new AlipayEbppPdeductSignValidateModel(); // AlipayEbppPdeductSignValidateModel | 
    try {
      Object result = apiInstance.validate(alipayEbppPdeductSignValidateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppPdeductSignApi#validate");
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
| **alipayEbppPdeductSignValidateModel** | **AlipayEbppPdeductSignValidateModel**|  | [optional] |

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

