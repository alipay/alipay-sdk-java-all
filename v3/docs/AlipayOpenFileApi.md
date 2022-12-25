# AlipayOpenFileApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**upload**](AlipayOpenFileApi.md#upload) | **POST** /v3/alipay/open/file/upload | 支付宝文件上传接口 |


<a name="upload"></a>
# **upload**
> AlipayOpenFileUploadResponseModel upload(data, fileContent)

支付宝文件上传接口

支付宝通用文件上传接口，支付宝开发者可以调用此接口上传文件，文件可以提供给其他业务使用，例如：上传素材（视频/图片），素材可以供给到生活号+/小程序等其他开放应用后正式发布。 该接口支持使用支付宝SDK和HTTP POST请求，两种方式示例如下： 1. 使用支付宝SDK时，可以直接使用FileItem上传，代码片段参考下文 2. 使用直接使用http协议时，需要忽略file_content参数，文件放入表单中，其余参数放入URL中，其中将参数（不包括文件和file_content）按&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/common/02kf5q#%E8%87%AA%E8%A1%8C%E5%AE%9E%E7%8E%B0%E7%AD%BE%E5%90%8D\&quot;&gt;自行实现签名&lt;/a&gt;文档实现，示例： curl --request POST &#39;http://openapi.alipay.com/gateway.do?charset&#x3D;GBK&amp;biz_content&#x3D;%7B%22biz_code%22%3A%22content_creation%22%2C%22extra_parameters%22%3A%7B%22extern_upload%22%3A%22youku%22%2C%22alipay_user_id%22%3A%22xxxx%22%7D%7D&amp;method&#x3D;alipay.open.file.upload&amp;format&#x3D;json&amp;sign&#x3D;xxx&amp;app_id&#x3D;2014060600164699&amp;version&#x3D;1.0&amp;sign_type&#x3D;RSA2&amp;timestamp&#x3D;xxx&#39;  --form &#39;file&#x3D;@\&quot;xx.mp4\&quot;&#39;

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenFileApi;

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

    AlipayOpenFileApi apiInstance = new AlipayOpenFileApi(defaultClient);
    AlipayOpenFileUploadModel data = new AlipayOpenFileUploadModel(); // AlipayOpenFileUploadModel | 
    File fileContent = new File("/path/to/file"); // File | 
    try {
      AlipayOpenFileUploadResponseModel result = apiInstance.upload(data, fileContent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenFileApi#upload");
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
| **data** | **AlipayOpenFileUploadModel**|  | [optional] |
| **fileContent** | **File**|  | [optional] |

### Return type

**AlipayOpenFileUploadResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

