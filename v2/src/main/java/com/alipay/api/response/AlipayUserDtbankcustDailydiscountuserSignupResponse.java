package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.dtbankcust.dailydiscountuser.signup response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-29 14:29:56
 */
public class AlipayUserDtbankcustDailydiscountuserSignupResponse extends AlipayResponse {

	private static final long serialVersionUID = 6342568573397914851L;

	/** 
	 * 天天减报名结果
	 */
	@ApiField("register_status")
	private Boolean registerStatus;

	public void setRegisterStatus(Boolean registerStatus) {
		this.registerStatus = registerStatus;
	}
	public Boolean getRegisterStatus( ) {
		return this.registerStatus;
	}

}
