package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.commercial.unit.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-09 11:57:00
 */
public class AlipayCommerceMedicalCommercialUnitCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4795832245635994731L;

	/** 
	 * 医疗生成的门店编码
	 */
	@ApiField("unit_code")
	private String unitCode;

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public String getUnitCode( ) {
		return this.unitCode;
	}

}
