package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ecsign解决方案属性信息开放试图对象。
 *
 * @author auto create
 * @since 1.0, 2023-05-12 16:25:50
 */
public class SolutionAttributeInfoOpenVO extends AlipayObject {

	private static final long serialVersionUID = 8733469465312781156L;

	/**
	 * 至少用户需要选择一个方式进行签约。
	 */
	@ApiField("access_config_code")
	private String accessConfigCode;

	/**
	 * 主要端外只能使用端外短信验证码的模式，其它两种只能端内小程序使用。
	 */
	@ApiField("verify_code")
	private String verifyCode;

	public String getAccessConfigCode() {
		return this.accessConfigCode;
	}
	public void setAccessConfigCode(String accessConfigCode) {
		this.accessConfigCode = accessConfigCode;
	}

	public String getVerifyCode() {
		return this.verifyCode;
	}
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

}
