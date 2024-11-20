package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.invoice.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-18 20:01:22
 */
public class MybankCreditLoantradeGuarletterInvoiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5539559468917267955L;

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
