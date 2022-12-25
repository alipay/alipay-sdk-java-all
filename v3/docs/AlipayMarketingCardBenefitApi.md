# AlipayMarketingCardBenefitApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](AlipayMarketingCardBenefitApi.md#create) | **POST** /v3/alipay/marketing/card/benefit/create | 会员卡模板外部权益创建 |
| [**delete**](AlipayMarketingCardBenefitApi.md#delete) | **DELETE** /v3/alipay/marketing/card/benefit/delete | 会员卡模板外部权益删除 |
| [**modify**](AlipayMarketingCardBenefitApi.md#modify) | **POST** /v3/alipay/marketing/card/benefit/modify | 会员卡模板外部权益修改 |
| [**query**](AlipayMarketingCardBenefitApi.md#query) | **GET** /v3/alipay/marketing/card/benefit/query | 会员卡模板外部权益查询 |


<a name="create"></a>
# **create**
> AlipayMarketingCardBenefitCreateResponseModel create(alipayMarketingCardBenefitCreateModel)

会员卡模板外部权益创建

会员卡模板外部权益创建，创建的权益内容信息将展示在卡包中卡详情页中部区域。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingCardBenefitApi;

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

    AlipayMarketingCardBenefitApi apiInstance = new AlipayMarketingCardBenefitApi(defaultClient);
    AlipayMarketingCardBenefitCreateModel alipayMarketingCardBenefitCreateModel = new AlipayMarketingCardBenefitCreateModel(); // AlipayMarketingCardBenefitCreateModel | 
    try {
      AlipayMarketingCardBenefitCreateResponseModel result = apiInstance.create(alipayMarketingCardBenefitCreateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingCardBenefitApi#create");
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
| **alipayMarketingCardBenefitCreateModel** | **AlipayMarketingCardBenefitCreateModel**|  | [optional] |

### Return type

**AlipayMarketingCardBenefitCreateResponseModel**

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
> AlipayMarketingCardBenefitDeleteResponseModel delete(templateId, benefitId)

会员卡模板外部权益删除

会员卡模板外部权益删除

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingCardBenefitApi;

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

    AlipayMarketingCardBenefitApi apiInstance = new AlipayMarketingCardBenefitApi(defaultClient);
    String templateId = "20170322000000000068101000300041"; // String | 会员卡模板ID，通过 <a href=\"https://opendocs.alipay.com/apis/api_5/alipay.marketing.card.template.create\">alipay.marketing.card.template.create</a>（会员卡模板创建)接口创建会员卡模板获取。
    String benefitId = "20170322000000000068101000300041"; // String | 权益ID，通过 <a href=\"https://opendocs.alipay.com/apis/api_5/alipay.marketing.card.benefit.create\">alipay.marketing.card.benefit.create</a>(会员卡模板外部权益创建)接口创建获取。
    try {
      AlipayMarketingCardBenefitDeleteResponseModel result = apiInstance.delete(templateId, benefitId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingCardBenefitApi#delete");
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
| **templateId** | **String**| 会员卡模板ID，通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_5/alipay.marketing.card.template.create\&quot;&gt;alipay.marketing.card.template.create&lt;/a&gt;（会员卡模板创建)接口创建会员卡模板获取。 | [optional] |
| **benefitId** | **String**| 权益ID，通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_5/alipay.marketing.card.benefit.create\&quot;&gt;alipay.marketing.card.benefit.create&lt;/a&gt;(会员卡模板外部权益创建)接口创建获取。 | [optional] |

### Return type

**AlipayMarketingCardBenefitDeleteResponseModel**

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
> AlipayMarketingCardBenefitModifyResponseModel modify(alipayMarketingCardBenefitModifyModel)

会员卡模板外部权益修改

会员卡模板外部权益修改

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingCardBenefitApi;

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

    AlipayMarketingCardBenefitApi apiInstance = new AlipayMarketingCardBenefitApi(defaultClient);
    AlipayMarketingCardBenefitModifyModel alipayMarketingCardBenefitModifyModel = new AlipayMarketingCardBenefitModifyModel(); // AlipayMarketingCardBenefitModifyModel | 
    try {
      AlipayMarketingCardBenefitModifyResponseModel result = apiInstance.modify(alipayMarketingCardBenefitModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingCardBenefitApi#modify");
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
| **alipayMarketingCardBenefitModifyModel** | **AlipayMarketingCardBenefitModifyModel**|  | [optional] |

### Return type

**AlipayMarketingCardBenefitModifyResponseModel**

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
> AlipayMarketingCardBenefitQueryResponseModel query(templateId, benefitId)

会员卡模板外部权益查询

会员卡模板外部权益查询

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayMarketingCardBenefitApi;

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

    AlipayMarketingCardBenefitApi apiInstance = new AlipayMarketingCardBenefitApi(defaultClient);
    String templateId = "20170322000000000068101000300041"; // String | 会员卡模板ID，通过 <a href=\"https://opendocs.alipay.com/apis/api_5/alipay.marketing.card.template.create\">alipay.marketing.card.template.create</a>（会员卡模板创建)接口创建会员卡模板获取。
    String benefitId = "20170322000000000068101000300041"; // String | 权益ID，通过 <a href=\"https://opendocs.alipay.com/apis/api_5/alipay.marketing.card.benefit.create\">alipay.marketing.card.benefit.create</a>(会员卡模板外部权益创建)接口创建获取。
    try {
      AlipayMarketingCardBenefitQueryResponseModel result = apiInstance.query(templateId, benefitId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayMarketingCardBenefitApi#query");
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
| **templateId** | **String**| 会员卡模板ID，通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_5/alipay.marketing.card.template.create\&quot;&gt;alipay.marketing.card.template.create&lt;/a&gt;（会员卡模板创建)接口创建会员卡模板获取。 | [optional] |
| **benefitId** | **String**| 权益ID，通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_5/alipay.marketing.card.benefit.create\&quot;&gt;alipay.marketing.card.benefit.create&lt;/a&gt;(会员卡模板外部权益创建)接口创建获取。 | [optional] |

### Return type

**AlipayMarketingCardBenefitQueryResponseModel**

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

