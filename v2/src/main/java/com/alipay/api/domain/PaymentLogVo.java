package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易列表
 *
 * @author auto create
 * @since 1.0, 2025-08-05 10:39:00
 */
public class PaymentLogVo extends AlipayObject {

	private static final long serialVersionUID = 4417734824786292524L;

	/**
	 * 结束日期
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 支出总金额，单位分
	 */
	@ApiField("expense_amount")
	private Long expenseAmount;

	/**
	 * 支出次数
	 */
	@ApiField("expense_count")
	private Long expenseCount;

	/**
	 * 收入总金额，单位分
	 */
	@ApiField("income_amount")
	private Long incomeAmount;

	/**
	 * 收入次数
	 */
	@ApiField("income_count")
	private Long incomeCount;

	/**
	 * 开始日期
	 */
	@ApiField("start_date")
	private String startDate;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Long getExpenseAmount() {
		return this.expenseAmount;
	}
	public void setExpenseAmount(Long expenseAmount) {
		this.expenseAmount = expenseAmount;
	}

	public Long getExpenseCount() {
		return this.expenseCount;
	}
	public void setExpenseCount(Long expenseCount) {
		this.expenseCount = expenseCount;
	}

	public Long getIncomeAmount() {
		return this.incomeAmount;
	}
	public void setIncomeAmount(Long incomeAmount) {
		this.incomeAmount = incomeAmount;
	}

	public Long getIncomeCount() {
		return this.incomeCount;
	}
	public void setIncomeCount(Long incomeCount) {
		this.incomeCount = incomeCount;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
