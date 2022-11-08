package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.finlease.token.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-29 13:46:54
 */
public class MybankCreditLoanapplyFinleaseTokenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2168334191242643572L;

	/** 
	 * 原因
	 */
	@ApiField("reason")
	private String reason;

	/** 
	 * 生成安全的url
	 */
	@ApiField("security_url")
	private String securityUrl;

	/** 
	 * 是否有效,true 有效，false无效
	 */
	@ApiField("valid")
	private Boolean valid;

	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason( ) {
		return this.reason;
	}

	public void setSecurityUrl(String securityUrl) {
		this.securityUrl = securityUrl;
	}
	public String getSecurityUrl( ) {
		return this.securityUrl;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}
	public Boolean getValid( ) {
		return this.valid;
	}

}
