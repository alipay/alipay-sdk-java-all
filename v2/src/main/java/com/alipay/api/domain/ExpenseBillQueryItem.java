package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单交易号关联的费用明细
 *
 * @author auto create
 * @since 1.0, 2024-05-21 21:52:59
 */
public class ExpenseBillQueryItem extends AlipayObject {

	private static final long serialVersionUID = 1827628271716327379L;

	/**
	 * 费用明细列表
	 */
	@ApiField("expense_list")
	private ExpenseBillItem expenseList;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public ExpenseBillItem getExpenseList() {
		return this.expenseList;
	}
	public void setExpenseList(ExpenseBillItem expenseList) {
		this.expenseList = expenseList;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
