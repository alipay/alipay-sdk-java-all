package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.partner.payment.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-11 10:02:12
 */
public class MybankCreditLoantradePartnerPaymentApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3292479475763885854L;

	/** 
	 * 网商内部申请单编号，外部机构根据此编号查询申请状态。
	 */
	@ApiField("in_apply_no")
	private String inApplyNo;

	public void setInApplyNo(String inApplyNo) {
		this.inApplyNo = inApplyNo;
	}
	public String getInApplyNo( ) {
		return this.inApplyNo;
	}

}
