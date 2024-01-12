package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.restore.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:05:16
 */
public class MybankCreditLoantradeGuarletterRestoreApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4154427819145366753L;

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
