# AlipayCommerceCityfacilitatorVoucherApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchquery**](AlipayCommerceCityfacilitatorVoucherApi.md#batchquery) | **POST** /v3/alipay/commerce/cityfacilitator/voucher/batchquery | 地铁购票订单批量查询 |
| [**generate**](AlipayCommerceCityfacilitatorVoucherApi.md#generate) | **POST** /v3/alipay/commerce/cityfacilitator/voucher/generate | 地铁购票核销码发码 |
| [**refund**](AlipayCommerceCityfacilitatorVoucherApi.md#refund) | **POST** /v3/alipay/commerce/cityfacilitator/voucher/refund | 地铁购票发码退款 |


<a name="batchquery"></a>
# **batchquery**
> AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel batchquery(alipayCommerceCityfacilitatorVoucherBatchqueryModel)

地铁购票订单批量查询

商户APP调该接口批量查询订单状态

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceCityfacilitatorVoucherApi;

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

    AlipayCommerceCityfacilitatorVoucherApi apiInstance = new AlipayCommerceCityfacilitatorVoucherApi(defaultClient);
    AlipayCommerceCityfacilitatorVoucherBatchqueryModel alipayCommerceCityfacilitatorVoucherBatchqueryModel = new AlipayCommerceCityfacilitatorVoucherBatchqueryModel(); // AlipayCommerceCityfacilitatorVoucherBatchqueryModel | 
    try {
      AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel result = apiInstance.batchquery(alipayCommerceCityfacilitatorVoucherBatchqueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceCityfacilitatorVoucherApi#batchquery");
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
| **alipayCommerceCityfacilitatorVoucherBatchqueryModel** | **AlipayCommerceCityfacilitatorVoucherBatchqueryModel**|  | [optional] |

### Return type

**AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel**

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

<a name="generate"></a>
# **generate**
> AlipayCommerceCityfacilitatorVoucherGenerateResponseModel generate(alipayCommerceCityfacilitatorVoucherGenerateModel)

地铁购票核销码发码

商户APP调快捷支付付款后，获取地铁购票的核销码

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceCityfacilitatorVoucherApi;

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

    AlipayCommerceCityfacilitatorVoucherApi apiInstance = new AlipayCommerceCityfacilitatorVoucherApi(defaultClient);
    AlipayCommerceCityfacilitatorVoucherGenerateModel alipayCommerceCityfacilitatorVoucherGenerateModel = new AlipayCommerceCityfacilitatorVoucherGenerateModel(); // AlipayCommerceCityfacilitatorVoucherGenerateModel | 
    try {
      AlipayCommerceCityfacilitatorVoucherGenerateResponseModel result = apiInstance.generate(alipayCommerceCityfacilitatorVoucherGenerateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceCityfacilitatorVoucherApi#generate");
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
| **alipayCommerceCityfacilitatorVoucherGenerateModel** | **AlipayCommerceCityfacilitatorVoucherGenerateModel**|  | [optional] |

### Return type

**AlipayCommerceCityfacilitatorVoucherGenerateResponseModel**

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

<a name="refund"></a>
# **refund**
> Object refund(alipayCommerceCityfacilitatorVoucherRefundModel)

地铁购票发码退款

地铁购票，商户发码后，调该接口从中间户退款

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceCityfacilitatorVoucherApi;

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

    AlipayCommerceCityfacilitatorVoucherApi apiInstance = new AlipayCommerceCityfacilitatorVoucherApi(defaultClient);
    AlipayCommerceCityfacilitatorVoucherRefundModel alipayCommerceCityfacilitatorVoucherRefundModel = new AlipayCommerceCityfacilitatorVoucherRefundModel(); // AlipayCommerceCityfacilitatorVoucherRefundModel | 
    try {
      Object result = apiInstance.refund(alipayCommerceCityfacilitatorVoucherRefundModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceCityfacilitatorVoucherApi#refund");
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
| **alipayCommerceCityfacilitatorVoucherRefundModel** | **AlipayCommerceCityfacilitatorVoucherRefundModel**|  | [optional] |

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

