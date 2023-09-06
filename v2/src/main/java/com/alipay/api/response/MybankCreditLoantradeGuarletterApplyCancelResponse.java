package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.apply.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 22:28:36
 */
public class MybankCreditLoantradeGuarletterApplyCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 2199831289456774628L;

	/** 
	 * 取消申请单号
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
