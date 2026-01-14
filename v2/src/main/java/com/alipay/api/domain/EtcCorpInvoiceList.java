package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业etc发票列表
 *
 * @author auto create
 * @since 1.0, 2025-12-19 14:03:07
 */
public class EtcCorpInvoiceList extends AlipayObject {

	private static final long serialVersionUID = 2736266651885438113L;

	/**
	 * 购方名称
	 */
	@ApiField("buyer_name")
	private String buyerName;

	/**
	 * 发票失败原因
	 */
	@ApiField("failed_reason")
	private String failedReason;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票开具时间
	 */
	@ApiField("invoice_make_time")
	private String invoiceMakeTime;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_num")
	private String invoiceNum;

	/**
	 * 发票地址下载
	 */
	@ApiField("invoice_oss_url")
	private String invoiceOssUrl;

	/**
	 * 开票失败
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/**
	 * 是否红票
	 */
	@ApiField("invoice_type")
	private Boolean invoiceType;

	/**
	 * 合计金额,单位:分
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 合计税额,单位:分
	 */
	@ApiField("total_tax_amount")
	private String totalTaxAmount;

	public String getBuyerName() {
		return this.buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getFailedReason() {
		return this.failedReason;
	}
	public void setFailedReason(String failedReason) {
		this.failedReason = failedReason;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceMakeTime() {
		return this.invoiceMakeTime;
	}
	public void setInvoiceMakeTime(String invoiceMakeTime) {
		this.invoiceMakeTime = invoiceMakeTime;
	}

	public String getInvoiceNum() {
		return this.invoiceNum;
	}
	public void setInvoiceNum(String invoiceNum) {
		this.invoiceNum = invoiceNum;
	}

	public String getInvoiceOssUrl() {
		return this.invoiceOssUrl;
	}
	public void setInvoiceOssUrl(String invoiceOssUrl) {
		this.invoiceOssUrl = invoiceOssUrl;
	}

	public String getInvoiceStatus() {
		return this.invoiceStatus;
	}
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public Boolean getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(Boolean invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTotalTaxAmount() {
		return this.totalTaxAmount;
	}
	public void setTotalTaxAmount(String totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
	}

}
