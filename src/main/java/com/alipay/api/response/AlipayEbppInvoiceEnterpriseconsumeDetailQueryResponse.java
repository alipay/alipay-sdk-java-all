package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ExpenseConsumeInfo;
import com.alipay.api.domain.ExpenseInvoiceInfo;
import com.alipay.api.domain.ExpenseVoucherInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.enterpriseconsume.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-08 22:00:23
 */
public class AlipayEbppInvoiceEnterpriseconsumeDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3499638445241833562L;

	/** 
	 * 账单信息
	 */
	@ApiField("expense_consume_info")
	private ExpenseConsumeInfo expenseConsumeInfo;

	/** 
	 * 发票凭证结构化数据
	 */
	@ApiField("expense_invoice_info")
	private ExpenseInvoiceInfo expenseInvoiceInfo;

	/** 
	 * 凭证基础信息
	 */
	@ApiField("voucher_info")
	private ExpenseVoucherInfo voucherInfo;

	public void setExpenseConsumeInfo(ExpenseConsumeInfo expenseConsumeInfo) {
		this.expenseConsumeInfo = expenseConsumeInfo;
	}
	public ExpenseConsumeInfo getExpenseConsumeInfo( ) {
		return this.expenseConsumeInfo;
	}

	public void setExpenseInvoiceInfo(ExpenseInvoiceInfo expenseInvoiceInfo) {
		this.expenseInvoiceInfo = expenseInvoiceInfo;
	}
	public ExpenseInvoiceInfo getExpenseInvoiceInfo( ) {
		return this.expenseInvoiceInfo;
	}

	public void setVoucherInfo(ExpenseVoucherInfo voucherInfo) {
		this.voucherInfo = voucherInfo;
	}
	public ExpenseVoucherInfo getVoucherInfo( ) {
		return this.voucherInfo;
	}

}
