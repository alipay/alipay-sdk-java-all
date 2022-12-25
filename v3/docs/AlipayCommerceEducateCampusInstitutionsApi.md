# AlipayCommerceEducateCampusInstitutionsApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**add**](AlipayCommerceEducateCampusInstitutionsApi.md#add) | **POST** /v3/alipay/commerce/educate/campus/institutions/add | 入驻学校信息 |
| [**query**](AlipayCommerceEducateCampusInstitutionsApi.md#query) | **GET** /v3/alipay/commerce/educate/campus/institutions/query | 查询学校信息 |


<a name="add"></a>
# **add**
> AlipayCommerceEducateCampusInstitutionsAddResponseModel add(alipayCommerceEducateCampusInstitutionsAddModel)

入驻学校信息

学校信息入驻

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEducateCampusInstitutionsApi;

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

    AlipayCommerceEducateCampusInstitutionsApi apiInstance = new AlipayCommerceEducateCampusInstitutionsApi(defaultClient);
    AlipayCommerceEducateCampusInstitutionsAddModel alipayCommerceEducateCampusInstitutionsAddModel = new AlipayCommerceEducateCampusInstitutionsAddModel(); // AlipayCommerceEducateCampusInstitutionsAddModel | 
    try {
      AlipayCommerceEducateCampusInstitutionsAddResponseModel result = apiInstance.add(alipayCommerceEducateCampusInstitutionsAddModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEducateCampusInstitutionsApi#add");
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
| **alipayCommerceEducateCampusInstitutionsAddModel** | **AlipayCommerceEducateCampusInstitutionsAddModel**|  | [optional] |

### Return type

**AlipayCommerceEducateCampusInstitutionsAddResponseModel**

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
> AlipayCommerceEducateCampusInstitutionsQueryResponseModel query(instName, provinceCode, cityCode, instId, instStdCode, likeProperty)

查询学校信息

可以通过学校库产品查询支付宝系统中是否已存在对应的学校，避免重复入驻，以及通过该接口查询入驻的进度：入驻成功则会返回学校信息，失败则不会返回

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEducateCampusInstitutionsApi;

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

    AlipayCommerceEducateCampusInstitutionsApi apiInstance = new AlipayCommerceEducateCampusInstitutionsApi(defaultClient);
    String instName = "复旦大学"; // String | 学校名称
    String provinceCode = "370000"; // String | 省份编码，编码标准为中华人民共和国行政区划代码，参见 2020年12月中华人民共和国县以上行政区划代码。
    String cityCode = "370900"; // String | 城市编码，编码标准为中华人民共和国行政区划代码，参见 2020年12月中华人民共和国县以上行政区划代码。
    String instId = "2088000139662311"; // String | 学校内标：支付宝内部学校唯一编号。使用内标查询时，默认使用内标进行精确匹配。
    String instStdCode = "202008016104"; // String | 学校外标：统一社会信用编码或教育部提供的学校标识码。使用学校外标查询时，默认使用外标进行精确匹配。
    String likeProperty = "1"; // String | 是否使用学校名称模糊匹配进行查询，默认精确匹配。 枚举值如下： 1：精确匹配； 0：模糊匹配
    try {
      AlipayCommerceEducateCampusInstitutionsQueryResponseModel result = apiInstance.query(instName, provinceCode, cityCode, instId, instStdCode, likeProperty);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEducateCampusInstitutionsApi#query");
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
| **instName** | **String**| 学校名称 | [optional] |
| **provinceCode** | **String**| 省份编码，编码标准为中华人民共和国行政区划代码，参见 2020年12月中华人民共和国县以上行政区划代码。 | [optional] |
| **cityCode** | **String**| 城市编码，编码标准为中华人民共和国行政区划代码，参见 2020年12月中华人民共和国县以上行政区划代码。 | [optional] |
| **instId** | **String**| 学校内标：支付宝内部学校唯一编号。使用内标查询时，默认使用内标进行精确匹配。 | [optional] |
| **instStdCode** | **String**| 学校外标：统一社会信用编码或教育部提供的学校标识码。使用学校外标查询时，默认使用外标进行精确匹配。 | [optional] |
| **likeProperty** | **String**| 是否使用学校名称模糊匹配进行查询，默认精确匹配。 枚举值如下： 1：精确匹配； 0：模糊匹配 | [optional] |

### Return type

**AlipayCommerceEducateCampusInstitutionsQueryResponseModel**

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

