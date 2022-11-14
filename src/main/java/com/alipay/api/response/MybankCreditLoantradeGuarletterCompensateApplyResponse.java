package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.compensate.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-10 18:56:43
 */
public class MybankCreditLoantradeGuarletterCompensateApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7319359626841652818L;

	/** 
	 * 赔付申请单单号
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
