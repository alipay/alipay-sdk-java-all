package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汇总信息,包括月汇总
 *
 * @author auto create
 * @since 1.0, 2018-10-18 16:01:23
 */
public class BillDingBizOrderSum extends AlipayObject {

	private static final long serialVersionUID = 4313718971984487113L;

	/**
	 * 日期展示, 月份2018-07,日期2018-07-10
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 支出金额
	 */
	@ApiField("expenses")
	private String expenses;

	/**
	 * 收入金额
	 */
	@ApiField("income")
	private String income;

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getExpenses() {
		return this.expenses;
	}
	public void setExpenses(String expenses) {
		this.expenses = expenses;
	}

	public String getIncome() {
		return this.income;
	}
	public void setIncome(String income) {
		this.income = income;
	}

}
