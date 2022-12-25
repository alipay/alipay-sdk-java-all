# ZhimaCustomerJobworthInfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](ZhimaCustomerJobworthInfoApi.md#query) | **GET** /v3/zhima/customer/jobworth/info/query | 职得工作证信息查询 |


<a name="query"></a>
# **query**
> ZhimaCustomerJobworthInfoQueryResponseModel query(userName, connKey, certNo, userId, openId, backUrl, certType, kaVisitorId, visitorType, visitorName, companyCertificate, visitorUrl, hasButton, hasNumber, hasQrCode, hasHtml, jobId, industryId, cloudResumeScene)

职得工作证信息查询

查询用户职得工作证信息 查询方式3选1，都设置时uid优先 1、支付宝uid查询：user_id 2、身份证+姓名查询：cert_type+cert_no 3、智能简历场景：conn_key

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.ZhimaCustomerJobworthInfoApi;

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

    ZhimaCustomerJobworthInfoApi apiInstance = new ZhimaCustomerJobworthInfoApi(defaultClient);
    String userName = "张三"; // String | 姓名
    String connKey = "ttest11234"; // String | 外部订单号，zhima.credit.payafteruse.creditagreement.sign的入参 out_agreement_no智能简历场景支持只传该值
    String certNo = "42011719880304XXXX"; // String | 证件号 ，根据cert_type类型设置对应证件号码，选择身份证校验时必传
    String userId = "2088XXXXXXXX"; // String | 蚂蚁统一会员ID ，为2088开头的唯一标识 选择支付宝uid检验时必传，支付宝uid或身份证+身份证类型 查询2选1，都设置时uid优先
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 蚂蚁统一会员ID ，为2088开头的唯一标识 选择支付宝uid检验时必传，支付宝uid或身份证+身份证类型 查询2选1，都设置时uid优先
    String backUrl = "www.123.com"; // String | 若用户没有开通工作证或者芝麻，成功开通后回跳的链接 ，支持http或schema地址
    String certType = "0:身份证1:护照2:台湾同胞回乡证3:港澳居民往来内地通行证4:台湾居民通行证5:港澳居民通行证"; // String | 证件类型 ，枚举值： 0:身份证1:护照2:台湾同胞回乡证3:港澳居民往来内地通行证4:台湾居民通行证5:港澳居民通行证 选择身份证校验时必传，支付宝uid或身份证+身份证类型 查询2选1，都设置时uid优先
    String kaVisitorId = "xxx"; // String | 商户内部的唯一id如果是需要返回h5页面必填
    String visitorType = "P"; // String | 访问类型 C = company  or P = person 如果是需要返回h5页面必填
    String visitorName = "访客名称"; // String | 商户侧配置访客名称 如果是需要返回h5页面必填
    String companyCertificate = "xxxx"; // String | 公司社会统一代码h5页面访客展示使用
    String visitorUrl = "xxxx"; // String | 上传图片接口返回的id
    Boolean hasButton = true; // Boolean | 在h5页面是否展示底部跳转按钮
    Boolean hasNumber = true; // Boolean | true or false 是否展示
    Boolean hasQrCode = true; // Boolean | 是否展示二维码
    Boolean hasHtml = true; // Boolean | 是否需要返回h5页面
    String jobId = "05A00"; // String | 对外使用的jobid
    String industryId = "05A21"; // String | 行业描述ID
    String cloudResumeScene = "GREEN_HIRE"; // String | 子场景
    try {
      ZhimaCustomerJobworthInfoQueryResponseModel result = apiInstance.query(userName, connKey, certNo, userId, openId, backUrl, certType, kaVisitorId, visitorType, visitorName, companyCertificate, visitorUrl, hasButton, hasNumber, hasQrCode, hasHtml, jobId, industryId, cloudResumeScene);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZhimaCustomerJobworthInfoApi#query");
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
| **userName** | **String**| 姓名 | [optional] |
| **connKey** | **String**| 外部订单号，zhima.credit.payafteruse.creditagreement.sign的入参 out_agreement_no智能简历场景支持只传该值 | [optional] |
| **certNo** | **String**| 证件号 ，根据cert_type类型设置对应证件号码，选择身份证校验时必传 | [optional] |
| **userId** | **String**| 蚂蚁统一会员ID ，为2088开头的唯一标识 选择支付宝uid检验时必传，支付宝uid或身份证+身份证类型 查询2选1，都设置时uid优先 | [optional] |
| **openId** | **String**| 蚂蚁统一会员ID ，为2088开头的唯一标识 选择支付宝uid检验时必传，支付宝uid或身份证+身份证类型 查询2选1，都设置时uid优先 | [optional] |
| **backUrl** | **String**| 若用户没有开通工作证或者芝麻，成功开通后回跳的链接 ，支持http或schema地址 | [optional] |
| **certType** | **String**| 证件类型 ，枚举值： 0:身份证1:护照2:台湾同胞回乡证3:港澳居民往来内地通行证4:台湾居民通行证5:港澳居民通行证 选择身份证校验时必传，支付宝uid或身份证+身份证类型 查询2选1，都设置时uid优先 | [optional] |
| **kaVisitorId** | **String**| 商户内部的唯一id如果是需要返回h5页面必填 | [optional] |
| **visitorType** | **String**| 访问类型 C &#x3D; company  or P &#x3D; person 如果是需要返回h5页面必填 | [optional] |
| **visitorName** | **String**| 商户侧配置访客名称 如果是需要返回h5页面必填 | [optional] |
| **companyCertificate** | **String**| 公司社会统一代码h5页面访客展示使用 | [optional] |
| **visitorUrl** | **String**| 上传图片接口返回的id | [optional] |
| **hasButton** | **Boolean**| 在h5页面是否展示底部跳转按钮 | [optional] |
| **hasNumber** | **Boolean**| true or false 是否展示 | [optional] |
| **hasQrCode** | **Boolean**| 是否展示二维码 | [optional] |
| **hasHtml** | **Boolean**| 是否需要返回h5页面 | [optional] |
| **jobId** | **String**| 对外使用的jobid | [optional] |
| **industryId** | **String**| 行业描述ID | [optional] |
| **cloudResumeScene** | **String**| 子场景 | [optional] |

### Return type

**ZhimaCustomerJobworthInfoQueryResponseModel**

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

