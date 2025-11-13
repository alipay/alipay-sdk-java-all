package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.contracts.loan.auth.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-24 11:12:02
 */
public class AlipayEcoContractsLoanAuthSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7762775142925511474L;

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
