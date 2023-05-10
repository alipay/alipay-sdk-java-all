package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票报销状态同步的发票要素模型
 *
 * @author auto create
 * @since 1.0, 2023-02-20 16:49:43
 */
public class InvoiceElementStatusSyncOpenModel extends AlipayObject {

	private static final long serialVersionUID = 6717367785737295995L;

	/**
	 * 同步申请id，每次发起同步时生成，isv每次请求需要保证唯一
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 报销详情地址，提供用户通过发票管家查看报销进度的地址
如果报销企业入驻发票管家时需要isv传入报销详情地址，则必须提供
	 */
	@ApiField("expense_detail_url")
	private String expenseDetailUrl;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getExpenseDetailUrl() {
		return this.expenseDetailUrl;
	}
	public void setExpenseDetailUrl(String expenseDetailUrl) {
		this.expenseDetailUrl = expenseDetailUrl;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

}
