package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.verify.aa.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:49
 */
public class AlipayDataDataserviceVerifyAaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2524551321263534145L;

	/** 
	 * 1
	 */
	@ApiField("ces")
	private String ces;

	public void setCes(String ces) {
		this.ces = ces;
	}
	public String getCes( ) {
		return this.ces;
	}

}
