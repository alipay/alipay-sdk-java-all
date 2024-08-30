# AntMerchantExpandShopApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**close**](AntMerchantExpandShopApi.md#close) | **PATCH** /v3/ant/merchant/shop/close | 蚂蚁店铺关闭 |
| [**consult**](AntMerchantExpandShopApi.md#consult) | **POST** /v3/ant/merchant/expand/shop/consult | 蚂蚁店铺创建咨询 |
| [**create**](AntMerchantExpandShopApi.md#create) | **POST** /v3/ant/merchant/shop | 蚂蚁店铺创建 |
| [**modify**](AntMerchantExpandShopApi.md#modify) | **PATCH** /v3/ant/merchant/shop | 修改蚂蚁店铺 |
| [**query**](AntMerchantExpandShopApi.md#query) | **GET** /v3/ant/merchant/shop | 店铺查询接口 |


<a name="close"></a>
# **close**
> Object close(antMerchantExpandShopCloseModel)

蚂蚁店铺关闭

通过shop_id，关闭蚂蚁店铺。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AntMerchantExpandShopApi;

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

    AntMerchantExpandShopApi apiInstance = new AntMerchantExpandShopApi(defaultClient);
    AntMerchantExpandShopCloseModel antMerchantExpandShopCloseModel = new AntMerchantExpandShopCloseModel(); // AntMerchantExpandShopCloseModel | 
    try {
      Object result = apiInstance.close(antMerchantExpandShopCloseModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntMerchantExpandShopApi#close");
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
| **antMerchantExpandShopCloseModel** | **AntMerchantExpandShopCloseModel**|  | [optional] |

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

<a name="consult"></a>
# **consult**
> AntMerchantExpandShopConsultResponseModel consult(antMerchantExpandShopConsultModel)

蚂蚁店铺创建咨询

蚂蚁店铺创建咨询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AntMerchantExpandShopApi;

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

    AntMerchantExpandShopApi apiInstance = new AntMerchantExpandShopApi(defaultClient);
    AntMerchantExpandShopConsultModel antMerchantExpandShopConsultModel = new AntMerchantExpandShopConsultModel(); // AntMerchantExpandShopConsultModel | 
    try {
      AntMerchantExpandShopConsultResponseModel result = apiInstance.consult(antMerchantExpandShopConsultModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntMerchantExpandShopApi#consult");
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
| **antMerchantExpandShopConsultModel** | **AntMerchantExpandShopConsultModel**|  | [optional] |

### Return type

**AntMerchantExpandShopConsultResponseModel**

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
> AntMerchantExpandShopCreateResponseModel create(antMerchantExpandShopCreateModel)

蚂蚁店铺创建

创建蚂蚁店铺

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AntMerchantExpandShopApi;

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

    AntMerchantExpandShopApi apiInstance = new AntMerchantExpandShopApi(defaultClient);
    AntMerchantExpandShopCreateModel antMerchantExpandShopCreateModel = new AntMerchantExpandShopCreateModel(); // AntMerchantExpandShopCreateModel | 
    try {
      AntMerchantExpandShopCreateResponseModel result = apiInstance.create(antMerchantExpandShopCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntMerchantExpandShopApi#create");
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
| **antMerchantExpandShopCreateModel** | **AntMerchantExpandShopCreateModel**|  | [optional] |

### Return type

**AntMerchantExpandShopCreateResponseModel**

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
> AntMerchantExpandShopModifyResponseModel modify(antMerchantExpandShopModifyModel)

修改蚂蚁店铺

修改蚂蚁店铺，按信息项修改。若无特殊说明，如果某项存在但是没填写，则不会覆盖掉原来的值

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AntMerchantExpandShopApi;

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

    AntMerchantExpandShopApi apiInstance = new AntMerchantExpandShopApi(defaultClient);
    AntMerchantExpandShopModifyModel antMerchantExpandShopModifyModel = new AntMerchantExpandShopModifyModel(); // AntMerchantExpandShopModifyModel | 
    try {
      AntMerchantExpandShopModifyResponseModel result = apiInstance.modify(antMerchantExpandShopModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntMerchantExpandShopApi#modify");
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
| **antMerchantExpandShopModifyModel** | **AntMerchantExpandShopModifyModel**|  | [optional] |

### Return type

**AntMerchantExpandShopModifyResponseModel**

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
> AntMerchantExpandShopQueryResponseModel query(shopId, storeId, ipRoleId, addressVersion, needRecommend, needIndustryInfo, needIndustryLicense)

店铺查询接口

用于服务商或商户查询其自己的店铺信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AntMerchantExpandShopApi;

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

    AntMerchantExpandShopApi apiInstance = new AntMerchantExpandShopApi(defaultClient);
    String shopId = "2018011900502000000005124744"; // String | 蚂蚁店铺id
    String storeId = "NO0001"; // String | 门店编号，表示该门店在该商户角色id(直连pid，间连smid)下，由商户自己定义的外部门店编号
    String ipRoleId = "2088301155943087"; // String | 商户角色id，表示将要开的店属于哪个商户角色。对于直连开店场景，填写商户pid；对于间连开店场景（线上、线下、直付通），填写商户smid
    String addressVersion = "2022Q2"; // String | 行政区划版本，当前可传空值(取默认版本)、2022Q2、UPTODATE(取最新版本)，其中空值默认为：2020Q1版本（ address_version=''或null），想要查看版本是2022年2季度版本则传入:(address_version='2022Q2')，想要获取最新版本则传入:(address_version ='UPTODATE')
    String needRecommend = "0"; // String | 门店不置信时，是否需要返回shop_recommend_info
    String needIndustryInfo = "1"; // String | need_industry_info=0时不返回行业信息；need_industry_info=1时返回不需要审核的行业信息、审核通过的行业信息
    String needIndustryLicense = "1"; // String | need_industry_license=0时不返回行业资质；need_industry_license=1时返回审核通过的行业资质
    try {
      AntMerchantExpandShopQueryResponseModel result = apiInstance.query(shopId, storeId, ipRoleId, addressVersion, needRecommend, needIndustryInfo, needIndustryLicense);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntMerchantExpandShopApi#query");
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
| **shopId** | **String**| 蚂蚁店铺id | [optional] |
| **storeId** | **String**| 门店编号，表示该门店在该商户角色id(直连pid，间连smid)下，由商户自己定义的外部门店编号 | [optional] |
| **ipRoleId** | **String**| 商户角色id，表示将要开的店属于哪个商户角色。对于直连开店场景，填写商户pid；对于间连开店场景（线上、线下、直付通），填写商户smid | [optional] |
| **addressVersion** | **String**| 行政区划版本，当前可传空值(取默认版本)、2022Q2、UPTODATE(取最新版本)，其中空值默认为：2020Q1版本（ address_version&#x3D;&#39;&#39;或null），想要查看版本是2022年2季度版本则传入:(address_version&#x3D;&#39;2022Q2&#39;)，想要获取最新版本则传入:(address_version &#x3D;&#39;UPTODATE&#39;) | [optional] |
| **needRecommend** | **String**| 门店不置信时，是否需要返回shop_recommend_info | [optional] |
| **needIndustryInfo** | **String**| need_industry_info&#x3D;0时不返回行业信息；need_industry_info&#x3D;1时返回不需要审核的行业信息、审核通过的行业信息 | [optional] |
| **needIndustryLicense** | **String**| need_industry_license&#x3D;0时不返回行业资质；need_industry_license&#x3D;1时返回审核通过的行业资质 | [optional] |

### Return type

**AntMerchantExpandShopQueryResponseModel**

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

