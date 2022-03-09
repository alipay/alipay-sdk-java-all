package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.zmgo.preconsult.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-12 09:40:12
 */
public class ZhimaCreditPeZmgoPreconsultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4493888155277229963L;

	/** 
	 * 是否准入
	 */
	@ApiField("admittance")
	private Boolean admittance;

	public void setAdmittance(Boolean admittance) {
		this.admittance = admittance;
	}
	public Boolean getAdmittance( ) {
		return this.admittance;
	}

}
