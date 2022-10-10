package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.bill.stat.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-22 00:17:53
 */
public class AlipayUserBillStatQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3466144572298777721L;

	/** 
	 * 实付金额，单位元
	 */
	@ApiField("expenditure_amount")
	private String expenditureAmount;

	/** 
	 * 实收金额，单位元
	 */
	@ApiField("income_amount")
	private String incomeAmount;

	public void setExpenditureAmount(String expenditureAmount) {
		this.expenditureAmount = expenditureAmount;
	}
	public String getExpenditureAmount( ) {
		return this.expenditureAmount;
	}

	public void setIncomeAmount(String incomeAmount) {
		this.incomeAmount = incomeAmount;
	}
	public String getIncomeAmount( ) {
		return this.incomeAmount;
	}

}
