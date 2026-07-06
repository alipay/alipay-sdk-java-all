package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 费用明细详情
 *
 * @author auto create
 * @since 1.0, 2026-05-26 19:48:41
 */
public class ExpenseDetail extends AlipayObject {

	private static final long serialVersionUID = 1393153926532679472L;

	/**
	 * 费用明细
	 */
	@ApiField("expense_detail_url")
	private String expenseDetailUrl;

	/**
	 * 费用结算id
	 */
	@ApiField("settlement_id")
	private String settlementId;

	public String getExpenseDetailUrl() {
		return this.expenseDetailUrl;
	}
	public void setExpenseDetailUrl(String expenseDetailUrl) {
		this.expenseDetailUrl = expenseDetailUrl;
	}

	public String getSettlementId() {
		return this.settlementId;
	}
	public void setSettlementId(String settlementId) {
		this.settlementId = settlementId;
	}

}
