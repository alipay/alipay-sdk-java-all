package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.apply.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-24 17:39:07
 */
public class MybankCreditLoantradeGuarletterApplyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1151222561151129418L;

	/** 
	 * 受理状态
	 */
	@ApiField("accept_result")
	private String acceptResult;

	/** 
	 * 拒绝原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	public void setAcceptResult(String acceptResult) {
		this.acceptResult = acceptResult;
	}
	public String getAcceptResult( ) {
		return this.acceptResult;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectReason( ) {
		return this.rejectReason;
	}

}
