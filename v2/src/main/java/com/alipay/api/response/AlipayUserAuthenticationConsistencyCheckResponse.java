package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.authentication.consistency.check response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-16 11:12:42
 */
public class AlipayUserAuthenticationConsistencyCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 6275235259953623583L;

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

	/** 
	 * 1688场景核验不一致的错误码
	 */
	@ApiField("not_match_code")
	private String notMatchCode;

	/** 
	 * 1688场景核验不一致的错误原因
	 */
	@ApiField("not_match_msg")
	private String notMatchMsg;

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

	public void setNotMatchCode(String notMatchCode) {
		this.notMatchCode = notMatchCode;
	}
	public String getNotMatchCode( ) {
		return this.notMatchCode;
	}

	public void setNotMatchMsg(String notMatchMsg) {
		this.notMatchMsg = notMatchMsg;
	}
	public String getNotMatchMsg( ) {
		return this.notMatchMsg;
	}

}
