package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.trusple.loanrepay.submit response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-02 10:15:21
 */
public class AnttechBlockchainFinanceTruspleLoanrepaySubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 1545712319747974827L;

	/** 
	 * 结果状态，S表示成功，F表示明确失败，U表示未知异常。一般返回U，调用方可能会重试
	 */
	@ApiField("result_status")
	private String resultStatus;

	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}
	public String getResultStatus( ) {
		return this.resultStatus;
	}

}
