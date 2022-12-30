# AlipayFundAccountbookApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayFundAccountbookApi.md#create) | **POST** /v3/alipay/fund/accountbook/create | 资金记账本开通 |
| [**query**](AlipayFundAccountbookApi.md#query) | **GET** /v3/alipay/fund/accountbook/query | 资金记账本的信息查询 |


<a name="create"></a>
# **create**
> AlipayFundAccountbookCreateResponseModel create(alipayFundAccountbookCreateModel)

资金记账本开通

资金记账本开通

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundAccountbookApi;

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

    AlipayFundAccountbookApi apiInstance = new AlipayFundAccountbookApi(defaultClient);
    AlipayFundAccountbookCreateModel alipayFundAccountbookCreateModel = new AlipayFundAccountbookCreateModel(); // AlipayFundAccountbookCreateModel | 
    try {
      AlipayFundAccountbookCreateResponseModel result = apiInstance.create(alipayFundAccountbookCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundAccountbookApi#create");
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
| **alipayFundAccountbookCreateModel** | **AlipayFundAccountbookCreateModel**|  | [optional] |

### Return type

**AlipayFundAccountbookCreateResponseModel**

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
> AlipayFundAccountbookQueryResponseModel query(accountBookId, merchantUserId, sceneCode, extInfo)

资金记账本的信息查询

资金记账本的信息查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayFundAccountbookApi;

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

    AlipayFundAccountbookApi apiInstance = new AlipayFundAccountbookApi(defaultClient);
    String accountBookId = "2088001409188095"; // String | 记账账簿id
    String merchantUserId = "243893499"; // String | 商户会员的唯一标识，如果传入account_book_id此字段必传并比对一致性。
    String sceneCode = "SATF_FUND_BOOK"; // String | 资金记账本的开通场景码
    String extInfo = "{\"agreement_no\":\"2019000000000\"}"; // String | JSON格式，传递业务扩展参数
    try {
      AlipayFundAccountbookQueryResponseModel result = apiInstance.query(accountBookId, merchantUserId, sceneCode, extInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayFundAccountbookApi#query");
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
| **accountBookId** | **String**| 记账账簿id | [optional] |
| **merchantUserId** | **String**| 商户会员的唯一标识，如果传入account_book_id此字段必传并比对一致性。 | [optional] |
| **sceneCode** | **String**| 资金记账本的开通场景码 | [optional] |
| **extInfo** | **String**| JSON格式，传递业务扩展参数 | [optional] |

### Return type

**AlipayFundAccountbookQueryResponseModel**

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

