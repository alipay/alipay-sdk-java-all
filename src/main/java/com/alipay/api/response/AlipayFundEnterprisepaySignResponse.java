package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.enterprisepay.sign response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-12 15:45:55
 */
public class AlipayFundEnterprisepaySignResponse extends AlipayResponse {

	private static final long serialVersionUID = 6199287293343387491L;

	/** 
	 * 签约凭证
	 */
	@ApiField("sign_token")
	private String signToken;

	/** 
	 * 签约链接，用于跳转到开户页面
	 */
	@ApiField("sign_url")
	private String signUrl;

	public void setSignToken(String signToken) {
		this.signToken = signToken;
	}
	public String getSignToken( ) {
		return this.signToken;
	}

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

}
