package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.userverify.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-19 15:42:32
 */
public class AlipayUserAgreementUserverifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3378919732949114549L;

	/** 
	 * 用户信息是否匹配
	 */
	@ApiField("user_match")
	private Boolean userMatch;

	public void setUserMatch(Boolean userMatch) {
		this.userMatch = userMatch;
	}
	public Boolean getUserMatch( ) {
		return this.userMatch;
	}

}
