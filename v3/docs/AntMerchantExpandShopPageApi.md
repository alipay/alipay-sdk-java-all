# AntMerchantExpandShopPageApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AntMerchantExpandShopPageApi.md#query) | **GET** /v3/ant/merchant/shop/pagequery | 店铺分页查询接口 |


<a name="query"></a>
# **query**
> AntMerchantExpandShopPageQueryResponseModel query(ipRoleId, pageNum, pageSize, addressVersion)

店铺分页查询接口

用于服务商或商户查询其自己的店铺信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AntMerchantExpandShopPageApi;

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

    AntMerchantExpandShopPageApi apiInstance = new AntMerchantExpandShopPageApi(defaultClient);
    String ipRoleId = "2088301155943087"; // String | 商户角色id，表示将要开的店属于哪个商户角色。对于直连开店场景，填写商户pid；对于间连开店场景（线上、线下、直付通），填写商户smid。特别说明：IoT设备三绑定场景统一填写商户pid
    Integer pageNum = 1; // Integer | 查询页数
    Integer pageSize = 10; // Integer | 每页查询大小，限制100以内
    String addressVersion = "2022Q2"; // String | 行政区划版本，当前可传空值(取默认版本)、2022Q2、UPTODATE(取最新版本)，其中空值默认为：2020Q1版本(address_version=''或null)，想要查看版本是2022年2季度版本则传入:(address_version='2022Q2')，想要获取最新版本则传入:(address_version ='UPTODATE')
    try {
      AntMerchantExpandShopPageQueryResponseModel result = apiInstance.query(ipRoleId, pageNum, pageSize, addressVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntMerchantExpandShopPageApi#query");
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
| **ipRoleId** | **String**| 商户角色id，表示将要开的店属于哪个商户角色。对于直连开店场景，填写商户pid；对于间连开店场景（线上、线下、直付通），填写商户smid。特别说明：IoT设备三绑定场景统一填写商户pid | [optional] |
| **pageNum** | **Integer**| 查询页数 | [optional] |
| **pageSize** | **Integer**| 每页查询大小，限制100以内 | [optional] |
| **addressVersion** | **String**| 行政区划版本，当前可传空值(取默认版本)、2022Q2、UPTODATE(取最新版本)，其中空值默认为：2020Q1版本(address_version&#x3D;&#39;&#39;或null)，想要查看版本是2022年2季度版本则传入:(address_version&#x3D;&#39;2022Q2&#39;)，想要获取最新版本则传入:(address_version &#x3D;&#39;UPTODATE&#39;) | [optional] |

### Return type

**AntMerchantExpandShopPageQueryResponseModel**

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

