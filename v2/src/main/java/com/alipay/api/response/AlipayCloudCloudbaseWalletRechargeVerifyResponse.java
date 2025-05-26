package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.wallet.recharge.verify response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-07 17:52:25
 */
public class AlipayCloudCloudbaseWalletRechargeVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1222175715522379786L;

	/** 
	 * 欠费冲正后核销操作返回
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
