package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反向订单发票明细
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:37:37
 */
public class OrderInvoice extends AlipayObject {

	private static final long serialVersionUID = 5234991337523681273L;

	/**
	 * 发票图片下载地址
	 */
	@ApiField("img_file_url")
	private String imgFileUrl;

	/**
	 * 发票不含税金额（元，两位小数）
	 */
	@ApiField("invoice_amount_without_tax")
	private String invoiceAmountWithoutTax;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票状态
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/**
	 * 开票状态信息
	 */
	@ApiField("invoice_status_message")
	private String invoiceStatusMessage;

	/**
	 * 发票税额（元，两位小数）
	 */
	@ApiField("invoice_tax_amount")
	private String invoiceTaxAmount;

	/**
	 * 发票类型
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 发票PDF下载地址
	 */
	@ApiField("pdf_file_url")
	private String pdfFileUrl;

	public String getImgFileUrl() {
		return this.imgFileUrl;
	}
	public void setImgFileUrl(String imgFileUrl) {
		this.imgFileUrl = imgFileUrl;
	}

	public String getInvoiceAmountWithoutTax() {
		return this.invoiceAmountWithoutTax;
	}
	public void setInvoiceAmountWithoutTax(String invoiceAmountWithoutTax) {
		this.invoiceAmountWithoutTax = invoiceAmountWithoutTax;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceStatus() {
		return this.invoiceStatus;
	}
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public String getInvoiceStatusMessage() {
		return this.invoiceStatusMessage;
	}
	public void setInvoiceStatusMessage(String invoiceStatusMessage) {
		this.invoiceStatusMessage = invoiceStatusMessage;
	}

	public String getInvoiceTaxAmount() {
		return this.invoiceTaxAmount;
	}
	public void setInvoiceTaxAmount(String invoiceTaxAmount) {
		this.invoiceTaxAmount = invoiceTaxAmount;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getPdfFileUrl() {
		return this.pdfFileUrl;
	}
	public void setPdfFileUrl(String pdfFileUrl) {
		this.pdfFileUrl = pdfFileUrl;
	}

}
