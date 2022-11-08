package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.market.member.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-26 14:15:20
 */
public class AlipayOpenMiniMarketMemberQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2241617847637118518L;

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
