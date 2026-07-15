package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.verify.consult response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-29 13:37:44
 */
public class AlipayCommerceEducateVerifyConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4636891387834841445L;

	/** 
	 * 用于跳转验证的链接
	 */
	@ApiField("normal_url")
	private String normalUrl;

	/** 
	 * 请求id，用于标识一次完整的验证请求链路
	 */
	@ApiField("verify_request_id")
	private String verifyRequestId;

	public void setNormalUrl(String normalUrl) {
		this.normalUrl = normalUrl;
	}
	public String getNormalUrl( ) {
		return this.normalUrl;
	}

	public void setVerifyRequestId(String verifyRequestId) {
		this.verifyRequestId = verifyRequestId;
	}
	public String getVerifyRequestId( ) {
		return this.verifyRequestId;
	}

}
