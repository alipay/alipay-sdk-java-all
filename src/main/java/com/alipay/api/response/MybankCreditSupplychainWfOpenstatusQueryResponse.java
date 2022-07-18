package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.wf.openstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-18 15:21:53
 */
public class MybankCreditSupplychainWfOpenstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5142278292797996376L;

	/** 
	 * 开通状态
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
