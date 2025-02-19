package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.tvp.account.close response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-24 16:38:57
 */
public class AnttechBlockchainFinanceTvpAccountCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 1837314973947754817L;

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
