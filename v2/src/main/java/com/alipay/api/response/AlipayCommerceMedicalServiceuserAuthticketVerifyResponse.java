package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.serviceuser.authticket.verify response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-30 20:17:52
 */
public class AlipayCommerceMedicalServiceuserAuthticketVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7488593742998988752L;

	/** 
	 * 扁鹊侧医生ID
	 */
	@ApiField("doc_id")
	private String docId;

	/** 
	 * 阿福医生端医生ID
	 */
	@ApiField("health_doc_id")
	private String healthDocId;

	public void setDocId(String docId) {
		this.docId = docId;
	}
	public String getDocId( ) {
		return this.docId;
	}

	public void setHealthDocId(String healthDocId) {
		this.healthDocId = healthDocId;
	}
	public String getHealthDocId( ) {
		return this.healthDocId;
	}

}
