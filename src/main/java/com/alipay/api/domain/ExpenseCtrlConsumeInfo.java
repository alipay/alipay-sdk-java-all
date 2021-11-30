package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 账单凭证关联实体
 *
 * @author auto create
 * @since 1.0, 2021-06-08 19:57:27
 */
public class ExpenseCtrlConsumeInfo extends AlipayObject {

	private static final long serialVersionUID = 4141366637859187271L;

	/**
	 * 账单基本信息
	 */
	@ApiField("expense_consume_info")
	private ExpenseConsumeInfo expenseConsumeInfo;

	/**
	 * 关联凑票账单列表（开票限额，多次消费后合并开票）
	 */
	@ApiListField("related_enterprise_consume_list")
	@ApiField("expense_consume_info")
	private List<ExpenseConsumeInfo> relatedEnterpriseConsumeList;

	/**
	 * 关联发票凭证对象
	 */
	@ApiListField("related_enterprise_invoice_list")
	@ApiField("expense_invoice_info")
	private List<ExpenseInvoiceInfo> relatedEnterpriseInvoiceList;

	public ExpenseConsumeInfo getExpenseConsumeInfo() {
		return this.expenseConsumeInfo;
	}
	public void setExpenseConsumeInfo(ExpenseConsumeInfo expenseConsumeInfo) {
		this.expenseConsumeInfo = expenseConsumeInfo;
	}

	public List<ExpenseConsumeInfo> getRelatedEnterpriseConsumeList() {
		return this.relatedEnterpriseConsumeList;
	}
	public void setRelatedEnterpriseConsumeList(List<ExpenseConsumeInfo> relatedEnterpriseConsumeList) {
		this.relatedEnterpriseConsumeList = relatedEnterpriseConsumeList;
	}

	public List<ExpenseInvoiceInfo> getRelatedEnterpriseInvoiceList() {
		return this.relatedEnterpriseInvoiceList;
	}
	public void setRelatedEnterpriseInvoiceList(List<ExpenseInvoiceInfo> relatedEnterpriseInvoiceList) {
		this.relatedEnterpriseInvoiceList = relatedEnterpriseInvoiceList;
	}

}
