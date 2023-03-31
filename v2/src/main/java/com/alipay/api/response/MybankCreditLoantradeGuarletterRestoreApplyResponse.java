package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.restore.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 00:21:48
 */
public class MybankCreditLoantradeGuarletterRestoreApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1836814331724171359L;

	/** 
	 * 受理申请单号
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
