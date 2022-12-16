package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.userverify.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 17:31:19
 */
public class AlipayUserAgreementUserverifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6519422454458538414L;

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
