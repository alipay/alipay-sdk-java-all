package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.invoice.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-19 20:07:35
 */
public class MybankCreditLoantradeGuarletterInvoiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1497826948593479755L;

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
