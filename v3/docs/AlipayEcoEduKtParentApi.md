# AlipayEcoEduKtParentApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayEcoEduKtParentApi.md#query) | **GET** /v3/alipay/eco/edu/kt/parent/query | 查询学生家长状态接口 |


<a name="query"></a>
# **query**
> AlipayEcoEduKtParentQueryResponseModel query(schoolPid, schoolNo, partnerId, childName, userMobile, studentCode, studentIdentify)

查询学生家长状态接口

ISV发送账单后，用户在支付宝缴费成功。ISV可以通过此接口查询，用户缴费的时候，是否创建了缴费账户，如果已经添加，学校使用ISV的系统再次发账单就可以通过支付宝的通知触达用户；如果未添加，学校即可联系家长，督促家长在支付宝添加学生的缴费账户。  目前的出现的场景是家长第一次缴费成功后，学校使用ISV的系统再次发账单，认为家长应该收到通知，实际上只有建立缴费账户的家长才能收到，未建立缴费账户的是收不到通知，这部分家长有可能就缴费不及时或不通过支付宝缴费。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoEduKtParentApi;

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

    AlipayEcoEduKtParentApi apiInstance = new AlipayEcoEduKtParentApi(defaultClient);
    String schoolPid = "20880012939123234423"; // String | 学校支付宝pid
    String schoolNo = "11010100000002"; // String | 学校编码，录入学校接口返回的school_no参数
    String partnerId = "208800129391238873"; // String | Isv的支付宝pid
    String childName = "张晓晓"; // String | 孩子或学生姓名
    String userMobile = "13300000000"; // String | 用户手机号，发账单时填写users数组中的一个手机号。结果返回用户是否通过此手机号添加此学生的缴费账户。user_mobile、student_code 、student_identify 必须并且只能填一项。
    String studentCode = "2098453900091"; // String | 学生的学号，一个学校的学号必须是唯一。结果返回用户是否通过此学号添加此学生的缴费账户。user_mobile、student_code 、student_identify 必须并且只能填一项。
    String studentIdentify = "982343191010100909"; // String | 学生的身份证号，使用身份证规则验证。结果返回用户是否通过此身份证号添加此学生的缴费账户。user_mobile、student_code 、student_identify 必须并且只能填一项。
    try {
      AlipayEcoEduKtParentQueryResponseModel result = apiInstance.query(schoolPid, schoolNo, partnerId, childName, userMobile, studentCode, studentIdentify);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoEduKtParentApi#query");
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
| **schoolPid** | **String**| 学校支付宝pid | [optional] |
| **schoolNo** | **String**| 学校编码，录入学校接口返回的school_no参数 | [optional] |
| **partnerId** | **String**| Isv的支付宝pid | [optional] |
| **childName** | **String**| 孩子或学生姓名 | [optional] |
| **userMobile** | **String**| 用户手机号，发账单时填写users数组中的一个手机号。结果返回用户是否通过此手机号添加此学生的缴费账户。user_mobile、student_code 、student_identify 必须并且只能填一项。 | [optional] |
| **studentCode** | **String**| 学生的学号，一个学校的学号必须是唯一。结果返回用户是否通过此学号添加此学生的缴费账户。user_mobile、student_code 、student_identify 必须并且只能填一项。 | [optional] |
| **studentIdentify** | **String**| 学生的身份证号，使用身份证规则验证。结果返回用户是否通过此身份证号添加此学生的缴费账户。user_mobile、student_code 、student_identify 必须并且只能填一项。 | [optional] |

### Return type

**AlipayEcoEduKtParentQueryResponseModel**

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

