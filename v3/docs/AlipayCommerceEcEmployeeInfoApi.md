# AlipayCommerceEcEmployeeInfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modify**](AlipayCommerceEcEmployeeInfoApi.md#modify) | **PUT** /v3/alipay/commerce/ec/employee/info | 修改员工基础信息 |
| [**query**](AlipayCommerceEcEmployeeInfoApi.md#query) | **GET** /v3/alipay/commerce/ec/employee/info/query | 查询员工详情 |


<a name="modify"></a>
# **modify**
> AlipayCommerceEcEmployeeInfoModifyResponseModel modify(alipayCommerceEcEmployeeInfoModifyModel)

修改员工基础信息

修改员工基础信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcEmployeeInfoApi;

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

    AlipayCommerceEcEmployeeInfoApi apiInstance = new AlipayCommerceEcEmployeeInfoApi(defaultClient);
    AlipayCommerceEcEmployeeInfoModifyModel alipayCommerceEcEmployeeInfoModifyModel = new AlipayCommerceEcEmployeeInfoModifyModel(); // AlipayCommerceEcEmployeeInfoModifyModel | 
    try {
      AlipayCommerceEcEmployeeInfoModifyResponseModel result = apiInstance.modify(alipayCommerceEcEmployeeInfoModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcEmployeeInfoApi#modify");
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
| **alipayCommerceEcEmployeeInfoModifyModel** | **AlipayCommerceEcEmployeeInfoModifyModel**|  | [optional] |

### Return type

**AlipayCommerceEcEmployeeInfoModifyResponseModel**

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
> AlipayCommerceEcEmployeeInfoQueryResponseModel query(enterpriseId, openId, userId, employeeId, mobile, alipayLogonId, employeeCertType, employeeCertNo, employeeEmail)

查询员工详情

根据员工id或员工uid查询企业下某个员工的详细信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcEmployeeInfoApi;

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

    AlipayCommerceEcEmployeeInfoApi apiInstance = new AlipayCommerceEcEmployeeInfoApi(defaultClient);
    String enterpriseId = "2088441363102941"; // String | 企业id
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 蚂蚁统一会员ID
    String userId = "2088501304519332"; // String | 支付宝用户ID
    String employeeId = "2284200000000000"; // String | 员工id
    String mobile = "134XXXX2526"; // String | 员工手机号码
    String alipayLogonId = "134xxxx2526"; // String | 支付宝登录号（手机号或邮箱）
    String employeeCertType = "IDENTITY_CARD"; // String | 员工证件类型
    String employeeCertNo = "220000000000000000"; // String | 员工证件号码
    String employeeEmail = "123@xxx.com"; // String | 员工邮箱
    try {
      AlipayCommerceEcEmployeeInfoQueryResponseModel result = apiInstance.query(enterpriseId, openId, userId, employeeId, mobile, alipayLogonId, employeeCertType, employeeCertNo, employeeEmail);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcEmployeeInfoApi#query");
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
| **enterpriseId** | **String**| 企业id | [optional] |
| **openId** | **String**| 蚂蚁统一会员ID | [optional] |
| **userId** | **String**| 支付宝用户ID | [optional] |
| **employeeId** | **String**| 员工id | [optional] |
| **mobile** | **String**| 员工手机号码 | [optional] |
| **alipayLogonId** | **String**| 支付宝登录号（手机号或邮箱） | [optional] |
| **employeeCertType** | **String**| 员工证件类型 | [optional] |
| **employeeCertNo** | **String**| 员工证件号码 | [optional] |
| **employeeEmail** | **String**| 员工邮箱 | [optional] |

### Return type

**AlipayCommerceEcEmployeeInfoQueryResponseModel**

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

