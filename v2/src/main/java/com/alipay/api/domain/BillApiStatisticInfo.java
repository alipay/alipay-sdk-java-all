package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询出的账单列表，当查询不到账单时，为空
 *
 * @author auto create
 * @since 1.0, 2026-03-13 10:42:44
 */
public class BillApiStatisticInfo extends AlipayObject {

	private static final long serialVersionUID = 1749243373358971825L;

	/**
	 * 按照账单的规则进行统计得到的支出金额，单位元
	 */
	@ApiField("expenditure_amount")
	private String expenditureAmount;

	/**
	 * 按照账单的规则进行统计得到的收入金额，单位元
	 */
	@ApiField("income_amount")
	private String incomeAmount;

	public String getExpenditureAmount() {
		return this.expenditureAmount;
	}
	public void setExpenditureAmount(String expenditureAmount) {
		this.expenditureAmount = expenditureAmount;
	}

	public String getIncomeAmount() {
		return this.incomeAmount;
	}
	public void setIncomeAmount(String incomeAmount) {
		this.incomeAmount = incomeAmount;
	}

}
