# AlipayUserCertdocCertverifyApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**consult**](AlipayUserCertdocCertverifyApi.md#consult) | **GET** /v3/alipay/user/certdoc/certverify/consult | 实名证件信息比对验证咨询 |
| [**preconsult**](AlipayUserCertdocCertverifyApi.md#preconsult) | **POST** /v3/alipay/user/certdoc/certverify/preconsult | 实名证件信息比对验证预咨询 |


<a name="consult"></a>
# **consult**
> AlipayUserCertdocCertverifyConsultResponseModel consult(authToken, verifyId)

实名证件信息比对验证咨询

商户在预咨询接口（接口1）预先录入某用户的实名证件信息（例如姓名、身份证号等），获得用户授权后调用本咨询接口（接口2），将对比该用户的支付宝实名信息与（接口1）传入的信息是否一致。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayUserCertdocCertverifyApi;

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

    AlipayUserCertdocCertverifyApi apiInstance = new AlipayUserCertdocCertverifyApi(defaultClient);
    String authToken = "authToken_example"; // String | 用户授权令牌
    String verifyId = "671ffcda5447bc87e9ed2f669eb143d4"; // String | 信息校验验证ID。通过<a href=\"https://opendocs.alipay.com/apis/api_2/alipay.user.certdoc.certverify.preconsult\">alipay.user.certdoc.certverify.preconsult</a>(实名证件信息比对验证预咨询)接口获取。
    try {
      AlipayUserCertdocCertverifyConsultResponseModel result = apiInstance.consult(authToken, verifyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayUserCertdocCertverifyApi#consult");
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
| **authToken** | **String**| 用户授权令牌 | [optional] |
| **verifyId** | **String**| 信息校验验证ID。通过&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_2/alipay.user.certdoc.certverify.preconsult\&quot;&gt;alipay.user.certdoc.certverify.preconsult&lt;/a&gt;(实名证件信息比对验证预咨询)接口获取。 | [optional] |

### Return type

**AlipayUserCertdocCertverifyConsultResponseModel**

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

<a name="preconsult"></a>
# **preconsult**
> AlipayUserCertdocCertverifyPreconsultResponseModel preconsult(alipayUserCertdocCertverifyPreconsultModel)

实名证件信息比对验证预咨询

商户在该接口（接口1）预先录入某用户的实名证件信息（例如姓名、身份证号等），获得用户授权后调用咨询接口（接口2），将对比该用户的支付宝实名信息与该（接口1）传入的信息是否一致。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayUserCertdocCertverifyApi;

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

    AlipayUserCertdocCertverifyApi apiInstance = new AlipayUserCertdocCertverifyApi(defaultClient);
    AlipayUserCertdocCertverifyPreconsultModel alipayUserCertdocCertverifyPreconsultModel = new AlipayUserCertdocCertverifyPreconsultModel(); // AlipayUserCertdocCertverifyPreconsultModel | 
    try {
      AlipayUserCertdocCertverifyPreconsultResponseModel result = apiInstance.preconsult(alipayUserCertdocCertverifyPreconsultModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayUserCertdocCertverifyApi#preconsult");
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
| **alipayUserCertdocCertverifyPreconsultModel** | **AlipayUserCertdocCertverifyPreconsultModel**|  | [optional] |

### Return type

**AlipayUserCertdocCertverifyPreconsultResponseModel**

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

