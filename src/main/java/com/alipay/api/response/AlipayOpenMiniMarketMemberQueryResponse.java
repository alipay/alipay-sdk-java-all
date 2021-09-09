package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.market.member.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-31 10:50:29
 */
public class AlipayOpenMiniMarketMemberQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2888458378967185385L;

	/** 
	 * 会员入会链接
	 */
	@ApiField("membership_redirect_url")
	private String membershipRedirectUrl;

	public void setMembershipRedirectUrl(String membershipRedirectUrl) {
		this.membershipRedirectUrl = membershipRedirectUrl;
	}
	public String getMembershipRedirectUrl( ) {
		return this.membershipRedirectUrl;
	}

}
