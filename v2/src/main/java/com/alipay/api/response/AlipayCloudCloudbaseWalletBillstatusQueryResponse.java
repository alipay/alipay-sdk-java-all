package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.wallet.billstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-21 17:53:15
 */
public class AlipayCloudCloudbaseWalletBillstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3248533155322215984L;

	/** 
	 * 出账状态
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
