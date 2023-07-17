# AlipayUserAgreementApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**migrate**](AlipayUserAgreementApi.md#migrate) | **POST** /v3/alipay/user/agreement/migrate | 代扣协议迁移 |
| [**query**](AlipayUserAgreementApi.md#query) | **GET** /v3/alipay/user/agreement/query | 支付宝个人代扣协议查询接口 |
| [**transfer**](AlipayUserAgreementApi.md#transfer) | **POST** /v3/alipay/user/agreement/transfer | 协议由普通通用代扣协议产品转移到周期扣协议产品 |
| [**unsign**](AlipayUserAgreementApi.md#unsign) | **POST** /v3/alipay/user/agreement/unsign | 支付宝个人代扣协议解约接口 |


<a name="migrate"></a>
# **migrate**
> Object migrate(alipayUserAgreementMigrateModel)

代扣协议迁移

由商户调用，将商户与用户签署的代扣协议内容进行迁移，包括协议主体迁移等

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayUserAgreementApi;

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

    AlipayUserAgreementApi apiInstance = new AlipayUserAgreementApi(defaultClient);
    AlipayUserAgreementMigrateModel alipayUserAgreementMigrateModel = new AlipayUserAgreementMigrateModel(); // AlipayUserAgreementMigrateModel | 
    try {
      Object result = apiInstance.migrate(alipayUserAgreementMigrateModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayUserAgreementApi#migrate");
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
| **alipayUserAgreementMigrateModel** | **AlipayUserAgreementMigrateModel**|  | [optional] |

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
> AlipayUserAgreementQueryResponseModel query(personalProductCode, alipayUserId, alipayOpenId, alipayLogonId, signScene, externalAgreementNo, thirdPartyType, agreementNo)

支付宝个人代扣协议查询接口

支付宝个人代扣协议查询接口

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayUserAgreementApi;

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

    AlipayUserAgreementApi apiInstance = new AlipayUserAgreementApi(defaultClient);
    String personalProductCode = "GENERAL_WITHHOLDING_P"; // String | 协议产品码，商户和支付宝签约时确定，商户可咨询技术支持。
    String alipayUserId = "2088101122675263"; // String | 用户的支付宝账号对应 的支付宝唯一用户号，以 2088 开头的 16 位纯数字 组成。 本参数与alipay_logon_id若都填写，则以本参数为准，优先级高于 alipay_logon_id。
    String alipayOpenId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 用户的支付宝账号对应 的支付宝唯一用户号， 本参数与alipay_logon_id若都填写，则以本参数为准，优先级高于 alipay_logon_id。
    String alipayLogonId = "abx@alitest.com"; // String | 用户的支付宝登录账号，支持邮箱或手机号码格式。本参数与alipay_open_id 或 alipay_user_id 同时填写，优先按照 alipay_open_id 或 alipay_user_id 处理。
    String signScene = "INDUSTRY|MEDICAL"; // String | 签约场景码，该值需要与系统/页面签约接口调用时传入的值保持一 致。如：周期扣款场景与调用 alipay.user.agreement.page.sign(支付宝个人协议页面签约接口) 签约时的 sign_scene 相同。  注意：当传入商户签约号 external_agreement_no 时，该值不能为空或默认值 DEFAULT|DEFAULT。 
    String externalAgreementNo = "test"; // String | 代扣协议中标示用户的唯一签约号(确保在商户系统中 唯一)。 格式规则:支持大写小写字母和数字，最长 32 位。
    String thirdPartyType = "PARTNER"; // String | 签约第三方主体类型。对于三方协议，表示当前用户和哪一类的第三方主体进行签约。 默认为PARTNER。
    String agreementNo = "20170322450983769228"; // String | 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ） ，如果传了该参数，其他参数会被忽略
    try {
      AlipayUserAgreementQueryResponseModel result = apiInstance.query(personalProductCode, alipayUserId, alipayOpenId, alipayLogonId, signScene, externalAgreementNo, thirdPartyType, agreementNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayUserAgreementApi#query");
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
| **personalProductCode** | **String**| 协议产品码，商户和支付宝签约时确定，商户可咨询技术支持。 | [optional] |
| **alipayUserId** | **String**| 用户的支付宝账号对应 的支付宝唯一用户号，以 2088 开头的 16 位纯数字 组成。 本参数与alipay_logon_id若都填写，则以本参数为准，优先级高于 alipay_logon_id。 | [optional] |
| **alipayOpenId** | **String**| 用户的支付宝账号对应 的支付宝唯一用户号， 本参数与alipay_logon_id若都填写，则以本参数为准，优先级高于 alipay_logon_id。 | [optional] |
| **alipayLogonId** | **String**| 用户的支付宝登录账号，支持邮箱或手机号码格式。本参数与alipay_open_id 或 alipay_user_id 同时填写，优先按照 alipay_open_id 或 alipay_user_id 处理。 | [optional] |
| **signScene** | **String**| 签约场景码，该值需要与系统/页面签约接口调用时传入的值保持一 致。如：周期扣款场景与调用 alipay.user.agreement.page.sign(支付宝个人协议页面签约接口) 签约时的 sign_scene 相同。  注意：当传入商户签约号 external_agreement_no 时，该值不能为空或默认值 DEFAULT|DEFAULT。  | [optional] |
| **externalAgreementNo** | **String**| 代扣协议中标示用户的唯一签约号(确保在商户系统中 唯一)。 格式规则:支持大写小写字母和数字，最长 32 位。 | [optional] |
| **thirdPartyType** | **String**| 签约第三方主体类型。对于三方协议，表示当前用户和哪一类的第三方主体进行签约。 默认为PARTNER。 | [optional] |
| **agreementNo** | **String**| 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ） ，如果传了该参数，其他参数会被忽略 | [optional] |

### Return type

**AlipayUserAgreementQueryResponseModel**

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

<a name="transfer"></a>
# **transfer**
> AlipayUserAgreementTransferResponseModel transfer(alipayUserAgreementTransferModel)

协议由普通通用代扣协议产品转移到周期扣协议产品

由商户调用，将商户之前通用代扣产品转移到周期扣的协议产品

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayUserAgreementApi;

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

    AlipayUserAgreementApi apiInstance = new AlipayUserAgreementApi(defaultClient);
    AlipayUserAgreementTransferModel alipayUserAgreementTransferModel = new AlipayUserAgreementTransferModel(); // AlipayUserAgreementTransferModel | 
    try {
      AlipayUserAgreementTransferResponseModel result = apiInstance.transfer(alipayUserAgreementTransferModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayUserAgreementApi#transfer");
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
| **alipayUserAgreementTransferModel** | **AlipayUserAgreementTransferModel**|  | [optional] |

### Return type

**AlipayUserAgreementTransferResponseModel**

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

<a name="unsign"></a>
# **unsign**
> Object unsign(alipayUserAgreementUnsignModel)

支付宝个人代扣协议解约接口

支付宝个人代扣协议解约接口

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayUserAgreementApi;

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

    AlipayUserAgreementApi apiInstance = new AlipayUserAgreementApi(defaultClient);
    AlipayUserAgreementUnsignModel alipayUserAgreementUnsignModel = new AlipayUserAgreementUnsignModel(); // AlipayUserAgreementUnsignModel | 
    try {
      Object result = apiInstance.unsign(alipayUserAgreementUnsignModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayUserAgreementApi#unsign");
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
| **alipayUserAgreementUnsignModel** | **AlipayUserAgreementUnsignModel**|  | [optional] |

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

