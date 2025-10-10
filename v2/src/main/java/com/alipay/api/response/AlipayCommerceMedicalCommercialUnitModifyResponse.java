package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.commercial.unit.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-09 11:57:00
 */
public class AlipayCommerceMedicalCommercialUnitModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2419249391293571754L;

	/** 
	 * 门店修改操作结果
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
