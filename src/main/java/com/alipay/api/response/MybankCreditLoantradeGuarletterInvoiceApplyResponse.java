package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.invoice.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-24 17:36:42
 */
public class MybankCreditLoantradeGuarletterInvoiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8682839985649497846L;

	/** 
	 * 开发票申请单单号
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
