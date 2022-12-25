# AlipayOpenSpOperationResultApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenSpOperationResultApi.md#query) | **GET** /v3/alipay/open/sp/operation/result/query | 查询服务商代运营操作结果 |


<a name="query"></a>
# **query**
> AlipayOpenSpOperationResultQueryResponseModel query(operateType, batchNo, accessProductCode, merchantNo, alipayAccount, isvScenePermissions)

查询服务商代运营操作结果

查询服务商代运营操作（代运营授权或者账号绑定）结果。提供两种查询方式： 方式一：operate_type + batch_no，提供基于操作批次的精确查询，只查询本操作批次的代运营操作结果，不反映最终代运营操作结果。 方式一查询方式优先级更高。 方式二：operate_type + access_product_code + merchant_no + alipay_account 参数组合，可以查询代运营操作最终结果，任意一个操作批次成功都会体现在最终结果中。 方式三：operate_type + isv_scene_permissions + merchant_no + alipay_account 参数组合，可以查询代运营操作最终结果，任意一个操作批次成功都会体现在最终结果中（仅支持查询授权结果）。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSpOperationResultApi;

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

    AlipayOpenSpOperationResultApi apiInstance = new AlipayOpenSpOperationResultApi(defaultClient);
    String operateType = "ACCOUNT_BIND"; // String | 代运营操作类型。取值如下 ACCOUNT_BIND：账号绑定； OPERATION_AUTH：代运营授权。
    String batchNo = "2020222342342"; // String | 支付宝操作批次号。 batch_no提供基于操作批次的精确查询，只查询本操作批次的代运营操作结果，不反映最终代运营操作结果。 注意： 1.access_product_code、merchant_no、alipay_account三个参数组合与传入 batch_no 为两种查询方式，不可同时为空且以 batch_no 优先。 2.access_product_code、merchant_no、alipay_account三个参数组合可以查询最终代运营操作结果。
    String accessProductCode = "OPENAPI_BIND_DEFAULT"; // String | 接入的产品编号。未传batch_no时必填，枚举如下： OPENAPI_BIND_DEFAULT：操作类型为账号绑定； OPENAPI_AUTH_DEFAULT：操作类型为代运营授权。
    String merchantNo = "2088912341234123"; // String | 支付宝商户号。支持间连、直连商户，值为2088开头。 未传batch_no时需注意： 若查询间连商户则 merchant_no 必填；  若查询直连商户，则merchant_no和alipay_account不能同时为空，都有值优先取merchant_no。
    String alipayAccount = "testaccount@test.com"; // String | 支付宝登录账号，通常为手机号或者邮箱。未传batch_no时需注意： 1.当查询merchant_no为间连商户时：   * 若 operate_type=ACCOUNT_BIND，则alipay_account必填。   * 若 operate_type=OPERATION_AUTH，则alipay_account无需传入。 2.当查询merchant_no为直连商户时：   * merchant_no和alipay_account不能同时为空，都有值优先取merchant_no。
    String isvScenePermissions = "SHOP_MANAGE:SHOP_MANAGE_BASE;PROMOTION_MANAGE:PROMOTION_MANAGE_BASE"; // String | 场景授权列表结构结构：场景codeA:权限code1,权限code2;场景codeB:权限code1,权限code2;
    try {
      AlipayOpenSpOperationResultQueryResponseModel result = apiInstance.query(operateType, batchNo, accessProductCode, merchantNo, alipayAccount, isvScenePermissions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSpOperationResultApi#query");
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
| **operateType** | **String**| 代运营操作类型。取值如下 ACCOUNT_BIND：账号绑定； OPERATION_AUTH：代运营授权。 | [optional] |
| **batchNo** | **String**| 支付宝操作批次号。 batch_no提供基于操作批次的精确查询，只查询本操作批次的代运营操作结果，不反映最终代运营操作结果。 注意： 1.access_product_code、merchant_no、alipay_account三个参数组合与传入 batch_no 为两种查询方式，不可同时为空且以 batch_no 优先。 2.access_product_code、merchant_no、alipay_account三个参数组合可以查询最终代运营操作结果。 | [optional] |
| **accessProductCode** | **String**| 接入的产品编号。未传batch_no时必填，枚举如下： OPENAPI_BIND_DEFAULT：操作类型为账号绑定； OPENAPI_AUTH_DEFAULT：操作类型为代运营授权。 | [optional] |
| **merchantNo** | **String**| 支付宝商户号。支持间连、直连商户，值为2088开头。 未传batch_no时需注意： 若查询间连商户则 merchant_no 必填；  若查询直连商户，则merchant_no和alipay_account不能同时为空，都有值优先取merchant_no。 | [optional] |
| **alipayAccount** | **String**| 支付宝登录账号，通常为手机号或者邮箱。未传batch_no时需注意： 1.当查询merchant_no为间连商户时：   * 若 operate_type&#x3D;ACCOUNT_BIND，则alipay_account必填。   * 若 operate_type&#x3D;OPERATION_AUTH，则alipay_account无需传入。 2.当查询merchant_no为直连商户时：   * merchant_no和alipay_account不能同时为空，都有值优先取merchant_no。 | [optional] |
| **isvScenePermissions** | **String**| 场景授权列表结构结构：场景codeA:权限code1,权限code2;场景codeB:权限code1,权限code2; | [optional] |

### Return type

**AlipayOpenSpOperationResultQueryResponseModel**

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

