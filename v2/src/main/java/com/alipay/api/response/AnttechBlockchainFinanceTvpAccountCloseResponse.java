package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.tvp.account.close response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:27:45
 */
public class AnttechBlockchainFinanceTvpAccountCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 7715891376759529797L;

	/** 
	 * 账号状态
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
