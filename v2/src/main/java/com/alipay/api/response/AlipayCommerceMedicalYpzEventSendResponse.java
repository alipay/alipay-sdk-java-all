package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.ypz.event.send response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-28 11:27:24
 */
public class AlipayCommerceMedicalYpzEventSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8688414975143239828L;

	/** 
	 * 返回数据
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
