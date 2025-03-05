package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.apply.refund response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-18 20:02:44
 */
public class MybankCreditLoantradeGuarletterApplyRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 2312894912394766217L;

	/** 
	 * 退款申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

}
