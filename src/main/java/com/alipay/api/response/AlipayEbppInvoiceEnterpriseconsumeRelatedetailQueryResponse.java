package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ExpenseCtrlConsumeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.enterpriseconsume.relatedetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-18 10:03:56
 */
public class AlipayEbppInvoiceEnterpriseconsumeRelatedetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3419493635149768528L;

	/** 
	 * 账单凭证关联信息
	 */
	@ApiField("expense_ctrl_consume_info")
	private ExpenseCtrlConsumeInfo expenseCtrlConsumeInfo;

	public void setExpenseCtrlConsumeInfo(ExpenseCtrlConsumeInfo expenseCtrlConsumeInfo) {
		this.expenseCtrlConsumeInfo = expenseCtrlConsumeInfo;
	}
	public ExpenseCtrlConsumeInfo getExpenseCtrlConsumeInfo( ) {
		return this.expenseCtrlConsumeInfo;
	}

}
