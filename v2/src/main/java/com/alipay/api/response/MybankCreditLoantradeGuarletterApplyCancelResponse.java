package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.apply.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 22:33:38
 */
public class MybankCreditLoantradeGuarletterApplyCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 7836419622228332557L;

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
