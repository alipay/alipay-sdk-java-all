package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI SaaS 基础服务
 *
 * @author auto create
 * @since 1.0, 2023-11-20 17:24:17
 */
public class AlipayCloudCloudbaseSaasAiUseModel extends AlipayObject {

	private static final long serialVersionUID = 2139165646274712615L;

	/**
	 * 应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 模型属性，具体值联系模型服务提供者，身份证需要区分正反面需要传身份证的正面front或者反面side，户口本需要传户主页或者个人页等
	 */
	@ApiField("attribute")
	private String attribute;

	/**
	 * 待返回的模型字段值，具体联系模型提供者，比如身份证需要返回的是地址则填address，姓名填name
	 */
	@ApiField("field_name")
	private String fieldName;

	/**
	 * 带识别的图片属性，需要传公网能访问的图片地址
	 */
	@ApiField("param")
	private String param;

	/**
	 * 模型服务编码，具体值可查看<a href="https://opendocs.alipay.com/pre-open/09s5qm?pathHash=f2ec2bf8">接口参数说明</a>
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 模型服务uri，具体值可查看<a href="https://opendocs.alipay.com/pre-open/09s5qm?pathHash=f2ec2bf8">接口参数说明</a>
	 */
	@ApiField("uri")
	private String uri;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAttribute() {
		return this.attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getFieldName() {
		return this.fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getParam() {
		return this.param;
	}
	public void setParam(String param) {
		this.param = param;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getUri() {
		return this.uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}

}
