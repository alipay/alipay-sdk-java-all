# AntMerchantExpandShopReceiptaccountApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**save**](AntMerchantExpandShopReceiptaccountApi.md#save) | **POST** /v3/ant/merchant/expand/shop/receiptaccount/save | 店铺增加收单账号 |


<a name="save"></a>
# **save**
> Object save(antMerchantExpandShopReceiptaccountSaveModel)

店铺增加收单账号

店铺增加收单账号

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AntMerchantExpandShopReceiptaccountApi;

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

    AntMerchantExpandShopReceiptaccountApi apiInstance = new AntMerchantExpandShopReceiptaccountApi(defaultClient);
    AntMerchantExpandShopReceiptaccountSaveModel antMerchantExpandShopReceiptaccountSaveModel = new AntMerchantExpandShopReceiptaccountSaveModel(); // AntMerchantExpandShopReceiptaccountSaveModel | 
    try {
      Object result = apiInstance.save(antMerchantExpandShopReceiptaccountSaveModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AntMerchantExpandShopReceiptaccountApi#save");
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
| **antMerchantExpandShopReceiptaccountSaveModel** | **AntMerchantExpandShopReceiptaccountSaveModel**|  | [optional] |

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

