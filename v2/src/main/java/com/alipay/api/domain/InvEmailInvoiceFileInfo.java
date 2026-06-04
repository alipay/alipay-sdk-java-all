package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收票邮箱解析获得的发票文件结构化信息
 *
 * @author auto create
 * @since 1.0, 2026-01-29 20:53:14
 */
public class InvEmailInvoiceFileInfo extends AlipayObject {

	private static final long serialVersionUID = 4267265458546445214L;

	/**
	 * 发票文件下载地址
	 */
	@ApiField("file_download_url")
	private String fileDownloadUrl;

	/**
	 * 发票文件ID
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 发票文件类型
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 价税合计金额
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票日期
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 发票票种类型
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/**
	 * 备注
	 */
	@ApiField("invoice_memo")
	private String invoiceMemo;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票类型
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 销方名称
	 */
	@ApiField("payee_name")
	private String payeeName;

	/**
	 * 销方税号
	 */
	@ApiField("payee_register_no")
	private String payeeRegisterNo;

	/**
	 * 购方名称
	 */
	@ApiField("payer_name")
	private String payerName;

	/**
	 * 购方抬头税号
	 */
	@ApiField("payer_register_no")
	private String payerRegisterNo;

	/**
	 * 税额
	 */
	@ApiField("tax_amount")
	private String taxAmount;

	/**
	 * 不含税金额
	 */
	@ApiField("without_tax_amount")
	private String withoutTaxAmount;

	public String getFileDownloadUrl() {
		return this.fileDownloadUrl;
	}
	public void setFileDownloadUrl(String fileDownloadUrl) {
		this.fileDownloadUrl = fileDownloadUrl;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceDate() {
		return this.invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceKind() {
		return this.invoiceKind;
	}
	public void setInvoiceKind(String invoiceKind) {
		this.invoiceKind = invoiceKind;
	}

	public String getInvoiceMemo() {
		return this.invoiceMemo;
	}
	public void setInvoiceMemo(String invoiceMemo) {
		this.invoiceMemo = invoiceMemo;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getPayeeName() {
		return this.payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getPayeeRegisterNo() {
		return this.payeeRegisterNo;
	}
	public void setPayeeRegisterNo(String payeeRegisterNo) {
		this.payeeRegisterNo = payeeRegisterNo;
	}

	public String getPayerName() {
		return this.payerName;
	}
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public String getPayerRegisterNo() {
		return this.payerRegisterNo;
	}
	public void setPayerRegisterNo(String payerRegisterNo) {
		this.payerRegisterNo = payerRegisterNo;
	}

	public String getTaxAmount() {
		return this.taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getWithoutTaxAmount() {
		return this.withoutTaxAmount;
	}
	public void setWithoutTaxAmount(String withoutTaxAmount) {
		this.withoutTaxAmount = withoutTaxAmount;
	}

}
