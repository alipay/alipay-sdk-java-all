package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.ypzescortinfo.upload response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-22 16:52:49
 */
public class AlipayCommerceMedicalYpzescortinfoUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6749453537128737632L;

	/** 
	 * 陪诊单id
	 */
	@ApiField("escort_id")
	private String escortId;

	public void setEscortId(String escortId) {
		this.escortId = escortId;
	}
	public String getEscortId( ) {
		return this.escortId;
	}

}
