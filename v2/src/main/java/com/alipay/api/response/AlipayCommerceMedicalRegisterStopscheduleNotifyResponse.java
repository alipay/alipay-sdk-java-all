package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.register.stopschedule.notify response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-18 16:52:44
 */
public class AlipayCommerceMedicalRegisterStopscheduleNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6622992795298852717L;

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
