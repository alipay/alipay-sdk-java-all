package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开卡调用参数
 *
 * @author auto create
 * @since 1.0, 2025-11-05 14:27:41
 */
public class Params extends AlipayObject {

	private static final long serialVersionUID = 6752486647623527975L;

	/**
	 * 开卡时商家 CRM 回调模式，枚举值：
● SPI（SPI极速开卡）
● OPENAPI（OpenAPI开卡）
如不传或输入非法参数，默认值：SPI。
	 */
	@ApiField("callback_type")
	private String callbackType;

	/**
	 * 透传参数，在开卡 SPI 调用时透传至商家 CRM 服务端。OPENAPI 开卡不支持透传
	 */
	@ApiField("out_string")
	private String outString;

	/**
	 * 用于配置会员卡模板的开放平台商家应用ID
	 */
	@ApiField("provider_application_id")
	private String providerApplicationId;

	/**
	 * 配置会员卡模板对应的商户PID
	 */
	@ApiField("provider_id")
	private String providerId;

	/**
	 * 跳转的小程序地址
	 */
	@ApiField("regist_alipay_schema")
	private String registAlipaySchema;

	/**
	 * miniProgramRegist：小程序注册
传递了miniProgramRegist时，需要传递
● registAlipaySchema
	 */
	@ApiField("regist_mode")
	private String registMode;

	/**
	 * 会员卡模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	public String getCallbackType() {
		return this.callbackType;
	}
	public void setCallbackType(String callbackType) {
		this.callbackType = callbackType;
	}

	public String getOutString() {
		return this.outString;
	}
	public void setOutString(String outString) {
		this.outString = outString;
	}

	public String getProviderApplicationId() {
		return this.providerApplicationId;
	}
	public void setProviderApplicationId(String providerApplicationId) {
		this.providerApplicationId = providerApplicationId;
	}

	public String getProviderId() {
		return this.providerId;
	}
	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getRegistAlipaySchema() {
		return this.registAlipaySchema;
	}
	public void setRegistAlipaySchema(String registAlipaySchema) {
		this.registAlipaySchema = registAlipaySchema;
	}

	public String getRegistMode() {
		return this.registMode;
	}
	public void setRegistMode(String registMode) {
		this.registMode = registMode;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
