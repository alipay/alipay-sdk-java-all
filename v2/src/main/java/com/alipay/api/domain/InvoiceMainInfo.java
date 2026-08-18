package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票主体信息，包含发票种类、个人/企业类型、蓝票/红票类型， 含税金额、不含税金额和税额
 *
 * @author auto create
 * @since 1.0, 2026-08-14 19:59:20
 */
public class InvoiceMainInfo extends AlipayObject {

	private static final long serialVersionUID = 1237859479428399165L;

	/**
	 * 0 个人，1 企业
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 本次不含税总金额，单位元精确到分
	 */
	@ApiField("excluding_tax_amount")
	private String excludingTaxAmount;

	/**
	 * 本次含税开票或红冲总金额；红票由商户按正数传入，单位元精确到分
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 81 数电专用增值税发票，82 数电普通发票
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/**
	 * 1 蓝票，2 红票
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 本次总税额，单位元精确到分
	 */
	@ApiField("tax_amount")
	private String taxAmount;

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getExcludingTaxAmount() {
		return this.excludingTaxAmount;
	}
	public void setExcludingTaxAmount(String excludingTaxAmount) {
		this.excludingTaxAmount = excludingTaxAmount;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getInvoiceKind() {
		return this.invoiceKind;
	}
	public void setInvoiceKind(String invoiceKind) {
		this.invoiceKind = invoiceKind;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getTaxAmount() {
		return this.taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

}
