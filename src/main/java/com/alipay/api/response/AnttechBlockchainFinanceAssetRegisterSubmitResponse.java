package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.asset.register.submit response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-24 17:05:35
 */
public class AnttechBlockchainFinanceAssetRegisterSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 8346574669396561139L;

	/** 
	 * 提交结果，根据operate不同而不同。
	 */
	@ApiField("submit_result")
	private String submitResult;

	public void setSubmitResult(String submitResult) {
		this.submitResult = submitResult;
	}
	public String getSubmitResult( ) {
		return this.submitResult;
	}

}
