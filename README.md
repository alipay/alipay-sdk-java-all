# 支付宝开放平台服务端SDK FOR JAVA

Alipay SDK for Java让您不用复杂编程即可访支付宝开放平台开放的各项能力，SDK可以自动帮您满足能力调用过程中所需的证书校验、加签、验签、发送HTTP请求等非功能性要求。

支付宝目前提供 [v2](v2/README.md)、[v3](v3/README.md) 两个版本SDK，根据您的习惯自由选择。

## v2 & v3

v2版本将会发起基于v2协议的OpenAPI，v3版本将会发起基于v3协议的OpenAPI。

## 关于v3协议

相较于v2协议的支付宝API，主要区别是：
- 使用RESTful设计风格，并通过OpenAPI规范（OAS）描述接口
- 使用JSON作为数据交互的格式，不再使用XML和表单格式
- 简化加验签逻辑，对http报文整体加验签
- 简化加解密、文件上传等规范

### 关于OpenAPI规范（OAS）

OpenAPI规范（OAS），是定义一个标准的、与具体编程语言无关的RESTful API的规范，您可查阅 [OAS官网](https://www.openapis.org) 了解更多。

利用支付宝提供的OpenAPI描述文件，您可以用代码生成工具来自动生成各种编程语言代码，用自动测试工具进行测试等等。

v3 SDK是基于 [OpenAPI描述文件](v3/api/openapi.yaml) 、使用 [OpenAPI Generator](https://openapi-generator.tech) 生成的。

## 问题

不管您在使用SDK的过程中遇到任何问题，欢迎前往 [支付宝开放社区](https://forum.alipay.com/mini-app/channel/1100001) 发帖与支付宝工作人员和其他开发者一起交流。

注：为了提高开发者问题的响应时效，github本身的issue功能已关闭，支付宝开放社区中发帖的问题，通常会在2小时内响应。