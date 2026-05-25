package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.individuation.enable.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-03 18:57:43
 */
public class AlipayCommerceMedicalIndividuationEnableQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2669215232984493177L;

	/** 
	 * 机构智能体个性开启
	 */
	@ApiField("data")
	private Boolean data;

	public void setData(Boolean data) {
		this.data = data;
	}
	public Boolean getData( ) {
		return this.data;
	}

}
