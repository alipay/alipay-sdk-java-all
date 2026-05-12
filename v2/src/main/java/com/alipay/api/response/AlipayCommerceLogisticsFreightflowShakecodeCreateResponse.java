package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.freightflow.shakecode.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-11 17:07:45
 */
public class AlipayCommerceLogisticsFreightflowShakecodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6513487861882143721L;

	/** 
	 * 生成的吱口令完整文案
	 */
	@ApiField("shake_code_text")
	private String shakeCodeText;

	public void setShakeCodeText(String shakeCodeText) {
		this.shakeCodeText = shakeCodeText;
	}
	public String getShakeCodeText( ) {
		return this.shakeCodeText;
	}

}
