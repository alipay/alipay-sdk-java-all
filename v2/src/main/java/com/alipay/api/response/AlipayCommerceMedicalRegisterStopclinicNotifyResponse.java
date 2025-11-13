package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.register.stopclinic.notify response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-27 14:22:30
 */
public class AlipayCommerceMedicalRegisterStopclinicNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2657239397868343573L;

	/** 
	 * 处理成功后，返回处理的排班id
	 */
	@ApiField("register_id")
	private String registerId;

	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}
	public String getRegisterId( ) {
		return this.registerId;
	}

}
