package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.serviceuser.thirdhospital.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-30 20:12:41
 */
public class AlipayCommerceMedicalServiceuserThirdhospitalSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2348221516658799276L;

	/** 
	 * 健康账号ID
	 */
	@ApiField("health_doc_id")
	private String healthDocId;

	public void setHealthDocId(String healthDocId) {
		this.healthDocId = healthDocId;
	}
	public String getHealthDocId( ) {
		return this.healthDocId;
	}

}
