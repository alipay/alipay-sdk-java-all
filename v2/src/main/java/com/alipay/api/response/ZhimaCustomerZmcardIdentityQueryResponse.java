package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.zmcard.identity.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-10 11:57:04
 */
public class ZhimaCustomerZmcardIdentityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3748227595192243654L;

	/** 
	 * 通过该URL可以跳转到芝麻证身份账户详情页面，有效期10分钟。如果是主态访问，已授权的情况下才会返回该链接；如果是客态访问，持证人已授权且身份验证通过的情况下才会返回该链接
	 */
	@ApiField("skip_url")
	private String skipUrl;

	/** 
	 * true：验证通过，false：验证未通过
	 */
	@ApiField("verified")
	private Boolean verified;

	public void setSkipUrl(String skipUrl) {
		this.skipUrl = skipUrl;
	}
	public String getSkipUrl( ) {
		return this.skipUrl;
	}

	public void setVerified(Boolean verified) {
		this.verified = verified;
	}
	public Boolean getVerified( ) {
		return this.verified;
	}

}
