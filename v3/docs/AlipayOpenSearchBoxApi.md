# AlipayOpenSearchBoxApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apply**](AlipayOpenSearchBoxApi.md#apply) | **POST** /v3/alipay/open/search/box/apply | 申请创建搜索直达配置 |
| [**batchquery**](AlipayOpenSearchBoxApi.md#batchquery) | **POST** /v3/alipay/open/search/box/batchquery | 批量查询搜索直达配置列表 |
| [**consult**](AlipayOpenSearchBoxApi.md#consult) | **POST** /v3/alipay/open/search/box/consult | 搜索直达创建预校验 |
| [**modify**](AlipayOpenSearchBoxApi.md#modify) | **POST** /v3/alipay/open/search/box/modify | 修改搜索直达配置 |
| [**offline**](AlipayOpenSearchBoxApi.md#offline) | **POST** /v3/alipay/open/search/box/offline | 下架搜索直达 |
| [**online**](AlipayOpenSearchBoxApi.md#online) | **POST** /v3/alipay/open/search/box/online | 上架搜索直达 |
| [**query**](AlipayOpenSearchBoxApi.md#query) | **GET** /v3/alipay/open/search/box/query | 查询搜索直达配置详情 |


<a name="apply"></a>
# **apply**
> AlipayOpenSearchBoxApplyResponseModel apply(alipayOpenSearchBoxApplyModel)

申请创建搜索直达配置

申请创建搜索直达配置，相关概念说明及准入条件详见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/mini/03fjba\&quot;&gt; 搜索直达 &lt;/a&gt; 通过该接口创建搜索直达，满足准入门槛时，创建后立马生效。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSearchBoxApi;

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

    AlipayOpenSearchBoxApi apiInstance = new AlipayOpenSearchBoxApi(defaultClient);
    AlipayOpenSearchBoxApplyModel alipayOpenSearchBoxApplyModel = new AlipayOpenSearchBoxApplyModel(); // AlipayOpenSearchBoxApplyModel | 
    try {
      AlipayOpenSearchBoxApplyResponseModel result = apiInstance.apply(alipayOpenSearchBoxApplyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSearchBoxApi#apply");
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
| **alipayOpenSearchBoxApplyModel** | **AlipayOpenSearchBoxApplyModel**|  | [optional] |

### Return type

**AlipayOpenSearchBoxApplyResponseModel**

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

<a name="batchquery"></a>
# **batchquery**
> AlipayOpenSearchBoxBatchqueryResponseModel batchquery(alipayOpenSearchBoxBatchqueryModel)

批量查询搜索直达配置列表

批量查询商户已开通搜索直达的小程序及直达信息（搜索直达名称和id）

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSearchBoxApi;

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

    AlipayOpenSearchBoxApi apiInstance = new AlipayOpenSearchBoxApi(defaultClient);
    AlipayOpenSearchBoxBatchqueryModel alipayOpenSearchBoxBatchqueryModel = new AlipayOpenSearchBoxBatchqueryModel(); // AlipayOpenSearchBoxBatchqueryModel | 
    try {
      AlipayOpenSearchBoxBatchqueryResponseModel result = apiInstance.batchquery(alipayOpenSearchBoxBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSearchBoxApi#batchquery");
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
| **alipayOpenSearchBoxBatchqueryModel** | **AlipayOpenSearchBoxBatchqueryModel**|  | [optional] |

### Return type

**AlipayOpenSearchBoxBatchqueryResponseModel**

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
> AlipayOpenSearchBoxConsultResponseModel consult(alipayOpenSearchBoxConsultModel)

搜索直达创建预校验

用于对搜索直达创建申请的入参和条件进行提前判断校验。 具体准入条件参考&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/pre-open/0311q3#%E5%87%86%E5%85%A5%E6%9D%A1%E4%BB%B6\&quot;&gt;搜索直达准入条件&lt;/a&gt;

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSearchBoxApi;

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

    AlipayOpenSearchBoxApi apiInstance = new AlipayOpenSearchBoxApi(defaultClient);
    AlipayOpenSearchBoxConsultModel alipayOpenSearchBoxConsultModel = new AlipayOpenSearchBoxConsultModel(); // AlipayOpenSearchBoxConsultModel | 
    try {
      AlipayOpenSearchBoxConsultResponseModel result = apiInstance.consult(alipayOpenSearchBoxConsultModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSearchBoxApi#consult");
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
| **alipayOpenSearchBoxConsultModel** | **AlipayOpenSearchBoxConsultModel**|  | [optional] |

### Return type

**AlipayOpenSearchBoxConsultResponseModel**

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
> AlipayOpenSearchBoxModifyResponseModel modify(alipayOpenSearchBoxModifyModel)

修改搜索直达配置

修改搜索直达配置模块，配置对应的模块参考：&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/mini/03fjba#%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E\&quot;&gt; 搜索直达模块说明 &lt;/a&gt;

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSearchBoxApi;

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

    AlipayOpenSearchBoxApi apiInstance = new AlipayOpenSearchBoxApi(defaultClient);
    AlipayOpenSearchBoxModifyModel alipayOpenSearchBoxModifyModel = new AlipayOpenSearchBoxModifyModel(); // AlipayOpenSearchBoxModifyModel | 
    try {
      AlipayOpenSearchBoxModifyResponseModel result = apiInstance.modify(alipayOpenSearchBoxModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSearchBoxApi#modify");
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
| **alipayOpenSearchBoxModifyModel** | **AlipayOpenSearchBoxModifyModel**|  | [optional] |

### Return type

**AlipayOpenSearchBoxModifyResponseModel**

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

<a name="offline"></a>
# **offline**
> Object offline(alipayOpenSearchBoxOfflineModel)

下架搜索直达

若不需要运营搜索直达时，可调用次接口下架搜索直达

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSearchBoxApi;

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

    AlipayOpenSearchBoxApi apiInstance = new AlipayOpenSearchBoxApi(defaultClient);
    AlipayOpenSearchBoxOfflineModel alipayOpenSearchBoxOfflineModel = new AlipayOpenSearchBoxOfflineModel(); // AlipayOpenSearchBoxOfflineModel | 
    try {
      Object result = apiInstance.offline(alipayOpenSearchBoxOfflineModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSearchBoxApi#offline");
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
| **alipayOpenSearchBoxOfflineModel** | **AlipayOpenSearchBoxOfflineModel**|  | [optional] |

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

<a name="online"></a>
# **online**
> Object online(alipayOpenSearchBoxOnlineModel)

上架搜索直达

若搜索直达处于下架状态时，可通过此接口来重新上架直达，上架须满足搜索直达准入门槛，若不满足，则会上架失败并报错

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSearchBoxApi;

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

    AlipayOpenSearchBoxApi apiInstance = new AlipayOpenSearchBoxApi(defaultClient);
    AlipayOpenSearchBoxOnlineModel alipayOpenSearchBoxOnlineModel = new AlipayOpenSearchBoxOnlineModel(); // AlipayOpenSearchBoxOnlineModel | 
    try {
      Object result = apiInstance.online(alipayOpenSearchBoxOnlineModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSearchBoxApi#online");
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
| **alipayOpenSearchBoxOnlineModel** | **AlipayOpenSearchBoxOnlineModel**|  | [optional] |

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
> AlipayOpenSearchBoxQueryResponseModel query(boxId, merchantId)

查询搜索直达配置详情

查询商户已开通搜索直达的小程序及直达信息（搜索直达名称和id），各模块说明详见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/mini/03fjba\&quot;&gt; 搜索直达 &lt;/a&gt;。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSearchBoxApi;

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

    AlipayOpenSearchBoxApi apiInstance = new AlipayOpenSearchBoxApi(defaultClient);
    String boxId = "20220308000000128693"; // String | 搜索直达配置id
    String merchantId = "2088xxxxxxxxxxxx"; // String | 商户id，代运营模式下传入。代运营模式，需要服务商已获得商家\"运营支付宝小程序\"授权。
    try {
      AlipayOpenSearchBoxQueryResponseModel result = apiInstance.query(boxId, merchantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSearchBoxApi#query");
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
| **boxId** | **String**| 搜索直达配置id | [optional] |
| **merchantId** | **String**| 商户id，代运营模式下传入。代运营模式，需要服务商已获得商家\&quot;运营支付宝小程序\&quot;授权。 | [optional] |

### Return type

**AlipayOpenSearchBoxQueryResponseModel**

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

