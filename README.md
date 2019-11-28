```
开发语言：JAVA
适用JDK版本：1.5及以上
版权：蚂蚁金融服务集团
```

## 主要类文件功能说明
[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Falipay%2Falipay-sdk-java-all.svg?type=shield)](https://app.fossa.io/projects/git%2Bgithub.com%2Falipay%2Falipay-sdk-java-all?ref=badge_shield)

```
DefaultAlipayClient.java
public DefaultAlipayClient(String serverUrl, String appId, String privateKey);
```
+ 功能：构造方法
+ 输入：
    + serverUrl 非空，请求服务器地址（调试：http://openapi.alipaydev.com/gateway.do 线上：https://openapi.alipay.com/gateway.do ）
    + appId 非空，应用ID
    + privateKey 非空，私钥
+ 输出：调用客户端实例对象

```
DefaultAlipayClient.java
public <T extends AlipayResponse> T execute(AlipayRequest<T> request);
```
+ 功能：执行请求调用（适用于不需要授权接口调用）
+ 输入：request 接口请求对象
+ 输出：T  请求返回对象

```
DefaultAlipayClient.java
public <T extends AlipayResponse> T execute(AlipayRequest<T> request, String accessToken);
```
+ 功能：执行请求调用（适用于需要授权接口调用）
+ 输入：
    + request 接口请求对象
    + authToken 授权令牌
+ 输出：T  请求返回对象

## 调用示例


## 签名相关类
```
AlipaySignature.java
public static String rsaSign(Map<String, String> params, String privateKey, String charset);
```
+ 功能：RSA签名
+ 输入：
    + params 待签名参数map
    + privateKey 私钥
    + charset 签名编码格式
+ 输出：签名结果

```
AlipaySignature.java
public static boolean rsaCheckV2(Map<String, String> params, String publicKey, String charset);
```
+ 功能：RSA验签
+ 输入：
    + params 签名参数内容map
    + publicKey 公钥
    + charset 签名编码格式
+ 输出：验签结果

```
AlipaySignature.java
public static boolean rsaCheckContent(String content, String sign, String publicKey,String charset);
```
+ 功能：RSA验签
+ 输入：
    + content 签名参数内容字符串
    + sign 签名
    + publicKey 公钥
    + charset 签名编码格式
+ 输出：验签结果



## License
[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Falipay%2Falipay-sdk-java-all.svg?type=large)](https://app.fossa.io/projects/git%2Bgithub.com%2Falipay%2Falipay-sdk-java-all?ref=badge_large)