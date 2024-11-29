package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.petinsure.signstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-03 19:57:07
 */
public class AlipayCommercePetinsureSignstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3322116719212167632L;

	/** 
	 * 签约状态
	 */
	@ApiField("sign_status")
	private String signStatus;

	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}
	public String getSignStatus( ) {
		return this.signStatus;
	}

}
