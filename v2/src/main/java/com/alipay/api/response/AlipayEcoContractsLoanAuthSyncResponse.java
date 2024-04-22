package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.contracts.loan.auth.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-08 10:37:00
 */
public class AlipayEcoContractsLoanAuthSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5894839414283662132L;

	/** 
	 * true代表同步成功，false代表同步失败
	 */
	@ApiField("status")
	private Boolean status;

	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getStatus( ) {
		return this.status;
	}

}
