package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.risk.warning.add response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 07:22:52
 */
public class AnttechBlockchainFinanceRiskWarningAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 7289839146886789266L;

	/** 
	 * 提交结果
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
