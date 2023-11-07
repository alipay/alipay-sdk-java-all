package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.userinfo.charge response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-07 15:28:46
 */
public class AlipayUserUserinfoChargeResponse extends AlipayResponse {

	private static final long serialVersionUID = 7847127528682242819L;

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
