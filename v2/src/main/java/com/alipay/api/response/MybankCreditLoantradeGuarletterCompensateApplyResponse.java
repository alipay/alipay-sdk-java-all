package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.compensate.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 00:21:01
 */
public class MybankCreditLoantradeGuarletterCompensateApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4167722157435792789L;

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
