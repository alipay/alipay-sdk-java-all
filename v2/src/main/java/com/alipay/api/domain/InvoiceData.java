package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票信息
 *
 * @author auto create
 * @since 1.0, 2025-06-16 10:16:12
 */
public class InvoiceData extends AlipayObject {

	private static final long serialVersionUID = 2374424662471761571L;

	/**
	 * 发票抬头
	 */
	@ApiField("buyer_invoice_title")
	private String buyerInvoiceTitle;

	/**
	 * 发票所属机构id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 发票金额，单位：元
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 发票金额币种
	 */
	@ApiField("invoice_amount_currency")
	private String invoiceAmountCurrency;

	/**
	 * 发票申请日期
	 */
	@ApiField("invoice_apply_date")
	private String invoiceApplyDate;

	/**
	 * 发票唯一编码
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	/**
	 * 发票类型
	 */
	@ApiField("invoice_material")
	private String invoiceMaterial;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票开具日期
	 */
	@ApiField("invoice_open_date")
	private String invoiceOpenDate;

	/**
	 * 发票状态
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/**
	 * 发票邮寄状态
	 */
	@ApiField("mail_status")
	private String mailStatus;

	/**
	 * 开放平台id
	 */
	@ApiField("open_api_id")
	private String openApiId;

	/**
	 * 发票邮寄下载地址
	 */
	@ApiField("out_side_download_url")
	private String outSideDownloadUrl;

	public String getBuyerInvoiceTitle() {
		return this.buyerInvoiceTitle;
	}
	public void setBuyerInvoiceTitle(String buyerInvoiceTitle) {
		this.buyerInvoiceTitle = buyerInvoiceTitle;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getInvoiceAmountCurrency() {
		return this.invoiceAmountCurrency;
	}
	public void setInvoiceAmountCurrency(String invoiceAmountCurrency) {
		this.invoiceAmountCurrency = invoiceAmountCurrency;
	}

	public String getInvoiceApplyDate() {
		return this.invoiceApplyDate;
	}
	public void setInvoiceApplyDate(String invoiceApplyDate) {
		this.invoiceApplyDate = invoiceApplyDate;
	}

	public String getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getInvoiceMaterial() {
		return this.invoiceMaterial;
	}
	public void setInvoiceMaterial(String invoiceMaterial) {
		this.invoiceMaterial = invoiceMaterial;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceOpenDate() {
		return this.invoiceOpenDate;
	}
	public void setInvoiceOpenDate(String invoiceOpenDate) {
		this.invoiceOpenDate = invoiceOpenDate;
	}

	public String getInvoiceStatus() {
		return this.invoiceStatus;
	}
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public String getMailStatus() {
		return this.mailStatus;
	}
	public void setMailStatus(String mailStatus) {
		this.mailStatus = mailStatus;
	}

	public String getOpenApiId() {
		return this.openApiId;
	}
	public void setOpenApiId(String openApiId) {
		this.openApiId = openApiId;
	}

	public String getOutSideDownloadUrl() {
		return this.outSideDownloadUrl;
	}
	public void setOutSideDownloadUrl(String outSideDownloadUrl) {
		this.outSideDownloadUrl = outSideDownloadUrl;
	}

}
