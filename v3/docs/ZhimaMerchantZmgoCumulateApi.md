# ZhimaMerchantZmgoCumulateApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](ZhimaMerchantZmgoCumulateApi.md#query) | **GET** /v3/zhima/merchant/zmgo/cumulate/query | 商家芝麻GO累计数据查询接口 |
| [**sync**](ZhimaMerchantZmgoCumulateApi.md#sync) | **POST** /v3/zhima/merchant/zmgo/cumulate/sync | 商家芝麻GO累计数据回传接口 |


<a name="query"></a>
# **query**
> ZhimaMerchantZmgoCumulateQueryResponseModel query(agreementId, userId, openId, providerPid, needDetail, pageNo, pageSize)

商家芝麻GO累计数据查询接口

芝麻GO数据累计查询接口，包含汇总和明细信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaMerchantZmgoCumulateApi;

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

    ZhimaMerchantZmgoCumulateApi apiInstance = new ZhimaMerchantZmgoCumulateApi(defaultClient);
    String agreementId = "20195108518085620000"; // String | 芝麻go协议号，唯一标识一个芝麻go协议。
    String userId = "2088602002015001"; // String | 用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
    String providerPid = "2088621805983504"; // String | 数据回传的商户 ID，即和用户发生业务来往的 PID 主体。商户账号在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
    Boolean needDetail = false; // Boolean | 是否需要回传明细。枚举支持： * true：需要回传明细。 * false：不需要回传明细。
    Integer pageNo = 1; // Integer | 分页参数，当need_detail=true时需要，代表当前页数，从1开始。
    Integer pageSize = 20; // Integer | 分页参数，当need_detail=true时需要，代表每页大小，不能大于20。
    try {
      ZhimaMerchantZmgoCumulateQueryResponseModel result = apiInstance.query(agreementId, userId, openId, providerPid, needDetail, pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaMerchantZmgoCumulateApi#query");
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
| **agreementId** | **String**| 芝麻go协议号，唯一标识一个芝麻go协议。 | [optional] |
| **userId** | **String**| 用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。 | [optional] |
| **openId** | **String**| 用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。 | [optional] |
| **providerPid** | **String**| 数据回传的商户 ID，即和用户发生业务来往的 PID 主体。商户账号在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。 | [optional] |
| **needDetail** | **Boolean**| 是否需要回传明细。枚举支持： * true：需要回传明细。 * false：不需要回传明细。 | [optional] |
| **pageNo** | **Integer**| 分页参数，当need_detail&#x3D;true时需要，代表当前页数，从1开始。 | [optional] |
| **pageSize** | **Integer**| 分页参数，当need_detail&#x3D;true时需要，代表每页大小，不能大于20。 | [optional] |

### Return type

**ZhimaMerchantZmgoCumulateQueryResponseModel**

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

<a name="sync"></a>
# **sync**
> ZhimaMerchantZmgoCumulateSyncResponseModel sync(zhimaMerchantZmgoCumulateSyncModel)

商家芝麻GO累计数据回传接口

外部商家接入芝麻GO场景下，回传用户行为履约数据给芝麻。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaMerchantZmgoCumulateApi;

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

    ZhimaMerchantZmgoCumulateApi apiInstance = new ZhimaMerchantZmgoCumulateApi(defaultClient);
    ZhimaMerchantZmgoCumulateSyncModel zhimaMerchantZmgoCumulateSyncModel = new ZhimaMerchantZmgoCumulateSyncModel(); // ZhimaMerchantZmgoCumulateSyncModel | 
    try {
      ZhimaMerchantZmgoCumulateSyncResponseModel result = apiInstance.sync(zhimaMerchantZmgoCumulateSyncModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaMerchantZmgoCumulateApi#sync");
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
| **zhimaMerchantZmgoCumulateSyncModel** | **ZhimaMerchantZmgoCumulateSyncModel**|  | [optional] |

### Return type

**ZhimaMerchantZmgoCumulateSyncResponseModel**

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

