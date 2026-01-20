package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medagent.hdfpatient.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-19 19:02:42
 */
public class AlipayCommerceMedicalMedagentHdfpatientSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1331698454143515417L;

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
