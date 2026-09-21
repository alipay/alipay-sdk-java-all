package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.dtbankcust.dailydiscountuser.check response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-21 15:27:53
 */
public class AlipayUserDtbankcustDailydiscountuserCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 2869897329181479555L;

	/** 
	 * 检查用户是否可以报名天天减结果
	 */
	@ApiField("pre_registration_status")
	private Boolean preRegistrationStatus;

	public void setPreRegistrationStatus(Boolean preRegistrationStatus) {
		this.preRegistrationStatus = preRegistrationStatus;
	}
	public Boolean getPreRegistrationStatus( ) {
		return this.preRegistrationStatus;
	}

}
