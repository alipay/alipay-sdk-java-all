# AlipayEcoEduKtParentApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayEcoEduKtParentApi.md#query) | **POST** /v3/alipay/eco/edu/kt/parent/query | 查询学生家长状态接口 |


<a name="query"></a>
# **query**
> AlipayEcoEduKtParentQueryResponseModel query()

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
    try {
      AlipayEcoEduKtParentQueryResponseModel result = apiInstance.query();
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
This endpoint does not need any parameter.

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

