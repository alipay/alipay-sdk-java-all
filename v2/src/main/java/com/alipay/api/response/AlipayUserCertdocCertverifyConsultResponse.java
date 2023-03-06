package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certdoc.certverify.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 22:41:17
 */
public class AlipayUserCertdocCertverifyConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8889734255196315744L;

	/** 
	 * 具体哪些字段不一致。与预授权的输入字段对应，类型为字符串列表的JSON格式。
	 */
	@ApiField("fail_params")
	private String failParams;

	/** 
	 * 校验不一致时，描述不一致的原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 校验是否一致：T-一致、F-不一致
	 */
	@ApiField("passed")
	private String passed;

	public void setFailParams(String failParams) {
		this.failParams = failParams;
	}
	public String getFailParams( ) {
		return this.failParams;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setPassed(String passed) {
		this.passed = passed;
	}
	public String getPassed( ) {
		return this.passed;
	}

}
