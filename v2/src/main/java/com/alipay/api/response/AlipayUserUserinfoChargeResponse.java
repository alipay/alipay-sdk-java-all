package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.userinfo.charge response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:54
 */
public class AlipayUserUserinfoChargeResponse extends AlipayResponse {

	private static final long serialVersionUID = 2444875281281581187L;

	/** 
	 * 1
	 */
	@ApiField("sd")
	private String sd;

	public void setSd(String sd) {
		this.sd = sd;
	}
	public String getSd( ) {
		return this.sd;
	}

}
