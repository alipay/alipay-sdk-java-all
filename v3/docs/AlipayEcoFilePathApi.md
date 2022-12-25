# AlipayEcoFilePathApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayEcoFilePathApi.md#query) | **GET** /v3/alipay/eco/file/path/query | 获取文件直传地址（E签宝） |


<a name="query"></a>
# **query**
> AlipayEcoFilePathQueryResponseModel query(targetAppId, contentMd5, contentType, fileName, fileSize)

获取文件直传地址（E签宝）

获取文件直传地址（E签宝）

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEcoFilePathApi;

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

    AlipayEcoFilePathApi apiInstance = new AlipayEcoFilePathApi(defaultClient);
    String targetAppId = "targetAppId_example"; // String | 目标isv应用ID
    String contentMd5 = "eGMHwA4TWnbg6PYKMxreUQ=="; // String | 先计算文件md5值，在对该md5值进行base64编码
    String contentType = "application/octet-stream"; // String | 目标文件的MIME类型
    String fileName = "附件.zip"; // String | 文件名称。 注意：必须带上文件扩展名，不然会导致后续发起流程校验不通过。示例：合同.pdf。
    Integer fileSize = 2542635; // Integer | 文件大小，单位byte。最大允许上传30Mb
    try {
      AlipayEcoFilePathQueryResponseModel result = apiInstance.query(targetAppId, contentMd5, contentType, fileName, fileSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEcoFilePathApi#query");
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
| **targetAppId** | **String**| 目标isv应用ID | [optional] |
| **contentMd5** | **String**| 先计算文件md5值，在对该md5值进行base64编码 | [optional] |
| **contentType** | **String**| 目标文件的MIME类型 | [optional] |
| **fileName** | **String**| 文件名称。 注意：必须带上文件扩展名，不然会导致后续发起流程校验不通过。示例：合同.pdf。 | [optional] |
| **fileSize** | **Integer**| 文件大小，单位byte。最大允许上传30Mb | [optional] |

### Return type

**AlipayEcoFilePathQueryResponseModel**

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

