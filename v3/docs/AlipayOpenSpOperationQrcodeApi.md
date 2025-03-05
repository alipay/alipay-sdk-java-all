# AlipayOpenSpOperationQrcodeApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenSpOperationQrcodeApi.md#query) | **GET** /v3/alipay/open/sp/operation/qrcode/query | 查询代运营授权或者账号绑定二维码 |


<a name="query"></a>
# **query**
> AlipayOpenSpOperationQrcodeQueryResponseModel query(outBizNo, operateType, merchantNo, alipayAccount, accessProductCode, isvScenePermissions)

查询代运营授权或者账号绑定二维码

面向服务商，查询发起代运营授权或者账号绑定的二维码。代间联商户代运营时，推荐使用接口同步返回的recommend_accounts字段中的账号扫码确认。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenSpOperationQrcodeApi;

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

    AlipayOpenSpOperationQrcodeApi apiInstance = new AlipayOpenSpOperationQrcodeApi(defaultClient);
    String outBizNo = "2020124234523465636345634"; // String | 外部操作流水，由服务商自定义，需确保每次操作唯一。仅支持数字、字母、下划线组合。
    String operateType = "OPERATION_AUTH"; // String | 代运营操作类型。取值如下： * ACCOUNT_BIND：账号绑定，仅支持间连商户。 * OPERATION_AUTH：代运营授权，支持间连、直连商户。
    String merchantNo = "2088XXXX"; // String | 支付宝商户号。注意仅支持 2088 开头的间连商户。 若被代运营者是间连商户，则 merchant_no 必填； 若为直连商户，则 merchant_no 和 alipay_account 不能同时为空，都有值优先取 merchant_no。
    String alipayAccount = "xxx@gmail.com"; // String | 支付宝登录账号。通常为手机号或者邮箱。 若被代运营者是间连商户，该字段无需填写。 若为直连商户，则 merchant_no 和 alipay_account 不能同时为空，都有值优先取 merchant_no。
    String accessProductCode = "OPENAPI_AUTH_DEFAULT"; // String | 接入的产品编号。 操作类型为绑定的，填OPENAPI_BIND_DEFAULT; 操作类型为授权的，填OPENAPI_AUTH_DEFAULT
    String isvScenePermissions = "SHOP_MANAGE:SHOP_MANAGE_BASE;PROMOTION_MANAGE:PROMOTION_MANAGE_BASE"; // String | 场景授权列表结构结构：场景codeA:权限code1,权限code2;场景codeB:权限code1,权限code2;
    try {
      AlipayOpenSpOperationQrcodeQueryResponseModel result = apiInstance.query(outBizNo, operateType, merchantNo, alipayAccount, accessProductCode, isvScenePermissions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenSpOperationQrcodeApi#query");
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
| **outBizNo** | **String**| 外部操作流水，由服务商自定义，需确保每次操作唯一。仅支持数字、字母、下划线组合。 | [optional] |
| **operateType** | **String**| 代运营操作类型。取值如下： * ACCOUNT_BIND：账号绑定，仅支持间连商户。 * OPERATION_AUTH：代运营授权，支持间连、直连商户。 | [optional] |
| **merchantNo** | **String**| 支付宝商户号。注意仅支持 2088 开头的间连商户。 若被代运营者是间连商户，则 merchant_no 必填； 若为直连商户，则 merchant_no 和 alipay_account 不能同时为空，都有值优先取 merchant_no。 | [optional] |
| **alipayAccount** | **String**| 支付宝登录账号。通常为手机号或者邮箱。 若被代运营者是间连商户，该字段无需填写。 若为直连商户，则 merchant_no 和 alipay_account 不能同时为空，都有值优先取 merchant_no。 | [optional] |
| **accessProductCode** | **String**| 接入的产品编号。 操作类型为绑定的，填OPENAPI_BIND_DEFAULT; 操作类型为授权的，填OPENAPI_AUTH_DEFAULT | [optional] |
| **isvScenePermissions** | **String**| 场景授权列表结构结构：场景codeA:权限code1,权限code2;场景codeB:权限code1,权限code2; | [optional] |

### Return type

**AlipayOpenSpOperationQrcodeQueryResponseModel**

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

