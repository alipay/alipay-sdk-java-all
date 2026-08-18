package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medagent.hdfpatient.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-05 00:05:16
 */
public class AlipayCommerceMedicalMedagentHdfpatientSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5585168353976216246L;

	/** 
	 * aq就诊人ID
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
