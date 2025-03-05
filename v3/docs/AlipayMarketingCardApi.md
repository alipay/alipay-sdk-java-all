# AlipayMarketingCardApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**delete**](AlipayMarketingCardApi.md#delete) | **DELETE** /v3/alipay/marketing/card/delete | 会员卡删卡 |
| [**open**](AlipayMarketingCardApi.md#open) | **POST** /v3/alipay/marketing/card/open | 会员卡开卡 |
| [**query**](AlipayMarketingCardApi.md#query) | **POST** /v3/alipay/marketing/card/query | 会员卡查询 |
| [**update**](AlipayMarketingCardApi.md#update) | **POST** /v3/alipay/marketing/card/update | 会员卡更新 |


<a name="delete"></a>
# **delete**
> AlipayMarketingCardDeleteResponseModel delete(outSerialNo, targetCardNo, targetCardNoType, reasonCode, extInfo)

会员卡删卡

通过 API 接口删除商家会员卡。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingCardApi;

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

    AlipayMarketingCardApi apiInstance = new AlipayMarketingCardApi(defaultClient);
    String outSerialNo = "2016062700001"; // String | 商户端删卡业务流水号，商户自定义且需确保流水号唯一性。
    String targetCardNo = "0000001"; // String | 支付宝业务卡号。即开卡接口返回结果中的card_info.biz_card_no。
    String targetCardNoType = "BIZ_CARD"; // String | 卡号ID类型
    String reasonCode = "USER_UNBUND"; // String | 删卡原因  USER_UNBUND：用户解绑（可以重新绑定）  CANCEL：销户（完成销户后，就不能再重新绑定）  PRESENT：转赠（可以重新绑定）
    String extInfo = "{\"new_card_no\":\"12345\",\" donee_user_id\":\"2088102130652460\"}"; // String | 删卡扩展参数，json格式。  用于商户的特定业务信息的传递，只有商户与支付宝约定了传递此参数且约定了参数含义，此参数才有效。  目前支持如下key：  new_card_no：新卡号  donee_user_id：受赠人userId
    try {
      AlipayMarketingCardDeleteResponseModel result = apiInstance.delete(outSerialNo, targetCardNo, targetCardNoType, reasonCode, extInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingCardApi#delete");
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
| **outSerialNo** | **String**| 商户端删卡业务流水号，商户自定义且需确保流水号唯一性。 | [optional] |
| **targetCardNo** | **String**| 支付宝业务卡号。即开卡接口返回结果中的card_info.biz_card_no。 | [optional] |
| **targetCardNoType** | **String**| 卡号ID类型 | [optional] |
| **reasonCode** | **String**| 删卡原因  USER_UNBUND：用户解绑（可以重新绑定）  CANCEL：销户（完成销户后，就不能再重新绑定）  PRESENT：转赠（可以重新绑定） | [optional] |
| **extInfo** | **String**| 删卡扩展参数，json格式。  用于商户的特定业务信息的传递，只有商户与支付宝约定了传递此参数且约定了参数含义，此参数才有效。  目前支持如下key：  new_card_no：新卡号  donee_user_id：受赠人userId | [optional] |

### Return type

**AlipayMarketingCardDeleteResponseModel**

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

<a name="open"></a>
# **open**
> AlipayMarketingCardOpenResponseModel open(authToken, alipayMarketingCardOpenModel)

会员卡开卡

商户通过API接口，进行会员卡开卡。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingCardApi;

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

    AlipayMarketingCardApi apiInstance = new AlipayMarketingCardApi(defaultClient);
    String authToken = "authToken_example"; // String | 用户授权令牌
    AlipayMarketingCardOpenModel alipayMarketingCardOpenModel = new AlipayMarketingCardOpenModel(); // AlipayMarketingCardOpenModel | 
    try {
      AlipayMarketingCardOpenResponseModel result = apiInstance.open(authToken, alipayMarketingCardOpenModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingCardApi#open");
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
| **alipayMarketingCardOpenModel** | **AlipayMarketingCardOpenModel**|  | [optional] |

### Return type

**AlipayMarketingCardOpenResponseModel**

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
> AlipayMarketingCardQueryResponseModel query(alipayMarketingCardQueryModel)

会员卡查询

根据卡号或者持卡人信息查询会员卡信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingCardApi;

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

    AlipayMarketingCardApi apiInstance = new AlipayMarketingCardApi(defaultClient);
    AlipayMarketingCardQueryModel alipayMarketingCardQueryModel = new AlipayMarketingCardQueryModel(); // AlipayMarketingCardQueryModel | 
    try {
      AlipayMarketingCardQueryResponseModel result = apiInstance.query(alipayMarketingCardQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingCardApi#query");
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
| **alipayMarketingCardQueryModel** | **AlipayMarketingCardQueryModel**|  | [optional] |

### Return type

**AlipayMarketingCardQueryResponseModel**

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

<a name="update"></a>
# **update**
> AlipayMarketingCardUpdateResponseModel update(alipayMarketingCardUpdateModel)

会员卡更新

会员卡更新

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingCardApi;

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

    AlipayMarketingCardApi apiInstance = new AlipayMarketingCardApi(defaultClient);
    AlipayMarketingCardUpdateModel alipayMarketingCardUpdateModel = new AlipayMarketingCardUpdateModel(); // AlipayMarketingCardUpdateModel | 
    try {
      AlipayMarketingCardUpdateResponseModel result = apiInstance.update(alipayMarketingCardUpdateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingCardApi#update");
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
| **alipayMarketingCardUpdateModel** | **AlipayMarketingCardUpdateModel**|  | [optional] |

### Return type

**AlipayMarketingCardUpdateResponseModel**

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

