package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.insurance.tpabilldata.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-25 16:02:56
 */
public class AlipayCommerceInsuranceTpabilldataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4318439822385217729L;

	/** 
	 * 100
	 */
	@ApiField("num")
	private Long num;

	public void setNum(Long num) {
		this.num = num;
	}
	public Long getNum( ) {
		return this.num;
	}

}
