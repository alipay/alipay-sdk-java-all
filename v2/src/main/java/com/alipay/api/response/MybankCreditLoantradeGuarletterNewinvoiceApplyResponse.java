package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.newinvoice.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-31 17:41:48
 */
public class MybankCreditLoantradeGuarletterNewinvoiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4582456651294837929L;

	/** 
	 * 申请单号
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
