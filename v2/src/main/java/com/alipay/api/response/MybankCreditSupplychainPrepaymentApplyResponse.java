package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.prepayment.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 05:39:47
 */
public class MybankCreditSupplychainPrepaymentApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4395794169944973441L;

	/** 
	 * 预付申请单编号。
	 */
	@ApiField("prepayment_apply_no")
	private String prepaymentApplyNo;

	public void setPrepaymentApplyNo(String prepaymentApplyNo) {
		this.prepaymentApplyNo = prepaymentApplyNo;
	}
	public String getPrepaymentApplyNo( ) {
		return this.prepaymentApplyNo;
	}

}
