package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.acccore.cetify.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-28 16:22:52
 */
public class AlipayUserAccountAcccoreCetifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1282424833613863931L;

	/** 
	 * 是否已认证
	 */
	@ApiField("certified")
	private Boolean certified;

	public void setCertified(Boolean certified) {
		this.certified = certified;
	}
	public Boolean getCertified( ) {
		return this.certified;
	}

}
