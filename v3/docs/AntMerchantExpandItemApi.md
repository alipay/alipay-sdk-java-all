# AntMerchantExpandItemApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AntMerchantExpandItemApi.md#create) | **POST** /v3/ant/merchant/expand/item/create | 商品创建接口 |
| [**delete**](AntMerchantExpandItemApi.md#delete) | **DELETE** /v3/ant/merchant/expand/item/delete | 商品删除接口 |
| [**modify**](AntMerchantExpandItemApi.md#modify) | **POST** /v3/ant/merchant/expand/item/modify | 商品修改接口 |
| [**query**](AntMerchantExpandItemApi.md#query) | **GET** /v3/ant/merchant/expand/item/query | 商品查询接口 |


<a name="create"></a>
# **create**
> AntMerchantExpandItemCreateResponseModel create(antMerchantExpandItemCreateModel)

商品创建接口

用于服务商或商户创建商品

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AntMerchantExpandItemApi;

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

    AntMerchantExpandItemApi apiInstance = new AntMerchantExpandItemApi(defaultClient);
    AntMerchantExpandItemCreateModel antMerchantExpandItemCreateModel = new AntMerchantExpandItemCreateModel(); // AntMerchantExpandItemCreateModel | 
    try {
      AntMerchantExpandItemCreateResponseModel result = apiInstance.create(antMerchantExpandItemCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntMerchantExpandItemApi#create");
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
| **antMerchantExpandItemCreateModel** | **AntMerchantExpandItemCreateModel**|  | [optional] |

### Return type

**AntMerchantExpandItemCreateResponseModel**

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

<a name="delete"></a>
# **delete**
> AntMerchantExpandItemDeleteResponseModel delete(itemId, externalItemId)

商品删除接口

用于服务商或商户删除商品

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AntMerchantExpandItemApi;

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

    AntMerchantExpandItemApi apiInstance = new AntMerchantExpandItemApi(defaultClient);
    String itemId = "2018091300502200002600104169"; // String | 商品ID（item_id不为空则以item_id作为删除KEY,item_id为空则以external_item_id作为删除KEY,两者不能同时为空）
    String externalItemId = "20190916123124123123123"; // String | 外部商品ID（item_id不为空则以item_id作为删除KEY,item_id为空则以external_item_id作为删除KEY,两者不能同时为空）
    try {
      AntMerchantExpandItemDeleteResponseModel result = apiInstance.delete(itemId, externalItemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntMerchantExpandItemApi#delete");
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
| **itemId** | **String**| 商品ID（item_id不为空则以item_id作为删除KEY,item_id为空则以external_item_id作为删除KEY,两者不能同时为空） | [optional] |
| **externalItemId** | **String**| 外部商品ID（item_id不为空则以item_id作为删除KEY,item_id为空则以external_item_id作为删除KEY,两者不能同时为空） | [optional] |

### Return type

**AntMerchantExpandItemDeleteResponseModel**

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

<a name="modify"></a>
# **modify**
> AntMerchantExpandItemModifyResponseModel modify(antMerchantExpandItemModifyModel)

商品修改接口

用于服务商或商户修改商品

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AntMerchantExpandItemApi;

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

    AntMerchantExpandItemApi apiInstance = new AntMerchantExpandItemApi(defaultClient);
    AntMerchantExpandItemModifyModel antMerchantExpandItemModifyModel = new AntMerchantExpandItemModifyModel(); // AntMerchantExpandItemModifyModel | 
    try {
      AntMerchantExpandItemModifyResponseModel result = apiInstance.modify(antMerchantExpandItemModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntMerchantExpandItemApi#modify");
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
| **antMerchantExpandItemModifyModel** | **AntMerchantExpandItemModifyModel**|  | [optional] |

### Return type

**AntMerchantExpandItemModifyResponseModel**

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
> AntMerchantExpandItemQueryResponseModel query(targetType, targetId, undefinedCategory, frontCategoryId, status)

商品查询接口

用于服务商或商户查询其商品信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AntMerchantExpandItemApi;

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

    AntMerchantExpandItemApi apiInstance = new AntMerchantExpandItemApi(defaultClient);
    String targetType = "5"; // String | 商品归属主体类型:  5: 店铺  4: 主站MID  3: 参与者  2: 角色  1: 联系人
    String targetId = "2018090600502000000022501261"; // String | 商品归属主体id
    Boolean undefinedCategory = false; // Boolean | 未分类类目: true 的时候 front_category_id 必须不填（null）
    String frontCategoryId = "2018091300502200002600105884"; // String | 商品前台类目id: null 表示所有分类
    String status = "EFFECT"; // String | 商品状态：EFFECT、INVALID、PAUSE；不填返回所有状态商品
    try {
      AntMerchantExpandItemQueryResponseModel result = apiInstance.query(targetType, targetId, undefinedCategory, frontCategoryId, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntMerchantExpandItemApi#query");
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
| **targetType** | **String**| 商品归属主体类型:  5: 店铺  4: 主站MID  3: 参与者  2: 角色  1: 联系人 | [optional] |
| **targetId** | **String**| 商品归属主体id | [optional] |
| **undefinedCategory** | **Boolean**| 未分类类目: true 的时候 front_category_id 必须不填（null） | [optional] |
| **frontCategoryId** | **String**| 商品前台类目id: null 表示所有分类 | [optional] |
| **status** | **String**| 商品状态：EFFECT、INVALID、PAUSE；不填返回所有状态商品 | [optional] |

### Return type

**AntMerchantExpandItemQueryResponseModel**

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

