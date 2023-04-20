package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.trusple.loanapply.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 14:36:47
 */
public class AnttechBlockchainFinanceTruspleLoanapplySubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 3563647994166799725L;

	/** 
	 * Trusple借据号
	 */
	@ApiField("loan_id")
	private String loanId;

	/** 
	 * 结果状态，S表示成功，F表示明确失败，U表示未知异常。一般返回U，调用方可能会重试
	 */
	@ApiField("result_status")
	private String resultStatus;

	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}
	public String getLoanId( ) {
		return this.loanId;
	}

	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}
	public String getResultStatus( ) {
		return this.resultStatus;
	}

}
