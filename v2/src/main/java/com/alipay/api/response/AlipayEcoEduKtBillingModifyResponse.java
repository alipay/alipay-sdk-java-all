package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.kt.billing.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-20 19:25:04
 */
public class AlipayEcoEduKtBillingModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8692216146147125653L;

	/** 
	 * 如果成功，返回Y
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
