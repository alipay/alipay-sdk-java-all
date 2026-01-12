package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.authentication.consistency.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 19:17:36
 */
public class AlipayUserAuthenticationConsistencyCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 6123117191172279954L;

	/** 
	 * 未认证时的引导跳转链接
	 */
	@ApiField("certify_url")
	private String certifyUrl;

	/** 
	 * 一致性校验是否通过，T/F
	 */
	@ApiField("match")
	private String match;

	/** 
	 * 未认证提示文案
	 */
	@ApiField("not_certify_msg")
	private String notCertifyMsg;

	public void setCertifyUrl(String certifyUrl) {
		this.certifyUrl = certifyUrl;
	}
	public String getCertifyUrl( ) {
		return this.certifyUrl;
	}

	public void setMatch(String match) {
		this.match = match;
	}
	public String getMatch( ) {
		return this.match;
	}

	public void setNotCertifyMsg(String notCertifyMsg) {
		this.notCertifyMsg = notCertifyMsg;
	}
	public String getNotCertifyMsg( ) {
		return this.notCertifyMsg;
	}

}
