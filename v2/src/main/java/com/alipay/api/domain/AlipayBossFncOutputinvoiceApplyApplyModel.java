package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应收开票申请(根据账单申请)2.0
 *
 * @author auto create
 * @since 1.0, 2023-11-01 11:27:16
 */
public class AlipayBossFncOutputinvoiceApplyApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3351252219669847756L;

	/**
	 * 调用方身份识别标记(应用名称) 与业务单据号联合唯一 必填
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务单据号，业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 开票总金额，开票金额不能为空，开票金额不能小于等于0
	 */
	@ApiField("invoice_amt")
	private MultiCurrencyMoneyOpenApi invoiceAmt;

	/**
	 * 开票账单集合
	 */
	@ApiField("invoice_bill_items")
	private InvoiceBillItem invoiceBillItems;

	/**
	 * 发票备注
	 */
	@ApiField("invoice_note")
	private String invoiceNote;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 申请人的uid号
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 调用来源
	 */
	@ApiField("source")
	private String source;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public MultiCurrencyMoneyOpenApi getInvoiceAmt() {
		return this.invoiceAmt;
	}
	public void setInvoiceAmt(MultiCurrencyMoneyOpenApi invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
	}

	public InvoiceBillItem getInvoiceBillItems() {
		return this.invoiceBillItems;
	}
	public void setInvoiceBillItems(InvoiceBillItem invoiceBillItems) {
		this.invoiceBillItems = invoiceBillItems;
	}

	public String getInvoiceNote() {
		return this.invoiceNote;
	}
	public void setInvoiceNote(String invoiceNote) {
		this.invoiceNote = invoiceNote;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
