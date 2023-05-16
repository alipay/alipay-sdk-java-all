package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.bill.stat.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 21:19:58
 */
public class AlipayUserBillStatQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1823378941266198397L;

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
