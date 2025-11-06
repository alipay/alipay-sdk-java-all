package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.contracts.loan.info.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-17 11:57:04
 */
public class AlipayEcoContractsLoanInfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4811839628126868146L;

	/** 
	 * true代表同步成功,false代表同步失败
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
