package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.register.stopschedule.notify response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-04 14:32:29
 */
public class AlipayCommerceMedicalRegisterStopscheduleNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2657972585763558315L;

	/** 
	 * 支持批量.registerIds 逗号分隔
	 */
	@ApiField("register_ids")
	private String registerIds;

	public void setRegisterIds(String registerIds) {
		this.registerIds = registerIds;
	}
	public String getRegisterIds( ) {
		return this.registerIds;
	}

}
