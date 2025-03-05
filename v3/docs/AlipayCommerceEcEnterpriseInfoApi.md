# AlipayCommerceEcEnterpriseInfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modify**](AlipayCommerceEcEnterpriseInfoApi.md#modify) | **PUT** /v3/alipay/commerce/ec/enterprise | 修改企业基础信息 |
| [**query**](AlipayCommerceEcEnterpriseInfoApi.md#query) | **GET** /v3/alipay/commerce/ec/enterprise/info | 查询企业详情 |


<a name="modify"></a>
# **modify**
> Object modify(alipayCommerceEcEnterpriseInfoModifyModel)

修改企业基础信息

修改企业基础信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcEnterpriseInfoApi;

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

    AlipayCommerceEcEnterpriseInfoApi apiInstance = new AlipayCommerceEcEnterpriseInfoApi(defaultClient);
    AlipayCommerceEcEnterpriseInfoModifyModel alipayCommerceEcEnterpriseInfoModifyModel = new AlipayCommerceEcEnterpriseInfoModifyModel(); // AlipayCommerceEcEnterpriseInfoModifyModel | 
    try {
      Object result = apiInstance.modify(alipayCommerceEcEnterpriseInfoModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcEnterpriseInfoApi#modify");
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
| **alipayCommerceEcEnterpriseInfoModifyModel** | **AlipayCommerceEcEnterpriseInfoModifyModel**|  | [optional] |

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
> AlipayCommerceEcEnterpriseInfoQueryResponseModel query(enterpriseId, outBizNo)

查询企业详情

查询企业详细信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcEnterpriseInfoApi;

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

    AlipayCommerceEcEnterpriseInfoApi apiInstance = new AlipayCommerceEcEnterpriseInfoApi(defaultClient);
    String enterpriseId = "20889490309498"; // String | 企业id,从企业注册等接口获取，和out_biz_no参数二选一，都传优先取企业id
    String outBizNo = "2024051000000001"; // String | 服务商生成的请求唯一流水号/业务幂等号，和enterprise_id参数二选一，都传优先取企业id
    try {
      AlipayCommerceEcEnterpriseInfoQueryResponseModel result = apiInstance.query(enterpriseId, outBizNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcEnterpriseInfoApi#query");
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
| **enterpriseId** | **String**| 企业id,从企业注册等接口获取，和out_biz_no参数二选一，都传优先取企业id | [optional] |
| **outBizNo** | **String**| 服务商生成的请求唯一流水号/业务幂等号，和enterprise_id参数二选一，都传优先取企业id | [optional] |

### Return type

**AlipayCommerceEcEnterpriseInfoQueryResponseModel**

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

