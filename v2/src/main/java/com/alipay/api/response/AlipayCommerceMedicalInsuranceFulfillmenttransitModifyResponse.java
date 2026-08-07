package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.fulfillmenttransit.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-04 11:27:54
 */
public class AlipayCommerceMedicalInsuranceFulfillmenttransitModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6745191419188616359L;

	/** 
	 * 结果数据
	 */
	@ApiField("result_data")
	private Boolean resultData;

	public void setResultData(Boolean resultData) {
		this.resultData = resultData;
	}
	public Boolean getResultData( ) {
		return this.resultData;
	}

}
