package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.petinsure.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-03 15:27:08
 */
public class AlipayCommercePetinsureQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3841736953533611882L;

	/** 
	 * 投保状态
	 */
	@ApiField("insure_status")
	private String insureStatus;

	public void setInsureStatus(String insureStatus) {
		this.insureStatus = insureStatus;
	}
	public String getInsureStatus( ) {
		return this.insureStatus;
	}

}
