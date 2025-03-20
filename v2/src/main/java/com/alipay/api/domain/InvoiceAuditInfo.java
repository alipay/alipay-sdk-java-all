package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票审核信息
 *
 * @author auto create
 * @since 1.0, 2024-01-23 16:43:08
 */
public class InvoiceAuditInfo extends AlipayObject {

	private static final long serialVersionUID = 3846484497947631981L;

	/**
	 * 发票审核备注信息
	 */
	@ApiField("invoice_audit_remark")
	private String invoiceAuditRemark;

	/**
	 * 发票审核状态
	 */
	@ApiField("invoice_audit_status")
	private String invoiceAuditStatus;

	/**
	 * 发票id
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	/**
	 * 发票外部索引号
	 */
	@ApiField("invoice_out_no")
	private String invoiceOutNo;

	public String getInvoiceAuditRemark() {
		return this.invoiceAuditRemark;
	}
	public void setInvoiceAuditRemark(String invoiceAuditRemark) {
		this.invoiceAuditRemark = invoiceAuditRemark;
	}

	public String getInvoiceAuditStatus() {
		return this.invoiceAuditStatus;
	}
	public void setInvoiceAuditStatus(String invoiceAuditStatus) {
		this.invoiceAuditStatus = invoiceAuditStatus;
	}

	public String getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getInvoiceOutNo() {
		return this.invoiceOutNo;
	}
	public void setInvoiceOutNo(String invoiceOutNo) {
		this.invoiceOutNo = invoiceOutNo;
	}

}
